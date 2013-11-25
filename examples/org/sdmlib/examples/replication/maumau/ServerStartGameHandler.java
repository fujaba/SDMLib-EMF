package org.sdmlib.examples.replication.maumau;

import java.util.Collections;
import java.util.Random;

import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.storyboards.Storyboard;

public class ServerStartGameHandler 
{

   private SharedSpace sharedSpace;

   public ServerStartGameHandler(SharedSpace sharedSpace)
   {
      this.sharedSpace = sharedSpace;
   }

   private boolean done = false;
   
   public boolean handle(BoardTask oldTask, BoardTask newTask)
   {
      if (newTask != null && MultiMauMau.START_GAME.equals(newTask.getName()))
      {
         if (done)
         {
            return true;
         }
         
         done = true;
         
         sharedSpace.getNewHistoryIdNumber(15);
         
         // remove init tasks

         TaskFlowBoard taskFlowBoard = (TaskFlowBoard) sharedSpace.getMap().getObject(sharedSpace.getSpaceId() + "taskBoard");
         taskFlowBoard.getLanes().getTasks().removeYou();
         
         MauMau mauMau = (MauMau) sharedSpace.getMap().getObject(sharedSpace.getSpaceId() + "_root");
         
         // deal the cards and ask the first player to do its turn
         mauMau.createDeck();
         Holder stack = mauMau.createStack();
         
         stack.getPropertyChangeSupport().addPropertyChangeListener(new CardStackListener(stack));
               
         int suitCount = 0;
         for (Suit s : Suit.values())
         {
            for (Value v : Value.values())
            {
               Card card = new Card().withSuit(s).withValue(v);
               mauMau.addToCards(card);
            }
//            suitCount++;
//            if (suitCount >= 2)
//            {
//               break;
//            }
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
               "icons/worker.png", this,
               mauMau
               );
            story.setStepDoneCounter(story.getStepDoneCounter() + 1);
         }
         
         return true;
      }
      
      return false;
   }

}
