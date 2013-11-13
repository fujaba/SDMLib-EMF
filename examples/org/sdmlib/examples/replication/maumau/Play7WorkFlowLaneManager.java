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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.junit.Assert;
import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.examples.replication.maumau.creators.LabelSet;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.ReplicationChannel;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.swt.ScreenShotRunnable;
import org.sdmlib.utils.PropertyChangeInterface;
import java.beans.PropertyChangeSupport;

public class Play7WorkFlowLaneManager  implements PropertyChangeListener, PropertyChangeInterface
{
   /**
    * @param sharedSpaceMauMauStoryboards
    */
   private Storyboard storyboard;
   
   public Storyboard getStoryboard()
   {
      return storyboard;
   }

   private SharedSpace gameSpace;
   
   public SharedSpace getGameSpace()
   {
      return gameSpace;
   }

   public Play7WorkFlowLaneManager withGameSpace(SharedSpace gameSpace)
   {
      this.gameSpace = gameSpace;

      this.channel = this.gameSpace.getChannels().first();

      return this;
   }

   private ReplicationChannel channel;
   
   public ReplicationChannel getChannel()
   {
      return channel;
   }

   private int stepHandled = 0;


   private String actionKey = "";



   // =========================================================================================================
   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      // lane manager, look for new tasks and add appropriate listeners to them
      if (evt.getSource() instanceof Lane && evt.getNewValue() != null)
      {
         // add appropriate listener to it
         BoardTask task = (BoardTask) evt.getNewValue();
         
         switch (task.getName())
         {
         case Play7WorkFlow.START_CLIENTS:
            task.getPropertyChangeSupport().addPropertyChangeListener(new StartClientsAction(this));
            break;

         case Play7WorkFlow.ASK_KARLI_TO_START_THE_GAME:
            task.getPropertyChangeSupport().addPropertyChangeListener(new AskKarliToStartTheGameAction(this));
            break;

         case Play7WorkFlow.DUMP_HTML_AND_TERMINATE_TEST:
            task.getPropertyChangeSupport().addPropertyChangeListener(new DumpHtmlAndTerminateTestAction(this));
            break;

         default:
            break;
         }
      }
         
   }

   public Play7WorkFlowLaneManager withStoryboard(Storyboard story)
   {
      this.storyboard = story;
      return this;
   }

   private int debugSocket = 8900;

   private TaskFlowBoard taskFlowBoard;
   
   public TaskFlowBoard getTaskFlowBoard()
   {
      return taskFlowBoard;
   }

   private MauMauClientGui gui;

   Process startClient(String name)
   {
      String abuClientComand = "javaw "
            + "-Xdebug -Xrunjdwp:transport=dt_socket,address=" + (debugSocket++) 
            + ",server=y,suspend=n "
            + "-Dfile.encoding=UTF-8 "
            + "-classpath " + System.getProperty("java.class.path")
            + " org.sdmlib.examples.replication.maumau.MultiMauMauClientGui "
            + name
            ;

      Process child = null;
      try
      {
         final Process localChild = Runtime.getRuntime().exec(abuClientComand);
         child = localChild;

         //         ProcessBuilder processBuilder =  new ProcessBuilder(abuClientComand);
         //         processBuilder.redirectErrorStream(true);
         //         Process child = processBuilder.start();
         InputStream inputStream = child.getInputStream();
         InputStreamReader in = new InputStreamReader(inputStream);
         final BufferedReader buf = new BufferedReader(in);
         String line = null; 
         line = buf.readLine();
         line = line + "\n   " + buf.readLine();
         Assert.assertFalse("Was not able to start abu client correctly.\n" + line, line.startsWith("FATAL"));;
         storyboard.add("<pre>   " + line + "</pre>");

         new Thread() {
            @Override
            public void run()
            {
               while (true)
               {
                  try
                  {
                     String text = buf.readLine();
                     System.out.println(text);
                  }
                  catch (IOException e)
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  }
               }
            }
         }.start();

         new Thread() {
            @Override
            public void run()
            {
               InputStream errorStream = localChild.getErrorStream();

               InputStreamReader in = new InputStreamReader(errorStream);
               BufferedReader errbuf = new BufferedReader(in);

               while (true)
               {
                  try
                  {
                     String text = errbuf.readLine();
                     System.out.println(text);
                  }
                  catch (IOException e)
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  }
               }
            }
         }.start();
      }
      catch (Exception e)
      {
         Assert.fail(e.toString());
      }

      int stopSize = storyboard.getStoryboardSteps().size() + 3;
      synchronized (storyboard)
      {
         while(storyboard.getStoryboardSteps().size() < stopSize)
         {
            try
            {
               storyboard.wait(1000);
               stopSize--;
            }
            catch (InterruptedException e)
            {
               // TODO Auto-generated catch block
               // e.printStackTrace();
            }
         }
      }


      return child;
   }

   public Play7WorkFlowLaneManager withTaskFlowBoard(TaskFlowBoard taskFlowBoard)
   {
      this.taskFlowBoard = taskFlowBoard;
      return this;
   }

   public Play7WorkFlowLaneManager withGui(MauMauClientGui gui)
   {
      this.gui = gui;

      this.gameSpace = gui.getSharedSpace();

      return this;
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
   
   public Play7WorkFlowLaneManager withSource(java.lang.Object value)
   {
      setSource(value);
      return this;
   } 
}

