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
import org.sdmlib.examples.chats.ClientLoginFlow;
import java.util.Collection;
import org.sdmlib.logger.util.PeerProxySet;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.logger.util.SDMLibJsonIdMapSet;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.logger.TaskFlow;

public class ClientLoginFlowSet extends SDMSet<ClientLoginFlow>
{


   public ClientLoginFlowPO hasClientLoginFlowPO()
   {
      return new ClientLoginFlowPO(this.toArray(new ClientLoginFlow[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.ClientLoginFlow";
   }


   @SuppressWarnings("unchecked")
   public ClientLoginFlowSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<ClientLoginFlow>)value);
      }
      else if (value != null)
      {
         this.add((ClientLoginFlow) value);
      }
      
      return this;
   }
   
   public ClientLoginFlowSet without(ClientLoginFlow value)
   {
      this.remove(value);
      return this;
   }

   
   //==========================================================================
   
   public ClientLoginFlowSet run()
   {
      for (ClientLoginFlow obj : this)
      {
         obj.run();
      }
      return this;
   }

   public PeerProxySet getServer()
   {
      PeerProxySet result = new PeerProxySet();
      
      for (ClientLoginFlow obj : this)
      {
         result.addAll(obj.getServer());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasServer(org.sdmlib.logger.util.PeerProxySet value)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (value == obj.getServer())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet withServer(PeerProxySet value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.setServer(value);
      }
      
      return this;
   }

   public StringList getClientIP()
   {
      StringList result = new StringList();
      
      for (ClientLoginFlow obj : this)
      {
         result.add(obj.getClientIP());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasClientIP(String value)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (value.equals(obj.getClientIP()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet hasClientIP(String lower, String upper)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (lower.compareTo(obj.getClientIP()) <= 0 && obj.getClientIP().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet withClientIP(String value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.setClientIP(value);
      }
      
      return this;
   }

   public intList getClientPort()
   {
      intList result = new intList();
      
      for (ClientLoginFlow obj : this)
      {
         result.add(obj.getClientPort());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasClientPort(int value)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (value == obj.getClientPort())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet hasClientPort(int lower, int upper)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (lower <= obj.getClientPort() && obj.getClientPort() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet withClientPort(int value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.setClientPort(value);
      }
      
      return this;
   }

   public StringList getAllMessagesText()
   {
      StringList result = new StringList();
      
      for (ClientLoginFlow obj : this)
      {
         result.add(obj.getAllMessagesText());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasAllMessagesText(String value)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (value.equals(obj.getAllMessagesText()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet hasAllMessagesText(String lower, String upper)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (lower.compareTo(obj.getAllMessagesText()) <= 0 && obj.getAllMessagesText().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet withAllMessagesText(String value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.setAllMessagesText(value);
      }
      
      return this;
   }

   public intList getTaskNo()
   {
      intList result = new intList();
      
      for (ClientLoginFlow obj : this)
      {
         result.add(obj.getTaskNo());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasTaskNo(int value)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (value == obj.getTaskNo())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet hasTaskNo(int lower, int upper)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (lower <= obj.getTaskNo() && obj.getTaskNo() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet withTaskNo(int value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.setTaskNo(value);
      }
      
      return this;
   }

   public SDMLibJsonIdMapSet getIdMap()
   {
      SDMLibJsonIdMapSet result = new SDMLibJsonIdMapSet();
      
      for (ClientLoginFlow obj : this)
      {
         result.add(obj.getIdMap());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasIdMap(org.sdmlib.serialization.SDMLibJsonIdMap value)
   {
      ClientLoginFlowSet result = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         if (value == obj.getIdMap())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ClientLoginFlowSet withIdMap(SDMLibJsonIdMap value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.setIdMap(value);
      }
      
      return this;
   }

   public TaskFlowSet getSubFlow()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         result.add(obj.getSubFlow());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasSubFlow(Object value)
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
      
      ClientLoginFlowSet answer = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
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

   public ClientLoginFlowSet withSubFlow(TaskFlow value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.withSubFlow(value);
      }
      
      return this;
   }

   public TaskFlowSet getParent()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (ClientLoginFlow obj : this)
      {
         result.add(obj.getParent());
      }
      
      return result;
   }

   public ClientLoginFlowSet hasParent(Object value)
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
      
      ClientLoginFlowSet answer = new ClientLoginFlowSet();
      
      for (ClientLoginFlow obj : this)
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

   public ClientLoginFlowSet withParent(TaskFlow value)
   {
      for (ClientLoginFlow obj : this)
      {
         obj.withParent(value);
      }
      
      return this;
   }

}
