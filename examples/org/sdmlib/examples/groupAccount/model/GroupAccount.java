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
   
package org.sdmlib.examples.groupAccount.model;

import org.sdmlib.serialization.PropertyChangeInterface;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import org.sdmlib.examples.groupAccount.model.util.PersonSet;
import org.sdmlib.examples.groupAccount.model.util.ItemSet;

public class GroupAccount implements PropertyChangeInterface
{

   
   //==========================================================================
   
   public double initAccounts( double num, String str )
   {
      return 0;
   }

   
   //==========================================================================
   
   public void updateBalances(  )
   {
      
   }

   
   //==========================================================================
   
   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   
   @Override
   public PropertyChangeSupport getPropertyChangeSupport()
   {
      return listeners;
   }
   
   public void addPropertyChangeListener(PropertyChangeListener listener) 
   {
      getPropertyChangeSupport().addPropertyChangeListener(listener);
   }

   
   //==========================================================================
   
   
   public void removeYou()
   {
      withoutPersons(this.getPersons().toArray(new Person[this.getPersons().size()]));
      withoutItems(this.getItems().toArray(new Item[this.getItems().size()]));
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   /********************************************************************
    * <pre>
    *              one                       many
    * GroupAccount ----------------------------------- Person
    *              parent                   persons
    * </pre>
    */
   
   public static final String PROPERTY_PERSONS = "persons";

   private PersonSet persons = null;
   
   public PersonSet getPersons()
   {
      if (this.persons == null)
      {
         return Person.EMPTY_SET;
      }
   
      return this.persons;
   }

   public GroupAccount withPersons(Person... value)
   {
      if(value==null){
         return this;
      }
      for (Person item : value)
      {
         if (item != null)
         {
            if (this.persons == null)
            {
               this.persons = new PersonSet();
            }
            
            boolean changed = this.persons.add (item);

            if (changed)
            {
               item.withParent(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_PERSONS, null, item);
            }
         }
      }
      return this;
   } 

   public GroupAccount withoutPersons(Person... value)
   {
      for (Person item : value)
      {
         if ((this.persons != null) && (item != null))
         {
            if (this.persons.remove(item))
            {
               item.setParent(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_PERSONS, item, null);
            }
         }
         
      }
      return this;
   }

   public Person createPersons()
   {
      Person value = new Person();
      withPersons(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       many
    * GroupAccount ----------------------------------- Item
    *              parent                   items
    * </pre>
    */
   
   public static final String PROPERTY_ITEMS = "items";

   private ItemSet items = null;
   
   public ItemSet getItems()
   {
      if (this.items == null)
      {
         return Item.EMPTY_SET;
      }
   
      return this.items;
   }

   public GroupAccount withItems(Item... value)
   {
      if(value==null){
         return this;
      }
      for (Item item : value)
      {
         if (item != null)
         {
            if (this.items == null)
            {
               this.items = new ItemSet();
            }
            
            boolean changed = this.items.add (item);

            if (changed)
            {
               item.withParent(this);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_ITEMS, null, item);
            }
         }
      }
      return this;
   } 

   public GroupAccount withoutItems(Item... value)
   {
      for (Item item : value)
      {
         if ((this.items != null) && (item != null))
         {
            if (this.items.remove(item))
            {
               item.setParent(null);
               getPropertyChangeSupport().firePropertyChange(PROPERTY_ITEMS, item, null);
            }
         }
         
      }
      return this;
   }

   public Item createItems()
   {
      Item value = new Item();
      withItems(value);
      return value;
   } 
}
