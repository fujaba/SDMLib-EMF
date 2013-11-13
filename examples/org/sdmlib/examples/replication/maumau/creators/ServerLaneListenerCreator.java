package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.creators.CreatorCreator;
import org.sdmlib.serialization.interfaces.EntityFactory;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.replication.maumau.ServerLaneManager;

public class ServerLaneListenerCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      ServerLaneManager.PROPERTY_SOURCE,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new ServerLaneManager();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((ServerLaneManager) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((ServerLaneManager) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((ServerLaneManager) entity).removeYou();
   }
}

