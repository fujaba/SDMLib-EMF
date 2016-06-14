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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import java.util.Collection;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class TeachingAssistantSet extends SDMSet<TeachingAssistant>
{

   public TeachingAssistantSet()
   {
      // empty
   }

   public TeachingAssistantSet(TeachingAssistant... objects)
   {
      for (TeachingAssistant obj : objects)
      {
         this.add(obj);
      }
   }

   public TeachingAssistantSet(Collection<TeachingAssistant> objects)
   {
      this.addAll(objects);
   }

   public static final TeachingAssistantSet EMPTY_SET = new TeachingAssistantSet();


   public TeachingAssistantPO filterTeachingAssistantPO()
   {
      return new TeachingAssistantPO(this.toArray(new TeachingAssistant[this.size()]));
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant";
   }


   @SuppressWarnings("unchecked")
   public TeachingAssistantSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
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


   /**
    * Loop through the current set of TeachingAssistant objects and collect a list of the noOfHours attribute values. 
    * 
    * @return List of int objects reachable via noOfHours attribute
    */
   public intList getNoOfHours()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getNoOfHours());
      }
      
      return result;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the noOfHours attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterNoOfHours(int value)
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


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the noOfHours attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterNoOfHours(int lower, int upper)
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


   /**
    * Loop through the current set of TeachingAssistant objects and assign value to the noOfHours attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of TeachingAssistant objects now with new attribute values.
    */
   public TeachingAssistantSet withNoOfHours(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setNoOfHours(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect a list of the name attribute values. 
    * 
    * @return List of String objects reachable via name attribute
    */
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the name attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterName(String value)
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


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the name attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterName(String lower, String upper)
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


   /**
    * Loop through the current set of TeachingAssistant objects and assign value to the name attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of TeachingAssistant objects now with new attribute values.
    */
   public TeachingAssistantSet withName(String value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect a list of the studId attribute values. 
    * 
    * @return List of String objects reachable via studId attribute
    */
   public StringList getStudId()
   {
      StringList result = new StringList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getStudId());
      }
      
      return result;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the studId attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterStudId(String value)
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


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the studId attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterStudId(String lower, String upper)
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


   /**
    * Loop through the current set of TeachingAssistant objects and assign value to the studId attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of TeachingAssistant objects now with new attribute values.
    */
   public TeachingAssistantSet withStudId(String value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setStudId(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect a list of the credits attribute values. 
    * 
    * @return List of int objects reachable via credits attribute
    */
   public intList getCredits()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the credits attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterCredits(int value)
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


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the credits attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterCredits(int lower, int upper)
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


   /**
    * Loop through the current set of TeachingAssistant objects and assign value to the credits attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of TeachingAssistant objects now with new attribute values.
    */
   public TeachingAssistantSet withCredits(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect a list of the motivation attribute values. 
    * 
    * @return List of int objects reachable via motivation attribute
    */
   public intList getMotivation()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getMotivation());
      }
      
      return result;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the motivation attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterMotivation(int value)
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


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the motivation attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterMotivation(int lower, int upper)
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


   /**
    * Loop through the current set of TeachingAssistant objects and assign value to the motivation attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of TeachingAssistant objects now with new attribute values.
    */
   public TeachingAssistantSet withMotivation(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setMotivation(value);
      }
      
      return this;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect a list of the assignmentPoints attribute values. 
    * 
    * @return List of int objects reachable via assignmentPoints attribute
    */
   public intList getAssignmentPoints()
   {
      intList result = new intList();
      
      for (TeachingAssistant obj : this)
      {
         result.add(obj.getAssignmentPoints());
      }
      
      return result;
   }


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the assignmentPoints attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterAssignmentPoints(int value)
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


   /**
    * Loop through the current set of TeachingAssistant objects and collect those TeachingAssistant objects where the assignmentPoints attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of TeachingAssistant objects that match the parameter
    */
   public TeachingAssistantSet filterAssignmentPoints(int lower, int upper)
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


   /**
    * Loop through the current set of TeachingAssistant objects and assign value to the assignmentPoints attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of TeachingAssistant objects now with new attribute values.
    */
   public TeachingAssistantSet withAssignmentPoints(int value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setAssignmentPoints(value);
      }
      
      return this;
   }

   /**
    * Loop through the current set of TeachingAssistant objects and collect a set of the Room objects reached via room. 
    * 
    * @return Set of Room objects reachable via room
    */
   public RoomSet getRoom()
   {
      RoomSet result = new RoomSet();
      
      for (TeachingAssistant obj : this)
      {
         result.with(obj.getRoom());
      }
      
      return result;
   }

   /**
    * Loop through the current set of TeachingAssistant objects and collect all contained objects with reference room pointing to the object passed as parameter. 
    * 
    * @param value The object required as room neighbor of the collected results. 
    * 
    * @return Set of Room objects referring to value via room
    */
   public TeachingAssistantSet filterRoom(Object value)
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
         if (neighbors.contains(obj.getRoom()) || (neighbors.isEmpty() && obj.getRoom() == null))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   /**
    * Loop through current set of ModelType objects and attach the TeachingAssistant object passed as parameter to the Room attribute of each of it. 
    * 
    * @return The original set of ModelType objects now with the new neighbor attached to their Room attributes.
    */
   public TeachingAssistantSet withRoom(Room value)
   {
      for (TeachingAssistant obj : this)
      {
         obj.setRoom(value);
      }
      
      return this;
   }

}
