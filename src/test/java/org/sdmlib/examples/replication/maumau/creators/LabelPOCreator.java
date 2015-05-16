package org.sdmlib.examples.replication.maumau.creators;


public class LabelPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new LabelPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((LabelPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((LabelPO) target).set(attrName, value);
   }
}

