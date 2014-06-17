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
   
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl;
import org.sdmlib.models.modelsets.StringList;
import java.util.Collection;
import java.util.List;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.UniversitySet;
import java.util.Collections;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;

public class TeachingAssistantImplSet extends SDMSet<TeachingAssistantImpl>
{


   public TeachingAssistantImplPO hasTeachingAssistantImplPO()
   {
      org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern pattern = new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern();
      
      TeachingAssistantImplPO patternObject = pattern.hasElementTeachingAssistantImplPO();
      
      patternObject.withCandidates(this.clone());
      
      pattern.setHasMatch(true);
      pattern.findMatch();
      
      return patternObject;
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl";
   }


   public TeachingAssistantImplSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<TeachingAssistantImpl>)value);
      }
      else if (value != null)
      {
         this.add((TeachingAssistantImpl) value);
      }
      
      return this;
   }
   
   public TeachingAssistantImplSet without(TeachingAssistantImpl value)
   {
      this.remove(value);
      return this;
   }

   public StringList getName()
   {
      StringList result = new StringList();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasName(String value)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasName(String lower, String upper)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet withName(String value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   public StringList getStudId()
   {
      StringList result = new StringList();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.add(obj.getStudId());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasStudId(String value)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (value.equals(obj.getStudId()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasStudId(String lower, String upper)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (lower.compareTo(obj.getStudId()) <= 0 && obj.getStudId().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet withStudId(String value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.setStudId(value);
      }
      
      return this;
   }

   public intList getCredits()
   {
      intList result = new intList();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasCredits(int value)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (value == obj.getCredits())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasCredits(int lower, int upper)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (lower <= obj.getCredits() && obj.getCredits() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet withCredits(int value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }

   public intList getMotivation()
   {
      intList result = new intList();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.add(obj.getMotivation());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasMotivation(int value)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (value == obj.getMotivation())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasMotivation(int lower, int upper)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (lower <= obj.getMotivation() && obj.getMotivation() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet withMotivation(int value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.setMotivation(value);
      }
      
      return this;
   }

   public intList getAssignmentPoints()
   {
      intList result = new intList();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.add(obj.getAssignmentPoints());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasAssignmentPoints(int value)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (value == obj.getAssignmentPoints())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasAssignmentPoints(int lower, int upper)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (lower <= obj.getAssignmentPoints() && obj.getAssignmentPoints() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet withAssignmentPoints(int value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.setAssignmentPoints(value);
      }
      
      return this;
   }

   public UniversitySet getUni()
   {
      UniversitySet result = new UniversitySet();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.with(obj.getUni());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasUni(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      TeachingAssistantImplSet answer = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (neighbors.contains(obj.getUni()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public TeachingAssistantImplSet withUni(University value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.withUni(value);
      }
      
      return this;
   }

   public RoomSet getIn()
   {
      RoomSet result = new RoomSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.with(obj.getIn());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasIn(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      TeachingAssistantImplSet answer = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (neighbors.contains(obj.getIn()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public TeachingAssistantImplSet withIn(Room value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.withIn(value);
      }
      
      return this;
   }

   public StudentSet getFriends()
   {
      StudentSet result = new StudentSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.with(obj.getFriends());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasFriends(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      TeachingAssistantImplSet answer = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
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

   public TeachingAssistantImplSet withFriends(Student value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.withFriends(value);
      }
      
      return this;
   }

   public TeachingAssistantImplSet withoutFriends(Student value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.withoutFriends(value);
      }
      
      return this;
   }

   public AssignmentSet getDone()
   {
      AssignmentSet result = new AssignmentSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.with(obj.getDone());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasDone(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      TeachingAssistantImplSet answer = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getDone()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public TeachingAssistantImplSet withDone(Assignment value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.withDone(value);
      }
      
      return this;
   }

   public TeachingAssistantImplSet withoutDone(Assignment value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.withoutDone(value);
      }
      
      return this;
   }

   public RoomSet getRoom()
   {
      RoomSet result = new RoomSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.with(obj.getRoom());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasRoom(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      TeachingAssistantImplSet answer = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (neighbors.contains(obj.getRoom()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public TeachingAssistantImplSet withRoom(Room value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.withRoom(value);
      }
      
      return this;
   }

}



