package org.sdmlib.examples.chats;

import org.junit.Test;
import org.sdmlib.logger.PeerProxy;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.logger.util.PeerProxySet;
import org.sdmlib.models.classes.Card;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.DataType;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.storyboards.Storyboard;

import de.uniks.networkparser.json.JsonIdMap;

public class PeerToPeerChatModel
{
   private static final String INT = "int";
   private static final String STRING = "String";
   private static final String PEER_TO_PEER_CHAT = "org.sdmlib.examples.chats.PeerToPeerChat";
   private Clazz clientTask;

   @Test
   public void peerToPeerChatModel()
   {
      Storyboard storyboard = new Storyboard("examples");

      ClassModel model = new ClassModel("org.sdmlib.examples.chats");

      Clazz peerToPeerChatClass = model.createClazz(PEER_TO_PEER_CHAT);

      Clazz taskFlowClass = model.createClazz(TaskFlow.class.getName()) 
            .withAttribute("taskNo", DataType.INT)
            .withAttribute("idMap", DataType.ref(SDMLibJsonIdMap.class))
            .withExternal(true);

      taskFlowClass.withAssoc(taskFlowClass, "subFlow", Card.ONE, "parent", Card.ONE);

      model.createClazz("ChatMessageFlow") 
      .withAttribute("msg", DataType.STRING)
      .withAttribute("gui", DataType.ref(PEER_TO_PEER_CHAT))
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID);

      model.createClazz("DrawPointFlow")
      .withAttribute("x", DataType.INT) 
      .withAttribute("y", DataType.INT)
      .withAttribute("r", DataType.INT) 
      .withAttribute("g", DataType.INT) 
      .withAttribute("b", DataType.INT)
      .withAttribute("gui", DataType.ref(PEER_TO_PEER_CHAT))
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID);

      model.createClazz(ClearDrawingFlow.class.getName())
      .withAttribute("gui", DataType.ref(PEER_TO_PEER_CHAT))
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID);

      model.createClazz("PeerToPeerChatArgs") 
      .withAttribute("userName", DataType.STRING)
      .withAttribute("localPort", DataType.INT)
      .withAttribute("peerIp", DataType.STRING)
      .withAttribute("peerPort", DataType.INT);


      model.createClazz(PeerProxy.class.getName()) 
      .withAttribute("ip", DataType.STRING) 
      .withAttribute("port", DataType.INT) 
      .withAttribute("idMap", DataType.ref(JsonIdMap.class))
      .withExternal(true);


      model.createClazz("CSChatMessageFlow") 
      .withAttribute("msg", DataType.STRING)
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID);

      model.createClazz("ChatServer") 
      .withAttribute("allMessages", DataType.STRING) 
      .withAttribute("allPeers", DataType.ref(PeerProxySet.class));

      model.createClazz(ClientLoginFlow.class.getName()) 
      .withAttribute("server", DataType.ref(PeerProxySet.class)) 
      .withAttribute("clientIP", DataType.STRING) 
      .withAttribute("clientPort", DataType.INT) 
      .withAttribute("allMessagesText", DataType.STRING)
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID);

      model.createClazz("CSDrawPointFlow")
      .withAttribute("x", DataType.INT) 
      .withAttribute("y", DataType.INT)
      .withAttribute("r", DataType.INT) 
      .withAttribute("g", DataType.INT) 
      .withAttribute("b", DataType.INT)
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID);

      model.createClazz("CSClearDrawingFlow")
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID);

      Clazz visitAllClientsFlow = model.createClazz("CSVisitAllClientsFlow")
            .withSuperClazz(taskFlowClass);

      visitAllClientsFlow.withMethod("run", DataType.VOID);

      Clazz clientTask = model.createClazz("CSClientTask");
      visitAllClientsFlow.withAssoc(clientTask, "tgtTask", Card.ONE, "parent", Card.ONE)
      .withSuperClazz(taskFlowClass);

      model.createClazz("CTDrawPoint")
      .withAttribute("x", DataType.INT) 
      .withAttribute("y", DataType.INT)
      .withAttribute("r", DataType.INT) 
      .withAttribute("g", DataType.INT) 
      .withAttribute("b", DataType.INT)
      .withSuperClazz(clientTask);

      model.createClazz("CTClearDrawing")
      .withSuperClazz(clientTask);

      model.createClazz("P2PNetworkLoginFlow") 
      .withAttribute("firstPeer", DataType.ref(PeerProxySet.class)) 
      .withAttribute("clientPeer", DataType.ref(PeerProxySet.class))
      .withAttribute("clientName", DataType.STRING)
      .withAttribute("allMessages", DataType.STRING)
      .withAttribute("peerList", DataType.ref(PeerProxySet.class))
      .withSuperClazz(taskFlowClass)
      .withMethod("run", DataType.VOID)
      .withMethod("getTaskNames", DataType.ref("Object[]"));

      model.createClazz("P2PChatMessageFlow") 
         .withAttribute("msg", DataType.STRING) 
         .withAttribute("pos", DataType.INT)
         .withSuperClazz(taskFlowClass)
         .withMethod("run", DataType.VOID);

      storyboard.addToDo("we should build attr.remove", Storyboard.BACKLOG, "zuendorf", "04.10.2012 12:50:42", 0, 8);

      model.generate("examples");

      storyboard.addClassDiagram(model, "examples");

      storyboard.dumpHTML();
   }
}
