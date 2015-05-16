package org.sdmlib.examples.replication.maumau.creators;


public class DutyPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new DutyPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((DutyPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((DutyPO) target).set(attrName, value);
   }
}

