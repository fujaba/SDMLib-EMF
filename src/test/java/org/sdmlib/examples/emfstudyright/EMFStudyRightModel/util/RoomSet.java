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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import de.uniks.networkparser.interfaces.Condition;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversitySet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import java.util.Collections;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.TeachingAssistantSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class RoomSet extends SDMSet<Room>
{

   public RoomSet()
   {
      // empty
   }

   public RoomSet(Room... objects)
   {
      for (Room obj : objects)
      {
         this.add(obj);
      }
   }

   public RoomSet(Collection<Room> objects)
   {
      this.addAll(objects);
   }

   public static final RoomSet EMPTY_SET = new RoomSet();


   public RoomPO filterRoomPO()
   {
      return new RoomPO(this.toArray(new Room[this.size()]));
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room";
   }


   public RoomSet filter(Condition<Room> condition) {
      RoomSet filterList = new RoomSet();
      filterItems(filterList, condition);
      return filterList;
   }

   @SuppressWarnings("unchecked")
   public RoomSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Room>)value);
      }
      else if (value != null)
      {
         this.add((Room) value);
      }
      
      return this;
   }
   
   public RoomSet without(Room value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Room objects and collect a list of the topic attribute values. 
    * 
    * @return List of String objects reachable via topic attribute
    */
   public StringList getTopic()
   {
      StringList result = new StringList();
      
      for (Room obj : this)
      {
         result.add(obj.getTopic());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Room objects and collect those Room objects where the topic attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Room objects that match the parameter
    */
   public RoomSet filterTopic(String value)
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         if (value.equals(obj.getTopic()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Room objects and collect those Room objects where the topic attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Room objects that match the parameter
    */
   public RoomSet filterTopic(String lower, String upper)
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         if (lower.compareTo(obj.getTopic()) <= 0 && obj.getTopic().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Room objects and assign value to the topic attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Room objects now with new attribute values.
    */
   public RoomSet withTopic(String value)
   {
      for (Room obj : this)
      {
         obj.setTopic(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Room objects and collect a list of the credits attribute values. 
    * 
    * @return List of int objects reachable via credits attribute
    */
   public intList getCredits()
   {
      intList result = new intList();
      
      for (Room obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Room objects and collect those Room objects where the credits attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Room objects that match the parameter
    */
   public RoomSet filterCredits(int value)
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         if (value == obj.getCredits())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Room objects and collect those Room objects where the credits attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Room objects that match the parameter
    */
   public RoomSet filterCredits(int lower, int upper)
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         if (lower <= obj.getCredits() && obj.getCredits() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Room objects and assign value to the credits attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Room objects now with new attribute values.
    */
   public RoomSet withCredits(int value)
   {
      for (Room obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Room objects and collect a set of the University objects reached via uni. 
    * 
    * @return Set of University objects reachable via uni
    */
   public UniversitySet getUni()
   {
      UniversitySet result = new UniversitySet();
      
      for (Room obj : this)
      {
         result.with(obj.getUni());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Room objects and collect all contained objects with reference uni pointing to the object passed as parameter. 
    * 
    * @param value The object required as uni neighbor of the collected results. 
    * 
    * @return Set of University objects referring to value via uni
    */
   public RoomSet filterUni(Object value)
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
      
      RoomSet answer = new RoomSet();
      
      for (Room obj : this)
      {
         if (neighbors.contains(obj.getUni()) || (neighbors.isEmpty() && obj.getUni() == null))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Room object passed as parameter to the Uni attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Uni attributes.
    */
   public RoomSet withUni(University value)
   {
      for (Room obj : this)
      {
         obj.setUni(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Room objects and collect a set of the Student objects reached via students. 
    * 
    * @return Set of Student objects reachable via students
    */
   public StudentSet getStudents()
   {
      StudentSet result = new StudentSet();
      
      for (Room obj : this)
      {
         result.with(obj.getStudents());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Room objects and collect all contained objects with reference students pointing to the object passed as parameter. 
    * 
    * @param value The object required as students neighbor of the collected results. 
    * 
    * @return Set of Student objects referring to value via students
    */
   public RoomSet filterStudents(Object value)
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
      
      RoomSet answer = new RoomSet();
      
      for (Room obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getStudents()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Room object passed as parameter to the Students attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Students attributes.
    */
   public RoomSet withStudents(Student value)
   {
      for (Room obj : this)
      {
         obj.getStudents().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Room object passed as parameter from the Students attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public RoomSet withoutStudents(Student value)
   {
      for (Room obj : this)
      {
         obj.getStudents().remove(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Room objects and collect a set of the TeachingAssistant objects reached via tas. 
    * 
    * @return Set of TeachingAssistant objects reachable via tas
    */
   public TeachingAssistantSet getTas()
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (Room obj : this)
      {
         result.with(obj.getTas());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Room objects and collect all contained objects with reference tas pointing to the object passed as parameter. 
    * 
    * @param value The object required as tas neighbor of the collected results. 
    * 
    * @return Set of TeachingAssistant objects referring to value via tas
    */
   public RoomSet filterTas(Object value)
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
      
      RoomSet answer = new RoomSet();
      
      for (Room obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getTas()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Room object passed as parameter to the Tas attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Tas attributes.
    */
   public RoomSet withTas(TeachingAssistant value)
   {
      for (Room obj : this)
      {
         obj.getTas().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Room object passed as parameter from the Tas attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public RoomSet withoutTas(TeachingAssistant value)
   {
      for (Room obj : this)
      {
         obj.getTas().remove(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Room objects and collect a set of the Room objects reached via doorsRev. 
    * 
    * @return Set of Room objects reachable via doorsRev
    */
   public RoomSet getDoorsRev()
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         result.with(obj.getDoorsRev());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Room objects and collect all contained objects with reference doorsRev pointing to the object passed as parameter. 
    * 
    * @param value The object required as doorsRev neighbor of the collected results. 
    * 
    * @return Set of Room objects referring to value via doorsRev
    */
   public RoomSet filterDoorsRev(Object value)
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
      
      RoomSet answer = new RoomSet();
      
      for (Room obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getDoorsRev()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Follow doorsRev reference zero or more times and collect all reachable objects. Detect cycles and deal with them. 
    * 
    * @return Set of Room objects reachable via doorsRev transitively (including the start set)
    */
   public RoomSet getDoorsRevTransitive()
   {
      RoomSet todo = new RoomSet().with(this);
      
      RoomSet result = new RoomSet();
      
      while ( ! todo.isEmpty())
      {
         Room current = todo.first();
         
         todo.remove(current);
         
         if ( ! result.contains(current))
         {
            result.add(current);
            
            todo.with(current.getDoorsRev()).minus(result);
         }
      }
      
      return result;
   }

   /**
    * Loop through current set of ModelType objects and attach the Room object passed as parameter to the DoorsRev attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their DoorsRev attributes.
    */
   public RoomSet withDoorsRev(Room value)
   {
      for (Room obj : this)
      {
         obj.getDoorsRev().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Room object passed as parameter from the DoorsRev attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public RoomSet withoutDoorsRev(Room value)
   {
      for (Room obj : this)
      {
         obj.getDoorsRev().remove(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Room objects and collect a set of the Room objects reached via doors. 
    * 
    * @return Set of Room objects reachable via doors
    */
   public RoomSet getDoors()
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         result.with(obj.getDoors());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Room objects and collect all contained objects with reference doors pointing to the object passed as parameter. 
    * 
    * @param value The object required as doors neighbor of the collected results. 
    * 
    * @return Set of Room objects referring to value via doors
    */
   public RoomSet filterDoors(Object value)
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
      
      RoomSet answer = new RoomSet();
      
      for (Room obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getDoors()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Follow doors reference zero or more times and collect all reachable objects. Detect cycles and deal with them. 
    * 
    * @return Set of Room objects reachable via doors transitively (including the start set)
    */
   public RoomSet getDoorsTransitive()
   {
      RoomSet todo = new RoomSet().with(this);
      
      RoomSet result = new RoomSet();
      
      while ( ! todo.isEmpty())
      {
         Room current = todo.first();
         
         todo.remove(current);
         
         if ( ! result.contains(current))
         {
            result.add(current);
            
            todo.with(current.getDoors()).minus(result);
         }
      }
      
      return result;
   }

   /**
    * Loop through current set of ModelType objects and attach the Room object passed as parameter to the Doors attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Doors attributes.
    */
   public RoomSet withDoors(Room value)
   {
      for (Room obj : this)
      {
         obj.getDoors().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Room object passed as parameter from the Doors attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public RoomSet withoutDoors(Room value)
   {
      for (Room obj : this)
      {
         obj.getDoors().remove(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Room objects and collect a set of the Assignment objects reached via assignments. 
    * 
    * @return Set of Assignment objects reachable via assignments
    */
   public AssignmentSet getAssignments()
   {
      AssignmentSet result = new AssignmentSet();
      
      for (Room obj : this)
      {
         result.with(obj.getAssignments());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Room objects and collect all contained objects with reference assignments pointing to the object passed as parameter. 
    * 
    * @param value The object required as assignments neighbor of the collected results. 
    * 
    * @return Set of Assignment objects referring to value via assignments
    */
   public RoomSet filterAssignments(Object value)
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
      
      RoomSet answer = new RoomSet();
      
      for (Room obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getAssignments()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Room object passed as parameter to the Assignments attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Assignments attributes.
    */
   public RoomSet withAssignments(Assignment value)
   {
      for (Room obj : this)
      {
         obj.getAssignments().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Room object passed as parameter from the Assignments attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public RoomSet withoutAssignments(Assignment value)
   {
      for (Room obj : this)
      {
         obj.getAssignments().remove(value);
      }
      
      return this;
   }

}
