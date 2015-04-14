package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class CardStackListener implements PropertyChangeListener
{
   /**
    * 
    */
   private Holder stack;

   /**
    * @param serverStartGameHandler
    */
   CardStackListener(Holder stack)
   {
      this.stack = stack;
   }

   private Player currentPlayer = null;
   
   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      // did we move on to a new player or did we just shuffle the stack
      if (stack.getStackOwner().getCurrentMove() != currentPlayer)
      {
         currentPlayer = stack.getStackOwner().getCurrentMove();
         
         // new card on stack, derive duty
         Value value = stack.getCards().getLast().getValue();
         
         if (value == Value._7)
         {
            // draw two cards
            Duty duty = currentPlayer.createDuty().withKind("draw cards").withNumber(2);
         }
      }
   }
}