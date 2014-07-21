/*
   Copyright (c) 2014 zuendorf 
   
   Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
   and associated documentation files (the "Software"), to deal in the Software without restriction, 
   including without limitation the rights to use, copy, modify, merge, publish, distribute, 
   sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is 
   furnished to do so, subject to the following conditions: 
   
   The above copyright notice and this permission notice shall be included in all copies or 
   substantial portions of the Software. 
   
   The Software shall be used for Good, not Evil. 
   
   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
   BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
   DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */
   
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util;

import org.sdmlib.serialization.EntityFactory;
import de.uniks.networkparser.json.JsonIdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class RoomImplCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      Room.PROPERTY_TOPIC,
      Room.PROPERTY_CREDITS,
      Room.PROPERTY_UNI,
      Room.PROPERTY_STUDENTS,
      Room.PROPERTY_TAS,
      Room.PROPERTY_DOORSREV,
      Room.PROPERTY_DOORS,
      Room.PROPERTY_ASSIGNMENTS,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory.eINSTANCE.createRoom();
   }
   
   @Override
   public Object getValue(Object target, String attrName)
   {
      int pos = attrName.indexOf('.');
      String attribute = attrName;
      
      if (pos > 0)
      {
         attribute = attrName.substring(0, pos);
      }

      if (Room.PROPERTY_TOPIC.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getTopic();
      }

      if (Room.PROPERTY_CREDITS.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getCredits();
      }

      if (RoomImpl.PROPERTY_UNI.equalsIgnoreCase(attribute))
      {
         return ((RoomImpl) target).getUni();
      }

      if (RoomImpl.PROPERTY_STUDENTS.equalsIgnoreCase(attribute))
      {
         return ((RoomImpl) target).getStudents();
      }

      if (RoomImpl.PROPERTY_TAS.equalsIgnoreCase(attribute))
      {
         return ((RoomImpl) target).getTas();
      }

      if (RoomImpl.PROPERTY_DOORSREV.equalsIgnoreCase(attribute))
      {
         return ((RoomImpl) target).getDoorsRev();
      }

      if (RoomImpl.PROPERTY_DOORS.equalsIgnoreCase(attribute))
      {
         return ((RoomImpl) target).getDoors();
      }

      if (RoomImpl.PROPERTY_ASSIGNMENTS.equalsIgnoreCase(attribute))
      {
         return ((RoomImpl) target).getAssignments();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (Room.PROPERTY_TOPIC.equalsIgnoreCase(attrName))
      {
         ((Room) target).withTopic((String) value);
         return true;
      }

      if (Room.PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         ((Room) target).withCredits(Integer.parseInt(value.toString()));
         return true;
      }

      if (RoomImpl.PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).setUni((University) value);
         return true;
      }

      if (RoomImpl.PROPERTY_STUDENTS.equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withStudents((Student) value);
         return true;
      }
      
      if ((RoomImpl.PROPERTY_STUDENTS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withoutStudents((Student) value);
         return true;
      }

      if (RoomImpl.PROPERTY_TAS.equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withTas((TeachingAssistant) value);
         return true;
      }
      
      if ((RoomImpl.PROPERTY_TAS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withoutTas((TeachingAssistant) value);
         return true;
      }

      if (RoomImpl.PROPERTY_DOORSREV.equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withDoorsRev((Room) value);
         return true;
      }
      
      if ((RoomImpl.PROPERTY_DOORSREV + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withoutDoorsRev((Room) value);
         return true;
      }

      if (RoomImpl.PROPERTY_DOORS.equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withDoors((Room) value);
         return true;
      }
      
      if ((RoomImpl.PROPERTY_DOORS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withoutDoors((Room) value);
         return true;
      }

      if (RoomImpl.PROPERTY_ASSIGNMENTS.equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withAssignments((Assignment) value);
         return true;
      }
      
      if ((RoomImpl.PROPERTY_ASSIGNMENTS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((RoomImpl) target).withoutAssignments((Assignment) value);
         return true;
      }
      
      return false;
   }
   public static JsonIdMap createIdMap(String sessionID)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }
   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((RoomImpl) entity).removeYou();
   }
}
