package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class StudentImplPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new StudentImplPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((StudentImplPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((StudentImplPO) target).set(attrName, value);
   }
}

