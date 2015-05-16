package org.sdmlib.examples.replication.maumau.creators;


public class SuitPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new SuitPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((SuitPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((SuitPO) target).set(attrName, value);
   }
}

