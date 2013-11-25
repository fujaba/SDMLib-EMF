package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class ServerLaneListenerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new ServerLaneListenerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((ServerLaneListenerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((ServerLaneListenerPO) target).set(attrName, value);
   }
}

