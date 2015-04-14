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
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.utils.PropertyChangeInterface;
import java.beans.PropertyChangeSupport;

public class ServerLaneManager implements PropertyChangeListener, PropertyChangeInterface
{
   private SharedSpace sharedSpace;
   

   public ServerLaneManager(SharedSpace sharedSpace)
   {
      this.sharedSpace = sharedSpace;
   }

   public ServerLaneManager()
   {
      // Auto-generated constructor stub
   }



   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getPropertyName().equals(Lane.PROPERTY_TASKS) && evt.getNewValue() != null)
      {
         BoardTask task = (BoardTask) evt.getNewValue();
         
         switch (task.getName())
         {
         case MultiMauMau.START_GAME:
            task.getPropertyChangeSupport().addPropertyChangeListener(new StartGameAction().withSharedSpace(sharedSpace));
            break;

         default:
            break;
         }
      }
   }

   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_SOURCE.equalsIgnoreCase(attrName))
      {
         return getSource();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
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
   
   public ServerLaneManager withSource(java.lang.Object value)
   {
      setSource(value);
      return this;
   } 
}

