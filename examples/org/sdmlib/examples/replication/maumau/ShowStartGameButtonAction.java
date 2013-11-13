package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Node;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.swt.ScreenShotRunnable;

public class ShowStartGameButtonAction implements PropertyChangeListener
{

   private MauMauClientGui gui = null;

   public ShowStartGameButtonAction withGui(MauMauClientGui gui)
   {
      this.gui = gui;
      return this;
   }

   private Label startGameLabel;

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {

      if (evt.getNewValue() != null
            && BoardTask.START.equals(evt.getNewValue()))
      {
         boolean oldState = gui.getSharedSpace().isApplyingChangeMsg();

         try
         {
            gui.getSharedSpace().setApplyingChangeMsg(false);

            BoardTask task = (BoardTask) evt.getSource();
            startGameLabel = new Label(gui.getShell(), SWT.NONE);
            startGameLabel.setBounds(200, 200, 292, 50);
            startGameLabel.setAlignment(SWT.CENTER);
            startGameLabel
            .setText("When all players have shown up, Start Game");

            StartGameMouseAdapter listener = new StartGameMouseAdapter(this.gui, task, startGameLabel);
            startGameLabel.addMouseListener(listener);

            gui.withStartGameLabel(startGameLabel);

            if (gui.getStoryboard() != null)
            {
               Storyboard story = gui.getStoryboard();

               // gui.getSharedSpace().getNewHistoryIdNumber(5 +
               // (newTask.getLane().getBoard().getLanes().size() - 3) * 10);

               // story.setStepCounter(5 +
               // (newTask.getLane().getBoard().getLanes().size() - 3) * 2);
               gui.getSharedSpace().getNewHistoryIdNumber(15);
               story.setStepCounter(story.getStepCounter() + 1);
               String nodeId = gui.getSharedSpace().getNodeId();
               story.add(nodeId
                  + "'s player lane manager detects the showStartGameButton task and triggers the responsible action. "
                  + "The showStartGameButton action creates a label and adds a mouse listener to it:");

               TaskFlowBoard board = task.getLane().getBoard();
               story.addObjectDiagram(
                  nodeId + "Node", "icons/node.png", new Node(),
                  "icons/worker.png", this, 
                  board, 
                  startGameLabel, 
                  "icons/person1.png", listener,
                  gui.getMauMau());

               story.add("On the screen we have now a message that may be used to start the game");

               String screendumpFile = gui.getSharedSpace().getName()
                     + "StartGameScreen" + story.getStoryboardSteps().size()
                     + ".png";
               new ScreenShotRunnable(Display.getDefault(), gui.getShell(), screendumpFile).run();
               story.addImage(screendumpFile);

               // story.setStepDoneCounter(story.getStepDoneCounter() + 1);

               if ("Sabine".equals(nodeId))
               {
                  // last client in test, trigger next test action
                  board.startTask(Play7WorkFlow.PLAY7_WORK_FLOW_LANE, Play7WorkFlow.ASK_KARLI_TO_START_THE_GAME);
               }
            }
         }
         finally
         {
            gui.getSharedSpace().setApplyingChangeMsg(oldState);
         }
      }
   }
}
