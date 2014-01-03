package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class UniversityImplPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new UniversityImplPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((UniversityImplPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((UniversityImplPO) target).set(attrName, value);
   }
}

