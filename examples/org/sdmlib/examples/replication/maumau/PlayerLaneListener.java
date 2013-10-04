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
import org.sdmlib.replication.TaskHandler;
import org.sdmlib.replication.creators.LaneSet;
import org.sdmlib.replication.creators.TaskHandlerSet;
import org.sdmlib.utils.PropertyChangeInterface;

import java.beans.PropertyChangeSupport;

public class PlayerLaneListener implements PropertyChangeListener, PropertyChangeInterface
{
   private MauMauClientGui gui = null;

   public PlayerLaneListener init(MauMauClientGui gui, Lane playerLane)
   {
      this.gui = gui;

      handlerList.add(new ShowStartGameButton().withGui(gui));
      handlerList.add(new ClickStartGameButton().withGui(gui));
      handlerList.add(new CardsAreDeltScreenDumpHandler().withGui(gui));
      handlerList.add(new KarliDrawCardsHandler().withGui(gui));

      sources.add(playerLane);

      return this;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getPropertyName().equals(Lane.PROPERTY_TASKS))
      {
         boolean oldState = gui.getSharedSpace().isApplyingChangeMsg();
         try
         {
            gui.getSharedSpace().setApplyingChangeMsg(false);
         
            BoardTask oldTask = (BoardTask) evt.getOldValue();
            BoardTask newTask = (BoardTask) evt.getNewValue();
            // some task change
            for (TaskHandler handler : handlerList)
            {
               boolean done = handler.handle(oldTask, newTask);

               if (done)
               {
                  break;
               }
            }
         }
         finally
         {
            gui.getSharedSpace().setApplyingChangeMsg(oldState);
         }
      }
   }


   //==========================================================================

   public Object get(String attrName)
   {
      if (PROPERTY_HANDLERLIST.equalsIgnoreCase(attrName))
      {
         return getHandlerList();
      }

      if (PROPERTY_SOURCES.equalsIgnoreCase(attrName))
      {
         return getSources();
      }

      return null;
   }


   //==========================================================================

   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_HANDLERLIST.equalsIgnoreCase(attrName))
      {
         setHandlerList((org.sdmlib.replication.creators.TaskHandlerSet) value);
         return true;
      }

      if (PROPERTY_SOURCES.equalsIgnoreCase(attrName))
      {
         setSources((org.sdmlib.replication.creators.LaneSet) value);
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

   public static final String PROPERTY_HANDLERLIST = "handlerList";

   private org.sdmlib.replication.creators.TaskHandlerSet handlerList = new TaskHandlerSet();

   public org.sdmlib.replication.creators.TaskHandlerSet getHandlerList()
   {
      return this.handlerList;
   }

   public void setHandlerList(org.sdmlib.replication.creators.TaskHandlerSet value)
   {
      if (this.handlerList != value)
      {
         org.sdmlib.replication.creators.TaskHandlerSet oldValue = this.handlerList;
         this.handlerList = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_HANDLERLIST, oldValue, value);
      }
   }

   public PlayerLaneListener withHandlerList(org.sdmlib.replication.creators.TaskHandlerSet value)
   {
      setHandlerList(value);
      return this;
   } 


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

   public PlayerLaneListener withSources(org.sdmlib.replication.creators.LaneSet value)
   {
      setSources(value);
      return this;
   } 
}

