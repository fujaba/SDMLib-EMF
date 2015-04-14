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
import org.sdmlib.examples.chats.CSClientTask;
import java.util.Collection;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.chats.CSVisitAllClientsFlow;

public class CSClientTaskSet extends SDMSet<CSClientTask>
{


   public CSClientTaskPO hasCSClientTaskPO()
   {
      return new CSClientTaskPO(this.toArray(new CSClientTask[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.CSClientTask";
   }


   @SuppressWarnings("unchecked")
   public CSClientTaskSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<CSClientTask>)value);
      }
      else if (value != null)
      {
         this.add((CSClientTask) value);
      }
      
      return this;
   }
   
   public CSClientTaskSet without(CSClientTask value)
   {
      this.remove(value);
      return this;
   }

   public CSVisitAllClientsFlowSet getParent()
   {
      CSVisitAllClientsFlowSet result = new CSVisitAllClientsFlowSet();
      
      for (CSClientTask obj : this)
      {
         result.add(obj.getParent());
      }
      
      return result;
   }

   public CSClientTaskSet hasParent(Object value)
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
      
      CSClientTaskSet answer = new CSClientTaskSet();
      
      for (CSClientTask obj : this)
      {
         if (neighbors.contains(obj.getParent()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public CSClientTaskSet withParent(CSVisitAllClientsFlow value)
   {
      for (CSClientTask obj : this)
      {
         obj.withParent(value);
      }
      
      return this;
   }

}
