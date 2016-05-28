package org.sdmlib.tools;

import java.lang.reflect.Field;

import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;
import org.sdmlib.CGUtil;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.storyboards.Storyboard;

public class SDMCodeEnhancer
{
   public static Storyboard story = null;
   private EPackage epackage;
   
   @Test
   public void testSDMCodeEnhancer()
   {
      story = new Storyboard();
      
      main("src/test/java", "org.sdmlib.examples.emfstudyright.EMFStudyRightModel");
      
      story.dumpHTML();
   }
   
   public static void main(String... args)
   {
      String rootDir = args[0];
      
      String rootPackage = args[1];
      
      // load package class
      
      String shortClassName = CGUtil.shortClassName(rootPackage) + "Package";
      
      String fullPackageClassName = rootPackage + "." + shortClassName;
      
      try
      {
         Class<?> packageClass = Class.forName(fullPackageClassName);

         Field field = packageClass.getField("eINSTANCE");
         
         Object thePackage = field.get(null);
         
         SDMCodeEnhancer sdmCodeEnhancer = new SDMCodeEnhancer()
               .withRootDir(rootDir)
               .withRootPackage(rootPackage)
               .withEPackage((EPackage) thePackage); // load package from parameter
               
               sdmCodeEnhancer.enhance();
               
               System.out.println();
      }
      catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
   }
   
   private SDMCodeEnhancer withEPackage(EPackage epackage)
   {
      this.epackage = epackage;
      return this;
   }

   public void enhance()
   {
      ClassModel model = new EMFTool().getClassModelFromEPackage(epackage, epackage.getName());
      
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
