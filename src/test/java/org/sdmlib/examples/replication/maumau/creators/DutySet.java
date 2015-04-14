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
import org.sdmlib.examples.replication.maumau.Duty;
import org.sdmlib.models.modelsets.StringList;
import java.util.List;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.examples.replication.maumau.creators.PlayerSet;
import org.sdmlib.examples.replication.maumau.Player;
import org.sdmlib.examples.replication.maumau.creators.MauMauSet;
import org.sdmlib.examples.replication.maumau.MauMau;

public class DutySet extends LinkedHashSet<Duty> implements org.sdmlib.models.modelsets.ModelSet
{


   public String toString()
   {
      StringList stringList = new StringList();
      
      for (Duty elem : this)
      {
         stringList.add(elem.toString());
      }
      
      return "(" + stringList.concat(", ") + ")";
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.replication.maumau.Duty";
   }


   public DutySet with(Duty value)
   {
      this.add(value);
      return this;
   }
   
   public DutySet without(Duty value)
   {
      this.remove(value);
      return this;
   }
   public StringList getKind()
   {
      StringList result = new StringList();
      
      for (Duty obj : this)
      {
         result.add(obj.getKind());
      }
      
      return result;
   }

   public DutySet withKind(String value)
   {
      for (Duty obj : this)
      {
         obj.setKind(value);
      }
      
      return this;
   }

   public intList getNumber()
   {
      intList result = new intList();
      
      for (Duty obj : this)
      {
         result.add(obj.getNumber());
      }
      
      return result;
   }

   public DutySet withNumber(int value)
   {
      for (Duty obj : this)
      {
         obj.setNumber(value);
      }
      
      return this;
   }

   public PlayerSet getPlayer()
   {
      PlayerSet result = new PlayerSet();
      
      for (Duty obj : this)
      {
         result.add(obj.getPlayer());
      }
      
      return result;
   }

   public DutySet withPlayer(Player value)
   {
      for (Duty obj : this)
      {
         obj.withPlayer(value);
      }
      
      return this;
   }

   public MauMauSet getGame()
   {
      MauMauSet result = new MauMauSet();
      
      for (Duty obj : this)
      {
         result.add(obj.getGame());
      }
      
      return result;
   }

   public DutySet withGame(MauMau value)
   {
      for (Duty obj : this)
      {
         obj.withGame(value);
      }
      
      return this;
   }

}

