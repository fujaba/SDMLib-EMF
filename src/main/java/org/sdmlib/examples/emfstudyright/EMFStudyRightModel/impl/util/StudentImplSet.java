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

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversitySet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import java.util.Collections;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class StudentImplSet extends SDMSet<StudentImpl>
{


   public StudentImplPO hasStudentImplPO()
   {
      return new StudentImplPO(this.toArray(new StudentImpl[this.size()]));
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl";
   }


   @SuppressWarnings("unchecked")
   public StudentImplSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<StudentImpl>)value);
      }
      else if (value != null)
      {
         this.add((StudentImpl) value);
      }
      
      return this;
   }
   
   public StudentImplSet without(StudentImpl value)
   {
      this.remove(value);
      return this;
   }

   public StringList getName()
   {
      StringList result = new StringList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public StudentImplSet hasName(String value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet hasName(String lower, String upper)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withName(String value)
   {
      for (StudentImpl obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   public StringList getStudId()
   {
      StringList result = new StringList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getStudId());
      }
      
      return result;
   }

   public StudentImplSet hasStudId(String value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value.equals(obj.getStudId()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet hasStudId(String lower, String upper)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (lower.compareTo(obj.getStudId()) <= 0 && obj.getStudId().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withStudId(String value)
   {
      for (StudentImpl obj : this)
      {
         obj.setStudId(value);
      }
      
      return this;
   }

   public intList getCredits()
   {
      intList result = new intList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }

   public StudentImplSet hasCredits(int value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value == obj.getCredits())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet hasCredits(int lower, int upper)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (lower <= obj.getCredits() && obj.getCredits() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withCredits(int value)
   {
      for (StudentImpl obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }

   public intList getMotivation()
   {
      intList result = new intList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getMotivation());
      }
      
      return result;
   }

   public StudentImplSet hasMotivation(int value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value == obj.getMotivation())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet hasMotivation(int lower, int upper)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (lower <= obj.getMotivation() && obj.getMotivation() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withMotivation(int value)
   {
      for (StudentImpl obj : this)
      {
         obj.setMotivation(value);
      }
      
      return this;
   }

   public intList getAssignmentPoints()
   {
      intList result = new intList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getAssignmentPoints());
      }
      
      return result;
   }

   public StudentImplSet hasAssignmentPoints(int value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value == obj.getAssignmentPoints())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet hasAssignmentPoints(int lower, int upper)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (lower <= obj.getAssignmentPoints() && obj.getAssignmentPoints() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withAssignmentPoints(int value)
   {
      for (StudentImpl obj : this)
      {
         obj.setAssignmentPoints(value);
      }
      
      return this;
   }

   public UniversitySet getUni()
   {
      UniversitySet result = new UniversitySet();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getUni());
      }
      
      return result;
   }

   public StudentImplSet hasUni(Object value)
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
      
      StudentImplSet answer = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (neighbors.contains(obj.getUni()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public StudentImplSet withUni(University value)
   {
      for (StudentImpl obj : this)
      {
         obj.withUni(value);
      }
      
      return this;
   }

   public RoomSet getIn()
   {
      RoomSet result = new RoomSet();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getIn());
      }
      
      return result;
   }

   public StudentImplSet hasIn(Object value)
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
      
      StudentImplSet answer = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (neighbors.contains(obj.getIn()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public StudentImplSet withIn(Room value)
   {
      for (StudentImpl obj : this)
      {
         obj.withIn(value);
      }
      
      return this;
   }

   public StudentSet getFriendsRev()
   {
      StudentSet result = new StudentSet();
      
      for (StudentImpl obj : this)
      {
         result.addAll(obj.getFriendsRev());
      }
      
      return result;
   }

   public StudentImplSet hasFriendsRev(Object value)
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
      
      StudentImplSet answer = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getFriendsRev()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }


   public StudentSet getFriendsRevTransitive()
   {
      StudentSet todo = new StudentSet().with(this);
      
      StudentSet result = new StudentSet();
      
      while ( ! todo.isEmpty())
      {
         Student current = todo.first();
         
         todo.remove(current);
         
         if ( ! result.contains(current))
         {
            result.add(current);
            
            todo.with(current.getFriendsRevSet().minus(result));
         }
      }
      
      return result;
   }

   public StudentImplSet withFriendsRev(Student value)
   {
      for (StudentImpl obj : this)
      {
         obj.withFriendsRev(value);
      }
      
      return this;
   }

   public StudentImplSet withoutFriendsRev(Student value)
   {
      for (StudentImpl obj : this)
      {
         obj.withoutFriendsRev(value);
      }
      
      return this;
   }

   public StudentSet getFriends()
   {
      StudentSet result = new StudentSet();
      
      for (StudentImpl obj : this)
      {
         result.addAll(obj.getFriends());
      }
      
      return result;
   }

   public StudentImplSet hasFriends(Object value)
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
      
      StudentImplSet answer = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getFriends()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }


   public StudentSet getFriendsTransitive()
   {
      StudentSet todo = new StudentSet().with(this);
      
      StudentSet result = new StudentSet();
      
      while ( ! todo.isEmpty())
      {
         Student current = todo.first();
         
         todo.remove(current);
         
         if ( ! result.contains(current))
         {
            result.add(current);
            
            todo.with(current.getFriendsSet().minus(result));
         }
      }
      
      return result;
   }

   public StudentImplSet withFriends(Student value)
   {
      for (StudentImpl obj : this)
      {
         obj.withFriends(value);
      }
      
      return this;
   }

   public StudentImplSet withoutFriends(Student value)
   {
      for (StudentImpl obj : this)
      {
         obj.withoutFriends(value);
      }
      
      return this;
   }

   public AssignmentSet getDone()
   {
      AssignmentSet result = new AssignmentSet();
      
      for (StudentImpl obj : this)
      {
         result.addAll(obj.getDone());
      }
      
      return result;
   }

   public StudentImplSet hasDone(Object value)
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
      
      StudentImplSet answer = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getDone()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public StudentImplSet withDone(Assignment value)
   {
      for (StudentImpl obj : this)
      {
         obj.withDone(value);
      }
      
      return this;
   }

   public StudentImplSet withoutDone(Assignment value)
   {
      for (StudentImpl obj : this)
      {
         obj.withoutDone(value);
      }
      
      return this;
   }

}
