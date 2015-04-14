package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.replication.creators.LaneSet;
import org.sdmlib.examples.replication.maumau.creators.LaneSetSet;

public class LaneSetPO extends PatternObject<LaneSetPO, LaneSet>
{
   public LaneSetSet allMatches()
   {
      this.setDoAllMatches(true);
      
      LaneSetSet matches = new LaneSetSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((LaneSet) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

