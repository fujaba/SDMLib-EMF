package org.sdmlib.examples.replication.maumau;

import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.Node;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.storyboards.Storyboard;

public class StartGameMouseAdapter extends MouseAdapter
{
   /**
    * 
    */
   private MauMauClientGui gui = null;

   private BoardTask t;
   private Label startGameLabel;

   public StartGameMouseAdapter(MauMauClientGui gui, BoardTask t, Label startGameLabel)
   {
      this.gui = gui;
      this.t = t;
      this.startGameLabel = startGameLabel;
   }

   public Label getStartGameLabel()
   {
      return startGameLabel;
   }

   @Override
   public void mouseUp(MouseEvent e)
   {
      // move start game task to server lane
      TaskFlowBoard board = t.getLane().getBoard();

      BoardTask task = board.createTask(MultiMauMau.SERVER, MultiMauMau.START_GAME);

      if (this.gui.getStoryboard() != null)
      {
         Storyboard story = this.gui.getStoryboard();
         // gui.getSharedSpace().getNewHistoryIdNumber(15);
         story.addStep("StartGameAction adds a start game task to the server lane");
         story.addObjectDiagram(
            gui.getSharedSpace().getNodeId() + "Node", "icons/node.png", new Node(),
            "icons/worker.png", this, board);
         // story.setStepDoneCounter(story.getStepDoneCounter() + 1);
      }
      
      task.start();
   }
}