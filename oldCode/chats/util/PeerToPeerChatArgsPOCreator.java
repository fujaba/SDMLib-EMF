package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.json.JsonIdMap;
import org.sdmlib.examples.chats.PeerToPeerChatArgs;

public class PeerToPeerChatArgsPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new PeerToPeerChatArgsPO(new PeerToPeerChatArgs[]{});
      } else {
          return new PeerToPeerChatArgsPO();
      }
   }
   
   public static JsonIdMap createIdMap(String sessionID) {
      return CreatorCreator.createIdMap(sessionID);
   }
}
