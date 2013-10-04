package org.sdmlib.examples.replication.maumau;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.TaskHandler;
import org.sdmlib.storyboards.Storyboard;

public class ClickStartGameButton extends TaskHandler
{

   private MauMauClientGui gui = null;
   
   public ClickStartGameButton withGui(MauMauClientGui gui)
   {
      this.gui = gui;
      return this;
   }

   @Override
   public boolean handle(BoardTask oldTask, BoardTask newTask)
   {
      // file:///C:/Users/zuendorf/eclipseworkspaces/indigo/SDMLibEMF/doc/replicationMauMau.html#step_3
      if (newTask != null && MultiMauMau.CLICK_START_BUTTON.equals(newTask.getName()))
      {  
         Label startGameLabel = gui.getStartGameLabel();
         
         startGameLabel.notifyListeners(SWT.MouseUp, null);
         
         if (gui.getStoryboard() != null)
         {
            Storyboard story = gui.getStoryboard();
            
            gui.getSharedSpace().getNewHistoryIdNumber(5);
            story.setStepCounter(story.getStepCounter() + 1);
            story.addStep( gui.getSharedSpace().getNodeId() + 
               "'s clickStartButton handler raises a mouseUp event. ");
            story.addObjectDiagram(
               "icons/worker.png", this, 
               startGameLabel);
            story.setStepDoneCounter(story.getStepDoneCounter() + 1);

         }
         return true;
      }      
      
      return false;
   }
   
}
