package org.sdmlib.serialization.xml;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.sdmlib.CGUtil;
import org.sdmlib.StrUtil;
import org.sdmlib.serialization.EntityFactory;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.serialization.StringBuilderBuffer;

import de.uniks.networkparser.interfaces.SendableEntityCreator;
import de.uniks.networkparser.xml.XMLEntity;
import de.uniks.networkparser.xml.XMLTokener;

public class EmfIdMap extends SDMLibJsonIdMap
{
   private static final String XSI_TYPE = "xsi:type";
   private static final String XMI_ID = "xmi:id";

   public EmfIdMap() {
}
   
   public Object decode(StringBuilder fileText)
   {
      int pos = fileText.indexOf("\n");

      StringBuilderBuffer buffer = new StringBuilderBuffer().withValue(fileText);

      buffer.withPosition(pos);
      
      

      XMLEntity xmlEntity = new XMLEntity().withValue(new XMLTokener().withBuffer(buffer));

      EntityFactory rootFactory = null;

      // build root entity
      String tag = xmlEntity.getTag();

      String className = tag.split("\\:")[1];

      for (String fullName : creators.keySet())
      {
         if (CGUtil.shortClassName(fullName).equals(className))
         {
            rootFactory = (EntityFactory) getCreator(fullName, true);
            break;
         }
      }

      Object rootObject = null;

      if (rootFactory != null)
      {
         rootObject = rootFactory.getSendableInstance(false);
      }
      else
      {
         // just use a ArrayList
         rootObject = new ArrayList();
      }

      addXMIIds(xmlEntity);

      addValues(rootFactory, xmlEntity, rootObject);

      addChildren(xmlEntity, rootFactory, rootObject);

      return rootObject;
   }

   private void addXMIIds(XMLEntity xmlEntity)
   {
      if (xmlEntity.contains(XMI_ID))
      {
         return;
      }

      xmlEntity.put(XMI_ID, "$n1");
      int i = 0;
      String firstTag = "p";
      for (XMLEntity kid : xmlEntity.getChildren())
      {
         if (kid.contains(XMI_ID))
         {
            continue;
         }
         if (!kid.getTag().startsWith(firstTag))
         {
            i = 0;
            firstTag = kid.getTag().substring(0, 1);
         }
         kid.put(XMI_ID, "$" + firstTag + i);
         i++;
      }
   }

   private void addValues(EntityFactory rootFactory, XMLEntity xmlEntity, Object rootObject)
   {
      if (rootFactory == null)
      {
         return;
      }
      // add to map
      String id = (String) xmlEntity.get(XMI_ID);

      if (id.startsWith("$"))
      {
         id = "_" + id.substring(1);
      }

      this.put(id, rootObject);

      // set plain attributes
      for (Iterator<String> iter = xmlEntity.keys(); iter.hasNext();)
      {
         String key = iter.next();
         String value = ((String) xmlEntity.get(key)).trim();

         if (value == null || "".equals(value) || XMI_ID.equals(key))
         {
            continue;
         }

         if (value.startsWith("/"))
         {
            // maybe multiple separated by blanks
            String tagChar = xmlEntity.getTag().substring(0, 1);
            for (String ref : value.split(" "))
            {
               ref = "_" + tagChar + ref.substring(1);
               if (getObject(ref) != null)
               {
                  rootFactory.setValue(rootObject, key, getObject(ref), "");
               }
            }
         }
         else if (value.indexOf('_') > 0)
         {
            // maybe multiple separated by blanks
            for (String ref : value.split(" "))
            {
               if (getObject(ref) != null)
               {
                  rootFactory.setValue(rootObject, key, getObject(ref), "");
               }
            }
         }
         else if (value.startsWith("$"))
         {
            for (String ref : value.split(" "))
            {
               String myRef = "_" + ref.substring(1);
               if (getObject(myRef) != null && rootFactory != null)
               {
                  rootFactory.setValue(rootObject, key, getObject(myRef), "");
               }
            }
         }
         else if (value.startsWith("//@"))
         {
            for (String ref : value.split(" "))
            {
               String myRef = ref.substring(3);
               myRef = "_" + myRef.subSequence(0, 1) + myRef.split("\\.")[1];
               if (getObject(myRef) != null)
               {
                  rootFactory.setValue(rootObject, key, getObject(myRef), "");
               }
            }
         }
         else
         {
            if (rootFactory != null)
            {
               rootFactory.setValue(rootObject, key, value, "");
            }
         }
      }
   }

   private void addChildren(XMLEntity xmlEntity, EntityFactory rootFactory, Object rootObject)
   {
      
      Iterator<XMLEntity> iterator = xmlEntity.getChildren().iterator();
      while (iterator.hasNext())
      {
         XMLEntity kidEntity = iterator.next();
         String tag = kidEntity.getTag();
         Method getMethod = null;
         String typeName = null;

         Collection rootCollection = null;
         // identify kid type
         try
         {
            if (rootObject instanceof Collection)
            {
               rootCollection = (Collection) rootObject;

               // take the type name from the tag
               typeName = tag.split(":")[1];
            }
            else
            {
               getMethod = rootObject.getClass().getMethod("get" + StrUtil.upFirstChar(tag));
               typeName = getMethod.getReturnType().getName();

               typeName = CGUtil.baseClassName(typeName, "Set");
            }

            if (kidEntity.contains(XSI_TYPE))
            {
               typeName = kidEntity.getString(XSI_TYPE);
               typeName = typeName.replaceAll(":", ".");
            }

            if (typeName != null)
            {
               EntityFactory kidFactory = (EntityFactory) getCreatorClassesByShortName(typeName);

               Object kidObject = kidFactory.create();

               addValues(kidFactory, kidEntity, kidObject);

               if (rootCollection != null)
               {
                  rootCollection.add(kidObject);
               }
               else
               {
                  rootFactory.setValue(rootObject, tag, kidObject, "");
               }

               addChildren(kidEntity, kidFactory, kidObject);
            }
         }
         catch (Exception e)
         {
            e.printStackTrace();
         }
      }

   }

   private EntityFactory getCreatorClassesByShortName(String typeName)
   {
      EntityFactory kidFactory = (EntityFactory) getCreator(typeName, true);

      if (kidFactory == null)
      {
         for (String creatorName : getCreatorsKeySet())
         {
            if (creatorName.endsWith(typeName))
            {
               return (EntityFactory) getCreator(creatorName, true);
            }
         }
      }

      return null;
   }

   private Set<String> getCreatorsKeySet()
   {
      return this.creators.keySet();
   }

   public EmfIdMap withCreators(LinkedHashSet<SendableEntityCreator> creatorSet)
   {
      withCreator(creatorSet);
      return this;
   }

   public Object decodeFile(String fileName)
   {
      StringBuilder fileText = CGUtil.readFile(fileName);

      return decode(fileText);
   }
}
