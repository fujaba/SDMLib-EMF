package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class AskKarliToStartTheGameAction implements PropertyChangeListener
{
   /**
    * 
    */
   private final Play7WorkFlowLaneManager workFlowManager;

   /**
    * @param play7WorkFlowLaneManager
    */
   AskKarliToStartTheGameAction(Play7WorkFlowLaneManager play7WorkFlowLaneManager)
   {
      workFlowManager = play7WorkFlowLaneManager;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getNewValue() != null && "start".equals(evt.getNewValue()))
      {
         boolean oldState = workFlowManager.getGameSpace().isApplyingChangeMsg();
       
         try
         {
            workFlowManager.getGameSpace().setApplyingChangeMsg(false);
            
            workFlowManager.getStoryboard().addStep("testPlay7 signals Karli to click the Start Game button.");

            workFlowManager.getTaskFlowBoard().startTask("KarliLane", Play7WorkFlow.CLICK_START_BUTTON);
         }
         finally
         {
            workFlowManager.getGameSpace().setApplyingChangeMsg(oldState);
         }
      }

   }
}