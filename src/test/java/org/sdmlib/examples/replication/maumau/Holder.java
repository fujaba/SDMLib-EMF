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
   
package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeSupport;
import java.util.LinkedHashSet;

import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.examples.replication.maumau.creators.HolderSet;
import org.sdmlib.serialization.PropertyChangeInterface;

import de.uniks.networkparser.json.JsonIdMap;

public class Holder implements PropertyChangeInterface
{

   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_DECKOWNER.equalsIgnoreCase(attrName))
      {
         return getDeckOwner();
      }

      if (PROPERTY_CARDS.equalsIgnoreCase(attrName))
      {
         return getCards();
      }

      if (PROPERTY_STACKOWNER.equalsIgnoreCase(attrName))
      {
         return getStackOwner();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_DECKOWNER.equalsIgnoreCase(attrName))
      {
         setDeckOwner((MauMau) value);
         return true;
      }

      if (PROPERTY_CARDS.equalsIgnoreCase(attrName))
      {
         addToCards((Card) value);
         return true;
      }
      
      if ((PROPERTY_CARDS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         removeFromCards((Card) value);
         return true;
      }

      if (PROPERTY_STACKOWNER.equalsIgnoreCase(attrName))
      {
         setStackOwner((MauMau) value);
         return true;
      }
      
      return false;
   }

   
   //==========================================================================
   
   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   
   public PropertyChangeSupport getPropertyChangeSupport()
   {
      return listeners;
   }

   
   //==========================================================================
   
   public void removeYou()
   {
      setDeckOwner(null);
      removeAllFromCards();
      setStackOwner(null);
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   public static final HolderSet EMPTY_SET = new HolderSet();

   
   /********************************************************************
    * <pre>
    *              one                       one
    * Holder ----------------------------------- MauMau
    *              deck                   deckOwner
    * </pre>
    */
   
   public static final String PROPERTY_DECKOWNER = "deckOwner";
   
   private MauMau deckOwner = null;
   
   public MauMau getDeckOwner()
   {
      return this.deckOwner;
   }
   
   public boolean setDeckOwner(MauMau value)
   {
      boolean changed = false;
      
      if (this.deckOwner != value)
      {
         MauMau oldValue = this.deckOwner;
         
         if (this.deckOwner != null)
         {
            this.deckOwner = null;
            oldValue.setDeck(null);
         }
         
         this.deckOwner = value;
         
         if (value != null)
         {
            value.withDeck(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_DECKOWNER, oldValue, value);
         changed = true;
      }
      
      return changed;
   }
   
   public Holder withDeckOwner(MauMau value)
   {
      setDeckOwner(value);
      return this;
   } 
   
   public MauMau createDeckOwner()
   {
      MauMau value = new MauMau();
      withDeckOwner(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       many
    * Holder ----------------------------------- Card
    *              holder                   cards
    * </pre>
    */
   
   public static final String PROPERTY_CARDS = "cards";
   
   private CardSet cards = null;
   
   public CardSet getCards()
   {
      if (this.cards == null)
      {
         return Card.EMPTY_SET;
      }
   
      return this.cards;
   }
   
   public boolean addToCards(Card value)
   {
      boolean changed = false;
      
      if (value != null)
      {
         if (this.cards == null)
         {
            this.cards = new CardSet();
         }
         
         changed = this.cards.add (value);
         
         if (changed)
         {
            value.withHolder(this);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_CARDS, null, value);
         }
      }
         
      return changed;   
   }
   
   public boolean removeFromCards(Card value)
   {
      boolean changed = false;
      
      if ((this.cards != null) && (value != null))
      {
         changed = this.cards.remove (value);
         
         if (changed)
         {
            value.setHolder(null);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_CARDS, value, null);
         }
      }
         
      return changed;   
   }
   
   public Holder withCards(Card value)
   {
      addToCards(value);
      return this;
   } 
   
   public Holder withoutCards(Card value)
   {
      removeFromCards(value);
      return this;
   } 
   
   public void removeAllFromCards()
   {
      LinkedHashSet<Card> tmpSet = new LinkedHashSet<Card>(this.getCards());
   
      for (Card value : tmpSet)
      {
         this.removeFromCards(value);
      }
   }
   
   public Card createCards()
   {
      Card value = new Card();
      withCards(value);
      return value;
   } 

   

   
   /********************************************************************
    * <pre>
    *              one                       one
    * Holder ----------------------------------- MauMau
    *              stack                   stackOwner
    * </pre>
    */
   
   public static final String PROPERTY_STACKOWNER = "stackOwner";
   
   private MauMau stackOwner = null;
   
   public MauMau getStackOwner()
   {
      return this.stackOwner;
   }
   
   public boolean setStackOwner(MauMau value)
   {
      boolean changed = false;
      
      if (this.stackOwner != value)
      {
         MauMau oldValue = this.stackOwner;
         
         if (this.stackOwner != null)
         {
            this.stackOwner = null;
            oldValue.setStack(null);
         }
         
         this.stackOwner = value;
         
         if (value != null)
         {
            value.withStack(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_STACKOWNER, oldValue, value);
         changed = true;
      }
      
      return changed;
   }
   
   public Holder withStackOwner(MauMau value)
   {
      setStackOwner(value);
      return this;
   } 
   
   public MauMau createStackOwner()
   {
      MauMau value = new MauMau();
      withStackOwner(value);
      return value;
   } 
}

