package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class LaneSetPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new LaneSetPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((LaneSetPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((LaneSetPO) target).set(attrName, value);
   }
}

