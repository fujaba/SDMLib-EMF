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

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import de.uniks.networkparser.interfaces.Condition;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.ObjectSet;
import java.util.Collections;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class AssignmentSet extends SDMSet<Assignment>
{

   public AssignmentSet()
   {
      // empty
   }

   public AssignmentSet(Assignment... objects)
   {
      for (Assignment obj : objects)
      {
         this.add(obj);
      }
   }

   public AssignmentSet(Collection<Assignment> objects)
   {
      this.addAll(objects);
   }

   public static final AssignmentSet EMPTY_SET = new AssignmentSet();


   public AssignmentPO filterAssignmentPO()
   {
      return new AssignmentPO(this.toArray(new Assignment[this.size()]));
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment";
   }


   public AssignmentSet filter(Condition<Assignment> condition) {
      AssignmentSet filterList = new AssignmentSet();
      filterItems(filterList, condition);
      return filterList;
   }

   @SuppressWarnings("unchecked")
   public AssignmentSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Assignment>)value);
      }
      else if (value != null)
      {
         this.add((Assignment) value);
      }
      
      return this;
   }
   
   public AssignmentSet without(Assignment value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Assignment objects and collect a list of the name attribute values. 
    * 
    * @return List of String objects reachable via name attribute
    */
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (Assignment obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Assignment objects and collect those Assignment objects where the name attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Assignment objects that match the parameter
    */
   public AssignmentSet filterName(String value)
   {
      AssignmentSet result = new AssignmentSet();
      
      for (Assignment obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Assignment objects and collect those Assignment objects where the name attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Assignment objects that match the parameter
    */
   public AssignmentSet filterName(String lower, String upper)
   {
      AssignmentSet result = new AssignmentSet();
      
      for (Assignment obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Assignment objects and assign value to the name attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Assignment objects now with new attribute values.
    */
   public AssignmentSet withName(String value)
   {
      for (Assignment obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Assignment objects and collect a list of the points attribute values. 
    * 
    * @return List of int objects reachable via points attribute
    */
   public intList getPoints()
   {
      intList result = new intList();
      
      for (Assignment obj : this)
      {
         result.add(obj.getPoints());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Assignment objects and collect those Assignment objects where the points attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Assignment objects that match the parameter
    */
   public AssignmentSet filterPoints(int value)
   {
      AssignmentSet result = new AssignmentSet();
      
      for (Assignment obj : this)
      {
         if (value == obj.getPoints())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Assignment objects and collect those Assignment objects where the points attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Assignment objects that match the parameter
    */
   public AssignmentSet filterPoints(int lower, int upper)
   {
      AssignmentSet result = new AssignmentSet();
      
      for (Assignment obj : this)
      {
         if (lower <= obj.getPoints() && obj.getPoints() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Assignment objects and assign value to the points attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Assignment objects now with new attribute values.
    */
   public AssignmentSet withPoints(int value)
   {
      for (Assignment obj : this)
      {
         obj.setPoints(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Assignment objects and collect a set of the Student objects reached via students. 
    * 
    * @return Set of Student objects reachable via students
    */
   public StudentSet getStudents()
   {
      StudentSet result = new StudentSet();
      
      for (Assignment obj : this)
      {
         result.with(obj.getStudents());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Assignment objects and collect all contained objects with reference students pointing to the object passed as parameter. 
    * 
    * @param value The object required as students neighbor of the collected results. 
    * 
    * @return Set of Student objects referring to value via students
    */
   public AssignmentSet filterStudents(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection<?>) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      AssignmentSet answer = new AssignmentSet();
      
      for (Assignment obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getStudents()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Assignment object passed as parameter to the Students attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Students attributes.
    */
   public AssignmentSet withStudents(Student value)
   {
      for (Assignment obj : this)
      {
         obj.getStudents().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Assignment object passed as parameter from the Students attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public AssignmentSet withoutStudents(Student value)
   {
      for (Assignment obj : this)
      {
         obj.getStudents().remove(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Assignment objects and collect a set of the Room objects reached via room. 
    * 
    * @return Set of Room objects reachable via room
    */
   public RoomSet getRoom()
   {
      RoomSet result = new RoomSet();
      
      for (Assignment obj : this)
      {
         result.with(obj.getRoom());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Assignment objects and collect all contained objects with reference room pointing to the object passed as parameter. 
    * 
    * @param value The object required as room neighbor of the collected results. 
    * 
    * @return Set of Room objects referring to value via room
    */
   public AssignmentSet filterRoom(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection<?>) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      AssignmentSet answer = new AssignmentSet();
      
      for (Assignment obj : this)
      {
         if (neighbors.contains(obj.getRoom()) || (neighbors.isEmpty() && obj.getRoom() == null))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Assignment object passed as parameter to the Room attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Room attributes.
    */
   public AssignmentSet withRoom(Room value)
   {
      for (Assignment obj : this)
      {
         obj.setRoom(value);
      }
      
      return this;
   }

}
