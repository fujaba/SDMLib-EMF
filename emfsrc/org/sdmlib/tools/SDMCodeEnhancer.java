package org.sdmlib.tools;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.junit.Test;
import org.sdmlib.codegen.CGUtil;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.Role;
import org.sdmlib.models.classes.Role.R;
import org.sdmlib.models.classes.creators.ClazzSet;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.storyboards.Storyboard;

public class SDMCodeEnhancer
{
   public static Storyboard story = null;
   private EPackage epackage;
   
   @Test
   public void testSDMCodeEnhancer()
   {
      story = new Storyboard();
      
      main(new String[] {"emfsrc", "org.sdmlib.examples.emfstudyright.EMFStudyRightModel"});
      
      story.dumpHTML();
   }
   
   public static void main(String[] args)
   {
      String rootDir = args[0];
      
      String rootPackage = args[1];
      
      SDMCodeEnhancer sdmCodeEnhancer = new SDMCodeEnhancer()
      .withRootDir(rootDir)
      .withRootPackage(rootPackage)
      .withEPackage(EMFStudyRightModelPackage.eINSTANCE);
      
      sdmCodeEnhancer.enhance();
      
      System.out.println();
   }
   
   private SDMCodeEnhancer withEPackage(EPackage epackage)
   {
      this.epackage = epackage;
      return this;
   }

   public void enhance()
   {
      File file = new File(".");
      
      // get class model from epackage
      ClassModel model = new ClassModel();
      
      LinkedHashMap<EClass, Clazz> classMap = new LinkedHashMap<EClass, Clazz>();
      
      for (EClassifier eclassifier : epackage.getEClassifiers())
      {
         if (eclassifier instanceof EClass)
         {
            EClass eclass = (EClass) eclassifier;
            
            // add an interface and a class to the SDMModel
            String fullClassName = eclass.getInstanceTypeName();
            Clazz sdmClass = model.createClazz(fullClassName).withInterfaze(true);

            String implClassName = CGUtil.packageName(fullClassName) + ".impl." + eclass.getName() + "Impl";
            Clazz implClass = model.createClazz(implClassName).withInterfaces(sdmClass);
         
            classMap.put(eclass, sdmClass);
            
            // add attributes
            for (EAttribute eattr : eclass.getEAttributes())
            {
               sdmClass.withAttribute(eattr.getName(), CGUtil.shortClassName(eattr.getEType().getInstanceClassName()));
            }
         }
      }

      
      LinkedHashSet<EReference> doneERefs = new LinkedHashSet<>();
      
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
               sdmClass.withSuperClass(sdmSuperClass);
            }
               
            for (EReference eref : eclass.getEReferences())
            {
               if (!doneERefs.contains(eref))
               {
                  EReference oppositeERef = eref.getEOpposite();
                  
                  // create assoc
                  EClass srcEClass = (EClass) eref.getEType();
                  EClass tgtEClass = (EClass) oppositeERef.getEType();
                  
                  Clazz srcSDMClass = classMap.get(srcEClass);
                  Clazz tgtSDMClass = classMap.get(tgtEClass);
                  
                  Role.R tgtCard = (oppositeERef.getUpperBound() == 1 ? R.ONE : R.MANY);
                  Role.R srcCard = (eref.getUpperBound() == 1 ? R.ONE : R.MANY);
                  
                  srcSDMClass.withAssoc(tgtSDMClass, oppositeERef.getName(), tgtCard, eref.getName(), srcCard);
                  
                  doneERefs.add(eref);
                  doneERefs.add(oppositeERef);
               }
            }
         }


      }
      
      if (story != null)
      {
         story.addClassDiagram(model);
      }
      
      model.generate(rootDir);
   }

   private String rootDir;
   
   public String getRootDir()
   {
      return rootDir;
   }
   
   public void setRootDir(String rootDir)
   {
      this.rootDir = rootDir;
   }

   public SDMCodeEnhancer withRootDir(String rootDir)
   {
      this.setRootDir(rootDir);
      return this;
   }
   
   private String rootPackage;
   
   public String getRootPackage()
   {
      return rootPackage;
   }
   
   public void setRootPackage(String rootPackage)
   {
      this.rootPackage = rootPackage;
   }
   
   public SDMCodeEnhancer withRootPackage(String rootPackage)
   {
      this.setRootPackage(rootPackage);
      return this;
   }
}
