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

import org.sdmlib.serialization.EntityFactory;
import de.uniks.networkparser.json.JsonIdMap;
import org.sdmlib.examples.chats.PeerToPeerChatArgs;

public class PeerToPeerChatArgsCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      PeerToPeerChatArgs.PROPERTY_USERNAME,
      PeerToPeerChatArgs.PROPERTY_LOCALPORT,
      PeerToPeerChatArgs.PROPERTY_PEERIP,
      PeerToPeerChatArgs.PROPERTY_PEERPORT,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return new PeerToPeerChatArgs();
   }
   
   @Override
   public Object getValue(Object target, String attrName)
   {
      int pos = attrName.indexOf('.');
      String attribute = attrName;
      
      if (pos > 0)
      {
         attribute = attrName.substring(0, pos);
      }

      if (PeerToPeerChatArgs.PROPERTY_USERNAME.equalsIgnoreCase(attribute))
      {
         return ((PeerToPeerChatArgs) target).getUserName();
      }

      if (PeerToPeerChatArgs.PROPERTY_LOCALPORT.equalsIgnoreCase(attribute))
      {
         return ((PeerToPeerChatArgs) target).getLocalPort();
      }

      if (PeerToPeerChatArgs.PROPERTY_PEERIP.equalsIgnoreCase(attribute))
      {
         return ((PeerToPeerChatArgs) target).getPeerIp();
      }

      if (PeerToPeerChatArgs.PROPERTY_PEERPORT.equalsIgnoreCase(attribute))
      {
         return ((PeerToPeerChatArgs) target).getPeerPort();
      }
      
      return null;
   }
   
   @Override
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (PeerToPeerChatArgs.PROPERTY_USERNAME.equalsIgnoreCase(attrName))
      {
         ((PeerToPeerChatArgs) target).withUserName((String) value);
         return true;
      }

      if (PeerToPeerChatArgs.PROPERTY_LOCALPORT.equalsIgnoreCase(attrName))
      {
         ((PeerToPeerChatArgs) target).withLocalPort(Integer.parseInt(value.toString()));
         return true;
      }

      if (PeerToPeerChatArgs.PROPERTY_PEERIP.equalsIgnoreCase(attrName))
      {
         ((PeerToPeerChatArgs) target).withPeerIp((String) value);
         return true;
      }

      if (PeerToPeerChatArgs.PROPERTY_PEERPORT.equalsIgnoreCase(attrName))
      {
         ((PeerToPeerChatArgs) target).withPeerPort(Integer.parseInt(value.toString()));
         return true;
      }
      
      return false;
   }
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }
   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((PeerToPeerChatArgs) entity).removeYou();
   }
}
