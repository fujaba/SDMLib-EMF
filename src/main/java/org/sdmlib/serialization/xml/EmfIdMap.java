package org.sdmlib.serialization.xml;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.sdmlib.CGUtil;
import org.sdmlib.StrUtil;
import org.sdmlib.models.SDMLibIdMap;

import de.uniks.networkparser.interfaces.EntityList;
import de.uniks.networkparser.interfaces.SendableEntityCreator;
import de.uniks.networkparser.xml.XMLEntity;
import de.uniks.networkparser.xml.XMLTokener;

@SuppressWarnings("restriction")
public class EmfIdMap extends SDMLibIdMap
{
   public EmfIdMap(String sessionId)
   {
      super(sessionId);
      // TODO Auto-generated constructor stub
   }

   private static final String XSI_TYPE = "xsi:type";
   private static final String XMI_ID = "xmi:id";

   // @Override
   public XMLEntity encode(Object entity)
   {
      XMLEntity result = new XMLEntity();


      String typetag = entity.getClass().getName().replaceAll("\\.", ":");
      result.with(typetag);

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

               child.with(propertyName);

               String typetag = childValue.getClass().getName().replaceAll("\\.", ":");

               child.put(XSI_TYPE, typetag);

               encodeChildren(childValue, child);
            }
         }
         else
         {
            XMLEntity child = new XMLEntity();

            parent.withChild(child);

            child.with(propertyName);

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

      XMLEntity xmlEntity = new XMLEntity().withValue(new XMLTokener().withBuffer(fileText.toString()));

      SendableEntityCreator rootFactory = null;

      // build root entity
      String tag = xmlEntity.getTag();

      String className = tag.split("\\:")[1];

      for (String fullName : creators.keySet())
      {
         if (CGUtil.shortClassName(fullName).equals(className))
         {
            rootFactory = getCreator(fullName, true);
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
         rootObject = new ArrayList<Object>();
      }

      runningNumbers = new LinkedHashMap<String, Integer>();

      addXMIIds(xmlEntity, null);

      addChildren(xmlEntity, rootFactory, rootObject);

      addValues(rootFactory, xmlEntity, rootObject);

      return rootObject;
   }

   LinkedHashMap<String, Integer> runningNumbers = null;

   private void addXMIIds(XMLEntity xmlEntity, String rootId)
   {
      if (xmlEntity.contains(XMI_ID)) {
         return;
      }
      String tag = xmlEntity.getTag();
      if(rootId != null) {
         rootId += tag;
         Integer num = runningNumbers.get(rootId);
         if (num == null) {
            num = 0;
         } else {
            num++;
         }
         runningNumbers.put(rootId, num);
         rootId += num;
      } else {
         rootId = "$";
      }
      // kid.put(XMI_ID, "$" + tag + num);

      if (xmlEntity.contains("href"))
      {
         // might point to another xml file already loaded
         String refString = xmlEntity.getString("href");
         String[] split = refString.split("#//");

         if (split.length == 2)
         {
            String objectId = split[1];
            objectId = objectId.replace('@', '$');
            objectId = objectId.replace(".", "");
            // Object object = this.getObject(objectId);
            xmlEntity.put(XMI_ID, objectId);

            return;
         }

      }
      xmlEntity.put(XMI_ID, rootId);

      for (EntityList kid : xmlEntity.getChildren())
      {
         addXMIIds((XMLEntity) kid, rootId);
      }
   }

   private void addValues(SendableEntityCreator rootFactory, XMLEntity xmlEntity, Object rootObject)
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
               String myRef = "_"+ref.substring(3);
               if(myRef.indexOf('.')>0){
                  myRef = myRef.replaceAll("\\.|/@", "");
               } else {
                  myRef = "_" + myRef.subSequence(0, 1) + "0";
               }

               Object object = getObject(myRef);
               if (object != null) {
                  rootFactory.setValue(rootObject, key, object, "");
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
      Iterator<EntityList> iterator = xmlEntity.getChildren().iterator();
      while (iterator.hasNext())
      {
         XMLEntity kidEntity = (XMLEntity) iterator.next();
         String kidId = (String) kidEntity.get(XMI_ID);

         if (kidId.startsWith("$"))
         {
            kidId = "_" + kidId.substring(1);
         }

         Object kidObject = this.getObject(kidId);

         SendableEntityCreator kidFactory = (SendableEntityCreator) this.getCreatorClass(kidObject);

         addValues(kidFactory, kidEntity, kidObject );
      }
   }

   private void addChildren(XMLEntity xmlEntity, SendableEntityCreator rootFactory, Object rootObject)
   {
      String id = (String) xmlEntity.get(XMI_ID);

      if (id.startsWith("$"))
      {
         id = "_" + id.substring(1);
      }

      this.put(id, rootObject);


      Iterator<EntityList> iterator = xmlEntity.getChildren().iterator();
      while (iterator.hasNext())
      {
         XMLEntity kidEntity = (XMLEntity) iterator.next();
         String tag = kidEntity.getTag();
         Method getMethod = null;
         String typeName = null;

         Collection rootCollection = null;

         // it might be a cross reference to an already loaded object
         if (kidEntity.contains("href"))
         {
            // might point to another xml file already loaded
            String refString = kidEntity.getString("href");
            String[] split = refString.split("#//");

            if (split.length == 2)
            {
               String objectId = split[1];
               objectId = objectId.replace('@', '_');
               objectId = objectId.replace(".", "");
               Object object = this.getObject(objectId);

               if (object != null)
               {
                  // yes we know it
                  if (rootObject instanceof Collection)
                  {
                     rootCollection = (Collection) rootObject;
                  }

                  if (rootCollection != null)
                  {
                     rootCollection.add(object);
                  }
                  else
                  {
                     rootFactory.setValue(rootObject, tag, object, "");
                  }

                  // addChildren(kidEntity, kidFactory, object);
                  return;
               }


            }

         }

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
               int pos = typeName.lastIndexOf(':');
               if (pos >= 0)
               {
                  typeName = typeName.substring(pos+1);
               }
               typeName = typeName.replaceAll(":", ".");
            }

            if (typeName != null)
            {
               SendableEntityCreator kidFactory = (SendableEntityCreator) getCreatorClassesByShortName(typeName);

               Object kidObject = kidFactory.getSendableInstance(false);

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

   private SendableEntityCreator getCreatorClassesByShortName(String typeName)
   {
      SendableEntityCreator kidFactory = (SendableEntityCreator) getCreator(typeName, false);
      if (kidFactory != null)
      {
         return kidFactory;
      }

      for (String creatorName : getCreatorsKeySet())
      {
         if (creatorName.endsWith(typeName))
         {
            return (SendableEntityCreator) getCreator(creatorName, true);
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
      with(creatorSet);
      return this;
   }

   public Object decodeFile(String fileName)
   {
      StringBuilder fileText = CGUtil.readFile(fileName);

      return decode(fileText);
   }
}
