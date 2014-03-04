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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl;
import org.sdmlib.models.modelsets.StringList;
import java.util.Collection;
import java.util.List;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import java.util.Collections;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;

public class AssignmentImplSet extends SDMSet<AssignmentImpl>
{


   public AssignmentImplPO hasAssignmentImplPO()
   {
      org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern pattern = new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern();
      
      AssignmentImplPO patternObject = pattern.hasElementAssignmentImplPO();
      
      patternObject.withCandidates(this.clone());
      
      pattern.setHasMatch(true);
      pattern.findMatch();
      
      return patternObject;
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl";
   }


   public AssignmentImplSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<AssignmentImpl>)value);
      }
      else if (value != null)
      {
         this.add((AssignmentImpl) value);
      }
      
      return this;
   }
   
   public AssignmentImplSet without(AssignmentImpl value)
   {
      this.remove(value);
      return this;
   }

   public StringList getName()
   {
      StringList result = new StringList();
      
      for (AssignmentImpl obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public AssignmentImplSet hasName(String value)
   {
      AssignmentImplSet result = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public AssignmentImplSet hasName(String lower, String upper)
   {
      AssignmentImplSet result = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public AssignmentImplSet withName(String value)
   {
      for (AssignmentImpl obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   public intList getPoints()
   {
      intList result = new intList();
      
      for (AssignmentImpl obj : this)
      {
         result.add(obj.getPoints());
      }
      
      return result;
   }

   public AssignmentImplSet hasPoints(int value)
   {
      AssignmentImplSet result = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if (value == obj.getPoints())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public AssignmentImplSet hasPoints(int lower, int upper)
   {
      AssignmentImplSet result = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if (lower <= obj.getPoints() && obj.getPoints() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public AssignmentImplSet withPoints(int value)
   {
      for (AssignmentImpl obj : this)
      {
         obj.setPoints(value);
      }
      
      return this;
   }

   public RoomSet getRoom()
   {
      RoomSet result = new RoomSet();
      
      for (AssignmentImpl obj : this)
      {
         result.with(obj.getRoom());
      }
      
      return result;
   }

   public AssignmentImplSet hasRoom(Object value)
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
      
      AssignmentImplSet answer = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if (neighbors.contains(obj.getRoom()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public AssignmentImplSet withRoom(Room value)
   {
      for (AssignmentImpl obj : this)
      {
         obj.withRoom(value);
      }
      
      return this;
   }

   public StudentSet getStudents()
   {
      StudentSet result = new StudentSet();
      
      for (AssignmentImpl obj : this)
      {
         result.with(obj.getStudents());
      }
      
      return result;
   }

   public AssignmentImplSet hasStudents(Object value)
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
      
      AssignmentImplSet answer = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getStudents()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public AssignmentImplSet withStudents(Student value)
   {
      for (AssignmentImpl obj : this)
      {
         obj.withStudents(value);
      }
      
      return this;
   }

   public AssignmentImplSet withoutStudents(Student value)
   {
      for (AssignmentImpl obj : this)
      {
         obj.withoutStudents(value);
      }
      
      return this;
   }

}


