package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class PlayerLaneManagerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new PlayerLaneManagerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((PlayerLaneManagerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((PlayerLaneManagerPO) target).set(attrName, value);
   }
}

