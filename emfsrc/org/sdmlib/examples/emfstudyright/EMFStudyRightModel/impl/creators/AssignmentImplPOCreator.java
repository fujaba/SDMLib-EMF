package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class AssignmentImplPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new AssignmentImplPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((AssignmentImplPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((AssignmentImplPO) target).set(attrName, value);
   }
}

