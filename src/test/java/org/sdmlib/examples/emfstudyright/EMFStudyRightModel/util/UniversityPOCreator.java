package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.IdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

public class UniversityPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new UniversityPO(new University[]{});
      } else {
          return new UniversityPO();
      }
   }
   
   public static IdMap createIdMap(String sessionID) {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }
}
