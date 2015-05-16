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

import org.sdmlib.examples.replication.maumau.ServerLaneManager;
import org.sdmlib.models.modelsets.StringList;

public class ServerLaneListenerSet extends LinkedHashSet<ServerLaneManager> implements org.sdmlib.models.modelsets.ModelSet
{


   public String toString()
   {
      StringList stringList = new StringList();
      
      for (ServerLaneManager elem : this)
      {
         stringList.add(elem.toString());
      }
      
      return "(" + stringList.concat(", ") + ")";
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.replication.maumau.ServerLaneListener";
   }


   public ServerLaneListenerSet with(ServerLaneManager value)
   {
      this.add(value);
      return this;
   }
   
   public ServerLaneListenerSet without(ServerLaneManager value)
   {
      this.remove(value);
      return this;
   }
   public ObjectSet getSource()
   {
      ObjectSet result = new ObjectSet();
      
      for (ServerLaneManager obj : this)
      {
         result.add(obj.getSource());
      }
      
      return result;
   }

   public ServerLaneListenerSet withSource(Object value)
   {
      for (ServerLaneManager obj : this)
      {
         obj.setSource(value);
      }
      
      return this;
   }

}

