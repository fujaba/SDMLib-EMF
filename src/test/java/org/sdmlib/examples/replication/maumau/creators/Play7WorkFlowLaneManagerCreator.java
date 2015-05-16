package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.Play7WorkFlowLaneManager;
import org.sdmlib.serialization.EntityFactory;

import de.uniks.networkparser.json.JsonIdMap;

public class Play7WorkFlowLaneManagerCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      Play7WorkFlowLaneManager.PROPERTY_SOURCE,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new Play7WorkFlowLaneManager();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((Play7WorkFlowLaneManager) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((Play7WorkFlowLaneManager) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((Play7WorkFlowLaneManager) entity).removeYou();
   }
}

