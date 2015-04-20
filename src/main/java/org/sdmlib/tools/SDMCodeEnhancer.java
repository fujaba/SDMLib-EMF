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
import org.sdmlib.CGUtil;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelPackage;
import org.sdmlib.models.classes.Card;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.DataType;
import org.sdmlib.storyboards.Storyboard;

public class SDMCodeEnhancer
{
   public static Storyboard story = null;
   private EPackage epackage;
   
   @Test
   public void testSDMCodeEnhancer()
   {
      story = new Storyboard();
      
      main(new String[] {"src/main/java", "org.sdmlib.examples.emfstudyright.EMFStudyRightModel"});
      
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
