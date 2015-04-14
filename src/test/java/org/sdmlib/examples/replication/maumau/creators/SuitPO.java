package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.Suit;
import org.sdmlib.examples.replication.maumau.creators.SuitSet;

public class SuitPO extends PatternObject<SuitPO, Suit>
{
   public SuitSet allMatches()
   {
      this.setDoAllMatches(true);
      
      SuitSet matches = new SuitSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Suit) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

