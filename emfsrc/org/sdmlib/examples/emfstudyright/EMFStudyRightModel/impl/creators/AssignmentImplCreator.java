package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.CreatorCreator;
import org.sdmlib.serialization.interfaces.EntityFactory;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class AssignmentImplCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      Assignment.PROPERTY_NAME,
      Assignment.PROPERTY_POINTS,
      Assignment.PROPERTY_ROOM,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory.eINSTANCE.createAssignment();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((AssignmentImpl) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((AssignmentImpl) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((AssignmentImpl) entity).removeYou();
   }
}







