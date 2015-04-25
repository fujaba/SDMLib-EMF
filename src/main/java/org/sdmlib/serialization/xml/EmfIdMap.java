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

import de.uniks.networkparser.StringBuffer;
import de.uniks.networkparser.interfaces.SendableEntityCreator;
import de.uniks.networkparser.list.SimpleKeyValueList;
import de.uniks.networkparser.xml.XMLEntity;
import de.uniks.networkparser.xml.XMLIdMap;
import de.uniks.networkparser.xml.XMLTokener;

public class EmfIdMap extends XMLIdMap
{
   private static final String XSI_TYPE = "xsi:type";
   private static final String XMI_ID = "xmi:id";

   public EmfIdMap() 
   {
   }
   
   @Override
   public XMLEntity encode(Object entity)
   {
      XMLEntity result = new XMLEntity();
      
      
      String typetag = entity.getClass().getName().replaceAll("\\.", ":");
      result.withTag(typetag);
      
      encodeChildren(entity, result);
      
      return result;
   }
   
   private void encodeChildren(Object entity, XMLEntity parent)
   {
      SendableEntityCreator creatorClass = this.getCreatorClass(entity);
      
      for (String propertyName : creatorClass.getProperties())
      {
         Object propertyValue = creatorClass.getValue(entity, propertyName);
         
         if (" String long Long int Integer char Char boolean Boolean byte Byte float Float double Double java.util.Date ".indexOf(CGUtil.shortClassName(propertyValue.getClass().getName())) >= 0)
         {
            parent.put(propertyName, propertyValue);
         }
         else if (propertyValue instanceof Collection)
         {
            for (Object childValue : (Collection) propertyValue)
            {
               XMLEntity child = new XMLEntity();
               
               parent.withChild(child);
               
               child.withTag(propertyName);
               
               String typetag = childValue.getClass().getName().replaceAll("\\.", ":");
               
               child.put(XSI_TYPE, typetag);
               
               encodeChildren(childValue, child);
            }
         }
         else
         {
            XMLEntity child = new XMLEntity();

            parent.withChild(child);

            child.withTag(propertyName);
            
            String typetag = propertyValue.getClass().getName().replaceAll("\\.", ":");
            
            child.put(XSI_TYPE, typetag);
            
            encodeChildren(propertyValue, child);
         }
      }
   }

   public Object decode(String fileText)
   {
      return decode(new StringBuilder(fileText));
   }
   
   public Object decode(StringBuilder fileText)
   {
      int pos = fileText.indexOf(">") + 1;

      StringBuffer buffer = new StringBuffer().withValue(fileText.toString());

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
         // just use an ArrayList
         rootObject = new ArrayList();
      }

      runningNumbers = new SimpleKeyValueList<String, Integer>();

      addXMIIds(xmlEntity, "$root");

      addChildren(xmlEntity, rootFactory, rootObject);

      addValues(rootFactory, xmlEntity, rootObject);

      return rootObject;
   }

   SimpleKeyValueList<String, Integer> runningNumbers = null;
   
   private void addXMIIds(XMLEntity xmlEntity, String rootId)
   {
      if (xmlEntity.contains(XMI_ID))
      {
         return;
      }

      if (rootId != null)
      { 
         xmlEntity.put(XMI_ID, rootId);
      }
      int i = 0;

      for (XMLEntity kid : xmlEntity.getChildren())
      {
         if (kid.contains(XMI_ID))
         {
            continue;
         }

         String tag = kid.getTag();
         
         Integer num = runningNumbers.get(tag);
         
         if (num == null)
         {
            num = 0;
            runningNumbers.put(tag, 0);
         }
         else
         {
            num++;
            runningNumbers.put(tag, num);
         }
         
         // kid.put(XMI_ID, "$" + tag + num);

         addXMIIds(kid, "$" + tag + num);
      
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

      // set plain attributes
      for (Iterator<String> iter = xmlEntity.keyIterator(); iter.hasNext();)
      {
         String key = iter.next();
         String value = ((String) xmlEntity.get(key)).trim();

         if (value == null || "".equals(value) || XMI_ID.equals(key))
         {
            continue;
         }

         if (value.startsWith("//@"))
         {
            for (String ref : value.split(" "))
            {
               String myRef = ref.substring(3);
               int dotPos = myRef.indexOf('.');
               if (dotPos >= 0)
               {
                  String[] split = myRef.split("\\.");
                  myRef = "_" + split[0] + split[1];
               }
               else
               {
                  myRef = "_" + myRef.subSequence(0, 1) + "0";
               }

               if (getObject(myRef) != null)
               {
                  rootFactory.setValue(rootObject, key, getObject(myRef), "");
               }
            }
         }
         else if (value.startsWith("/"))
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
         else
         {
            if (rootFactory != null)
            {
               rootFactory.setValue(rootObject, key, value, "");
            }
         }
      }
      
      // recursive on kids
      Iterator<XMLEntity> iterator = xmlEntity.getChildren().iterator();
      while (iterator.hasNext())
      {
         XMLEntity kidEntity = iterator.next();
         String kidId = (String) kidEntity.get(XMI_ID);

         if (kidId.startsWith("$"))
         {
            kidId = "_" + kidId.substring(1);
         }

         Object kidObject = this.getObject(kidId);
         
         EntityFactory kidFactory = (EntityFactory) this.getCreatorClass(kidObject);
         
         addValues(kidFactory, kidEntity, kidObject );
      }
   }

   private void addChildren(XMLEntity xmlEntity, EntityFactory rootFactory, Object rootObject)
   {
      String id = (String) xmlEntity.get(XMI_ID);

      if (id.startsWith("$"))
      {
         id = "_" + id.substring(1);
      }
      
      this.put(id, rootObject);


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

               // addValues(kidFactory, kidEntity, kidObject);

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

      if (kidFactory != null)
      {
         return kidFactory;
      }

      for (String creatorName : getCreatorsKeySet())
      {
         if (creatorName.endsWith(typeName))
         {
            return (EntityFactory) getCreator(creatorName, true);
         }
      }

      return null;
   }

   private Set<String> getCreatorsKeySet()
   {
      return this.creators.keySet();
   }

   public EmfIdMap withCreators(Collection<SendableEntityCreator> creatorSet)
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
