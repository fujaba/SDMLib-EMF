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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl;
import java.util.Collection;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class TeachingAssistantImplSet extends SDMSet<TeachingAssistantImpl>
{


   public TeachingAssistantImplPO hasTeachingAssistantImplPO()
   {
      return new TeachingAssistantImplPO(this.toArray(new TeachingAssistantImpl[this.size()]));
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl";
   }


   @SuppressWarnings("unchecked")
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

   public intList getNoOfHours()
   {
      intList result = new intList();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.add(obj.getNoOfHours());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasNoOfHours(int value)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (value == obj.getNoOfHours())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasNoOfHours(int lower, int upper)
   {
      TeachingAssistantImplSet result = new TeachingAssistantImplSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         if (lower <= obj.getNoOfHours() && obj.getNoOfHours() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantImplSet withNoOfHours(int value)
   {
      for (TeachingAssistantImpl obj : this)
      {
         obj.setNoOfHours(value);
      }
      
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

   public RoomSet getRoom()
   {
      RoomSet result = new RoomSet();
      
      for (TeachingAssistantImpl obj : this)
      {
         result.add(obj.getRoom());
      }
      
      return result;
   }

   public TeachingAssistantImplSet hasRoom(Object value)
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
