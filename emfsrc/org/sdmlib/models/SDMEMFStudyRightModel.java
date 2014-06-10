package org.sdmlib.models;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.Test;
import org.sdmlib.CGUtil;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.tools.EMFTool;

public class SDMEMFStudyRightModel
{
   @Test
   public void EMFStudyRightClasses()
   {
      Storyboard storyboard = new Storyboard("emfsrc");

      storyboard.add("We build some example classes and then turn them into an Ecore model ", Storyboard.MODELING, "zuendorf", "03.07.2013 13:19:42", 1, 0);

      ClassModel model = new ClassModel("org.sdmlib.examples.sdmmodel_emfcode.studyright");

      Clazz uniClazz = model.createClazz("University", "name", R.STRING);
      
      Clazz persClazz = model.createClazz("Person", "name", R.STRING);
      
      Clazz studClazz = uniClazz.createClassAndAssoc("Student", "students", R.MANY, "uni", R.ONE)
            .withAttributes("studId", R.STRING)
            .withSuperClazzes(persClazz);
      
      storyboard.addSVGImage(model.dumpClassDiagram("examples", "EMFStudyRightClassDiag"));
      
      EMFTool emfTool = new EMFTool();
      
      // turn into EPackage
      EPackage ePackage = emfTool.classModelToEPackage(model);
            
      // write to file 
      ResourceSet resourceSet = new ResourceSetImpl();
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());
      
      Resource resource = resourceSet.createResource(URI.createURI("./EMFStudyRight.ecore"));
      
      resource.getContents().add(ePackage);
      
      
      try
      {
         resource.save(null);
         
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         resource.save(out, null);
         
         String xmlText = "<textarea rows=\"20\" cols=\"120\" style='border:none'>" + out.toString() +  "</textarea>";
         
         storyboard.add(xmlText);
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      // try to build the genmodel
      URI genModelURI = URI.createFileURI("./EMFStudyRight.genmodel");
      
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMLResourceFactoryImpl());
      
      Resource genModelResource = resourceSet.createResource(genModelURI);
      
      GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
      
      genModelResource.getContents().add(genModel);
      
      resourceSet.getResources().add(genModelResource);
      
      genModel.setModelDirectory("./SDMLib/emfsrc");
      genModel.getForeignModel().add("./EMFStudyRight.ecore");
      genModel.initialize(Collections.singleton(ePackage));
      
      GenPackage genPackage = genModel.getGenPackages().get(0);
      
      genModel.setModelName(genModelURI.trimFileExtension().lastSegment());

      genPackage.setPrefix(CGUtil.shortClassName(model.getPackageName()) + "genmodel");
      genPackage.setBasePackage(model.getPackageName());

      try
      {
         genModelResource.save(Collections.EMPTY_MAP);
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      IStatus status = genModel.validate();
      if (!status.isOK())
      {
        System.out.println(status);
      }
      
      
      
      // now generate Java
      // org.eclipse.xsd
      //      JETEmitter e;
      //      CodeGenEcorePlugin codeGenPlugin = CodeGenEcorePlugin.INSTANCE;
      //      
      //      genModel.setCanGenerate(true);
      //      
      //      org.eclipse.emf.codegen.ecore.generator.Generator gen = new org.eclipse.emf.codegen.ecore.generator.Generator();
      //      
      //      gen.setInput(genModel);
      //      
      //      boolean flag = gen.canGenerate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE);
      //      
      //      if (!flag)
      //      {
      //         System.out.println("Cannot generate");
      //      }
      //      
      //      BasicMonitor basicMonitor = new BasicMonitor();
      //      gen.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, basicMonitor);
      
      
      storyboard.dumpHTML();
   }
   
   @Test
   public void testLoadEcoreCreateClassModel()
   {
      Storyboard storyboard = new Storyboard("emfsrc");

      storyboard.add("Reading ecore file and generating sdmlib classModel ", Storyboard.MODELING, "zuendorf", "03.07.2013 13:20:42", 1, 22);

      
      EMFTool emfTool = new EMFTool();
      
      ClassModel model = emfTool.genModelToClassModel("./EMFStudyRight.genmodel");
      
      storyboard.addSVGImage(model.dumpClassDiagram("StudyRighLoadedFromECore"));
      
      storyboard.dumpHTML();
      
      
   }
}
