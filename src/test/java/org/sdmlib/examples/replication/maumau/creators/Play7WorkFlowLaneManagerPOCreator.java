package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class Play7WorkFlowLaneManagerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new Play7WorkFlowLaneManagerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((Play7WorkFlowLaneManagerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((Play7WorkFlowLaneManagerPO) target).set(attrName, value);
   }
}
