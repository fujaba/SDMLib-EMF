package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;

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

