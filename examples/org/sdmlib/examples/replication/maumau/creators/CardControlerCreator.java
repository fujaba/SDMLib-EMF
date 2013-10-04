package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.creators.CreatorCreator;
import org.sdmlib.serialization.interfaces.EntityFactory;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.examples.replication.maumau.CardControler;

public class CardControlerCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      CardControler.PROPERTY_CARD,
      CardControler.PROPERTY_LABEL,
      CardControler.PROPERTY_LISTENER,
      CardControler.PROPERTY_MAUMAUCONTROLER,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new CardControler();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((CardControler) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((CardControler) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((CardControler) entity).removeYou();
   }
}

