package org.sdmlib.tools;

import java.io.File;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;
import org.sdmlib.codegen.CGUtil;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.creators.ClazzSet;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.storyboards.Storyboard;

public class SDMCodeEnhancer
{
   public static Storyboard storyboard = null;
   private EPackage epackage;
   
   @Test
   public void testSDMCodeEnhancer()
   {
      storyboard = new Storyboard();
      
      main(new String[] {"emfsrc", "org.sdmlib.examples.emfstudyright.EMFStudyRightModel"});
      
      storyboard.dumpHTML();
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
      
      for (EClassifier eclassifier : epackage.getEClassifiers())
      {
         // add an interface and a class to the SDMModel
         String fullClassName = eclassifier.getInstanceTypeName();
         Clazz sdmClass = model.createClazz(fullClassName).withInterfaze(true);
         
         String implClassName = CGUtil.packageName(fullClassName) + ".impl." + eclassifier.getName() + "Impl";
         Clazz implClass = model.createClazz(implClassName).withInterfaces(sdmClass);
         
         if (eclassifier instanceof EClass)
         {
            EClass eclass = (EClass) eclassifier;
            // add attributes
            for (EAttribute eattr : eclass.getEAttributes())
            {
               sdmClass.withAttribute(eattr.getName(), CGUtil.shortClassName(eattr.getEType().getInstanceClassName()));
            }

         }
      }
      
      if (storyboard != null)
      {
         storyboard.addClassDiagram(model);
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
