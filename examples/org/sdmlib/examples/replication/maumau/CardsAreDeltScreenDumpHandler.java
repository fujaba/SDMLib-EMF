package org.sdmlib.examples.replication.maumau;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.examples.replication.maumau.creators.LabelSet;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.TaskHandler;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.swt.ScreenShotRunnable;

public class CardsAreDeltScreenDumpHandler extends TaskHandler
{

   private MauMauClientGui gui = null;
   
   public CardsAreDeltScreenDumpHandler withGui(MauMauClientGui gui)
   {
      this.gui = gui;
      return this;
   }

   @Override
   public boolean handle(BoardTask oldTask, BoardTask newTask)
   {
      // file:///C:/Users/zuendorf/eclipseworkspaces/indigo/SDMLibEMF/doc/replicationMauMau.html#step_3
      if (newTask != null && MultiMauMau.CARDS_ARE_DELT_SCREEN_DUMP.equals(newTask.getName()))
      {  
         if (gui.getStoryboard() != null)
         {
            Storyboard story = gui.getStoryboard();
            
            newTask.setName(newTask.getName() + "_done" );

            newTask.removeYou();
            
            gui.getSharedSpace().getNewHistoryIdNumber(42);
            
            // story.setStepCounter(story.getStepCounter() + 1);
            
            story.addStep( gui.getSharedSpace().getNodeId() + 
               "', maumau controler creates labels for all cards on the screen. ");
            
            MauMau mauMau = gui.getMauMau();
            
            Holder stack = mauMau.getStack();
            
            Card firstCardOnStack = stack.getCards().getFirst();
            
            MultiMauMauControler gameControler = gui.getGameControler();
            
            Player abu = gameControler.getActivePlayer();
            
            
            // find controlers and labels and listeners for abu's cards and add them to the object diagram
            CardSet cards = stack.getCards().union(abu.getCards());
            LabelSet labels = new LabelSet();
            LinkedHashSet<CardControler> cardControlers = new LinkedHashSet<CardControler>();
            LinkedHashSet<CardListener> cardListeners = new LinkedHashSet<CardListener>();
            
            Card hearts7 = null;
            CardControler hearts7Controler = null;
            CardControler heartsQueenControler = null;
            
            for(CardControler cardControler : gameControler.getCardControlers())
            {
               Card card = cardControler.getCard();
               
               if (cards.contains(card))
               {
                  // interesting one
                  labels.add(cardControler.getLabel());
                  
                  cardControlers.add(cardControler);

                  cardListeners.add(cardControler.getListener());
                  
                  if (card.getSuit() == Suit.Hearts && card.getValue() == Value._7)
                  {
                     hearts7 = card;
                     hearts7Controler = cardControler;
                  }
                  else if (card.getSuit() == Suit.Hearts && card.getValue() == Value.Queen)
                  {
                     heartsQueenControler = cardControler;
                  }
               }
            }
            
            story.addObjectDiagramWith(
               "icons/worker.png", this,
               "maumau", "icons/shared.png", mauMau, 
               mauMau.getPlayers(), 
               "abuMauMauController", "icons/person1.png", gameControler, 
               stack, 
               cards,
               labels, 
               cardControlers,
               cardListeners,
               gameControler.getHandlerlist()
               );
            
            String screendumpFile = gui.getSharedSpace().getName() + "CardsDeltScreen" + story.getStoryboardSteps().size() + ".png";
            new ScreenShotRunnable(Display.getDefault(), gui.getShell(), screendumpFile).run();
            story.addImage(screendumpFile);
            
            story.addStep("Theo asks Abu to play 7 hearts.");

            story.add("The CardListener of 7 hearts calls method playToStack() on the card. This moves the card and creates a duty object. ");
            
            if (hearts7 != null)
            {
               Label hearts7Label = hearts7Controler.getLabel();
               Label heartsQueenLabel = heartsQueenControler.getLabel();
               hearts7Label.setLocation(heartsQueenLabel.getLocation().x + 5, heartsQueenLabel.getLocation().x + 5);
               
               hearts7Label.notifyListeners(SWT.MouseUp, null);
               
               ;
               
               story.addObjectDiagramWith(
                  "icons/worker.png", hearts7Controler.getListener(),
                  stack, 
                  hearts7, 
                  mauMau, 
                  mauMau.getPlayers(), 
                  "draw2", mauMau.getDuty()
                  );
            }
            
            story.setStepDoneCounter(story.getStepDoneCounter() + 1);

         }
         return true;
      }      
      
      return false;
   }
   
}
