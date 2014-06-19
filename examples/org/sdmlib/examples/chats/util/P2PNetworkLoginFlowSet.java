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
import org.sdmlib.examples.chats.P2PNetworkLoginFlow;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.sdmlib.logger.util.PeerProxySet;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.logger.util.SDMLibJsonIdMapSet;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.logger.TaskFlow;

public class P2PNetworkLoginFlowSet extends SDMSet<P2PNetworkLoginFlow>
{


   public P2PNetworkLoginFlowPO hasP2PNetworkLoginFlowPO()
   {
      return new P2PNetworkLoginFlowPO(this.toArray(new P2PNetworkLoginFlow[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.P2PNetworkLoginFlow";
   }


   @SuppressWarnings("unchecked")
   public P2PNetworkLoginFlowSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<P2PNetworkLoginFlow>)value);
      }
      else if (value != null)
      {
         this.add((P2PNetworkLoginFlow) value);
      }
      
      return this;
   }
   
   public P2PNetworkLoginFlowSet without(P2PNetworkLoginFlow value)
   {
      this.remove(value);
      return this;
   }

   
   //==========================================================================
   
   public P2PNetworkLoginFlowSet run()
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.run();
      }
      return this;
   }

   
   //==========================================================================
   
   public LinkedHashSet<Object> getTaskNames()
   {
      LinkedHashSet<Object> result = new LinkedHashSet<Object>();
      for (P2PNetworkLoginFlow obj : this)
      {
         result.add(obj.getTaskNames());
      }
      return result;
   }

   public PeerProxySet getFirstPeer()
   {
      PeerProxySet result = new PeerProxySet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.addAll(obj.getFirstPeer());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasFirstPeer(org.sdmlib.logger.util.PeerProxySet value)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (value == obj.getFirstPeer())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet withFirstPeer(PeerProxySet value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.setFirstPeer(value);
      }
      
      return this;
   }

   public PeerProxySet getClientPeer()
   {
      PeerProxySet result = new PeerProxySet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.addAll(obj.getClientPeer());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasClientPeer(org.sdmlib.logger.util.PeerProxySet value)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (value == obj.getClientPeer())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet withClientPeer(PeerProxySet value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.setClientPeer(value);
      }
      
      return this;
   }

   public StringList getClientName()
   {
      StringList result = new StringList();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.add(obj.getClientName());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasClientName(String value)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (value.equals(obj.getClientName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasClientName(String lower, String upper)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (lower.compareTo(obj.getClientName()) <= 0 && obj.getClientName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet withClientName(String value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.setClientName(value);
      }
      
      return this;
   }

   public StringList getAllMessages()
   {
      StringList result = new StringList();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.add(obj.getAllMessages());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasAllMessages(String value)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (value.equals(obj.getAllMessages()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasAllMessages(String lower, String upper)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (lower.compareTo(obj.getAllMessages()) <= 0 && obj.getAllMessages().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet withAllMessages(String value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.setAllMessages(value);
      }
      
      return this;
   }

   public PeerProxySet getPeerList()
   {
      PeerProxySet result = new PeerProxySet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.addAll(obj.getPeerList());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasPeerList(org.sdmlib.logger.util.PeerProxySet value)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (value == obj.getPeerList())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet withPeerList(PeerProxySet value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.setPeerList(value);
      }
      
      return this;
   }

   public intList getTaskNo()
   {
      intList result = new intList();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.add(obj.getTaskNo());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasTaskNo(int value)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (value == obj.getTaskNo())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasTaskNo(int lower, int upper)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (lower <= obj.getTaskNo() && obj.getTaskNo() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet withTaskNo(int value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.setTaskNo(value);
      }
      
      return this;
   }

   public SDMLibJsonIdMapSet getIdMap()
   {
      SDMLibJsonIdMapSet result = new SDMLibJsonIdMapSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.add(obj.getIdMap());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasIdMap(org.sdmlib.serialization.SDMLibJsonIdMap value)
   {
      P2PNetworkLoginFlowSet result = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         if (value == obj.getIdMap())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet withIdMap(SDMLibJsonIdMap value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.setIdMap(value);
      }
      
      return this;
   }

   public TaskFlowSet getSubFlow()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.add(obj.getSubFlow());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasSubFlow(Object value)
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
      
      P2PNetworkLoginFlowSet answer = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
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

   public P2PNetworkLoginFlowSet withSubFlow(TaskFlow value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.withSubFlow(value);
      }
      
      return this;
   }

   public TaskFlowSet getParent()
   {
      TaskFlowSet result = new TaskFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
      {
         result.add(obj.getParent());
      }
      
      return result;
   }

   public P2PNetworkLoginFlowSet hasParent(Object value)
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
      
      P2PNetworkLoginFlowSet answer = new P2PNetworkLoginFlowSet();
      
      for (P2PNetworkLoginFlow obj : this)
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

   public P2PNetworkLoginFlowSet withParent(TaskFlow value)
   {
      for (P2PNetworkLoginFlow obj : this)
      {
         obj.withParent(value);
      }
      
      return this;
   }

}
