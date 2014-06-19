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
import org.sdmlib.examples.chats.CSChatMessageFlow;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.logger.util.SDMLibJsonIdMapSet;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.logger.TaskFlow;

public class CSChatMessageFlowSet extends SDMSet<CSChatMessageFlow>
{


   public CSChatMessageFlowPO hasCSChatMessageFlowPO()
   {
      return new CSChatMessageFlowPO(this.toArray(new CSChatMessageFlow[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.CSChatMessageFlow";
   }


   @SuppressWarnings("unchecked")
   public CSChatMessageFlowSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<CSChatMessageFlow>)value);
      }
      else if (value != null)
      {
         this.add((CSChatMessageFlow) value);
      }
      
      return this;
   }
   
   public CSChatMessageFlowSet without(CSChatMessageFlow value)
   {
      this.remove(value);
      return this;
   }

   
   //==========================================================================
   
   public CSChatMessageFlowSet run()
   {
      for (CSChatMessageFlow obj : this)
      {
         obj.run();
      }
      return this;
   }

   public StringList getMsg()
   {
      StringList result = new StringList();
      
      for (CSChatMessageFlow obj : this)
      {
         result.add(obj.getMsg());
      }
      
      return result;
   }

   public CSChatMessageFlowSet hasMsg(String value)
   {
      CSChatMessageFlowSet result = new CSChatMessageFlowSet();
      
      for (CSChatMessageFlow obj : this)
      {
         if (value.equals(obj.getMsg()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSChatMessageFlowSet hasMsg(String lower, String upper)
   {
      CSChatMessageFlowSet result = new CSChatMessageFlowSet();
      
      for (CSChatMessageFlow obj : this)
      {
         if (lower.compareTo(obj.getMsg()) <= 0 && obj.getMsg().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSChatMessageFlowSet withMsg(String value)
   {
      for (CSChatMessageFlow obj : this)
      {
         obj.setMsg(value);
      }
      
      return this;
   }

   public intList getTaskNo()
   {
      intList result = new intList();
      
      for (CSChatMessageFlow obj : this)
      {
         result.add(obj.getTaskNo());
      }
      
      return result;
   }

   public CSChatMessageFlowSet hasTaskNo(int value)
   {
      CSChatMessageFlowSet result = new CSChatMessageFlowSet();
      
      for (CSChatMessageFlow obj : this)
      {
         if (value == obj.getTaskNo())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSChatMessageFlowSet hasTaskNo(int lower, int upper)
   {
      CSChatMessageFlowSet result = new CSChatMessageFlowSet();
      
      for (CSChatMessageFlow obj : this)
      {
         if (lower <= obj.getTaskNo() && obj.getTaskNo() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSChatMessageFlowSet withTaskNo(int value)
   {
      for (CSChatMessageFlow obj : this)
      {
         obj.setTaskNo(value);
      }
      
      return this;
   }

   public SDMLibJsonIdMapSet getIdMap()
   {
      SDMLibJsonIdMapSet result = new SDMLibJsonIdMapSet();
      
      for (CSChatMessageFlow obj : this)
      {
         result.add(obj.getIdMap());
      }
      
      return result;
   }

   public CSChatMessageFlowSet hasIdMap(org.sdmlib.serialization.SDMLibJsonIdMap value)
   {
      CSChatMessageFlowSet result = new CSChatMessageFlowSet();
      
      for (CSChatMessageFlow obj : this)
      {
         if (value == obj.getIdMap())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CSChatMessageFlowSet withIdMap(SDMLibJsonIdMap value)
   {
      for (CSChatMessageFlow obj : this)
      {
         obj.setIdMap(value);
      }
      
      return this;
   }

   public TaskFlowSet getSubFlow()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (CSChatMessageFlow obj : this)
      {
         result.add(obj.getSubFlow());
      }
      
      return result;
   }

   public CSChatMessageFlowSet hasSubFlow(Object value)
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
      
      CSChatMessageFlowSet answer = new CSChatMessageFlowSet();
      
      for (CSChatMessageFlow obj : this)
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

   public CSChatMessageFlowSet withSubFlow(TaskFlow value)
   {
      for (CSChatMessageFlow obj : this)
      {
         obj.withSubFlow(value);
      }
      
      return this;
   }

   public TaskFlowSet getParent()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (CSChatMessageFlow obj : this)
      {
         result.add(obj.getParent());
      }
      
      return result;
   }

   public CSChatMessageFlowSet hasParent(Object value)
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
      
      CSChatMessageFlowSet answer = new CSChatMessageFlowSet();
      
      for (CSChatMessageFlow obj : this)
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

   public CSChatMessageFlowSet withParent(TaskFlow value)
   {
      for (CSChatMessageFlow obj : this)
      {
         obj.withParent(value);
      }
      
      return this;
   }

}
