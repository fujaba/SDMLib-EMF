package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class StartClientsAction implements PropertyChangeListener
{
   /**
    * 
    */
   private final Play7WorkFlowLaneManager workFlowManager;

   /**
    * @param play7WorkFlowLaneManager
    */
   StartClientsAction(Play7WorkFlowLaneManager play7WorkFlowLaneManager)
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
            
            workFlowManager.getGameSpace().getNewHistoryIdNumber(10);

            workFlowManager.getStoryboard().addStep("The play7Tester starts the three clients.");

            workFlowManager.startClient("Abu");

            workFlowManager.startClient("Karli");

            workFlowManager.startClient("Sabine");

            System.out.println("Clients have been started");
         }
         finally
         {
            workFlowManager.getGameSpace().setApplyingChangeMsg(oldState);
         }
      }

   }
}