package EMFStudyRightModel.util;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.AssignmentImplCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.AssignmentImplPOCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.RoomImplCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.RoomImplPOCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.StudentImplCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.StudentImplPOCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.TeachingAssistantImplCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.TeachingAssistantImplPOCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.UniversityImplCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.UniversityImplPOCreator;
import de.uniks.networkparser.IdMap;
import org.sdmlib.serialization.SDMLibJsonIdMap;

class CreatorCreator {

   public static IdMap createIdMap(String sessionID)
   {
      IdMap jsonIdMap =  new IdMap().withSessionId(sessionID);
      jsonIdMap.with(new UniversityImplCreator());
      jsonIdMap.with(new UniversityImplPOCreator());
      jsonIdMap.with(new StudentImplCreator());
      jsonIdMap.with(new StudentImplPOCreator());
      jsonIdMap.with(new TeachingAssistantImplCreator());
      jsonIdMap.with(new TeachingAssistantImplPOCreator());
      jsonIdMap.with(new RoomImplCreator());
      jsonIdMap.with(new RoomImplPOCreator());
      jsonIdMap.with(new AssignmentImplCreator());
      jsonIdMap.with(new AssignmentImplPOCreator());
      return jsonIdMap;
   }
}
