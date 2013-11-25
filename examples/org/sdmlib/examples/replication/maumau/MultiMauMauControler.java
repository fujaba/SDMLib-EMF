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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.eclipse.swt.widgets.Label;
import org.sdmlib.examples.replication.maumau.creators.CardControlerSet;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.utils.PropertyChangeInterface;

public class MultiMauMauControler implements PropertyChangeListener, PropertyChangeInterface
{

   private Player activePlayer;
   private MauMau mauMau;
   private MauMauClientGui gui;

   public Player getActivePlayer()
   {
      return activePlayer;
   }

   private LinkedHashMap<Player, Label> playerLabels = new LinkedHashMap<Player, Label>();

   public LinkedHashMap<Player, Label> getPlayerLabels()
   {
      return playerLabels;
   }

   private SharedSpace sharedSpace;
   
   public MauMauClientGui getGui()
   {
      return gui;
   }

   public MultiMauMauControler(MauMau mauMau, MauMauClientGui gui, SharedSpace sharedSpace)
   {
      this.mauMau = mauMau;
      this.gui = gui;
      this.sharedSpace = sharedSpace;
   }

   public MultiMauMauControler()
   {
      // TODO Auto-generated constructor stub
   }

   private LinkedHashSet<ChangeHandler> handlerlist = new LinkedHashSet<ChangeHandler>();
   
   public MultiMauMauControler init()
   {
      handlerlist.add(new NewPlayerHandler(this));
      handlerlist.add(new NewCardHandler(this));
      handlerlist.add(new NewDutyHandler(this));
      
      return this;
   }
   
   public LinkedHashSet<ChangeHandler> getHandlerlist()
   {
      return handlerlist;
   }
   
   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      boolean oldState = sharedSpace.isApplyingChangeMsg();
    
      try
      {
         sharedSpace.setApplyingChangeMsg(false);
         
         for (ChangeHandler handler : handlerlist)
         {
            boolean done = handler.propertyChange(evt);
            
            if (done)
            {
               break;
            }
         }
         
      }
      finally
      {
         sharedSpace.setApplyingChangeMsg(oldState);
      }
   }

   public MauMau getMauMau()
   {
      return mauMau;
   }


   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_MAUMAU.equalsIgnoreCase(attrName))
      {
         return getMauMau();
      }

      if (PROPERTY_ACTIVEPLAYER.equalsIgnoreCase(attrName))
      {
         return getActivePlayer();
      }

      if (PROPERTY_CARDCONTROLERS.equalsIgnoreCase(attrName))
      {
         return getCardControlers();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_MAUMAU.equalsIgnoreCase(attrName))
      {
         setMauMau((org.sdmlib.examples.replication.maumau.MauMau) value);
         return true;
      }

      if (PROPERTY_ACTIVEPLAYER.equalsIgnoreCase(attrName))
      {
         setActivePlayer((org.sdmlib.examples.replication.maumau.Player) value);
         return true;
      }

      if (PROPERTY_CARDCONTROLERS.equalsIgnoreCase(attrName))
      {
         addToCardControlers((CardControler) value);
         return true;
      }
      
      if ((PROPERTY_CARDCONTROLERS + JsonIdMap.REMOVE).equalsIgnoreCase(attrName))
      {
         removeFromCardControlers((CardControler) value);
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
   
   public void addPropertyChangeListener(PropertyChangeListener listener) 
   {
      getPropertyChangeSupport().addPropertyChangeListener(listener);
   }

   
   //==========================================================================
   
   public void removeYou()
   {
      removeAllFromCardControlers();
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_MAUMAU = "mauMau";
   
   public void setMauMau(org.sdmlib.examples.replication.maumau.MauMau value)
   {
      if (this.mauMau != value)
      {
         org.sdmlib.examples.replication.maumau.MauMau oldValue = this.mauMau;
         this.mauMau = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_MAUMAU, oldValue, value);
      }
   }
   
   public MultiMauMauControler withMauMau(org.sdmlib.examples.replication.maumau.MauMau value)
   {
      setMauMau(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_ACTIVEPLAYER = "activePlayer";
   
   public void setActivePlayer(org.sdmlib.examples.replication.maumau.Player value)
   {
      if (this.activePlayer != value)
      {
         org.sdmlib.examples.replication.maumau.Player oldValue = this.activePlayer;
         this.activePlayer = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_ACTIVEPLAYER, oldValue, value);
      }
   }
   
   public MultiMauMauControler withActivePlayer(org.sdmlib.examples.replication.maumau.Player value)
   {
      setActivePlayer(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       many
    * MultiMauMauControler ----------------------------------- CardControler
    *              mauMauControler                   cardControlers
    * </pre>
    */
   
   public static final String PROPERTY_CARDCONTROLERS = "cardControlers";
   
   private CardControlerSet cardControlers = null;
   
   public CardControlerSet getCardControlers()
   {
      if (this.cardControlers == null)
      {
         return CardControler.EMPTY_SET;
      }
   
      return this.cardControlers;
   }
   
   public boolean addToCardControlers(CardControler value)
   {
      boolean changed = false;
      
      if (value != null)
      {
         if (this.cardControlers == null)
         {
            this.cardControlers = new CardControlerSet();
         }
         
         changed = this.cardControlers.add (value);
         
         if (changed)
         {
            value.withMauMauControler(this);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_CARDCONTROLERS, null, value);
         }
      }
         
      return changed;   
   }
   
   public boolean removeFromCardControlers(CardControler value)
   {
      boolean changed = false;
      
      if ((this.cardControlers != null) && (value != null))
      {
         changed = this.cardControlers.remove (value);
         
         if (changed)
         {
            value.setMauMauControler(null);
            getPropertyChangeSupport().firePropertyChange(PROPERTY_CARDCONTROLERS, value, null);
         }
      }
         
      return changed;   
   }
   
   public MultiMauMauControler withCardControlers(CardControler... value)
   {
      for (CardControler item : value)
      {
         addToCardControlers(item);
      }
      return this;
   } 
   
   public MultiMauMauControler withoutCardControlers(CardControler... value)
   {
      for (CardControler item : value)
      {
         removeFromCardControlers(item);
      }
      return this;
   }
   
   public void removeAllFromCardControlers()
   {
      LinkedHashSet<CardControler> tmpSet = new LinkedHashSet<CardControler>(this.getCardControlers());
   
      for (CardControler value : tmpSet)
      {
         this.removeFromCardControlers(value);
      }
   }
   
   public CardControler createCardControlers()
   {
      CardControler value = new CardControler();
      withCardControlers(value);
      return value;
   } 
}

