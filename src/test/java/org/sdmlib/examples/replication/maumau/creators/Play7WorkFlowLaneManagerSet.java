/*
   Copyright (c) 2013 zuendorf 
   
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
   
package org.sdmlib.examples.replication.maumau.creators;

import java.util.LinkedHashSet;
import org.sdmlib.examples.replication.maumau.Play7WorkFlowLaneManager;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.examples.replication.maumau.creators.ObjectSet;
import java.lang.Object;

public class Play7WorkFlowLaneManagerSet extends LinkedHashSet<Play7WorkFlowLaneManager> implements org.sdmlib.models.modelsets.ModelSet
{


   public String toString()
   {
      StringList stringList = new StringList();
      
      for (Play7WorkFlowLaneManager elem : this)
      {
         stringList.add(elem.toString());
      }
      
      return "(" + stringList.concat(", ") + ")";
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.replication.maumau.Play7WorkFlowLaneManager";
   }


   public Play7WorkFlowLaneManagerSet with(Play7WorkFlowLaneManager value)
   {
      this.add(value);
      return this;
   }
   
   public Play7WorkFlowLaneManagerSet without(Play7WorkFlowLaneManager value)
   {
      this.remove(value);
      return this;
   }
   public ObjectSet getSource()
   {
      ObjectSet result = new ObjectSet();
      
      for (Play7WorkFlowLaneManager obj : this)
      {
         result.add(obj.getSource());
      }
      
      return result;
   }

   public Play7WorkFlowLaneManagerSet withSource(Object value)
   {
      for (Play7WorkFlowLaneManager obj : this)
      {
         obj.setSource(value);
      }
      
      return this;
   }

}

