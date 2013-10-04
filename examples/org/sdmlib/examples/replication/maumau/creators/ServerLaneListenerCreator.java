package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.creators.CreatorCreator;
import org.sdmlib.serialization.interfaces.EntityFactory;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.replication.maumau.ServerLaneListener;

public class ServerLaneListenerCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      ServerLaneListener.PROPERTY_SOURCE,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new ServerLaneListener();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((ServerLaneListener) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((ServerLaneListener) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((ServerLaneListener) entity).removeYou();
   }
}

