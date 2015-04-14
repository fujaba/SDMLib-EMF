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
import org.sdmlib.examples.chats.PeerToPeerChatArgs;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.models.modelsets.intList;

public class PeerToPeerChatArgsSet extends SDMSet<PeerToPeerChatArgs>
{


   public PeerToPeerChatArgsPO hasPeerToPeerChatArgsPO()
   {
      return new PeerToPeerChatArgsPO(this.toArray(new PeerToPeerChatArgs[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.PeerToPeerChatArgs";
   }


   @SuppressWarnings("unchecked")
   public PeerToPeerChatArgsSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<PeerToPeerChatArgs>)value);
      }
      else if (value != null)
      {
         this.add((PeerToPeerChatArgs) value);
      }
      
      return this;
   }
   
   public PeerToPeerChatArgsSet without(PeerToPeerChatArgs value)
   {
      this.remove(value);
      return this;
   }

   public StringList getUserName()
   {
      StringList result = new StringList();
      
      for (PeerToPeerChatArgs obj : this)
      {
         result.add(obj.getUserName());
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasUserName(String value)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (value.equals(obj.getUserName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasUserName(String lower, String upper)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (lower.compareTo(obj.getUserName()) <= 0 && obj.getUserName().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet withUserName(String value)
   {
      for (PeerToPeerChatArgs obj : this)
      {
         obj.setUserName(value);
      }
      
      return this;
   }

   public intList getLocalPort()
   {
      intList result = new intList();
      
      for (PeerToPeerChatArgs obj : this)
      {
         result.add(obj.getLocalPort());
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasLocalPort(int value)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (value == obj.getLocalPort())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasLocalPort(int lower, int upper)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (lower <= obj.getLocalPort() && obj.getLocalPort() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet withLocalPort(int value)
   {
      for (PeerToPeerChatArgs obj : this)
      {
         obj.setLocalPort(value);
      }
      
      return this;
   }

   public StringList getPeerIp()
   {
      StringList result = new StringList();
      
      for (PeerToPeerChatArgs obj : this)
      {
         result.add(obj.getPeerIp());
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasPeerIp(String value)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (value.equals(obj.getPeerIp()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasPeerIp(String lower, String upper)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (lower.compareTo(obj.getPeerIp()) <= 0 && obj.getPeerIp().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet withPeerIp(String value)
   {
      for (PeerToPeerChatArgs obj : this)
      {
         obj.setPeerIp(value);
      }
      
      return this;
   }

   public intList getPeerPort()
   {
      intList result = new intList();
      
      for (PeerToPeerChatArgs obj : this)
      {
         result.add(obj.getPeerPort());
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasPeerPort(int value)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (value == obj.getPeerPort())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet hasPeerPort(int lower, int upper)
   {
      PeerToPeerChatArgsSet result = new PeerToPeerChatArgsSet();
      
      for (PeerToPeerChatArgs obj : this)
      {
         if (lower <= obj.getPeerPort() && obj.getPeerPort() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public PeerToPeerChatArgsSet withPeerPort(int value)
   {
      for (PeerToPeerChatArgs obj : this)
      {
         obj.setPeerPort(value);
      }
      
      return this;
   }

}
