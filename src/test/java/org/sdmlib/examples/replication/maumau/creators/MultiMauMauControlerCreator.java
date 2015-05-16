package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.MultiMauMauControler;
import org.sdmlib.serialization.EntityFactory;

import de.uniks.networkparser.json.JsonIdMap;

public class MultiMauMauControlerCreator extends EntityFactory
{
   private final String[] properties = new String[]
   {
      MultiMauMauControler.PROPERTY_MAUMAU,
      MultiMauMauControler.PROPERTY_ACTIVEPLAYER,
      MultiMauMauControler.PROPERTY_CARDCONTROLERS,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      return new MultiMauMauControler();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((MultiMauMauControler) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }
      return ((MultiMauMauControler) target).set(attrName, value);
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      ((MultiMauMauControler) entity).removeYou();
   }
}

