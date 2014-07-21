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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class StudentImplCreator extends EntityFactory
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
      Student.PROPERTY_FRIENDSREV,
      Student.PROPERTY_FRIENDS,
      Student.PROPERTY_DONE,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return org.sdmlib.examples.emfstudyright.EMFStudyRightModel.EMFStudyRightModelFactory.eINSTANCE.createStudent();
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

      if (Student.PROPERTY_NAME.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getName();
      }

      if (Student.PROPERTY_STUDID.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getStudId();
      }

      if (Student.PROPERTY_CREDITS.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getCredits();
      }

      if (Student.PROPERTY_MOTIVATION.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getMotivation();
      }

      if (Student.PROPERTY_ASSIGNMENTPOINTS.equalsIgnoreCase(attribute))
      {
         return ((Student) target).getAssignmentPoints();
      }

      if (StudentImpl.PROPERTY_UNI.equalsIgnoreCase(attribute))
      {
         return ((StudentImpl) target).getUni();
      }

      if (StudentImpl.PROPERTY_IN.equalsIgnoreCase(attribute))
      {
         return ((StudentImpl) target).getIn();
      }

      if (StudentImpl.PROPERTY_FRIENDSREV.equalsIgnoreCase(attribute))
      {
         return ((StudentImpl) target).getFriendsRev();
      }

      if (StudentImpl.PROPERTY_FRIENDS.equalsIgnoreCase(attribute))
      {
         return ((StudentImpl) target).getFriends();
      }

      if (StudentImpl.PROPERTY_DONE.equalsIgnoreCase(attribute))
      {
         return ((StudentImpl) target).getDone();
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

      if (Student.PROPERTY_NAME.equalsIgnoreCase(attrName))
      {
         ((Student) target).withName((String) value);
         return true;
      }

      if (Student.PROPERTY_STUDID.equalsIgnoreCase(attrName))
      {
         ((Student) target).withStudId((String) value);
         return true;
      }

      if (Student.PROPERTY_CREDITS.equalsIgnoreCase(attrName))
      {
         ((Student) target).withCredits(Integer.parseInt(value.toString()));
         return true;
      }

      if (Student.PROPERTY_MOTIVATION.equalsIgnoreCase(attrName))
      {
         ((Student) target).withMotivation(Integer.parseInt(value.toString()));
         return true;
      }

      if (Student.PROPERTY_ASSIGNMENTPOINTS.equalsIgnoreCase(attrName))
      {
         ((Student) target).withAssignmentPoints(Integer.parseInt(value.toString()));
         return true;
      }

      if (StudentImpl.PROPERTY_UNI.equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).setUni((University) value);
         return true;
      }

      if (StudentImpl.PROPERTY_IN.equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).setIn((Room) value);
         return true;
      }

      if (StudentImpl.PROPERTY_FRIENDSREV.equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).withFriendsRev((Student) value);
         return true;
      }
      
      if ((StudentImpl.PROPERTY_FRIENDSREV + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).withoutFriendsRev((Student) value);
         return true;
      }

      if (StudentImpl.PROPERTY_FRIENDS.equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).withFriends((Student) value);
         return true;
      }
      
      if ((StudentImpl.PROPERTY_FRIENDS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).withoutFriends((Student) value);
         return true;
      }

      if (StudentImpl.PROPERTY_DONE.equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).withDone((Assignment) value);
         return true;
      }
      
      if ((StudentImpl.PROPERTY_DONE + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         ((StudentImpl) target).withoutDone((Assignment) value);
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
      ((StudentImpl) entity).removeYou();
   }
}
