package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.IdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;

public class TeachingAssistantPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new TeachingAssistantPO(new TeachingAssistant[]{});
      } else {
          return new TeachingAssistantPO();
      }
   }
   
   public static IdMap createIdMap(String sessionID) {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }
}
