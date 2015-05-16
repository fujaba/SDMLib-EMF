package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.PlayerLaneManager;
import org.sdmlib.serialization.EntityFactory;

import de.uniks.networkparser.json.JsonIdMap;

public class PlayerLaneListenerCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      PlayerLaneManager.PROPERTY_SOURCES,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new PlayerLaneManager();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((PlayerLaneManager) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((PlayerLaneManager) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((PlayerLaneManager) entity).removeYou();
   }
}

