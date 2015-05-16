package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.MauMau;
import org.sdmlib.serialization.EntityFactory;

import de.uniks.networkparser.json.JsonIdMap;

public class MauMauCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      MauMau.PROPERTY_CARDS,
      MauMau.PROPERTY_DECK,
      MauMau.PROPERTY_STACK,
      MauMau.PROPERTY_PLAYERS,
      MauMau.PROPERTY_CURRENTMOVE,
      MauMau.PROPERTY_DUTY,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new MauMau();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((MauMau) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((MauMau) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((MauMau) entity).removeYou();
   }
}

