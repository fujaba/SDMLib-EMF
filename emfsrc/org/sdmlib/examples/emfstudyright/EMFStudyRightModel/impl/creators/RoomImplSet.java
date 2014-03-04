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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl;
import org.sdmlib.models.modelsets.StringList;
import java.util.Collection;
import java.util.List;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.UniversitySet;
import java.util.Collections;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class RoomImplSet extends SDMSet<RoomImpl>
{


   public RoomImplPO hasRoomImplPO()
   {
      org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern pattern = new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern();
      
      RoomImplPO patternObject = pattern.hasElementRoomImplPO();
      
      patternObject.withCandidates(this.clone());
      
      pattern.setHasMatch(true);
      pattern.findMatch();
      
      return patternObject;
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl";
   }


   public RoomImplSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<RoomImpl>)value);
      }
      else if (value != null)
      {
         this.add((RoomImpl) value);
      }
      
      return this;
   }
   
   public RoomImplSet without(RoomImpl value)
   {
      this.remove(value);
      return this;
   }

   public StringList getTopic()
   {
      StringList result = new StringList();
      
      for (RoomImpl obj : this)
      {
         result.add(obj.getTopic());
      }
      
      return result;
   }

   public RoomImplSet hasTopic(String value)
   {
      RoomImplSet result = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if (value.equals(obj.getTopic()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public RoomImplSet hasTopic(String lower, String upper)
   {
      RoomImplSet result = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if (lower.compareTo(obj.getTopic()) <= 0 && obj.getTopic().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public RoomImplSet withTopic(String value)
   {
      for (RoomImpl obj : this)
      {
         obj.setTopic(value);
      }
      
      return this;
   }

   public intList getCredits()
   {
      intList result = new intList();
      
      for (RoomImpl obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }

   public RoomImplSet hasCredits(int value)
   {
      RoomImplSet result = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if (value == obj.getCredits())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public RoomImplSet hasCredits(int lower, int upper)
   {
      RoomImplSet result = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if (lower <= obj.getCredits() && obj.getCredits() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public RoomImplSet withCredits(int value)
   {
      for (RoomImpl obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }

   public UniversitySet getUni()
   {
      UniversitySet result = new UniversitySet();
      
      for (RoomImpl obj : this)
      {
         result.with(obj.getUni());
      }
      
      return result;
   }

   public RoomImplSet hasUni(Object value)
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
      
      RoomImplSet answer = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if (neighbors.contains(obj.getUni()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public RoomImplSet withUni(University value)
   {
      for (RoomImpl obj : this)
      {
         obj.withUni(value);
      }
      
      return this;
   }

   public AssignmentSet getAssignments()
   {
      AssignmentSet result = new AssignmentSet();
      
      for (RoomImpl obj : this)
      {
         result.with(obj.getAssignments());
      }
      
      return result;
   }

   public RoomImplSet hasAssignments(Object value)
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
      
      RoomImplSet answer = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getAssignments()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public RoomImplSet withAssignments(Assignment value)
   {
      for (RoomImpl obj : this)
      {
         obj.withAssignments(value);
      }
      
      return this;
   }

   public RoomImplSet withoutAssignments(Assignment value)
   {
      for (RoomImpl obj : this)
      {
         obj.withoutAssignments(value);
      }
      
      return this;
   }

   public StudentSet getStudents()
   {
      StudentSet result = new StudentSet();
      
      for (RoomImpl obj : this)
      {
         result.with(obj.getStudents());
      }
      
      return result;
   }

   public RoomImplSet hasStudents(Object value)
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
      
      RoomImplSet answer = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getStudents()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public RoomImplSet withStudents(Student value)
   {
      for (RoomImpl obj : this)
      {
         obj.withStudents(value);
      }
      
      return this;
   }

   public RoomImplSet withoutStudents(Student value)
   {
      for (RoomImpl obj : this)
      {
         obj.withoutStudents(value);
      }
      
      return this;
   }

   public TeachingAssistantSet getTas()
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (RoomImpl obj : this)
      {
         result.with(obj.getTas());
      }
      
      return result;
   }

   public RoomImplSet hasTas(Object value)
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
      
      RoomImplSet answer = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getTas()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public RoomImplSet withTas(TeachingAssistant value)
   {
      for (RoomImpl obj : this)
      {
         obj.withTas(value);
      }
      
      return this;
   }

   public RoomImplSet withoutTas(TeachingAssistant value)
   {
      for (RoomImpl obj : this)
      {
         obj.withoutTas(value);
      }
      
      return this;
   }

   public RoomSet getDoors()
   {
      RoomSet result = new RoomSet();
      
      for (RoomImpl obj : this)
      {
         result.with(obj.getDoors());
      }
      
      return result;
   }

   public RoomImplSet hasDoors(Object value)
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
      
      RoomImplSet answer = new RoomImplSet();
      
      for (RoomImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getDoors()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public RoomImplSet withDoors(Room value)
   {
      for (RoomImpl obj : this)
      {
         obj.withDoors(value);
      }
      
      return this;
   }

   public RoomImplSet withoutDoors(Room value)
   {
      for (RoomImpl obj : this)
      {
         obj.withoutDoors(value);
      }
      
      return this;
   }

}


