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

import org.sdmlib.utils.PropertyChangeInterface;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;
import org.sdmlib.utils.StrUtil;

public class Duty implements PropertyChangeInterface
{

   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_KIND.equalsIgnoreCase(attrName))
      {
         return getKind();
      }

      if (PROPERTY_NUMBER.equalsIgnoreCase(attrName))
      {
         return getNumber();
      }

      if (PROPERTY_PLAYER.equalsIgnoreCase(attrName))
      {
         return getPlayer();
      }

      if (PROPERTY_GAME.equalsIgnoreCase(attrName))
      {
         return getGame();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_KIND.equalsIgnoreCase(attrName))
      {
         setKind((String) value);
         return true;
      }

      if (PROPERTY_NUMBER.equalsIgnoreCase(attrName))
      {
         setNumber(Integer.parseInt(value.toString()));
         return true;
      }

      if (PROPERTY_PLAYER.equalsIgnoreCase(attrName))
      {
         setPlayer((Player) value);
         return true;
      }

      if (PROPERTY_GAME.equalsIgnoreCase(attrName))
      {
         setGame((MauMau) value);
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
      setPlayer(null);
      setGame(null);
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_KIND = "kind";
   
   private String kind;

   public String getKind()
   {
      return this.kind;
   }
   
   public void setKind(String value)
   {
      if ( ! StrUtil.stringEquals(this.kind, value))
      {
         String oldValue = this.kind;
         this.kind = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_KIND, oldValue, value);
      }
   }
   
   public Duty withKind(String value)
   {
      setKind(value);
      return this;
   } 

   public String toString()
   {
      StringBuilder _ = new StringBuilder();
      
      _.append(" ").append(this.getKind());
      _.append(" ").append(this.getNumber());
      return _.substring(1);
   }


   
   //==========================================================================
   
   public static final String PROPERTY_NUMBER = "number";
   
   private int number;

   public int getNumber()
   {
      return this.number;
   }
   
   public void setNumber(int value)
   {
      if (this.number != value)
      {
         int oldValue = this.number;
         this.number = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_NUMBER, oldValue, value);
      }
   }
   
   public Duty withNumber(int value)
   {
      setNumber(value);
      return this;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       one
    * Duty ----------------------------------- Player
    *              duty                   player
    * </pre>
    */
   
   public static final String PROPERTY_PLAYER = "player";
   
   private Player player = null;
   
   public Player getPlayer()
   {
      return this.player;
   }
   
   public boolean setPlayer(Player value)
   {
      boolean changed = false;
      
      if (this.player != value)
      {
         Player oldValue = this.player;
         
         if (this.player != null)
         {
            this.player = null;
            oldValue.setDuty(null);
         }
         
         this.player = value;
         
         if (value != null)
         {
            value.withDuty(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_PLAYER, oldValue, value);
         changed = true;
      }
      
      return changed;
   }
   
   public Duty withPlayer(Player value)
   {
      setPlayer(value);
      return this;
   } 
   
   public Player createPlayer()
   {
      Player value = new Player();
      withPlayer(value);
      return value;
   } 

   
   /********************************************************************
    * <pre>
    *              one                       one
    * Duty ----------------------------------- MauMau
    *              duty                   game
    * </pre>
    */
   
   public static final String PROPERTY_GAME = "game";
   
   private MauMau game = null;
   
   public MauMau getGame()
   {
      return this.game;
   }
   
   public boolean setGame(MauMau value)
   {
      boolean changed = false;
      
      if (this.game != value)
      {
         MauMau oldValue = this.game;
         
         if (this.game != null)
         {
            this.game = null;
            oldValue.setDuty(null);
         }
         
         this.game = value;
         
         if (value != null)
         {
            value.withDuty(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_GAME, oldValue, value);
         changed = true;
      }
      
      return changed;
   }
   
   public Duty withGame(MauMau value)
   {
      setGame(value);
      return this;
   } 
   
   public MauMau createGame()
   {
      MauMau value = new MauMau();
      withGame(value);
      return value;
   } 
}

