package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.Value;
import org.sdmlib.models.pattern.PatternObject;

public class ValuePO extends PatternObject<ValuePO, Value>
{
   public ValueSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ValueSet matches = new ValueSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Value) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

