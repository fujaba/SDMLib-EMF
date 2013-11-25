package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collections;
import java.util.Random;

import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.Node;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.replication.creators.LanePO;
import org.sdmlib.replication.creators.ModelPattern;
import org.sdmlib.storyboards.Storyboard;

public class StartGameAction implements PropertyChangeListener
{

   private SharedSpace sharedSpace;
   private boolean done = false;
   
   public StartGameAction withSharedSpace(SharedSpace sharedSpace)
   {
      this.sharedSpace = sharedSpace;
      return this;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getNewValue() != null && "start".equals(evt.getNewValue()))
      {
         boolean oldState = sharedSpace.isApplyingChangeMsg();

         try
         {
            sharedSpace.setApplyingChangeMsg(false);
            
            if (done )
            {
               return;
            }
            
            done = true;
            
            // sharedSpace.getNewHistoryIdNumber(15);
            
            BoardTask task = (BoardTask) evt.getSource();
            Lane lane = task.getLane();
            TaskFlowBoard taskFlowBoard = lane.getBoard();
            
            MauMau mauMau = (MauMau) sharedSpace.getMap().getObject(sharedSpace.getSpaceId() + "_root");
            
            // deal the cards and ask the first player to do its turn
            mauMau.createDeck();
            Holder stack = mauMau.createStack();
            
            stack.getPropertyChangeSupport().addPropertyChangeListener(new CardStackListener(stack));
                  
            for (Suit s : Suit.values())
            {
               for (Value v : Value.values())
               {
                  Card card = new Card().withSuit(s).withValue(v);
                  mauMau.addToCards(card);
               }
            }
            
            // deal cards
            Player[] players = mauMau.getPlayers().toArray(new Player[] {});
            
            int i = 0;
            int p = 0;

            CardSet cards = new CardSet();
            cards.addAll(mauMau.getCards());
            
            Random random = new Random();
            
            Storyboard story = (Storyboard) sharedSpace.getMap().getObject(sharedSpace.getSpaceId() + "storyboard");
            
            if (story != null)
            {
               random.setSeed(47);
            }
            
            Collections.shuffle(cards, random);
            
            for (Card c : cards)
            {
               if (p < players.length)
               {
                  players[p].addToCards(c);
                  
                  i++;
                  
                  if ( ! (i < 5))
                  {
                     i = 0;
                     p++;
                  }
               }
               else if (p == players.length)
               {
                  // put one card on the stack
                  mauMau.getStack().addToCards(c);
                  p++;
               }
               else
               { 
                  // all other cards put on the deck
                  mauMau.getDeck().addToCards(c);
               }
            }
            
            // connect players
            for (int j = 0; j < players.length; j++)
            {
               int next = (j + 1) % players.length;
               
               players[j].setNext(players[next]);
            }
            
            mauMau.setCurrentMove(players[0]);
            
            if (story != null)
            {
               // story.setStepCounter(story.getStepCounter() + 1);
               story.addStep("ServerStartGame handler deals the cards. ");
               story.addObjectDiagram(
                  sharedSpace.getNodeId() + "Node", "icons/node.png", new Node(),
                  "icons/worker.png", this,
                  mauMau
                  );
               // story.setStepDoneCounter(story.getStepDoneCounter() + 1);
            }
            
            // tell players to remove StartGameButton
            ModelPattern modelPattern = new ModelPattern();
            LanePO myLane = modelPattern.hasElementLanePO(lane);
            LanePO otherLane = myLane.hasBoard().hasLanes().hasMatchOtherThen(myLane).startCreate();
            modelPattern.hasElementBoardTaskPO().hasName(MultiMauMau.HIDE_START_GAME_BUTTON).hasLane(otherLane).hasStatus(BoardTask.START).allMatches();
         }
         finally
         {
            sharedSpace.setApplyingChangeMsg(oldState);
         }
      }
   }

}
