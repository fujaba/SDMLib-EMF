package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.Card;
import org.sdmlib.serialization.EntityFactory;

import de.uniks.networkparser.json.JsonIdMap;

public class CardCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      Card.PROPERTY_SUIT,
      Card.PROPERTY_VALUE,
      Card.PROPERTY_GAME,
      Card.PROPERTY_HOLDER,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new Card();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((Card) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((Card) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((Card) entity).removeYou();
   }
}

