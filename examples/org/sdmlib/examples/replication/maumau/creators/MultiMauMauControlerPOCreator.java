package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class MultiMauMauControlerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new MultiMauMauControlerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((MultiMauMauControlerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((MultiMauMauControlerPO) target).set(attrName, value);
   }
}

