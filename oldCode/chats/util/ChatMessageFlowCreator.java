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
import org.sdmlib.examples.chats.ChatMessageFlow;
import org.sdmlib.logger.TaskFlow;

public class ChatMessageFlowCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      ChatMessageFlow.PROPERTY_MSG,
      ChatMessageFlow.PROPERTY_GUI,
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
      return new ChatMessageFlow();
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

      if (ChatMessageFlow.PROPERTY_MSG.equalsIgnoreCase(attribute))
      {
         return ((ChatMessageFlow) target).getMsg();
      }

      if (ChatMessageFlow.PROPERTY_GUI.equalsIgnoreCase(attribute))
      {
         return ((ChatMessageFlow) target).getGui();
      }

      if (TaskFlowCreator.PROPERTY_TASKNO.equalsIgnoreCase(attribute))
      {
         return ((TaskFlow) target).getTaskNo();
      }

      if (TaskFlowCreator.PROPERTY_IDMAP.equalsIgnoreCase(attribute))
      {
         return ((TaskFlow) target).getIdMap();
      }

      if (ChatMessageFlow.PROPERTY_SUBFLOW.equalsIgnoreCase(attribute))
      {
         return ((ChatMessageFlow) target).getSubFlow();
      }

      if (ChatMessageFlow.PROPERTY_PARENT.equalsIgnoreCase(attribute))
      {
         return ((ChatMessageFlow) target).getParent();
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

      if (ChatMessageFlow.PROPERTY_MSG.equalsIgnoreCase(attrName))
      {
         ((ChatMessageFlow) target).withMsg((String) value);
         return true;
      }

      if (ChatMessageFlow.PROPERTY_GUI.equalsIgnoreCase(attrName))
      {
         ((ChatMessageFlow) target).withGui((org.sdmlib.examples.chats.PeerToPeerChat) value);
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

      if (ChatMessageFlow.PROPERTY_SUBFLOW.equalsIgnoreCase(attrName))
      {
         ((ChatMessageFlow) target).setSubFlow((TaskFlow) value);
         return true;
      }

      if (ChatMessageFlow.PROPERTY_PARENT.equalsIgnoreCase(attrName))
      {
         ((ChatMessageFlow) target).setParent((TaskFlow) value);
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
      ((ChatMessageFlow) entity).removeYou();
   }
}