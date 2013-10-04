package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.Task;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.replication.TaskHandler;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.swt.ScreenShotRunnable;

public class ShowStartGameButton extends TaskHandler
{

   private MauMauClientGui gui = null;
   
   public ShowStartGameButton withGui(MauMauClientGui gui)
   {
      this.gui = gui;
      return this;
   }

   public class StartGameAction extends MouseAdapter
   {
      private BoardTask t;
      private Label startGameLabel;

      public StartGameAction(BoardTask t, Label startGameLabel)
      {
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
         
         Lane serverLane = board.getLanes(MultiMauMau.SERVER);
         
         serverLane.addToTasks(new BoardTask().withName(MultiMauMau.START_GAME));
         
         if (gui.getStoryboard() != null)
         {
            Storyboard story = gui.getStoryboard();
            // gui.getSharedSpace().getNewHistoryIdNumber(15);
            story.addStep("StartGameAction adds a start game task to the server lane");
            story.addObjectDiagram(
               "icons/worker.png", this, 
               board
                  );
            story.setStepDoneCounter(story.getStepDoneCounter() + 1);
         }
      }
   }

   private Label startGameLabel;

   @Override
   public boolean handle(BoardTask oldTask, BoardTask newTask)
   {
      // file:///C:/Users/zuendorf/eclipseworkspaces/indigo/SDMLibEMF/doc/replicationMauMau.html#step_3
      if (newTask != null && MultiMauMau.INIT.equals(newTask.getName()))
      {  
         startGameLabel = new Label(gui .getShell(), SWT.NONE);
         startGameLabel.setBounds(200, 200, 292, 50);
         startGameLabel.setAlignment(SWT.CENTER);
         startGameLabel.setText("When all players have shown up, Start Game");
         
         StartGameAction listener = new StartGameAction(newTask, startGameLabel);
         startGameLabel.addMouseListener(listener);
         
         gui.withStartGameLabel(startGameLabel);
         
         if (gui.getStoryboard() != null)
         {
            Storyboard story = gui.getStoryboard();
            
            // gui.getSharedSpace().getNewHistoryIdNumber(5 + (newTask.getLane().getBoard().getLanes().size() - 3) * 10);
            
            // story.setStepCounter(5 + (newTask.getLane().getBoard().getLanes().size() - 3) * 2);
            gui.getSharedSpace().getNewHistoryIdNumber(15);
            story.setStepCounter(story.getStepCounter() + 1);
            story.addStep( gui.getSharedSpace().getNodeId() + 
               "'s lane listener detects the init action. "
               + "The startGame action is fed to the handlerList and in this case ShowStartGame feels responsible. "
               + "ShowStartGame creates a label and adds a mouse listener to it:");
            
            story.addObjectDiagram(
               "icons/worker.png", this, 
               newTask.getLane().getBoard(), 
               startGameLabel, 
               "icons/person1.png", listener, 
               gui.getMauMau());
            
            story.add("On the screen we have now a message that may be used to start the game");
            
            String screendumpFile = gui.getSharedSpace().getName() + "StartGameScreen" + story.getStoryboardSteps().size() + ".png";
            new ScreenShotRunnable(Display.getDefault(), gui.getShell(), screendumpFile).run();
            story.addImage(screendumpFile);
            
            story.setStepDoneCounter(story.getStepDoneCounter() + 1);

         }
         return true;
      }
      else if (oldTask != null && MultiMauMau.INIT.equals(oldTask.getName()))
      {
         // hide start game label
         startGameLabel.dispose();
      }
      
      
      return false;
   }
   
}
