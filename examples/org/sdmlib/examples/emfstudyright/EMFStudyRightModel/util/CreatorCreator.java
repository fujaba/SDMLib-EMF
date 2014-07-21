package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import de.uniks.networkparser.json.JsonIdMap;
import org.sdmlib.serialization.SDMLibJsonIdMap;

public class CreatorCreator{

   public static JsonIdMap createIdMap(String sessionID)
   {
      JsonIdMap jsonIdMap = (JsonIdMap) new SDMLibJsonIdMap().withSessionId(sessionID);
      
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.UniversityImplCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.UniversityImplPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.StudentImplCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.StudentImplPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.TeachingAssistantImplCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.TeachingAssistantImplPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.RoomImplCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.RoomImplPOCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.AssignmentImplCreator());
      jsonIdMap.withCreator(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.AssignmentImplPOCreator());

      return jsonIdMap;
   }
}
