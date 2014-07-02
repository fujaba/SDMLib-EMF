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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import java.util.Collection;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class TeachingAssistantSet extends SDMSet<TeachingAssistant>
{


   public TeachingAssistantPO hasTeachingAssistantPO()
   {
      return new TeachingAssistantPO(this.toArray(new TeachingAssistant[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant";
   }


   @SuppressWarnings("unchecked")
   public TeachingAssistantSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<TeachingAssistant>)value);
      }
      else if (value != null)
      {
         this.add((TeachingAssistant) value);
      }
      
      return this;
   }
   
   public TeachingAssistantSet without(TeachingAssistant value)
   {
      this.remove(value);
      return this;
   }

   public intList getNoOfHours()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getNoOfHours());
      }
      
      return result;
   }

   public TeachingAssistantSet hasNoOfHours(int value)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (value == obj.getNoOfHours())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet hasNoOfHours(int lower, int upper)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (lower <= obj.getNoOfHours() && obj.getNoOfHours() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet withNoOfHours(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setNoOfHours(value);
      }
      
      return this;
   }

   public StringList getName()
   {
      StringList result = new StringList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public TeachingAssistantSet hasName(String value)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet hasName(String lower, String upper)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (lower.compareTo(obj.getName()) <= 0 && obj.getName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet withName(String value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   public StringList getStudId()
   {
      StringList result = new StringList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getStudId());
      }
      
      return result;
   }

   public TeachingAssistantSet hasStudId(String value)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (value.equals(obj.getStudId()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet hasStudId(String lower, String upper)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (lower.compareTo(obj.getStudId()) <= 0 && obj.getStudId().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet withStudId(String value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setStudId(value);
      }
      
      return this;
   }

   public intList getCredits()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }

   public TeachingAssistantSet hasCredits(int value)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (value == obj.getCredits())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet hasCredits(int lower, int upper)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (lower <= obj.getCredits() && obj.getCredits() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet withCredits(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }

   public intList getMotivation()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getMotivation());
      }
      
      return result;
   }

   public TeachingAssistantSet hasMotivation(int value)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (value == obj.getMotivation())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet hasMotivation(int lower, int upper)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (lower <= obj.getMotivation() && obj.getMotivation() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet withMotivation(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setMotivation(value);
      }
      
      return this;
   }

   public intList getAssignmentPoints()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getAssignmentPoints());
      }
      
      return result;
   }

   public TeachingAssistantSet hasAssignmentPoints(int value)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (value == obj.getAssignmentPoints())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet hasAssignmentPoints(int lower, int upper)
   {
      TeachingAssistantSet result = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (lower <= obj.getAssignmentPoints() && obj.getAssignmentPoints() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public TeachingAssistantSet withAssignmentPoints(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setAssignmentPoints(value);
      }
      
      return this;
   }

   public RoomSet getRoom()
   {
      RoomSet result = new RoomSet();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getRoom());
      }
      
      return result;
   }

   public TeachingAssistantSet hasRoom(Object value)
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
      
      TeachingAssistantSet answer = new TeachingAssistantSet();
      
      for (TeachingAssistant obj : this)
      {
         if (neighbors.contains(obj.getRoom()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public TeachingAssistantSet withRoom(Room value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.withRoom(value);
      }
      
      return this;
   }

}
