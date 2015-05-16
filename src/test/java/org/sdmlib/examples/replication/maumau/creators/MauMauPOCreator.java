package org.sdmlib.examples.replication.maumau.creators;


public class MauMauPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new MauMauPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((MauMauPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((MauMauPO) target).set(attrName, value);
   }
}

