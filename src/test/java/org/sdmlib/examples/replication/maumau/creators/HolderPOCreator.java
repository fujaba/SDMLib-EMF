package org.sdmlib.examples.replication.maumau.creators;


public class HolderPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new HolderPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((HolderPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((HolderPO) target).set(attrName, value);
   }
}

