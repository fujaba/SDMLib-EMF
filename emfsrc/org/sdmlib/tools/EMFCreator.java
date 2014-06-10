package org.sdmlib.tools;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.serialization.EntityFactory;

public class EMFCreator extends EntityFactory
{
   private EPackage epackage;
   
   private EClass targetClass;
   
   public EMFCreator with(EPackage epackage, String targetClass)
   {
      this.epackage = epackage;
      this.targetClass = (EClass) epackage.getEClassifier(targetClass);
            
      return this;
   }

   private String[] properties = null;
   
   @Override
   public String[] getProperties()
   {
      if (properties == null)
      {
         StringList newList = new StringList();
         
         for (EStructuralFeature feature : targetClass.getEStructuralFeatures())
         {
            newList.add(feature.getName());
         }
         
         properties = (String[]) newList.toArray();
      }
      
      return properties;
   }

   @Override
   public Object getSendableInstance(boolean prototyp)
   {
      Object newInstance = epackage.getEFactoryInstance().create(targetClass);
      
      return newInstance;
   }

   @Override
   public Object getValue(Object entity, String attribute)
   {
      EObject eobject = (EObject) entity;
      
      return eobject.eGet(targetClass.getEStructuralFeature(attribute));
   }

   @Override
   public boolean setValue(Object entity, String attribute, Object value,
         String type)
   {
      EObject eobject = (EObject) entity;
      
      eobject.eSet(targetClass.getEStructuralFeature(attribute), value);
      
      return true;
   }
   
}
