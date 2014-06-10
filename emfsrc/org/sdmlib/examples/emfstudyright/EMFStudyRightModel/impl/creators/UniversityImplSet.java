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

import java.util.Collection;
import java.util.Collections;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.models.modelsets.StringList;

public class UniversityImplSet extends SDMSet<UniversityImpl>
{


   public UniversityImplPO hasUniversityImplPO()
   {
      org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern pattern = new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern();
      
      UniversityImplPO patternObject = pattern.hasElementUniversityImplPO();
      
      patternObject.withCandidates(this.clone());
      
      pattern.setHasMatch(true);
      pattern.findMatch();
      
      return patternObject;
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl";
   }


   public UniversityImplSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<UniversityImpl>)value);
      }
      else if (value != null)
      {
         this.add((UniversityImpl) value);
      }
      
      return this;
   }
   
   public UniversityImplSet without(UniversityImpl value)
   {
      this.remove(value);
      return this;
   }

   public StringList getName()
   {
      StringList result = new StringList();
      
      for (UniversityImpl obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public UniversityImplSet hasName(String value)
   {
      UniversityImplSet result = new UniversityImplSet();
      
      for (UniversityImpl obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public UniversityImplSet hasName(String lower, String upper)
   {
      UniversityImplSet result = new UniversityImplSet();
      
      for (UniversityImpl obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public UniversityImplSet withName(String value)
   {
      for (UniversityImpl obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   public RoomSet getRooms()
   {
      RoomSet result = new RoomSet();
      
      for (UniversityImpl obj : this)
      {
         result.with(obj.getRooms());
      }
      
      return result;
   }

   public UniversityImplSet hasRooms(Object value)
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
      
      UniversityImplSet answer = new UniversityImplSet();
      
      for (UniversityImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getRooms()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public UniversityImplSet withRooms(Room value)
   {
      for (UniversityImpl obj : this)
      {
         obj.withRooms(value);
      }
      
      return this;
   }

   public UniversityImplSet withoutRooms(Room value)
   {
      for (UniversityImpl obj : this)
      {
         obj.withoutRooms(value);
      }
      
      return this;
   }

   public StudentSet getStudents()
   {
      StudentSet result = new StudentSet();
      
      for (UniversityImpl obj : this)
      {
         result.with(obj.getStudents());
      }
      
      return result;
   }

   public UniversityImplSet hasStudents(Object value)
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
      
      UniversityImplSet answer = new UniversityImplSet();
      
      for (UniversityImpl obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getStudents()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public UniversityImplSet withStudents(Student value)
   {
      for (UniversityImpl obj : this)
      {
         obj.withStudents(value);
      }
      
      return this;
   }

   public UniversityImplSet withoutStudents(Student value)
   {
      for (UniversityImpl obj : this)
      {
         obj.withoutStudents(value);
      }
      
      return this;
   }

}

