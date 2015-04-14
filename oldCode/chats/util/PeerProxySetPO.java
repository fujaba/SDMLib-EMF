package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.logger.util.PeerProxySet;

public class PeerProxySetPO extends PatternObject<PeerProxySetPO, PeerProxySet>
{

    public PeerProxySetSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PeerProxySetSet matches = new PeerProxySetSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((PeerProxySet) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public PeerProxySetPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public PeerProxySetPO(PeerProxySet... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
}
