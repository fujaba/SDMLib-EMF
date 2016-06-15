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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import de.uniks.networkparser.IdMap;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;

public class UniversityCreator implements SendableEntityCreator
{
   public static final String PROPERTY_NAME = "name";
   public static final String PROPERTY_ROOMS = "rooms";
   public static final String PROPERTY_STUDENTS = "students";
   private final String[] properties = new String[]
   {
      PROPERTY_NAME,
      UniversityCreator.PROPERTY_ROOMS,
      UniversityCreator.PROPERTY_STUDENTS,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return EMFStudyRightModelFactory.eINSTANCE.createUniversity();
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

      if (UniversityCreator.PROPERTY_NAME.equalsIgnoreCase(attribute))
      {
         return ((University) target).getName();
      }

      if (UniversityCreator.PROPERTY_ROOMS.equalsIgnoreCase(attribute))
      {
         return ((University) target).getRooms();
      }

      if (UniversityCreator.PROPERTY_STUDENTS.equalsIgnoreCase(attribute))
      {
         return ((University) target).getStudents();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (UniversityCreator.PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         ((University) target).setName((String) value);
         return true;
      }

      if (SendableEntityCreator.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (UniversityCreator.PROPERTY_ROOMS.equalsIgnoreCase(attrName))
      {
         ((University) target).getRooms().add((Room) value);
         return true;
      }
      
      if ((UniversityCreator.PROPERTY_ROOMS + SendableEntityCreator.REMOVE).equalsIgnoreCase(attrName))
      {
         ((University) target).getRooms().remove((Room) value);
         return true;
      }

      if (UniversityCreator.PROPERTY_STUDENTS.equalsIgnoreCase(attrName))
      {
         ((University) target).getStudents().add((Student) value);
         return true;
      }
      
      if ((UniversityCreator.PROPERTY_STUDENTS + SendableEntityCreator.REMOVE).equalsIgnoreCase(attrName))
      {
         ((University) target).getStudents().remove((Student) value);
         return true;
      }
      
      return false;
   }
   public static IdMap createIdMap(String sessionID)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap(sessionID);
   }}
