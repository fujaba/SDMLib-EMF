package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.ReplicationMauMauServer;
import org.sdmlib.examples.replication.maumau.creators.ReplicationMauMauServerSet;

public class ReplicationMauMauServerPO extends PatternObject<ReplicationMauMauServerPO, ReplicationMauMauServer>
{
   public ReplicationMauMauServerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ReplicationMauMauServerSet matches = new ReplicationMauMauServerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ReplicationMauMauServer) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

