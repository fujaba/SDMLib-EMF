package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class ReplicationMauMauServerPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new ReplicationMauMauServerPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((ReplicationMauMauServerPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((ReplicationMauMauServerPO) target).set(attrName, value);
   }
}

