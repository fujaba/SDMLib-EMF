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
import org.sdmlib.examples.replication.maumau.PlayerLaneListener;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.replication.creators.TaskHandlerSet;
import org.sdmlib.replication.creators.LaneSet;

public class PlayerLaneListenerSet extends LinkedHashSet<PlayerLaneListener> implements org.sdmlib.models.modelsets.ModelSet
{


   public String toString()
   {
      StringList stringList = new StringList();
      
      for (PlayerLaneListener elem : this)
      {
         stringList.add(elem.toString());
      }
      
      return "(" + stringList.concat(", ") + ")";
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.replication.maumau.PlayerLaneListener";
   }


   public PlayerLaneListenerSet with(PlayerLaneListener value)
   {
      this.add(value);
      return this;
   }
   
   public PlayerLaneListenerSet without(PlayerLaneListener value)
   {
      this.remove(value);
      return this;
   }
   public TaskHandlerSet getHandlerList()
   {
      TaskHandlerSet result = new TaskHandlerSet();
      
      for (PlayerLaneListener obj : this)
      {
         result.addAll(obj.getHandlerList());
      }
      
      return result;
   }

   public PlayerLaneListenerSet withHandlerList(TaskHandlerSet value)
   {
      for (PlayerLaneListener obj : this)
      {
         obj.setHandlerList(value);
      }
      
      return this;
   }

   public LaneSet getSources()
   {
      LaneSet result = new LaneSet();
      
      for (PlayerLaneListener obj : this)
      {
         result.addAll(obj.getSources());
      }
      
      return result;
   }

   public PlayerLaneListenerSet withSources(LaneSet value)
   {
      for (PlayerLaneListener obj : this)
      {
         obj.setSources(value);
      }
      
      return this;
   }

}

