package org.sdmlib.examples.chats;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedHashSet;

import org.junit.Test;
import org.sdmlib.CGUtil;
import org.sdmlib.examples.chats.creators.CreatorCreator;
import org.sdmlib.logger.PeerProxy;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.storyboards.Storyboard;

import de.uniks.networkparser.json.JsonIdMap;

public class PeerToServerChatTest
{
   
   @Test 
   public void testFlowModel()
   {
      ClassModel model = new ClassModel("org.sdmlib.examples.chats");
      
      Clazz taskFlowClazz = model.createClazz(TaskFlow.class.getName(), 
         "taskNo", "int")
         .withExternal(true);

      model.createClazz("TestChatMessageFlow", 
         "msg", String.class.getSimpleName())
         .withSuperClazzes(taskFlowClazz)
         .withMethods("run()", "void")
         .withMethods("getTaskNames()", "Object[]");

      model.generate("examples");
   }

   @Test
   public void PeerToServerChatStoryboard()
   {
      Storyboard storyboard = new Storyboard("examples");
      
      // first start the server
      runJava("10112", "org.sdmlib.examples.chats.ChatServer", "");
       
      // now Albert's client
      runJava("10113", PeerToPeerChat.class.getName(), "localhost 11112 11113 cs Albert");

      // now Nina's client
      runJava("10114", PeerToPeerChat.class.getName(), "localhost 11112 11114 cs Nina");
      
      JsonIdMap idMap = CreatorCreator.createIdMap("test");
      idMap.put("id.map", idMap);
      
      new SocketThread()
      .withPort(42424)
      .withIdMap(idMap)
      .start();
      
      TestChatMessageFlow testChatMessageFlow = null;
      try
      {
         testChatMessageFlow = (TestChatMessageFlow) new TestChatMessageFlow()
         .withTestTarget(new PeerProxy(InetAddress.getLocalHost().getHostAddress(), 11113, idMap))
         .withMsg("Hello World")
         .withIdMap((SDMLibJsonIdMap) idMap);
      }
      catch (UnknownHostException e1)
      {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }

      testChatMessageFlow.run();


      while (testChatMessageFlow.getTaskNo() + 1 < testChatMessageFlow.getTaskNames().length)
      {
         synchronized (idMap)
         {
            try
            {
               idMap.wait();
            }
            catch (InterruptedException e)
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }
      }


      // dump logger 

      System.out.println("done");
      
      killSubProcesses();
      
      storyboard.addSVGImage("CSChatMessageFlow.svg");
      
      storyboard.dumpHTML();
      
   }

   private void killSubProcesses()
   {
      for (Process pid : mySubProcesses)
      {
         pid.destroy();
      }
   }
   
   private LinkedHashSet<Process> mySubProcesses = new LinkedHashSet<Process>();

   private void runJava(String debugPort, String mainClass, String args)
   {
      StringBuilder command = new StringBuilder(
         "java -Xdebug -Xrunjdwp:transport=dt_socket,address=debugPort,server=y,suspend=n " +
         "-classpath myclasspath main args"
            );

      String java = "\"C:\\Program Files\\Java\\jdk1.6.0_31\\bin\\javaw.exe\" ";
      
      String classPath = System.getProperty("java.class.path");
      
     CGUtil.replaceAll(command, 
         "java", java, 
         "debugPort", debugPort, 
         "myclasspath", classPath, 
         "main", mainClass,
         "args", args);
      
      try
      {
         Process pid = Runtime.getRuntime().exec(command.toString());
         mySubProcesses.add(pid);
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}