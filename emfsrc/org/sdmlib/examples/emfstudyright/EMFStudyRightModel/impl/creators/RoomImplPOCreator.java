package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.util.PatternObjectCreator;

public class RoomImplPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new RoomImplPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((RoomImplPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((RoomImplPO) target).set(attrName, value);
   }
}

