package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class ValuePOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new ValuePO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((ValuePO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((ValuePO) target).set(attrName, value);
   }
}

