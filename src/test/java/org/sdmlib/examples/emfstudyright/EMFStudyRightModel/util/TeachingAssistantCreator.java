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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import de.uniks.networkparser.IdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;

public class TeachingAssistantCreator implements SendableEntityCreator
{
   public static final String PROPERTY_NOOFHOURS = "noOfHours";
   public static final String PROPERTY_NAME = "name";
   public static final String PROPERTY_STUDID = "studId";
   public static final String PROPERTY_CREDITS = "credits";
   public static final String PROPERTY_MOTIVATION = "motivation";
   public static final String PROPERTY_ASSIGNMENTPOINTS = "assignmentPoints";
   public static final String PROPERTY_ROOM = "room";
   private final String[] properties = new String[]
   {
      PROPERTY_NOOFHOURS,
      PROPERTY_NAME,
      PROPERTY_STUDID,
      PROPERTY_CREDITS,
      PROPERTY_MOTIVATION,
      PROPERTY_ASSIGNMENTPOINTS,
      TeachingAssistantCreator.PROPERTY_ROOM,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return EMFStudyRightModelFactory.eINSTANCE.createTeachingAssistant();
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

      if (TeachingAssistantCreator.PROPERTY_NOOFHOURS.equalsIgnoreCase(attribute))
      {
         return ((TeachingAssistant) target).getNoOfHours();
      }

      if (StudentCreator.PROPERTY_NAME.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getName();
      }

      if (StudentCreator.PROPERTY_STUDID.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getStudId();
      }

      if (StudentCreator.PROPERTY_CREDITS.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getCredits();
      }

      if (StudentCreator.PROPERTY_MOTIVATION.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getMotivation();
      }

      if (StudentCreator.PROPERTY_ASSIGNMENTPOINTS.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getAssignmentPoints();
      }

      if (TeachingAssistantCreator.PROPERTY_ROOM.equalsIgnoreCase(attribute))
      {
         return ((TeachingAssistant) target).getRoom();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (StudentCreator.PROPERTY_ASSIGNMENTPOINTS.equalsIgnoreCase(attrName))
      {
         ((Student) target).setAssignmentPoints(Integer.parseInt(value.toString()));
         return true;
      }

      if (StudentCreator.PROPERTY_MOTIVATION.equalsIgnoreCase(attrName))
      {
         ((Student) target).setMotivation(Integer.parseInt(value.toString()));
         return true;
      }

      if (StudentCreator.PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         ((Student) target).setCredits(Integer.parseInt(value.toString()));
         return true;
      }

      if (StudentCreator.PROPERTY_STUDID.equalsIgnoreCase(attrName))
      {
         ((Student) target).setStudId((String) value);
         return true;
      }

      if (StudentCreator.PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         ((Student) target).setName((String) value);
         return true;
      }

      if (TeachingAssistantCreator.PROPERTY_NOOFHOURS.equalsIgnoreCase(attrName))
      {
         ((TeachingAssistant) target).setNoOfHours(Integer.parseInt(value.toString()));
         return true;
      }

      if (SendableEntityCreator.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      
      return false;
   }
   public static IdMap createIdMap(String sessionID)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }}
