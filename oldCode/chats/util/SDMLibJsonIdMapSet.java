/*
   Copyright (c) 2014 zuendorf 
   
   Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
   and associated documentation files (the "Software"), to deal in the Software without restriction, 
   including without limitation the rights to use, copy, modify, merge, publish, distribute, 
   sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is 
   furnished to do so, subject to the following conditions: 
   
   The above copyright notice and this permission notice shall be included in all copies or 
   substantial portions of the Software. 
   
   The Software shall be used for Good, not Evil. 
   
   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
   BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
   DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */
   
package org.sdmlib.examples.chats.util;

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import java.util.Collection;

public class SDMLibJsonIdMapSet extends SDMSet<SDMLibJsonIdMap>
{


   public SDMLibJsonIdMapPO hasSDMLibJsonIdMapPO()
   {
      return new SDMLibJsonIdMapPO(this.toArray(new SDMLibJsonIdMap[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.serialization.SDMLibJsonIdMap";
   }


   @SuppressWarnings("unchecked")
   public SDMLibJsonIdMapSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<SDMLibJsonIdMap>)value);
      }
      else if (value != null)
      {
         this.add((SDMLibJsonIdMap) value);
      }
      
      return this;
   }
   
   public SDMLibJsonIdMapSet without(SDMLibJsonIdMap value)
   {
      this.remove(value);
      return this;
   }

}
