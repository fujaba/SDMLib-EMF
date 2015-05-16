package org.sdmlib.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.sdmlib.CGUtil;
import org.sdmlib.StrUtil;
import org.sdmlib.models.classes.Association;
import org.sdmlib.models.classes.Attribute;
import org.sdmlib.models.classes.Card;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.DataType;
import org.sdmlib.models.classes.Enumeration;
import org.sdmlib.models.classes.Role;

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


      for (Clazz c : model.getClasses())
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
      for (Clazz c : model.getClasses())
      {
         if (c.getSuperClass() != null)
         {
            EClass kidEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(c.getName()));
            EClass superEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(c.getSuperClass().getName()));

            kidEClass.getESuperTypes().add(superEClass);
         }
      }

      // transfer assocs
      for (Association assoc : model.getClasses().getSourceRoles().getAssoc())
      {
         Role srcRole = assoc.getSource();
         Role tgtRole = assoc.getTarget();

         EReference fwdRef = ecoreFactory.createEReference();
         fwdRef.setName(tgtRole.getName());
         EClass tgtEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(tgtRole.getClazz().getName()));
         fwdRef.setEType(tgtEClass);
         if (Card.MANY.toString().equals(tgtRole.getCard()))
         {
            fwdRef.setUpperBound(-1);
         }

         EReference bwdRef = ecoreFactory.createEReference();
         bwdRef.setName(srcRole.getName());
         EClass srcEClass = (EClass) ePackage.getEClassifier(CGUtil.shortClassName(srcRole.getClazz().getName()));
         bwdRef.setEType(srcEClass);
         if (Card.MANY.toString().equals(srcRole.getCard()))
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
            String fullClassName = eclass.getInstanceTypeName();
            Clazz sdmClass = model.createClazz(fullClassName);
            
            if (withImpl)
            {
               sdmClass.withInterface(true);
            
               String implClassName = CGUtil.packageName(fullClassName) + ".impl." + eclass.getName() + "Impl";
               Clazz implClass = model.createClazz(implClassName).withSuperClazz(sdmClass);
            }

            classMap.put(eclass, sdmClass);

            // add attributes
            for (EAttribute eattr : eclass.getEAttributes())
            {
               sdmClass.withAttribute(eattr.getName(), DataType.ref(CGUtil.shortClassName(eattr.getEType().getInstanceClassName())));
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
                     EClass srcEClass = (EClass) eref.getEType();
                     EClass tgtEClass = (EClass) oppositeERef.getEType();

                     Clazz srcSDMClass = classMap.get(srcEClass);
                     Clazz tgtSDMClass = classMap.get(tgtEClass);

                     Card tgtCard = (oppositeERef.getUpperBound() == 1 ? Card.ONE : Card.MANY);
                     Card srcCard = (eref.getUpperBound() == 1 ? Card.ONE : Card.MANY);

                     srcSDMClass.withAssoc(tgtSDMClass, oppositeERef.getName(), tgtCard, eref.getName(), srcCard);

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

                     Card tgtCard = (eref.getUpperBound() == 1 ? Card.ONE : Card.MANY);
                     
                     srcSDMClass.withUniDirectionalAssoc(tgtSDMClass, eref.getName(), tgtCard);

                     doneERefs.add(eref);
                  }
               }
            }
         }


      }
      return model;
   }


   public ClassModel genModelToClassModel(String genModelFileName)
   {
      GenModelPackage.eINSTANCE.eClass();

      ResourceSet resSet = new ResourceSetImpl();

      URI genModelURI = URI.createFileURI(genModelFileName);

      resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
//      resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMLResourceFactoryImpl());

      Resource genModelRes = resSet.getResource(genModelURI, true);
      String path = new File(genModelFileName).getParentFile().getAbsolutePath();

      GenModel genModel = (GenModel) genModelRes.getContents().get(0);

      String packageName = genModel.getModelName();

      String ecoreFileName = genModel.getForeignModel().get(0);
      
      if(path != null) {
    	  ecoreFileName = path + File.separator + ecoreFileName;
      }

      return ecoreModelToClassModel(packageName, ecoreFileName);
   }


   public ClassModel ecoreModelToClassModel(String packageName, String ecoreFileName)
   {
      ResourceSet resSet = new ResourceSetImpl();

      URI ecoreModelURI = URI.createFileURI(ecoreFileName);

      resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

      Resource ecoreModelRes = resSet.getResource(ecoreModelURI, true);

      EPackage epackage = (EPackage) ecoreModelRes.getContents().get(0);

      ClassModel model = new ClassModel(packageName);


      LinkedHashSet<EReference> refs = new LinkedHashSet<EReference>();

      // add classes
      for (EClassifier eClassifier : epackage.getEClassifiers())
      {
         if (eClassifier instanceof EClass)
         {
            EClass eclass = (EClass) eClassifier;

            Clazz clazz = model.createClazz(eclass.getName());

            for (EAttribute eattr : eclass.getEAttributes())
            {
            	String name = eattr.getEType().getName();
            	if(CGUtil.isEMFType(name)) {
            		name = name.substring(1);
            	}
            	if(CGUtil.isPrimitiveType(name.toLowerCase())){
            		name = name.toLowerCase();
            	}
           		clazz.withAttribute(CGUtil.toValidJavaId(eattr.getName()), DataType.ref(name));
            }

            for (EReference eref : eclass.getEReferences())
            {
               if ( ! refs.contains(eref))
               {
                  if (eref.getEOpposite() == null)
                  {
//                	  if(eref.getUpperBound()<0 || eref.getUpperBound() > 1) {
                		  refs.add(eref);	  
//                	  }else {
//                	  DataType.ref("java.util.ArrayList<"+eref.getEReferenceType().getName()+">");
//                		  clazz.withAttribute(CGUtil.toValidJavaId(eref.getName()), DataType.ref(eref.getEReferenceType().getName()));
//                	  }
                  }
                  else if ( ! refs.contains(eref.getEOpposite()))
                  {
                     refs.add(eref);
                  }
               }
            }
         }else if (eClassifier instanceof EEnum) {
        	 // VODOO
        	 EEnum eenum = (EEnum) eClassifier;
        	 Enumeration sdmEnum = model.createEnumeration(eClassifier.getName());
        	 ArrayList<String> arrayList= new ArrayList<String>();
        	 for(EEnumLiteral item : eenum.getELiterals()) {
        		 arrayList.add(item.getName());
        	 }
        	 sdmEnum.withValueNames(arrayList.toArray(new String[0]));
        	 
        	 
//        	 <eClassifiers xsi:type="ecore:EEnum" name="Signal">
//        	    <eLiterals name="FAILURE" value="1"/>
//        	    <eLiterals name="STOP"/>
//        	    <eLiterals name="GO" value="2"/>
//        	  </eClassifiers>
         }
      }
      // inheritance
      for (EClassifier eClassifier : epackage.getEClassifiers())
      {
         if (eClassifier instanceof EClass)
         {
            EClass eclass = (EClass) eClassifier;

            if ( ! eclass.getESuperTypes().isEmpty())
            {
               Clazz kidClazz = model.getClazz(eclass.getName());
               Clazz superClazz = model.getClazz(eclass.getESuperTypes().get(0).getName());

               kidClazz.withSuperClazz(superClazz);
            }
         }
      }

      // assocs
      for (EReference eref : refs)
      {
         String tgtClassName = eref.getEReferenceType().getName();
         String tgtRoleName = CGUtil.toValidJavaId(eref.getName());
         Card tgtCard = Card.ONE;
         if (eref.getUpperBound() != 1)
         {
            tgtCard = Card.MANY;
         }

         String srcClassName = null;
         String srcRoleName = null;
         Card srcCard = null;
         if(eref.getEOpposite() == null) {
        	 srcClassName = eref.getEContainingClass().getName();
        	 srcRoleName = tgtRoleName+"_back";
        	 srcCard = Card.MANY;
         }else {
	         eref = eref.getEOpposite();
	         srcClassName = eref.getEReferenceType().getName();
	         srcRoleName = CGUtil.toValidJavaId(eref.getName());
	         srcCard = Card.ONE;
	         if (eref.getUpperBound() != 1)
	         {
	            srcCard = Card.MANY;
	         }
         }

         Clazz tgtClazz = model.getClazz(tgtClassName);
         Clazz srcClazz = model.getClazz(srcClassName);

         srcClazz.withAssoc(tgtClazz, tgtRoleName, tgtCard, srcRoleName, srcCard);
      }

      return model;
   }
}
