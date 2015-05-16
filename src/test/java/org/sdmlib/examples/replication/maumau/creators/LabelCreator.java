package org.sdmlib.examples.replication.maumau.creators;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.sdmlib.serialization.EntityFactory;

import de.uniks.networkparser.json.JsonIdMap;

public class LabelCreator extends EntityFactory
{
   public static final String PROPERTY_TEXT = "text";
   private final String[] properties = new String[]
   {
      PROPERTY_TEXT,
   };
   
   public String[] getProperties()
   {
      return properties;
   }
   
   public Object getSendableInstance(boolean reference)
   {
      Label label = null;
      try
      {
         label = new Label(new Shell(), 0);
      }
      catch (Exception e)
      {
         // ignore
      }
      return label;
   }
   
   public Object getValue(Object target, String attrName)
   {
      if (PROPERTY_TEXT.equalsIgnoreCase(attrName))
      {
         return ((Label) target).getText();
      }

      return null;
   }
   
   public boolean setValue(Object target, String attrName, Object value, String type)
   {
      if (JsonIdMap.REMOVE.equals(type) && value != null)
      {
         attrName = attrName + type;
      }

      if (PROPERTY_TEXT.equalsIgnoreCase(attrName))
      {
         ((Label) target).setText((String) value);
         return true;
      }
      return false;
   }
   
   public static JsonIdMap createIdMap(String sessionID)
   {
      return CreatorCreator.createIdMap(sessionID);
   }

   
   //==========================================================================
   
   @Override
   public void removeObject(Object entity)
   {
      // wrapped object has no removeYou method
   }
}

