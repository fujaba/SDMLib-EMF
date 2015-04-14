package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.json.JsonIdMap;
import org.sdmlib.examples.chats.P2PNetworkLoginFlow;

public class P2PNetworkLoginFlowPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new P2PNetworkLoginFlowPO(new P2PNetworkLoginFlow[]{});
      } else {
          return new P2PNetworkLoginFlowPO();
      }
   }
   
   public static JsonIdMap createIdMap(String sessionID) {
      return CreatorCreator.createIdMap(sessionID);
   }
}
