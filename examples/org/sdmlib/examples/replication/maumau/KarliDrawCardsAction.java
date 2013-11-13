package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.Node;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.swt.ScreenShotRunnable;

public class KarliDrawCardsAction implements PropertyChangeListener
{

   private MauMauClientGui gui;

   public KarliDrawCardsAction withGui(MauMauClientGui gui)
   {
      this.gui = gui;

      return this;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getNewValue() != null && "start".equals(evt.getNewValue()))
      {
         boolean oldState = gui.getSharedSpace().isApplyingChangeMsg();

         try
         {
            gui.getSharedSpace().setApplyingChangeMsg(false);

            Storyboard story = gui.getStoryboard();

            // gui.getSharedSpace().getNewHistoryIdNumber(42);

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
               gui.getSharedSpace().getNodeId() + "Node", "icons/node.png", new Node(),
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
               gui.getSharedSpace().getNodeId() + "Node", "icons/node.png", new Node(),
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
               gui.getSharedSpace().getNodeId() + "Node", "icons/node.png", new Node(),
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
            
           
            // story.setStepDoneCounter(story.getStepDoneCounter() + 1);
            BoardTask task = (BoardTask) evt.getSource();
            TaskFlowBoard board = task.getLane().getBoard();
            board.startTask(Play7WorkFlow.PLAY7_WORK_FLOW_LANE, Play7WorkFlow.DUMP_HTML_AND_TERMINATE_TEST);
         }
         finally
         {
            gui.getSharedSpace().setApplyingChangeMsg(oldState);
         }
      }
   }

}
