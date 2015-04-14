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
import java.util.LinkedHashSet;

import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.Task;
import org.sdmlib.replication.creators.LaneSet;
import org.sdmlib.utils.PropertyChangeInterface;

import java.beans.PropertyChangeSupport;

public class PlayerLaneManager implements PropertyChangeListener, PropertyChangeInterface
{
   private MauMauClientGui gui = null;

   public PlayerLaneManager init(MauMauClientGui gui, Lane playerLane)
   {
      this.gui = gui;

      // handlerList.add(new ShowStartGameButton().withGui(gui));
      // handlerList.add(new Play7WorkFlowLaneManager().withGui(gui));

      sources.add(playerLane);

      return this;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getPropertyName().equals(Lane.PROPERTY_TASKS) && evt.getNewValue() != null)
      {
         // new task, add action to it 
         BoardTask task = (BoardTask) evt.getNewValue();
         
         switch (task.getName())
         {
         case MultiMauMau.SHOW_START_GAME_BUTTON:
            task.getPropertyChangeSupport().addPropertyChangeListener(new ShowStartGameButtonAction().withGui(gui));
            break;

         case MultiMauMau.HIDE_START_GAME_BUTTON:
            task.getPropertyChangeSupport().addPropertyChangeListener(new HideStartGameButtonAction().withGui(gui));
            break;

         case Play7WorkFlow.CLICK_START_BUTTON:
            task.getPropertyChangeSupport().addPropertyChangeListener(new ClickStartButtonAction().withGui(gui));
            break;

         case Play7WorkFlow.CARDS_ARE_DELT_SCREEN_DUMP:
            task.getPropertyChangeSupport().addPropertyChangeListener(new CardsAreDeltScreenDumpAction().withGui(gui));
            break;

         case Play7WorkFlow.KARLI_DRAW_CARDS:
            task.getPropertyChangeSupport().addPropertyChangeListener(new KarliDrawCardsAction().withGui(gui));
            break;

         default:
            break;
         }
         System.out.println(task.getName());
//         boolean oldState = gui.getSharedSpace().isApplyingChangeMsg();
//         try
//         {
//            gui.getSharedSpace().setApplyingChangeMsg(false);
//         
//            BoardTask oldTask = (BoardTask) evt.getOldValue();
//            BoardTask newTask = (BoardTask) evt.getNewValue();
//            // some task change
//            for (TaskHandler handler : handlerList)
//            {
//               boolean done = handler.handle(oldTask, newTask);
//
//               if (done)
//               {
//                  break;
//               }
//            }
//         }
//         finally
//         {
//            gui.getSharedSpace().setApplyingChangeMsg(oldState);
//         }
      }
   }


   //==========================================================================

   public Object get(String attrName)
   {
      if (PROPERTY_SOURCES.equalsIgnoreCase(attrName))
      {
         return getSources();
      }

      if (PROPERTY_SOURCE.equalsIgnoreCase(attrName))
      {
         return getSource();
      }

      return null;
   }


   //==========================================================================

   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_SOURCES.equalsIgnoreCase(attrName))
      {
         setSources((org.sdmlib.replication.creators.LaneSet) value);
         return true;
      }

      if (PROPERTY_SOURCE.equalsIgnoreCase(attrName))
      {
         setSource((java.lang.Object) value);
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
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }


   //==========================================================================

   //==========================================================================

   public static final String PROPERTY_SOURCES = "sources";

   private org.sdmlib.replication.creators.LaneSet sources = new LaneSet();

   public org.sdmlib.replication.creators.LaneSet getSources()
   {
      return this.sources;
   }

   public void setSources(org.sdmlib.replication.creators.LaneSet value)
   {
      if (this.sources != value)
      {
         org.sdmlib.replication.creators.LaneSet oldValue = this.sources;
         this.sources = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_SOURCES, oldValue, value);
      }
   }

   public PlayerLaneManager withSources(org.sdmlib.replication.creators.LaneSet value)
   {
      setSources(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_SOURCE = "source";
   
   private java.lang.Object source;

   public java.lang.Object getSource()
   {
      return this.source;
   }
   
   public void setSource(java.lang.Object value)
   {
      if (this.source != value)
      {
         java.lang.Object oldValue = this.source;
         this.source = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_SOURCE, oldValue, value);
      }
   }
   
   public PlayerLaneManager withSource(java.lang.Object value)
   {
      setSource(value);
      return this;
   } 
}

