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
   
package org.sdmlib.examples.chats.util;

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.examples.chats.CSDrawPointFlow;
import java.util.Collection;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.logger.util.SDMLibJsonIdMapSet;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.logger.TaskFlow;

public class CSDrawPointFlowSet extends SDMSet<CSDrawPointFlow>
{


   public CSDrawPointFlowPO hasCSDrawPointFlowPO()
   {
      return new CSDrawPointFlowPO(this.toArray(new CSDrawPointFlow[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.CSDrawPointFlow";
   }


   @SuppressWarnings("unchecked")
   public CSDrawPointFlowSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<CSDrawPointFlow>)value);
      }
      else if (value != null)
      {
         this.add((CSDrawPointFlow) value);
      }
      
      return this;
   }
   
   public CSDrawPointFlowSet without(CSDrawPointFlow value)
   {
      this.remove(value);
      return this;
   }

   
   //==========================================================================
   
   public CSDrawPointFlowSet run()
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.run();
      }
      return this;
   }

   public intList getX()
   {
      intList result = new intList();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getX());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasX(int value)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (value == obj.getX())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasX(int lower, int upper)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (lower <= obj.getX() && obj.getX() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withX(int value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.setX(value);
      }
      
      return this;
   }

   public intList getY()
   {
      intList result = new intList();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getY());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasY(int value)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (value == obj.getY())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasY(int lower, int upper)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (lower <= obj.getY() && obj.getY() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withY(int value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.setY(value);
      }
      
      return this;
   }

   public intList getR()
   {
      intList result = new intList();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getR());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasR(int value)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (value == obj.getR())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasR(int lower, int upper)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (lower <= obj.getR() && obj.getR() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withR(int value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.setR(value);
      }
      
      return this;
   }

   public intList getG()
   {
      intList result = new intList();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getG());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasG(int value)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (value == obj.getG())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasG(int lower, int upper)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (lower <= obj.getG() && obj.getG() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withG(int value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.setG(value);
      }
      
      return this;
   }

   public intList getB()
   {
      intList result = new intList();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getB());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasB(int value)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (value == obj.getB())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasB(int lower, int upper)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (lower <= obj.getB() && obj.getB() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withB(int value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.setB(value);
      }
      
      return this;
   }

   public intList getTaskNo()
   {
      intList result = new intList();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getTaskNo());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasTaskNo(int value)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (value == obj.getTaskNo())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasTaskNo(int lower, int upper)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (lower <= obj.getTaskNo() && obj.getTaskNo() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withTaskNo(int value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.setTaskNo(value);
      }
      
      return this;
   }

   public SDMLibJsonIdMapSet getIdMap()
   {
      SDMLibJsonIdMapSet result = new SDMLibJsonIdMapSet();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getIdMap());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasIdMap(org.sdmlib.serialization.SDMLibJsonIdMap value)
   {
      CSDrawPointFlowSet result = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (value == obj.getIdMap())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withIdMap(SDMLibJsonIdMap value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.setIdMap(value);
      }
      
      return this;
   }

   public TaskFlowSet getSubFlow()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getSubFlow());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasSubFlow(Object value)
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
      
      CSDrawPointFlowSet answer = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (neighbors.contains(obj.getSubFlow()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }


   public TaskFlowSet getSubFlowTransitive()
   {
      TaskFlowSet todo = new TaskFlowSet().with(this);
      
      TaskFlowSet result = new TaskFlowSet();
      
      while ( ! todo.isEmpty())
      {
         TaskFlow current = todo.first();
         
         todo.remove(current);
         
         if ( ! result.contains(current))
         {
            result.add(current);
            
            if ( ! result.contains(current.getSubFlow()))
            {
               todo.with(current.getSubFlow());
            }
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withSubFlow(TaskFlow value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.withSubFlow(value);
      }
      
      return this;
   }

   public TaskFlowSet getParent()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         result.add(obj.getParent());
      }
      
      return result;
   }

   public CSDrawPointFlowSet hasParent(Object value)
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
      
      CSDrawPointFlowSet answer = new CSDrawPointFlowSet();
      
      for (CSDrawPointFlow obj : this)
      {
         if (neighbors.contains(obj.getParent()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }


   public TaskFlowSet getParentTransitive()
   {
      TaskFlowSet todo = new TaskFlowSet().with(this);
      
      TaskFlowSet result = new TaskFlowSet();
      
      while ( ! todo.isEmpty())
      {
         TaskFlow current = todo.first();
         
         todo.remove(current);
         
         if ( ! result.contains(current))
         {
            result.add(current);
            
            if ( ! result.contains(current.getParent()))
            {
               todo.with(current.getParent());
            }
         }
      }
      
      return result;
   }

   public CSDrawPointFlowSet withParent(TaskFlow value)
   {
      for (CSDrawPointFlow obj : this)
      {
         obj.withParent(value);
      }
      
      return this;
   }

}
