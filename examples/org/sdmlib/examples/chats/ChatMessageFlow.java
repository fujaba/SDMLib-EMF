/*
   Copyright (c) 2012 zuendorf 
   
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
   
package org.sdmlib.examples.chats;

import java.beans.PropertyChangeSupport;

import org.sdmlib.StrUtil;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.serialization.PropertyChangeInterface;

public class ChatMessageFlow extends TaskFlow implements PropertyChangeInterface
{
   enum TaskNames
   {
      HandleClick, HandleMessage
   }
   
   public Object[] getTaskNames()
	{
		return TaskNames.values();
	}



   //==========================================================================
   
   @Override            
   public void run()
   {
      switch (TaskNames.values()[taskNo])
      {
      case HandleClick:
         msg = gui.getNameLabel().getText() + ": " + gui.getNewMessageText().getText();
         
         gui.getNewMessageText().setText("");
         
         switchToThisAnd(gui.getPeer());
         break;

      case HandleMessage:
         gui.getAllMessages().append(msg + "\n");
         break;
         
      default:
         break;
      }
      
   } 

   
   //==========================================================================
   
   public Object get(String attrName)
   {
      int pos = attrName.indexOf('.');
      String attribute = attrName;
      
      if (pos > 0)
      {
         attribute = attrName.substring(0, pos);
      }

      if (PROPERTY_MSG.equalsIgnoreCase(attribute))
      {
         return getMsg();
      }

      if (PROPERTY_GUI.equalsIgnoreCase(attribute))
      {
         return getGui();
      }

      if (PROPERTY_TASKNO.equalsIgnoreCase(attribute))
      {
         return getTaskNo();
      }

      if (PROPERTY_IDMAP.equalsIgnoreCase(attrName))
      {
         return getIdMap();
      }

      if (PROPERTY_SUBFLOW.equalsIgnoreCase(attrName))
      {
         return getSubFlow();
      }

      if (PROPERTY_PARENT.equalsIgnoreCase(attrName))
      {
         return getParent();
      }

      return super.get(attrName);
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_MSG.equalsIgnoreCase(attrName))
      {
         setMsg((String) value);
         return true;
      }

      if (PROPERTY_GUI.equalsIgnoreCase(attrName))
      {
         setGui((PeerToPeerChat) value);
         return true;
      }

      if (PROPERTY_TASKNO.equalsIgnoreCase(attrName))
      {
         setTaskNo(Integer.parseInt(value.toString()));
         return true;
      }

      if (PROPERTY_IDMAP.equalsIgnoreCase(attrName))
      {
         setIdMap((org.sdmlib.serialization.json.SDMLibJsonIdMap) value);
         return true;
      }

      if (PROPERTY_SUBFLOW.equalsIgnoreCase(attrName))
      {
         setSubFlow((TaskFlow) value);
         return true;
      }

      if (PROPERTY_PARENT.equalsIgnoreCase(attrName))
      {
         setParent((TaskFlow) value);
         return true;
      }

      return super.set(attrName, value);
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
      setSubFlow(null);
      setParent(null);
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_MSG = "msg";
   
   private String msg;

   public String getMsg()
   {
      return this.msg;
   }
   
   public void setMsg(String value)
   {
      if ( ! StrUtil.stringEquals(this.msg, value))
      {
         String oldValue = this.msg;
         this.msg = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_MSG, oldValue, value);
      }
   }
   
   public ChatMessageFlow withMsg(String value)
   {
      setMsg(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_GUI = "gui";
   
   private PeerToPeerChat gui;

   public PeerToPeerChat getGui()
   {
      return this.gui;
   }
   
   public void setGui(PeerToPeerChat value)
   {
      if (this.gui != value)
      {
         PeerToPeerChat oldValue = this.gui;
         this.gui = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_GUI, oldValue, value);
      }
   }
   
   public ChatMessageFlow withGui(PeerToPeerChat value)
   {
      setGui(value);
      return this;
   }


   public String toString()
   {
      StringBuilder _ = new StringBuilder();
      
      _.append(" ").append(this.getMsg());
      _.append(" ").append(this.getTaskNo());
      return _.substring(1);
   }

}

