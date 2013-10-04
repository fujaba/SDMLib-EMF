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

public class KarliDrawCardsHandler extends TaskHandler
{

   private MauMauClientGui gui = null;

   public KarliDrawCardsHandler withGui(MauMauClientGui gui)
   {
      this.gui = gui;
      return this;
   }

   @Override
   public boolean handle(BoardTask oldTask, BoardTask newTask)
   {
      // file:///C:/Users/zuendorf/eclipseworkspaces/indigo/SDMLibEMF/doc/replicationMauMau.html#step_3
      if (newTask != null && MultiMauMau.KARLI_DRAW_CARDS.equals(newTask.getName()))
      {  
         if (gui.getStoryboard() != null)
         {
            newTask.setName(newTask.getName() + "_done" );

            newTask.removeYou();

            Storyboard story = gui.getStoryboard();

            gui.getSharedSpace().getNewHistoryIdNumber(42);

            story.addStep( "Each player's duty handler creates a label telling that Karli has to draw cards.");

            String screendumpFile = gui.getSharedSpace().getName() + "Draw2LabelCreatedScreen" + story.getStoryboardSteps().size() + ".png";
            new ScreenShotRunnable(Display.getDefault(), gui.getShell(), screendumpFile).run();
            story.addImage(screendumpFile);

            MauMau mauMau = gui.getMauMau();

            Holder deck = mauMau.getDeck();

            Card topCardOnDeck = deck.getCards().getLast();

            MultiMauMauControler gameControler = gui.getGameControler();

            Player karli = gameControler.getActivePlayer();


            // find controllers and labels and listeners for abu's cards and add them to the object diagram
            CardControler topCardOnDeckControler = gameControler.getCardControlers().hasCard(topCardOnDeck);
            Label topCardOnDeckLabel = topCardOnDeckControler.getLabel();

            story.addObjectDiagramWith(
               "icons/worker.png", this,
               "maumau", "icons/shared.png", mauMau,
               mauMau.getDuty(),
               mauMau.getPlayers(), 
               karli.getCards(), 
               "topCardOnDeckControler", "icons/person1.png", topCardOnDeckControler, 
               deck, 
               topCardOnDeck, 
               topCardOnDeckControler.getLabel(),
               topCardOnDeckControler.getListener()
                  );

            story.add("Karli's DrawCardHandler draws a card for Karli");

            topCardOnDeckLabel.setLocation(200, 450);
            topCardOnDeckLabel.notifyListeners(SWT.MouseUp, null);
            
            screendumpFile = gui.getSharedSpace().getName() + "Draw2LabelCreatedScreenAfterOneDraw" + story.getStoryboardSteps().size() + ".png";
            new ScreenShotRunnable(Display.getDefault(), gui.getShell(), screendumpFile).run();
            story.addImage(screendumpFile);
            
            topCardOnDeckControler = gameControler.getCardControlers().hasCard(topCardOnDeck);
            topCardOnDeckLabel = topCardOnDeckControler.getLabel();
            
            story.addObjectDiagramWith(
               "icons/worker.png", this,
               "maumau", "icons/shared.png", mauMau,
               mauMau.getDuty(),
               mauMau.getPlayers(), 
               karli.getCards(), 
               "topCardOnDeckControler", "icons/person1.png", topCardOnDeckControler, 
               deck, 
               topCardOnDeck, 
               topCardOnDeckControler.getLabel(),
               topCardOnDeckControler.getListener()
                  );
            
            story.add("Karli's DrawCardHandler draws a second card.");

            topCardOnDeck = deck.getCards().getLast();
            topCardOnDeckControler = gameControler.getCardControlers().hasCard(topCardOnDeck);
            topCardOnDeckLabel = topCardOnDeckControler.getLabel();
            
            topCardOnDeckLabel.setLocation(200, 450);
            topCardOnDeckLabel.notifyListeners(SWT.MouseUp, null);
            
            screendumpFile = gui.getSharedSpace().getName() + "Draw2LabelCreatedScreenAfterSecondDraw" + story.getStoryboardSteps().size() + ".png";
            new ScreenShotRunnable(Display.getDefault(), gui.getShell(), screendumpFile).run();
            story.addImage(screendumpFile);
            
            story.addObjectDiagramWith(
               "icons/worker.png", this,
               "maumau", "icons/shared.png", mauMau,
               mauMau.getDuty(),
               mauMau.getPlayers(), 
               karli.getCards(), 
               "topCardOnDeckControler", "icons/person1.png", topCardOnDeckControler, 
               deck, 
               topCardOnDeck, 
               topCardOnDeckControler.getLabel(),
               topCardOnDeckControler.getListener()
                  );
            
            

            story.setStepDoneCounter(story.getStepDoneCounter() + 1);

         }
         return true;
      }      

      return false;
   }

}
