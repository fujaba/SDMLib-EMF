package org.sdmlib.examples.chats;

import static org.sdmlib.models.classes.Role.R.ONE;

import org.junit.Test;
import org.sdmlib.model.taskflows.PeerProxy;
import org.sdmlib.model.taskflows.TaskFlow;
import org.sdmlib.model.taskflows.creators.PeerProxySet;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.Role.R;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.serialization.json.SDMLibJsonIdMap;

public class PeerToPeerChatModel
{
   private static final String INT = "int";
   private static final String STRING = "String";
   private static final String PEER_TO_PEER_CHAT = "org.sdmlib.examples.chats.PeerToPeerChat";

   @Test
   public void peerToPeerChatModel()
   {
      Storyboard storyboard = new Storyboard("examples");

      ClassModel model = new ClassModel("org.sdmlib.examples.chats");

      Clazz peerToPeerChatClass = model.createClazz(PEER_TO_PEER_CHAT);

      Clazz taskFlowClass = model.createClazz(TaskFlow.class.getName(), 
         "taskNo", INT,
         "idMap", SDMLibJsonIdMap.class.getName())
         .withExternal(true);
      
      taskFlowClass.withAssoc(taskFlowClass, "subFlow", ONE, "parent", ONE);

      model.createClazz("ChatMessageFlow", 
         "msg", String.class.getSimpleName(),
         "gui", PEER_TO_PEER_CHAT)
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");

      model.createClazz("DrawPointFlow",
         "x", INT, "y", INT,
         "r", INT, "g", INT, "b", INT,
         "gui", PEER_TO_PEER_CHAT)
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");

      model.createClazz(ClearDrawingFlow.class.getName(), 
         "gui", PEER_TO_PEER_CHAT)
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");
      
      model.createClazz("PeerToPeerChatArgs", 
         "userName", STRING,
         "localPort", INT,
         "peerIp", STRING,
         "peerPort", INT);
      
      
      model.createClazz(PeerProxy.class.getName(), 
         "ip", STRING, 
         "port", INT, 
         "idMap", JsonIdMap.class.getName()).withExternal(true);
      
      
      model.createClazz("CSChatMessageFlow", 
         "msg", String.class.getSimpleName())
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");
      
      model.createClazz("ChatServer", 
         "allMessages", STRING, 
         "allPeers", PeerProxySet.class.getName());
      
      model.createClazz(ClientLoginFlow.class.getName(), 
         "server", PeerProxy.class.getName(), 
         "clientIP", STRING, 
         "clientPort", INT, 
         "allMessagesText", STRING)
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");
      
      model.createClazz("CSDrawPointFlow",
         "x", INT, 
         "y", INT,
         "r", INT, 
         "g", INT, 
         "b", INT)
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");

      model.createClazz("CSClearDrawingFlow")
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");
      
      Clazz visitAllClientsFlow = model.createClazz("CSVisitAllClientsFlow")
         .withSuperClazzes(taskFlowClass);
   
      visitAllClientsFlow.createMethods("run()", "void");
      
      Clazz clientTask = visitAllClientsFlow.createClassAndAssoc("CSClientTask", "tgtTask", R.ONE, "parent", R.ONE)
            .withSuperClazzes(taskFlowClass);
      
      model.createClazz("CTDrawPoint",
         "x", INT, 
         "y", INT,
         "r", INT, 
         "g", INT, 
         "b", INT)
         .withSuperClazzes(clientTask);
      
      model.createClazz("CTClearDrawing")
      .withSuperClazzes(clientTask);
      
      model.createClazz("P2PNetworkLoginFlow", 
         "firstPeer", PeerProxy.class.getName(), 
         "clientPeer", PeerProxy.class.getName(),
         "clientName", STRING,
         "allMessages", STRING,
         "peerList", PeerProxySet.class.getName())
         .withSuperClazzes(taskFlowClass)
         .withMethods("run()", "void")
         .withMethods("getTaskNames()", "Object[]");
      
      model.createClazz("P2PChatMessageFlow", 
         "msg", STRING, 
         "pos", INT)
         .withSuperClazzes(taskFlowClass)
         .createMethods("run()", "void");
         
      storyboard.addToDo("we should build attr.remove", Storyboard.BACKLOG, "zuendorf", "04.10.2012 12:50:42", 0, 8);
      
      model.generate("examples");

      storyboard.addSVGImage(model.dumpClassDiagram("examples", "PeerToPeerChatModel"));

      storyboard.dumpHTML();
   }
}
