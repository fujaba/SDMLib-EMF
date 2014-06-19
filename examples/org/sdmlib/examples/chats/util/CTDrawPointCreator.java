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
import org.sdmlib.examples.chats.CTDrawPoint;
import org.sdmlib.examples.chats.CSVisitAllClientsFlow;
import org.sdmlib.examples.chats.CSClientTask;

public class CTDrawPointCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      CTDrawPoint.PROPERTY_X,
      CTDrawPoint.PROPERTY_Y,
      CTDrawPoint.PROPERTY_R,
      CTDrawPoint.PROPERTY_G,
      CTDrawPoint.PROPERTY_B,
      CSClientTask.PROPERTY_PARENT,
   };
   
   @Override
   public String[] getProperties()
   {
      return properties;
   }
   
   @Override
   public Object getSendableInstance(boolean reference)
   {
      return new CTDrawPoint();
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

      if (CTDrawPoint.PROPERTY_X.equalsIgnoreCase(attribute))
      {
         return ((CTDrawPoint) target).getX();
      }

      if (CTDrawPoint.PROPERTY_Y.equalsIgnoreCase(attribute))
      {
         return ((CTDrawPoint) target).getY();
      }

      if (CTDrawPoint.PROPERTY_R.equalsIgnoreCase(attribute))
      {
         return ((CTDrawPoint) target).getR();
      }

      if (CTDrawPoint.PROPERTY_G.equalsIgnoreCase(attribute))
      {
         return ((CTDrawPoint) target).getG();
      }

      if (CTDrawPoint.PROPERTY_B.equalsIgnoreCase(attribute))
      {
         return ((CTDrawPoint) target).getB();
      }

      if (CTDrawPoint.PROPERTY_PARENT.equalsIgnoreCase(attribute))
      {
         return ((CTDrawPoint) target).getParent();
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

      if (CTDrawPoint.PROPERTY_X.equalsIgnoreCase(attrName))
      {
         ((CTDrawPoint) target).withX(Integer.parseInt(value.toString()));
         return true;
      }

      if (CTDrawPoint.PROPERTY_Y.equalsIgnoreCase(attrName))
      {
         ((CTDrawPoint) target).withY(Integer.parseInt(value.toString()));
         return true;
      }

      if (CTDrawPoint.PROPERTY_R.equalsIgnoreCase(attrName))
      {
         ((CTDrawPoint) target).withR(Integer.parseInt(value.toString()));
         return true;
      }

      if (CTDrawPoint.PROPERTY_G.equalsIgnoreCase(attrName))
      {
         ((CTDrawPoint) target).withG(Integer.parseInt(value.toString()));
         return true;
      }

      if (CTDrawPoint.PROPERTY_B.equalsIgnoreCase(attrName))
      {
         ((CTDrawPoint) target).withB(Integer.parseInt(value.toString()));
         return true;
      }

      if (CTDrawPoint.PROPERTY_PARENT.equalsIgnoreCase(attrName))
      {
         ((CTDrawPoint) target).setParent((CSVisitAllClientsFlow) value);
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
      ((CTDrawPoint) entity).removeYou();
   }
}
