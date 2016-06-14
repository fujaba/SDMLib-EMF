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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class StudentSet extends SDMSet<Student>
{

   public StudentSet()
   {
      // empty
   }

   public StudentSet(Student... objects)
   {
      for (Student obj : objects)
      {
         this.add(obj);
      }
   }

   public StudentSet(Collection<Student> objects)
   {
      this.addAll(objects);
   }

   public static final StudentSet EMPTY_SET = new StudentSet();


   public StudentPO filterStudentPO()
   {
      return new StudentPO(this.toArray(new Student[this.size()]));
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student";
   }


   @SuppressWarnings("unchecked")
   public StudentSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Student>)value);
      }
      else if (value != null)
      {
         this.add((Student) value);
      }
      
      return this;
   }
   
   public StudentSet without(Student value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Student objects and collect a list of the name attribute values. 
    * 
    * @return List of String objects reachable via name attribute
    */
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (Student obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the name attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterName(String value)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the name attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterName(String lower, String upper)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and assign value to the name attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Student objects now with new attribute values.
    */
   public StudentSet withName(String value)
   {
      for (Student obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Student objects and collect a list of the studId attribute values. 
    * 
    * @return List of String objects reachable via studId attribute
    */
   public StringList getStudId()
   {
      StringList result = new StringList();
      
      for (Student obj : this)
      {
         result.add(obj.getStudId());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the studId attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterStudId(String value)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (value.equals(obj.getStudId()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the studId attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterStudId(String lower, String upper)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (lower.compareTo(obj.getStudId()) <= 0 && obj.getStudId().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and assign value to the studId attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Student objects now with new attribute values.
    */
   public StudentSet withStudId(String value)
   {
      for (Student obj : this)
      {
         obj.setStudId(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Student objects and collect a list of the credits attribute values. 
    * 
    * @return List of int objects reachable via credits attribute
    */
   public intList getCredits()
   {
      intList result = new intList();
      
      for (Student obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the credits attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterCredits(int value)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (value == obj.getCredits())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the credits attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterCredits(int lower, int upper)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (lower <= obj.getCredits() && obj.getCredits() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and assign value to the credits attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Student objects now with new attribute values.
    */
   public StudentSet withCredits(int value)
   {
      for (Student obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Student objects and collect a list of the motivation attribute values. 
    * 
    * @return List of int objects reachable via motivation attribute
    */
   public intList getMotivation()
   {
      intList result = new intList();
      
      for (Student obj : this)
      {
         result.add(obj.getMotivation());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the motivation attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterMotivation(int value)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (value == obj.getMotivation())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the motivation attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterMotivation(int lower, int upper)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (lower <= obj.getMotivation() && obj.getMotivation() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and assign value to the motivation attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Student objects now with new attribute values.
    */
   public StudentSet withMotivation(int value)
   {
      for (Student obj : this)
      {
         obj.setMotivation(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of Student objects and collect a list of the assignmentPoints attribute values. 
    * 
    * @return List of int objects reachable via assignmentPoints attribute
    */
   public intList getAssignmentPoints()
   {
      intList result = new intList();
      
      for (Student obj : this)
      {
         result.add(obj.getAssignmentPoints());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the assignmentPoints attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterAssignmentPoints(int value)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (value == obj.getAssignmentPoints())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and collect those Student objects where the assignmentPoints attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Student objects that match the parameter
    */
   public StudentSet filterAssignmentPoints(int lower, int upper)
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         if (lower <= obj.getAssignmentPoints() && obj.getAssignmentPoints() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Student objects and assign value to the assignmentPoints attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Student objects now with new attribute values.
    */
   public StudentSet withAssignmentPoints(int value)
   {
      for (Student obj : this)
      {
         obj.setAssignmentPoints(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Student objects and collect a set of the University objects reached via uni. 
    * 
    * @return Set of University objects reachable via uni
    */
   public UniversitySet getUni()
   {
      UniversitySet result = new UniversitySet();
      
      for (Student obj : this)
      {
         result.with(obj.getUni());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Student objects and collect all contained objects with reference uni pointing to the object passed as parameter. 
    * 
    * @param value The object required as uni neighbor of the collected results. 
    * 
    * @return Set of University objects referring to value via uni
    */
   public StudentSet filterUni(Object value)
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
      
      StudentSet answer = new StudentSet();
      
      for (Student obj : this)
      {
         if (neighbors.contains(obj.getUni()) || (neighbors.isEmpty() && obj.getUni() == null))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Student object passed as parameter to the Uni attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Uni attributes.
    */
   public StudentSet withUni(University value)
   {
      for (Student obj : this)
      {
         obj.setUni(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Student objects and collect a set of the Room objects reached via in. 
    * 
    * @return Set of Room objects reachable via in
    */
   public RoomSet getIn()
   {
      RoomSet result = new RoomSet();
      
      for (Student obj : this)
      {
         result.with(obj.getIn());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Student objects and collect all contained objects with reference in pointing to the object passed as parameter. 
    * 
    * @param value The object required as in neighbor of the collected results. 
    * 
    * @return Set of Room objects referring to value via in
    */
   public StudentSet filterIn(Object value)
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
      
      StudentSet answer = new StudentSet();
      
      for (Student obj : this)
      {
         if (neighbors.contains(obj.getIn()) || (neighbors.isEmpty() && obj.getIn() == null))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Student object passed as parameter to the In attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their In attributes.
    */
   public StudentSet withIn(Room value)
   {
      for (Student obj : this)
      {
         obj.setIn(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Student objects and collect a set of the Student objects reached via friendsRev. 
    * 
    * @return Set of Student objects reachable via friendsRev
    */
   public StudentSet getFriendsRev()
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         result.with(obj.getFriendsRev());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Student objects and collect all contained objects with reference friendsRev pointing to the object passed as parameter. 
    * 
    * @param value The object required as friendsRev neighbor of the collected results. 
    * 
    * @return Set of Student objects referring to value via friendsRev
    */
   public StudentSet filterFriendsRev(Object value)
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
      
      StudentSet answer = new StudentSet();
      
      for (Student obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getFriendsRev()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Follow friendsRev reference zero or more times and collect all reachable objects. Detect cycles and deal with them. 
    * 
    * @return Set of Student objects reachable via friendsRev transitively (including the start set)
    */
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
            
            todo.with(current.getFriendsRev()).minus(result);
         }
      }
      
      return result;
   }

   /**
    * Loop through current set of ModelType objects and attach the Student object passed as parameter to the FriendsRev attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their FriendsRev attributes.
    */
   public StudentSet withFriendsRev(Student value)
   {
      for (Student obj : this)
      {
         obj.getFriendsRev().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Student object passed as parameter from the FriendsRev attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public StudentSet withoutFriendsRev(Student value)
   {
      for (Student obj : this)
      {
         obj.getFriendsRev().remove(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Student objects and collect a set of the Student objects reached via friends. 
    * 
    * @return Set of Student objects reachable via friends
    */
   public StudentSet getFriends()
   {
      StudentSet result = new StudentSet();
      
      for (Student obj : this)
      {
         result.with(obj.getFriends());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Student objects and collect all contained objects with reference friends pointing to the object passed as parameter. 
    * 
    * @param value The object required as friends neighbor of the collected results. 
    * 
    * @return Set of Student objects referring to value via friends
    */
   public StudentSet filterFriends(Object value)
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
      
      StudentSet answer = new StudentSet();
      
      for (Student obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getFriends()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Follow friends reference zero or more times and collect all reachable objects. Detect cycles and deal with them. 
    * 
    * @return Set of Student objects reachable via friends transitively (including the start set)
    */
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
            
            todo.with(current.getFriends()).minus(result);
         }
      }
      
      return result;
   }

   /**
    * Loop through current set of ModelType objects and attach the Student object passed as parameter to the Friends attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Friends attributes.
    */
   public StudentSet withFriends(Student value)
   {
      for (Student obj : this)
      {
         obj.getFriends().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Student object passed as parameter from the Friends attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public StudentSet withoutFriends(Student value)
   {
      for (Student obj : this)
      {
         obj.getFriends().remove(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of Student objects and collect a set of the Assignment objects reached via done. 
    * 
    * @return Set of Assignment objects reachable via done
    */
   public AssignmentSet getDone()
   {
      AssignmentSet result = new AssignmentSet();
      
      for (Student obj : this)
      {
         result.with(obj.getDone());
      }
      
      return result;
   }

   /**
    * Loop through the current set of Student objects and collect all contained objects with reference done pointing to the object passed as parameter. 
    * 
    * @param value The object required as done neighbor of the collected results. 
    * 
    * @return Set of Assignment objects referring to value via done
    */
   public StudentSet filterDone(Object value)
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
      
      StudentSet answer = new StudentSet();
      
      for (Student obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getDone()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the Student object passed as parameter to the Done attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Done attributes.
    */
   public StudentSet withDone(Assignment value)
   {
      for (Student obj : this)
      {
         obj.getDone().add(value);
      }
      
      return this;
   }

   /**
    * Loop through current set of ModelType objects and remove the Student object passed as parameter from the Done attribute of each of it. 
    * 
    * @return The original set of ModelType objects now without the old neighbor.
    */
   public StudentSet withoutDone(Assignment value)
   {
      for (Student obj : this)
      {
         obj.getDone().remove(value);
      }
      
      return this;
   }

}
