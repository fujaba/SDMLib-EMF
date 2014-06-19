package org.sdmlib.examples.chats.util;

import de.uniks.networkparser.json.JsonIdMap;
import org.sdmlib.serialization.SDMLibJsonIdMap;

class CreatorCreator{

   public static JsonIdMap createIdMap(String sessionID)
   {
      JsonIdMap jsonIdMap = (JsonIdMap) new SDMLibJsonIdMap().withSessionId(sessionID);
      
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerToPeerChatCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerToPeerChatPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.TaskFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.TaskFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ChatMessageFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ChatMessageFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.DrawPointFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.DrawPointFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ClearDrawingFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ClearDrawingFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerToPeerChatArgsCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerToPeerChatArgsPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerProxyCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerProxyPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSChatMessageFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSChatMessageFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ChatServerCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ChatServerPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ClientLoginFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.ClientLoginFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSDrawPointFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSDrawPointFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSClearDrawingFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSClearDrawingFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSVisitAllClientsFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSVisitAllClientsFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSClientTaskCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CSClientTaskPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CTDrawPointCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CTDrawPointPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CTClearDrawingCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.CTClearDrawingPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.P2PNetworkLoginFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.P2PNetworkLoginFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.P2PChatMessageFlowCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.P2PChatMessageFlowPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.SDMLibJsonIdMapCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.SDMLibJsonIdMapPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.JsonIdMapCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.JsonIdMapPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerProxySetCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.chats.util.PeerProxySetPOCreator());

      return jsonIdMap;
   }
}
