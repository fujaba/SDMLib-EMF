package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.Node;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.storyboards.Storyboard;

public class ClickStartButtonAction implements PropertyChangeListener
{

   private MauMauClientGui gui;

   public ClickStartButtonAction withGui(MauMauClientGui gui)
   {
      this.gui = gui;

      return this;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getNewValue() != null && "start".equals(evt.getNewValue()))
      {
         boolean oldState = gui.getSharedSpace().isApplyingChangeMsg();

         try
         {
            gui.getSharedSpace().setApplyingChangeMsg(false);

            // handle click start button at karli
            Label startGameLabel = gui.getStartGameLabel();

            Storyboard story = gui.getStoryboard();

            if (story != null)
            {
               gui.getSharedSpace().getNewHistoryIdNumber(5);
               // story.setStepCounter(story.getStepCounter() + 1);
               String nodeId = gui.getSharedSpace().getNodeId();
               story.addStep(nodeId
                  + "'s clickStartButton handler raises a mouseUp event. ");
               story.addObjectDiagram(
                  nodeId + "Node", "icons/node.png", new Node(),
                  "icons/worker.png", this, startGameLabel);
               
               // story.setStepDoneCounter(story.getStepDoneCounter() + 1);
            }

            startGameLabel.notifyListeners(SWT.MouseUp, null);

            if (story != null)
            {
               story.addStep("Theo asks Abu to show his card listeners and to do a screen dump.");

               BoardTask task = (BoardTask) evt.getSource();
               
               TaskFlowBoard board = task.getLane().getBoard();

               board.startTask("AbuLane", Play7WorkFlow.CARDS_ARE_DELT_SCREEN_DUMP);
            }

         }
         finally
         {
            gui.getSharedSpace().setApplyingChangeMsg(oldState);
         }
      }
   }

}
