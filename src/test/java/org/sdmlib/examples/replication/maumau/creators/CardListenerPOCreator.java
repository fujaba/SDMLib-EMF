package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class CardListenerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new CardListenerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((CardListenerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((CardListenerPO) target).set(attrName, value);
   }
}

