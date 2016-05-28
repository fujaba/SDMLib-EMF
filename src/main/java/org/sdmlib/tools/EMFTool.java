package org.sdmlib.tools;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.sdmlib.CGUtil;
import org.sdmlib.StrUtil;
import org.sdmlib.models.classes.ClassModel;

import de.uniks.networkparser.graph.Association;
import de.uniks.networkparser.graph.Attribute;
import de.uniks.networkparser.graph.Cardinality;
import de.uniks.networkparser.graph.Clazz;
import de.uniks.networkparser.graph.DataType;

@SuppressWarnings("restriction")
public class EMFTool
{
   public EPackage classModelToEPackage(ClassModel model)
   {
      // create the corresponding EMF ecore structures
      EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
      EcorePackage ecorePackage = EcorePackage.eINSTANCE;

      // first we need a package
      EPackage ePackage = ecoreFactory.createEPackage();
      ePackage.setName(StrUtil.upFirstChar(CGUtil.shortClassName(model.getName()))+"Package");
      ePackage.setNsPrefix(CGUtil.shortClassName(model.getName()));
      ePackage.setNsURI("http:///" + model.getName() + ".ecore");


      for (Clazz c : model.getClazzes())
      {
         EClass ec = ecoreFactory.createEClass();
         ec.setName(CGUtil.shortClassName(c.getName()));

         ePackage.getEClassifiers().add(ec);

         // transfer attributes
         for (Attribute attr : c.getAttributes())
         {
            EAttribute eattr = ecoreFactory.createEAttribute();
            eattr.setName(attr.getName());
            EClassifier estring = ecorePackage.getEClassifier("E" + attr.getType());
            eattr.setEType(estring);
            ec.getEStructuralFeatures().add(eattr);
         }

      }

      // transfer super class
      for (Clazz c : model.getClazzes())
      {
         if (c.getSuperClass() != null)
         {
            EClass kidEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(c.getName()));
            EClass superEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(c.getSuperClass().getName()));

            kidEClass.getESuperTypes().add(superEClass);
         }
      }

      // transfer assocs
      for (Association assoc : model.getClazzes().getAssociations())
      {
         Association revAssoc = assoc.getOther();

         EReference fwdRef = ecoreFactory.createEReference();
         fwdRef.setName(revAssoc.getName());
         EClass tgtEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(revAssoc.getClazz().getName()));
         fwdRef.setEType(tgtEClass);
         if (Cardinality.MANY.toString().equals(revAssoc.getCardinality()))
         {
            fwdRef.setUpperBound(-1);
         }

         EReference bwdRef = ecoreFactory.createEReference();
         bwdRef.setName(assoc.getName());
         EClass srcEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(assoc.getClazz().getName()));
         bwdRef.setEType(srcEClass);
         if (Cardinality.MANY.toString().equals(assoc.getCardinality()))
         {
            bwdRef.setUpperBound(-1);
         }

         fwdRef.setEOpposite(bwdRef);
         bwdRef.setEOpposite(fwdRef);

         srcEClass.getEStructuralFeatures().add(fwdRef);

         tgtEClass.getEStructuralFeatures().add(bwdRef);

      }

      return ePackage;
   }

   public ClassModel getClassModelFromEPackage(EPackage epackage, String packageName)
   {
      return getClassModelFromEPackage(epackage, packageName, true);
   }
   
   public ClassModel getClassModelFromEPackage(EPackage epackage, String packageName, boolean withImpl)
   {
      File file = new File(".");

      // get class model from epackage
      ClassModel model = new ClassModel(packageName);

      LinkedHashMap<EClass, Clazz> classMap = new LinkedHashMap<EClass, Clazz>();

      for (EClassifier eclassifier : epackage.getEClassifiers())
      {
         if (eclassifier instanceof EClass)
         {
            EClass eclass = (EClass) eclassifier;

            // add an interface and a class to the SDMModel
            String fullClassName = eclass.getName();
            Clazz sdmClass = model.createClazz(fullClassName);
            
            if (withImpl)
            {
               sdmClass.enableInterface();
            
               String implClassName = CGUtil.packageName(fullClassName) + ".impl." + eclass.getName() + "Impl";
               Clazz implClass = model.createClazz(implClassName).withSuperClazz(sdmClass);
            }

            classMap.put(eclass, sdmClass);

            // add attributes
            for (EAttribute eattr : eclass.getEAttributes())
            {
               sdmClass.withAttribute(eattr.getName(), DataType.create(CGUtil.shortClassName(eattr.getEType().getInstanceClassName())));
            }
         }
      }


      LinkedHashSet<EReference> doneERefs = new LinkedHashSet<EReference>();

      for (EClassifier eclassifier : epackage.getEClassifiers())
      {
         if (eclassifier instanceof EClass)
         {
            EClass eclass = (EClass) eclassifier;

            if ( ! eclass.getESuperTypes().isEmpty())
            {
               EClass eSuperClass = eclass.getESuperTypes().get(0);
               Clazz sdmSuperClass = classMap.get(eSuperClass);
               Clazz sdmClass = classMap.get(eclass);
               sdmClass.withSuperClazz(sdmSuperClass);
            }

            for (EReference eref : eclass.getEReferences())
            {
               if (!doneERefs.contains(eref))
               {
                  EReference oppositeERef = eref.getEOpposite();

                  if (oppositeERef != null)
                  {
                     // create assoc
                     EClass srcEClass = (EClass) oppositeERef.getEType();
                     EClass tgtEClass = (EClass) eref.getEType();

                     Clazz srcSDMClass = classMap.get(srcEClass);
                     Clazz tgtSDMClass = classMap.get(tgtEClass);

                     Cardinality srcCard = (oppositeERef.getUpperBound() == 1 ? Cardinality.ONE : Cardinality.MANY);
                     Cardinality tgtCard = (eref.getUpperBound() == 1 ? Cardinality.ONE : Cardinality.MANY);

                     srcSDMClass.withBidirectional(tgtSDMClass, eref.getName(), tgtCard, oppositeERef.getName(), srcCard);

                     doneERefs.add(eref);
                     doneERefs.add(oppositeERef);
                  }
                  else
                  {
                     // uni directional assoc
                     EClass srcEClass = eclass;
                     EClass tgtEClass = (EClass) eref.getEType();

                     Clazz srcSDMClass = classMap.get(srcEClass);
                     Clazz tgtSDMClass = classMap.get(tgtEClass);

                     Cardinality tgtCard = (eref.getUpperBound() == 1 ? Cardinality.ONE : Cardinality.MANY);
                     
                     srcSDMClass.withUniDirectional(tgtSDMClass, eref.getName(), tgtCard);

                     doneERefs.add(eref);
                  }
               }
            }
         }


      }
      return model;
   }


   public ClassModel ecoreModelToClassModel(String packageName, String ecoreFileName)
   {
      ResourceSet resSet = new ResourceSetImpl();

      URI ecoreModelURI = URI.createFileURI(ecoreFileName);

      resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

      Resource ecoreModelRes = resSet.getResource(ecoreModelURI, true);

      EPackage epackage = (EPackage) ecoreModelRes.getContents().get(0);
      
      ClassModel model = getClassModelFromEPackage(epackage, packageName, false);
 

      return model;
   }
}
