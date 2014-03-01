package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.CreatorCreator;
import org.sdmlib.serialization.interfaces.EntityFactory;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;

public class UniversityImplCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      University.PROPERTY_NAME,
      University.PROPERTY_ROOMS,
      University.PROPERTY_STUDENTS,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory.eINSTANCE.createUniversity();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((UniversityImpl) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((UniversityImpl) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((UniversityImpl) entity).removeYou();
   }
}

