package org.sdmlib.examples.groupAccount.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class GroupAccountTestsPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new GroupAccountTestsPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((GroupAccountTestsPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((GroupAccountTestsPO) target).set(attrName, value);
   }
}

