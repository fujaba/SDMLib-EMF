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

import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.ChangeHistory;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.Node;
import org.sdmlib.replication.RemoteTaskBoard;
import org.sdmlib.replication.ReplicationNode;
import org.sdmlib.replication.ServerSocketAcceptThread;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.serialization.PropertyChangeInterface;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.storyboards.StoryboardWall;

import de.uniks.networkparser.json.JsonIdMap;

public class ReplicationMauMauServer extends ReplicationNode implements PropertyChangeInterface
{
   public class TaskBoardLanesListener implements  PropertyChangeListener
   {
      public RemoteTaskBoard getTaskFlowBoard()
      {
         return taskFlowBoard;
      }

      @Override
      public void propertyChange(PropertyChangeEvent evt)
      {
         boolean oldState = sharedSpace.isApplyingChangeMsg();

         try
         {
            sharedSpace.setApplyingChangeMsg(false);
            if (evt.getNewValue() != null)
            {
               Lane newLane = (Lane) evt.getNewValue();

               BoardTask createTask = newLane.createTask(MultiMauMau.SHOW_START_GAME_BUTTON);

               if (storyboard != null)
               {
                  sharedSpace.getNewHistoryIdNumber(5);
                  
                  storyboard.add("The taskboard lane listener detects " + newLane.getName() 
                     + "'s lane and adds an init task to it.");
                  
                  storyboard.addObjectDiagram(
                     "serverNode", "icons/node.png", new Node(),
                     "icons/worker.png", this
                        );
               }
               
               createTask.setStatus(BoardTask.START);
            }
         }
         finally
         {
            sharedSpace.setApplyingChangeMsg(oldState);
         }
      }
   }

   public static final int REPLICATION_SERVER_PORT = 11144;
   private RemoteTaskBoard taskFlowBoard;
   private MauMau mauMau;

   public RemoteTaskBoard getTaskFlowBoard()
   {
      return taskFlowBoard;
   }

   public MauMau getMauMau()
   {
      return mauMau;
   }

   public static void main(String[] args)
   {
      ReplicationMauMauServer replicationServer = new ReplicationMauMauServer().start();
   }

   public ReplicationMauMauServer start()
   {
      new ServerSocketAcceptThread(this, REPLICATION_SERVER_PORT).start();

      return this;
   }

   @Override
   public synchronized SharedSpace getOrCreateSharedSpace(String spaceId) 
   {
      sharedSpace = super.getOrCreateSharedSpace(spaceId);

      if (sharedSpace.getMap() == null)
      {
         JsonIdMap map = org.sdmlib.examples.replication.maumau.creators.CreatorCreator.createIdMap(MultiMauMau.SERVER);
         map.withCreator(org.sdmlib.replication.creators.CreatorCreator.getCreatorSet());
         map.withCreator(StoryboardWallCreator.createIdMap("x").getCreators());


         sharedSpace.withNodeId(MultiMauMau.SERVER).withMap(map);

         // set up history
         ChangeHistory history = new ChangeHistory();
         sharedSpace.setHistory(history);


         // add a shared model root to replicate the storyboard
         StoryboardWall storyboardWall = new StoryboardWall();
         map.put(spaceId + "storyboardWall", storyboardWall);
         storyboard = null;

         if (testMode)
         {
            storyboard = new Storyboard("examples", this.getClass().getSimpleName());
            map.put(spaceId + "storyboard", storyboard);

            storyboardWall.withStoryboard(storyboard);
         }

         mauMau = new MauMau();
         map.put(spaceId + "_root", mauMau);

         // add taskflow board
         taskFlowBoard = new RemoteTaskBoard();
         map.put(spaceId + "taskBoard", taskFlowBoard);

         Lane serverLane = new Lane().withName(MultiMauMau.SERVER);
         // map.put(MultiMauMau.SERVER_LANE, serverLane);
         taskFlowBoard.addToLanes(serverLane);

         TaskBoardLanesListener taskBoardLanesListener = new TaskBoardLanesListener();
         taskFlowBoard.getPropertyChangeSupport().addPropertyChangeListener(RemoteTaskBoard.PROPERTY_LANES, taskBoardLanesListener);

         ServerLaneManager serverLaneManager = new ServerLaneManager(sharedSpace);
         serverLane.getPropertyChangeSupport().addPropertyChangeListener(serverLaneManager.withSource(serverLane));

         if (storyboard != null)
         {
            // file:///C:/Users/zuendorf/eclipseworkspaces/indigo/SDMLibEMF/doc/replicationMauMau.html
            sharedSpace.getNewHistoryIdNumber(5);
            storyboard.setStepCounter(2);
            storyboard.addStep("On client connect, the game server creates shared objects and adds a listener for new player lanes");
            storyboard.addObjectDiagram(
               "serverNode", "icons/node.png", new Node(),
               "server", "icons/worker.png", this,
               "taskboard", "icons/shared.png", taskFlowBoard, 
               "taskBoardLanesListener", "icons/server.png", taskBoardLanesListener,
               "serverLaneListener", "icons/server.png", serverLaneManager, 
               "serverLane", serverLane, 
               "maumau", "icons/shared.png", mauMau);
         }

      }

      return sharedSpace;
   }


   private boolean testMode = false;

   public ReplicationMauMauServer withTestMode(boolean flag)
   {
      this.testMode = flag; 
      return this;
   }


   //==========================================================================

   public Object get(String attrName)
   {
      return null;
   }


   //==========================================================================

   public boolean set(String attrName, Object value)
   {
      return false;
   }


   //==========================================================================

   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   private SharedSpace sharedSpace;
   private Storyboard storyboard;

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
}

