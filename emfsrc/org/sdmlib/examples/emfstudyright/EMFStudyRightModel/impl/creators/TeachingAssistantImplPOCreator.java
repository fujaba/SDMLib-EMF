package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.creators.PatternObjectCreator;

public class TeachingAssistantImplPOCreator extends PatternObjectCreator
{
   public Object getSendableInstance(boolean reference)
   {
      return new TeachingAssistantImplPO();
   }
   
   public Object getValue(Object target, String attrName)
   {
      return ((TeachingAssistantImplPO) target).get(attrName);
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      return ((TeachingAssistantImplPO) target).set(attrName, value);
   }
}

