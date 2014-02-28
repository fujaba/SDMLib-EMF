package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.CreatorCreator;
import org.sdmlib.serialization.interfaces.EntityFactory;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;

public class StudentImplCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      Student.PROPERTY_NAME,
      Student.PROPERTY_CREDITS,
      Student.PROPERTY_MOTIVATION,
      Student.PROPERTY_UNI,
      Student.PROPERTY_FRIENDS,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory.eINSTANCE.createStudent();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((StudentImpl) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((StudentImpl) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((StudentImpl) entity).removeYou();
   }
}







