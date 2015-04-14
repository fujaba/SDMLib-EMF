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
import org.sdmlib.examples.chats.ChatServer;
import java.util.Collection;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.logger.util.PeerProxySet;

public class ChatServerSet extends SDMSet<ChatServer>
{


   public ChatServerPO hasChatServerPO()
   {
      return new ChatServerPO(this.toArray(new ChatServer[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.ChatServer";
   }


   @SuppressWarnings("unchecked")
   public ChatServerSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<ChatServer>)value);
      }
      else if (value != null)
      {
         this.add((ChatServer) value);
      }
      
      return this;
   }
   
   public ChatServerSet without(ChatServer value)
   {
      this.remove(value);
      return this;
   }

   public StringList getAllMessages()
   {
      StringList result = new StringList();
      
      for (ChatServer obj : this)
      {
         result.add(obj.getAllMessages());
      }
      
      return result;
   }

   public ChatServerSet hasAllMessages(String value)
   {
      ChatServerSet result = new ChatServerSet();
      
      for (ChatServer obj : this)
      {
         if (value.equals(obj.getAllMessages()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ChatServerSet hasAllMessages(String lower, String upper)
   {
      ChatServerSet result = new ChatServerSet();
      
      for (ChatServer obj : this)
      {
         if (lower.compareTo(obj.getAllMessages()) <= 0 && obj.getAllMessages().compareTo(upper) <= 0)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ChatServerSet withAllMessages(String value)
   {
      for (ChatServer obj : this)
      {
         obj.setAllMessages(value);
      }
      
      return this;
   }

   public PeerProxySet getAllPeers()
   {
      PeerProxySet result = new PeerProxySet();
      
      for (ChatServer obj : this)
      {
         result.addAll(obj.getAllPeers());
      }
      
      return result;
   }

   public ChatServerSet hasAllPeers(org.sdmlib.logger.util.PeerProxySet value)
   {
      ChatServerSet result = new ChatServerSet();
      
      for (ChatServer obj : this)
      {
         if (value == obj.getAllPeers())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public ChatServerSet withAllPeers(PeerProxySet value)
   {
      for (ChatServer obj : this)
      {
         obj.setAllPeers(value);
      }
      
      return this;
   }

}
