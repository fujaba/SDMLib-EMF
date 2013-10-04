package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class TaskHandlerSetPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new TaskHandlerSetPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((TaskHandlerSetPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((TaskHandlerSetPO) target).set(attrName, value);
   }
}

