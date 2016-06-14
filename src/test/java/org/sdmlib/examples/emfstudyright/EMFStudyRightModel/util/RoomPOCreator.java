package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.IdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class RoomPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new RoomPO(new Room[]{});
      } else {
          return new RoomPO();
      }
   }
   
   public static IdMap createIdMap(String sessionID) {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }
}
