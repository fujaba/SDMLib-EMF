package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.CreatorCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl;
import org.sdmlib.serialization.EntityFactory;

import de.uniks.networkparser.json.JsonIdMap;

public class RoomImplCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      Room.PROPERTY_TOPIC,
      Room.PROPERTY_CREDITS,
      Room.PROPERTY_UNI,
      Room.PROPERTY_ASSIGNMENTS,
      Room.PROPERTY_STUDENTS,
      Room.PROPERTY_TAS,
      Room.PROPERTY_DOORS,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory.eINSTANCE.createRoom();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((RoomImpl) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((RoomImpl) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((RoomImpl) entity).removeYou();
   }
}















