package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;

public class AssignmentPO extends PatternObject<AssignmentPO, Assignment>
{
   public AssignmentSet allMatches()
   {
      this.setDoAllMatches(true);
      
      AssignmentSet matches = new AssignmentSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Assignment) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

