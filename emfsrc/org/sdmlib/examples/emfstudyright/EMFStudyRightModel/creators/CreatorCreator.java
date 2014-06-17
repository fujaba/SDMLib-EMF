package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import java.util.LinkedHashSet;

import org.sdmlib.serialization.SDMLibJsonIdMap;

import de.uniks.networkparser.interfaces.SendableEntityCreator;
import de.uniks.networkparser.json.JsonIdMap;

public class CreatorCreator
{
   public static LinkedHashSet<SendableEntityCreator> creatorSet = null;
   
   public static LinkedHashSet<SendableEntityCreator> getCreatorSet()
   {
      if (creatorSet == null)
      {
         creatorSet = new LinkedHashSet<SendableEntityCreator>();
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.UniversityImplCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.UniversityImplPOCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.StudentImplCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.StudentImplPOCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.TeachingAssistantImplCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.TeachingAssistantImplPOCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.RoomImplCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.RoomImplPOCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.AssignmentImplCreator());
         creatorSet.add(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.AssignmentImplPOCreator());
         creatorSet.addAll(org.sdmlib.models.pattern.creators.CreatorCreator.getCreatorSet());
      }
      
      return creatorSet;
   }

   public static JsonIdMap createIdMap(String sessionID)
   {
      JsonIdMap jsonIdMap = (JsonIdMap) new SDMLibJsonIdMap().withSessionId(sessionID);
      
      jsonIdMap.withCreator(getCreatorSet());

      return jsonIdMap;
   }
}

