package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.json.JsonIdMap;
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
   
   public static JsonIdMap createIdMap(String sessionID) {
      return CreatorCreator.createIdMap(sessionID);
   }
}
