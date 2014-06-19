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
import org.sdmlib.examples.chats.CSClearDrawingFlow;
import java.util.Collection;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.logger.util.SDMLibJsonIdMapSet;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.logger.TaskFlow;

public class CSClearDrawingFlowSet extends SDMSet<CSClearDrawingFlow>
{


   public CSClearDrawingFlowPO hasCSClearDrawingFlowPO()
   {
      return new CSClearDrawingFlowPO(this.toArray(new CSClearDrawingFlow[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.CSClearDrawingFlow";
   }


   @SuppressWarnings("unchecked")
   public CSClearDrawingFlowSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<CSClearDrawingFlow>)value);
      }
      else if (value != null)
      {
         this.add((CSClearDrawingFlow) value);
      }
      
      return this;
   }
   
   public CSClearDrawingFlowSet without(CSClearDrawingFlow value)
   {
      this.remove(value);
      return this;
   }

   
   //==========================================================================
   
   public CSClearDrawingFlowSet run()
   {
      for (CSClearDrawingFlow obj : this)
      {
         obj.run();
      }
      return this;
   }

   public intList getTaskNo()
   {
      intList result = new intList();
      
      for (CSClearDrawingFlow obj : this)
      {
         result.add(obj.getTaskNo());
      }
      
      return result;
   }

   public CSClearDrawingFlowSet hasTaskNo(int value)
   {
      CSClearDrawingFlowSet result = new CSClearDrawingFlowSet();
      
      for (CSClearDrawingFlow obj : this)
      {
         if (value == obj.getTaskNo())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSClearDrawingFlowSet hasTaskNo(int lower, int upper)
   {
      CSClearDrawingFlowSet result = new CSClearDrawingFlowSet();
      
      for (CSClearDrawingFlow obj : this)
      {
         if (lower <= obj.getTaskNo() && obj.getTaskNo() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSClearDrawingFlowSet withTaskNo(int value)
   {
      for (CSClearDrawingFlow obj : this)
      {
         obj.setTaskNo(value);
      }
      
      return this;
   }

   public SDMLibJsonIdMapSet getIdMap()
   {
      SDMLibJsonIdMapSet result = new SDMLibJsonIdMapSet();
      
      for (CSClearDrawingFlow obj : this)
      {
         result.add(obj.getIdMap());
      }
      
      return result;
   }

   public CSClearDrawingFlowSet hasIdMap(org.sdmlib.serialization.SDMLibJsonIdMap value)
   {
      CSClearDrawingFlowSet result = new CSClearDrawingFlowSet();
      
      for (CSClearDrawingFlow obj : this)
      {
         if (value == obj.getIdMap())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSClearDrawingFlowSet withIdMap(SDMLibJsonIdMap value)
   {
      for (CSClearDrawingFlow obj : this)
      {
         obj.setIdMap(value);
      }
      
      return this;
   }

   public TaskFlowSet getSubFlow()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (CSClearDrawingFlow obj : this)
      {
         result.add(obj.getSubFlow());
      }
      
      return result;
   }

   public CSClearDrawingFlowSet hasSubFlow(Object value)
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
      
      CSClearDrawingFlowSet answer = new CSClearDrawingFlowSet();
      
      for (CSClearDrawingFlow obj : this)
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

   public CSClearDrawingFlowSet withSubFlow(TaskFlow value)
   {
      for (CSClearDrawingFlow obj : this)
      {
         obj.withSubFlow(value);
      }
      
      return this;
   }

   public TaskFlowSet getParent()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (CSClearDrawingFlow obj : this)
      {
         result.add(obj.getParent());
      }
      
      return result;
   }

   public CSClearDrawingFlowSet hasParent(Object value)
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
      
      CSClearDrawingFlowSet answer = new CSClearDrawingFlowSet();
      
      for (CSClearDrawingFlow obj : this)
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

   public CSClearDrawingFlowSet withParent(TaskFlow value)
   {
      for (CSClearDrawingFlow obj : this)
      {
         obj.withParent(value);
      }
      
      return this;
   }

}
