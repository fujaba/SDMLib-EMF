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

import org.sdmlib.examples.replication.maumau.CardControler;
import org.sdmlib.examples.replication.maumau.MauMau;
import org.sdmlib.examples.replication.maumau.MultiMauMauControler;
import org.sdmlib.examples.replication.maumau.Player;
import org.sdmlib.models.modelsets.StringList;

public class MultiMauMauControlerSet extends LinkedHashSet<MultiMauMauControler> implements org.sdmlib.models.modelsets.ModelSet
{


   public String toString()
   {
      StringList stringList = new StringList();
      
      for (MultiMauMauControler elem : this)
      {
         stringList.add(elem.toString());
      }
      
      return "(" + stringList.concat(", ") + ")";
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.replication.maumau.MultiMauMauControler";
   }


   public MultiMauMauControlerSet with(MultiMauMauControler value)
   {
      this.add(value);
      return this;
   }
   
   public MultiMauMauControlerSet without(MultiMauMauControler value)
   {
      this.remove(value);
      return this;
   }
   public MauMauSet getMauMau()
   {
      MauMauSet result = new MauMauSet();
      
      for (MultiMauMauControler obj : this)
      {
         result.add(obj.getMauMau());
      }
      
      return result;
   }

   public MultiMauMauControlerSet withMauMau(MauMau value)
   {
      for (MultiMauMauControler obj : this)
      {
         obj.setMauMau(value);
      }
      
      return this;
   }

   public PlayerSet getActivePlayer()
   {
      PlayerSet result = new PlayerSet();
      
      for (MultiMauMauControler obj : this)
      {
         result.add(obj.getActivePlayer());
      }
      
      return result;
   }

   public MultiMauMauControlerSet withActivePlayer(Player value)
   {
      for (MultiMauMauControler obj : this)
      {
         obj.setActivePlayer(value);
      }
      
      return this;
   }

   public CardControlerSet getCardControlers()
   {
      CardControlerSet result = new CardControlerSet();
      
      for (MultiMauMauControler obj : this)
      {
         result.addAll(obj.getCardControlers());
      }
      
      return result;
   }

   public MultiMauMauControlerSet withCardControlers(CardControler value)
   {
      for (MultiMauMauControler obj : this)
      {
         obj.withCardControlers(value);
      }
      
      return this;
   }

   public MultiMauMauControlerSet withoutCardControlers(CardControler value)
   {
      for (MultiMauMauControler obj : this)
      {
         obj.withoutCardControlers(value);
      }
      
      return this;
   }

}

