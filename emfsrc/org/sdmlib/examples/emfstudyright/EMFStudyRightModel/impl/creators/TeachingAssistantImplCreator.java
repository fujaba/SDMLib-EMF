package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.CreatorCreator;
import org.sdmlib.serialization.interfaces.EntityFactory;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;

public class TeachingAssistantImplCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      Student.PROPERTY_NAME,
      Student.PROPERTY_STUDID,
      Student.PROPERTY_CREDITS,
      Student.PROPERTY_MOTIVATION,
      Student.PROPERTY_ASSIGNMENTPOINTS,
      Student.PROPERTY_UNI,
      Student.PROPERTY_IN,
      Student.PROPERTY_FRIENDS,
      Student.PROPERTY_DONE,
      TeachingAssistant.PROPERTY_ROOM,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory.eINSTANCE.createTeachingAssistant();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((TeachingAssistantImpl) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((TeachingAssistantImpl) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((TeachingAssistantImpl) entity).removeYou();
   }
}

