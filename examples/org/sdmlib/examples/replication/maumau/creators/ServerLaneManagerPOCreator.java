package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class ServerLaneManagerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new ServerLaneManagerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((ServerLaneManagerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((ServerLaneManagerPO) target).set(attrName, value);
   }
}

