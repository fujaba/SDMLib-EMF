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
   
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
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


   public RoomPO hasRoomPO()
   {
      return new RoomPO(this.toArray(new Room[this.size()]));
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room";
   }


   @SuppressWarnings("unchecked")
   public RoomSet with(Object value)
   {
      if (value instanceof java.util.Collection)
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

   public StringList getTopic()
   {
      StringList result = new StringList();
      
      for (Room obj : this)
      {
         result.add(obj.getTopic());
      }
      
      return result;
   }

   public RoomSet hasTopic(String value)
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

   public RoomSet hasTopic(String lower, String upper)
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

   public RoomSet withTopic(String value)
   {
      for (Room obj : this)
      {
         obj.setTopic(value);
      }
      
      return this;
   }

   public intList getCredits()
   {
      intList result = new intList();
      
      for (Room obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }

   public RoomSet hasCredits(int value)
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

   public RoomSet hasCredits(int lower, int upper)
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

   public RoomSet withCredits(int value)
   {
      for (Room obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }

   public UniversitySet getUni()
   {
      UniversitySet result = new UniversitySet();
      
      for (Room obj : this)
      {
         result.add(obj.getUni());
      }
      
      return result;
   }

   public RoomSet hasUni(Object value)
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
         if (neighbors.contains(obj.getUni()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public RoomSet withUni(University value)
   {
      for (Room obj : this)
      {
         obj.withUni(value);
      }
      
      return this;
   }

   public StudentSet getStudents()
   {
      StudentSet result = new StudentSet();
      
      for (Room obj : this)
      {
         result.addAll(obj.getStudents());
      }
      
      return result;
   }

   public RoomSet hasStudents(Object value)
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

   public RoomSet withStudents(Student value)
   {
      for (Room obj : this)
      {
         obj.withStudents(value);
      }
      
      return this;
   }

   public RoomSet withoutStudents(Student value)
   {
      for (Room obj : this)
      {
         obj.withoutStudents(value);
      }
      
      return this;
   }

   public TeachingAssistantSet getTas()
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (Room obj : this)
      {
         result.addAll(obj.getTas());
      }
      
      return result;
   }

   public RoomSet hasTas(Object value)
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

   public RoomSet withTas(TeachingAssistant value)
   {
      for (Room obj : this)
      {
         obj.withTas(value);
      }
      
      return this;
   }

   public RoomSet withoutTas(TeachingAssistant value)
   {
      for (Room obj : this)
      {
         obj.withoutTas(value);
      }
      
      return this;
   }

   public RoomSet getDoorsRev()
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         result.addAll(obj.getDoorsRev());
      }
      
      return result;
   }

   public RoomSet hasDoorsRev(Object value)
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
            
            todo.with(current.getDoorsRevSet().minus(result));
         }
      }
      
      return result;
   }

   public RoomSet withDoorsRev(Room value)
   {
      for (Room obj : this)
      {
         obj.withDoorsRev(value);
      }
      
      return this;
   }

   public RoomSet withoutDoorsRev(Room value)
   {
      for (Room obj : this)
      {
         obj.withoutDoorsRev(value);
      }
      
      return this;
   }

   public RoomSet getDoors()
   {
      RoomSet result = new RoomSet();
      
      for (Room obj : this)
      {
         result.addAll(obj.getDoors());
      }
      
      return result;
   }

   public RoomSet hasDoors(Object value)
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
            
            todo.with(current.getDoorsSet().minus(result));
         }
      }
      
      return result;
   }

   public RoomSet withDoors(Room value)
   {
      for (Room obj : this)
      {
         obj.withDoors(value);
      }
      
      return this;
   }

   public RoomSet withoutDoors(Room value)
   {
      for (Room obj : this)
      {
         obj.withoutDoors(value);
      }
      
      return this;
   }

   public AssignmentSet getAssignments()
   {
      AssignmentSet result = new AssignmentSet();
      
      for (Room obj : this)
      {
         result.addAll(obj.getAssignments());
      }
      
      return result;
   }

   public RoomSet hasAssignments(Object value)
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

   public RoomSet withAssignments(Assignment value)
   {
      for (Room obj : this)
      {
         obj.withAssignments(value);
      }
      
      return this;
   }

   public RoomSet withoutAssignments(Assignment value)
   {
      for (Room obj : this)
      {
         obj.withoutAssignments(value);
      }
      
      return this;
   }


   public static final RoomSet EMPTY_SET = new RoomSet().withReadOnly(true);
}
