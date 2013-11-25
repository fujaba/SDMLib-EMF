package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class PlayerLaneListenerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new PlayerLaneListenerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((PlayerLaneListenerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((PlayerLaneListenerPO) target).set(attrName, value);
   }
}

