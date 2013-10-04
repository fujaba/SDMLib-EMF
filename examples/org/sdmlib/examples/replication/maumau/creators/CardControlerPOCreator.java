package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class CardControlerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new CardControlerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((CardControlerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((CardControlerPO) target).set(attrName, value);
   }
}

