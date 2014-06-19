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
import org.sdmlib.examples.chats.ClientLoginFlow;
import org.sdmlib.logger.TaskFlow;

public class ClientLoginFlowCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      ClientLoginFlow.PROPERTY_SERVER,
      ClientLoginFlow.PROPERTY_CLIENTIP,
      ClientLoginFlow.PROPERTY_CLIENTPORT,
      ClientLoginFlow.PROPERTY_ALLMESSAGESTEXT,
      TaskFlow.PROPERTY_TASKNO,
      TaskFlow.PROPERTY_IDMAP,
      TaskFlow.PROPERTY_SUBFLOW,
      TaskFlow.PROPERTY_PARENT,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return new ClientLoginFlow();
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

      if (ClientLoginFlow.PROPERTY_SERVER.equalsIgnoreCase(attribute))
      {
         return ((ClientLoginFlow) target).getServer();
      }

      if (ClientLoginFlow.PROPERTY_CLIENTIP.equalsIgnoreCase(attribute))
      {
         return ((ClientLoginFlow) target).getClientIP();
      }

      if (ClientLoginFlow.PROPERTY_CLIENTPORT.equalsIgnoreCase(attribute))
      {
         return ((ClientLoginFlow) target).getClientPort();
      }

      if (ClientLoginFlow.PROPERTY_ALLMESSAGESTEXT.equalsIgnoreCase(attribute))
      {
         return ((ClientLoginFlow) target).getAllMessagesText();
      }

      if (TaskFlowCreator.PROPERTY_TASKNO.equalsIgnoreCase(attribute))
      {
         return ((TaskFlow) target).getTaskNo();
      }

      if (TaskFlowCreator.PROPERTY_IDMAP.equalsIgnoreCase(attribute))
      {
         return ((TaskFlow) target).getIdMap();
      }

      if (ClientLoginFlow.PROPERTY_SUBFLOW.equalsIgnoreCase(attribute))
      {
         return ((ClientLoginFlow) target).getSubFlow();
      }

      if (ClientLoginFlow.PROPERTY_PARENT.equalsIgnoreCase(attribute))
      {
         return ((ClientLoginFlow) target).getParent();
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

      if (ClientLoginFlow.PROPERTY_SERVER.equalsIgnoreCase(attrName))
      {
         ((ClientLoginFlow) target).withServer((org.sdmlib.logger.util.PeerProxySet) value);
         return true;
      }

      if (ClientLoginFlow.PROPERTY_CLIENTIP.equalsIgnoreCase(attrName))
      {
         ((ClientLoginFlow) target).withClientIP((String) value);
         return true;
      }

      if (ClientLoginFlow.PROPERTY_CLIENTPORT.equalsIgnoreCase(attrName))
      {
         ((ClientLoginFlow) target).withClientPort(Integer.parseInt(value.toString()));
         return true;
      }

      if (ClientLoginFlow.PROPERTY_ALLMESSAGESTEXT.equalsIgnoreCase(attrName))
      {
         ((ClientLoginFlow) target).withAllMessagesText((String) value);
         return true;
      }

      if (TaskFlowCreator.PROPERTY_TASKNO.equalsIgnoreCase(attrName))
      {
         ((TaskFlow) target).withTaskNo(Integer.parseInt(value.toString()));
         return true;
      }

      if (TaskFlowCreator.PROPERTY_IDMAP.equalsIgnoreCase(attrName))
      {
         ((TaskFlow) target).withIdMap((org.sdmlib.serialization.SDMLibJsonIdMap) value);
         return true;
      }

      if (ClientLoginFlow.PROPERTY_SUBFLOW.equalsIgnoreCase(attrName))
      {
         ((ClientLoginFlow) target).setSubFlow((TaskFlow) value);
         return true;
      }

      if (ClientLoginFlow.PROPERTY_PARENT.equalsIgnoreCase(attrName))
      {
         ((ClientLoginFlow) target).setParent((TaskFlow) value);
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
      ((ClientLoginFlow) entity).removeYou();
   }
}
