/*
   Copyright (c) 2016 zuendorf
   
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
   
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import de.uniks.networkparser.interfaces.SendableEntityCreator;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import de.uniks.networkparser.IdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class RoomCreator implements SendableEntityCreator
{
   public static final String PROPERTY_TOPIC = "topic";
   public static final String PROPERTY_CREDITS = "credits";
   public static final String PROPERTY_UNI = "uni";
   public static final String PROPERTY_STUDENTS = "students";
   public static final String PROPERTY_TAS = "tas";
   public static final String PROPERTY_DOORSREV = "doorsRev";
   public static final String PROPERTY_DOORS = "doors";
   public static final String PROPERTY_ASSIGNMENTS = "assignments";
   private final String[] properties = new String[]
   {
      PROPERTY_TOPIC,
      PROPERTY_CREDITS,
      RoomCreator.PROPERTY_UNI,
      RoomCreator.PROPERTY_STUDENTS,
      RoomCreator.PROPERTY_TAS,
      RoomCreator.PROPERTY_DOORSREV,
      RoomCreator.PROPERTY_DOORS,
      RoomCreator.PROPERTY_ASSIGNMENTS,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return EMFStudyRightModelFactory.eINSTANCE.createRoom();
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

      if (RoomCreator.PROPERTY_TOPIC.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getTopic();
      }

      if (RoomCreator.PROPERTY_CREDITS.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getCredits();
      }

      if (RoomCreator.PROPERTY_UNI.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getUni();
      }

      if (RoomCreator.PROPERTY_STUDENTS.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getStudents();
      }

      if (RoomCreator.PROPERTY_TAS.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getTas();
      }

      if (RoomCreator.PROPERTY_DOORSREV.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getDoorsRev();
      }

      if (RoomCreator.PROPERTY_DOORS.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getDoors();
      }

      if (RoomCreator.PROPERTY_ASSIGNMENTS.equalsIgnoreCase(attribute))
      {
         return ((Room) target).getAssignments();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (RoomCreator.PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         ((Room) target).setCredits(Integer.parseInt(value.toString()));
         return true;
      }

      if (RoomCreator.PROPERTY_TOPIC.equalsIgnoreCase(attrName))
      {
         ((Room) target).setTopic((String) value);
         return true;
      }

      if (SendableEntityCreator.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (RoomCreator.PROPERTY_STUDENTS.equalsIgnoreCase(attrName))
      {
         ((Room) target).getStudents().add((Student) value);
         return true;
      }
      
      if ((RoomCreator.PROPERTY_STUDENTS + SendableEntityCreator.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Room) target).getStudents().remove((Student) value);
         return true;
      }

      if (RoomCreator.PROPERTY_TAS.equalsIgnoreCase(attrName))
      {
         ((Room) target).getTas().add((TeachingAssistant) value);
         return true;
      }
      
      if ((RoomCreator.PROPERTY_TAS + SendableEntityCreator.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Room) target).getTas().remove((TeachingAssistant) value);
         return true;
      }

      if (RoomCreator.PROPERTY_DOORSREV.equalsIgnoreCase(attrName))
      {
         ((Room) target).getDoorsRev().add((Room) value);
         return true;
      }
      
      if ((RoomCreator.PROPERTY_DOORSREV + SendableEntityCreator.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Room) target).getDoorsRev().remove((Room) value);
         return true;
      }

      if (RoomCreator.PROPERTY_DOORS.equalsIgnoreCase(attrName))
      {
         ((Room) target).getDoors().add((Room) value);
         return true;
      }
      
      if ((RoomCreator.PROPERTY_DOORS + SendableEntityCreator.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Room) target).getDoors().remove((Room) value);
         return true;
      }

      if (RoomCreator.PROPERTY_ASSIGNMENTS.equalsIgnoreCase(attrName))
      {
         ((Room) target).getAssignments().add((Assignment) value);
         return true;
      }
      
      if ((RoomCreator.PROPERTY_ASSIGNMENTS + SendableEntityCreator.REMOVE).equalsIgnoreCase(attrName))
      {
         ((Room) target).getAssignments().remove((Assignment) value);
         return true;
      }
      
      return false;
   }
   public static IdMap createIdMap(String sessionID)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }}
