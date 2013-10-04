package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.replication.creators.TaskHandlerSet;
import org.sdmlib.examples.replication.maumau.creators.TaskHandlerSetSet;

public class TaskHandlerSetPO extends PatternObject<TaskHandlerSetPO, TaskHandlerSet>
{
   public TaskHandlerSetSet allMatches()
   {
      this.setDoAllMatches(true);
      
      TaskHandlerSetSet matches = new TaskHandlerSetSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((TaskHandlerSet) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

