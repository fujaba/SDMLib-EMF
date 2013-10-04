package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;

public class NewCardHandler extends ChangeHandler
{

   private MultiMauMauControler maumauControler;

   public NewCardHandler(MultiMauMauControler maumauControler)
   {
      this.maumauControler = maumauControler;
   }

   @Override
   public boolean propertyChange(PropertyChangeEvent evt)
   {
      if (evt != null && MauMau.PROPERTY_CARDS.equals(evt.getPropertyName()))
      {
         Player activePlayer = maumauControler.getActivePlayer();
         if (activePlayer  == null || activePlayer.getName() == null)
         {
            // to early, wait for next event.
            return true;
         }
         
         // add card controler to card
         Card newCard = (Card) evt.getNewValue();
         
         if (newCard == null)
         {
            return true;
         }
         
         CardControler listener = new CardControler(maumauControler, newCard);
         newCard.getPropertyChangeSupport().addPropertyChangeListener(listener);
         listener.propertyChange(null);

         maumauControler.getCardControlers().add(listener);
         
         return true;
      }
      return false;
   }
}
