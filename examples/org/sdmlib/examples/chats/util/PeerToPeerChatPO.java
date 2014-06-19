package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.PeerToPeerChat;

public class PeerToPeerChatPO extends PatternObject<PeerToPeerChatPO, PeerToPeerChat>
{

    public PeerToPeerChatSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PeerToPeerChatSet matches = new PeerToPeerChatSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((PeerToPeerChat) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public PeerToPeerChatPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public PeerToPeerChatPO(PeerToPeerChat... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
}
