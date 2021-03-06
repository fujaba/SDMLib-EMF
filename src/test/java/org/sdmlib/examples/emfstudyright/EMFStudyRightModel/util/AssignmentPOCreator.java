package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.IdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class AssignmentPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new AssignmentPO(new Assignment[]{});
      } else {
          return new AssignmentPO();
      }
   }
   
   public static IdMap createIdMap(String sessionID) {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }
}
