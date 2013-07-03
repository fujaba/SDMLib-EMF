package org.sdmlib.examples.groupAccount.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.groupAccount.GroupAccountTests;
import org.sdmlib.examples.groupAccount.creators.GroupAccountTestsSet;

public class GroupAccountTestsPO extends PatternObject<GroupAccountTestsPO, GroupAccountTests>
{
   public GroupAccountTestsSet allMatches()
   {
      this.setDoAllMatches(true);
      
      GroupAccountTestsSet matches = new GroupAccountTestsSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((GroupAccountTests) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

