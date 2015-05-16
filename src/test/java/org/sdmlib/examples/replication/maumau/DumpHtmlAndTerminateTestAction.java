package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.sdmlib.replication.SharedSpace;

class DumpHtmlAndTerminateTestAction implements PropertyChangeListener
{
   /**
    * 
    */
   private final Play7WorkFlowLaneManager workFlowManager;

   /**
    * @param play7WorkFlowLaneManager
    */
   DumpHtmlAndTerminateTestAction(Play7WorkFlowLaneManager play7WorkFlowLaneManager)
   {
      workFlowManager = play7WorkFlowLaneManager;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getNewValue() != null && "start".equals(evt.getNewValue()))
      {
         boolean oldState = workFlowManager.getGameSpace()
            .isApplyingChangeMsg();

         try
         {
            workFlowManager.getGameSpace().setApplyingChangeMsg(false);

            workFlowManager.getStoryboard().dumpHTML();

            workFlowManager.getChannel().send(SharedSpace.TERMINATE);
         }
         finally
         {
            workFlowManager.getGameSpace().setApplyingChangeMsg(oldState);
         }
      }

   }
}