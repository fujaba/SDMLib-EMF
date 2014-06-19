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
   
package org.sdmlib.examples.groupAccount.model.util;

import java.util.Collection;
import java.util.Collections;

import org.sdmlib.examples.groupAccount.model.GroupAccount;
import org.sdmlib.examples.groupAccount.model.Item;
import org.sdmlib.examples.groupAccount.model.Person;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.models.modelsets.doubleList;

public class GroupAccountSet extends SDMSet<GroupAccount>
{


   public GroupAccountPO hasGroupAccountPO()
   {
      return new GroupAccountPO(this.toArray(new GroupAccount[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.groupAccount.model.GroupAccount";
   }


   @SuppressWarnings("unchecked")
   public GroupAccountSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<GroupAccount>)value);
      }
      else if (value != null)
      {
         this.add((GroupAccount) value);
      }
      
      return this;
   }
   
   public GroupAccountSet without(GroupAccount value)
   {
      this.remove(value);
      return this;
   }

   
   //==========================================================================
   
   public doubleList initAccounts(double num, String str)
   {
      doubleList result = new doubleList();
      for (GroupAccount obj : this)
      {
         result.add(obj.initAccounts(num, str));
      }
      return result;
   }

   
   //==========================================================================
   
   public GroupAccountSet updateBalances()
   {
      for (GroupAccount obj : this)
      {
         obj.updateBalances();
      }
      return this;
   }

   public PersonSet getPersons()
   {
      PersonSet result = new PersonSet();
      
      for (GroupAccount obj : this)
      {
         result.addAll(obj.getPersons());
      }
      
      return result;
   }

   public GroupAccountSet hasPersons(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection<?>) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      GroupAccountSet answer = new GroupAccountSet();
      
      for (GroupAccount obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getPersons()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public GroupAccountSet withPersons(Person value)
   {
      for (GroupAccount obj : this)
      {
         obj.withPersons(value);
      }
      
      return this;
   }

   public GroupAccountSet withoutPersons(Person value)
   {
      for (GroupAccount obj : this)
      {
         obj.withoutPersons(value);
      }
      
      return this;
   }

   public ItemSet getItems()
   {
      ItemSet result = new ItemSet();
      
      for (GroupAccount obj : this)
      {
         result.addAll(obj.getItems());
      }
      
      return result;
   }

   public GroupAccountSet hasItems(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection<?>) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      GroupAccountSet answer = new GroupAccountSet();
      
      for (GroupAccount obj : this)
      {
         if ( ! Collections.disjoint(neighbors, obj.getItems()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public GroupAccountSet withItems(Item value)
   {
      for (GroupAccount obj : this)
      {
         obj.withItems(value);
      }
      
      return this;
   }

   public GroupAccountSet withoutItems(Item value)
   {
      for (GroupAccount obj : this)
      {
         obj.withoutItems(value);
      }
      
      return this;
   }

}
