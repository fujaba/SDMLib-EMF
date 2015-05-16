package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;

public class ObjectPO extends PatternObject<ObjectPO, Object>
{
   public ObjectSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ObjectSet matches = new ObjectSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Object) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

