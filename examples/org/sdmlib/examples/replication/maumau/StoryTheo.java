package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.junit.Assert;
import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.examples.replication.maumau.creators.LabelSet;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.ReplicationChannel;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.replication.TaskHandler;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.swt.ScreenShotRunnable;

public class StoryTheo extends TaskHandler implements PropertyChangeListener, Runnable
{
   /**
    * @param sharedSpaceMauMauStoryboards
    */
   private Storyboard storyboard;

   private SharedSpace gameSpace;

   public StoryTheo withGameSpace(SharedSpace gameSpace)
   {
      this.gameSpace = gameSpace;

      this.channel = this.gameSpace.getChannels().first();

      return this;
   }

   private ReplicationChannel channel;

   private int stepHandled = 0;


   private String actionKey = "";

   @Override
   public void run()
   {
      boolean oldState = gameSpace.isApplyingChangeMsg();
      gameSpace.setApplyingChangeMsg(false);
      try
      { 
         // main event routine
         switch (actionKey)
         {
         // =========================================================================================================
         case "stepDoneCounter_3":
         {
            // server is ready. Start first client
            storyboard.addStep("Abu, starts a maumau client. On init, the client creates shared objects and it connects to the server." );

            startClient("Abu", storyboard);

         }
         break;


         // =========================================================================================================
         case "stepDoneCounter_4":
         {
            storyboard.addStep("Karli, starts a maumau client. ");

            startClient("Karli", storyboard);
         }
         break;


         // =========================================================================================================
         case "stepDoneCounter_5":
         {
            storyboard.addStep("Sabine, starts a maumau client. ");

            startClient("Sabine", storyboard);
         }
         break;


         // =========================================================================================================
         case "stepDoneCounter_6":
         {
            storyboard.addStep("Theo signals Karli to click the Start Game button.");
            Lane karliLane = taskFlowBoard.getLanes("KarliLane");
            karliLane.addToTasks(new BoardTask().withName(MultiMauMau.CLICK_START_BUTTON));
         }
         break;


         // =========================================================================================================
         case MultiMauMau.CLICK_START_BUTTON:
         {
            // handle click start button at karli
            taskIsHandled = true;
            Label startGameLabel = gui.getStartGameLabel();

            startGameLabel.notifyListeners(SWT.MouseUp, null);

            if (gui.getStoryboard() != null)
            {
               Storyboard story = gui.getStoryboard();

               gui.getSharedSpace().getNewHistoryIdNumber(5);
               story.setStepCounter(story.getStepCounter() + 1);
               story.addStep( gui.getSharedSpace().getNodeId() + 
                     "'s clickStartButton handler raises a mouseUp event. ");
               story.addObjectDiagram(
                  "icons/worker.png", this, 
                  startGameLabel);
               story.setStepDoneCounter(story.getStepDoneCounter() + 1);
            }
         }
         break;


         // =========================================================================================================
         case "stepDoneCounter_7":
         {
            // ask abu to show card listeners and do a screen dump
            storyboard.addStep("Theo asks Abu to show his card listeners and to do a screen dump.");
            Lane abuLane = taskFlowBoard.getLanes("AbuLane");
            abuLane.addToTasks(new BoardTask().withName(MultiMauMau.CARDS_ARE_DELT_SCREEN_DUMP));
         }
         break;


         // =========================================================================================================
         case MultiMauMau.CARDS_ARE_DELT_SCREEN_DUMP:
         {
            taskIsHandled = true;

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

               story.addStep("Theo asks      arts.");

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
         }
         break;


         // =========================================================================================================
         case "stepDoneCounter_8":
         {
            storyboard.addStep("Theo asks Karli to do a screen dump and to draw cards.");
            Lane karliLane = taskFlowBoard.getLanes("KarliLane");
            karliLane.addToTasks(new BoardTask().withName(MultiMauMau.KARLI_DRAW_CARDS));
         }
         break;


         // =========================================================================================================
         case MultiMauMau.KARLI_DRAW_CARDS:
         {
            taskIsHandled = true;

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
         }
         break;


         // =========================================================================================================
         case "stepDoneCounter_9":
         {
            storyboard.dumpHTML();

            channel.send(SharedSpace.TERMINATE);
         }
         break;

         default:
            break;
         }

      }
      finally
      {
         gameSpace.setApplyingChangeMsg(oldState);
      }
   }



   // =========================================================================================================
   private BoardTask oldTask;
   private BoardTask newTask;
   boolean taskIsHandled;

   @Override
   public boolean handle(BoardTask oldTask, BoardTask newTask)
   {
      if (newTask != null)
      {
         taskIsHandled = false;
         actionKey = newTask.getName();
         this.oldTask = oldTask;
         this.newTask = newTask;

         run();      

         return taskIsHandled;
      }

      return false;
   }


   // =========================================================================================================
   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      int stepDoneCounter = storyboard.getStepDoneCounter();

      if (evt.getPropertyName().equals(Storyboard.PROPERTY_STEPDONECOUNTER)
            && stepDoneCounter > stepHandled)
      {
         stepHandled = stepDoneCounter;

         actionKey = "stepDoneCounter_" + stepDoneCounter;

         run();
      }
   }

   public StoryTheo withStoryboard(Storyboard story)
   {
      this.storyboard = story;
      return this;
   }

   private int debugSocket = 8900;

   private TaskFlowBoard taskFlowBoard;

   private MauMauClientGui gui;

   Process startClient(String name, Storyboard story)
   {
      String abuClientComand = "javaw "
            + "-Xdebug -Xrunjdwp:transport=dt_socket,address=" + (debugSocket++) 
            + ",server=y,suspend=n "
            + "-Dfile.encoding=UTF-8 "
            + "-classpath " + System.getProperty("java.class.path")
            + " org.sdmlib.examples.replication.maumau.MultiMauMauClientGui "
            + name
            ;

      Process child = null;
      try
      {
         final Process localChild = Runtime.getRuntime().exec(abuClientComand);
         child = localChild;

         //         ProcessBuilder processBuilder =  new ProcessBuilder(abuClientComand);
         //         processBuilder.redirectErrorStream(true);
         //         Process child = processBuilder.start();
         InputStream inputStream = child.getInputStream();
         InputStreamReader in = new InputStreamReader(inputStream);
         final BufferedReader buf = new BufferedReader(in);
         String line = null; 
         line = buf.readLine();
         line = line + "\n   " + buf.readLine();
         Assert.assertFalse("Was not able to start abu client correctly.\n" + line, line.startsWith("FATAL"));;
         story.add("<pre>   " + line + "</pre>");

         new Thread() {
            @Override
            public void run()
            {
               while (true)
               {
                  try
                  {
                     String text = buf.readLine();
                     System.out.println(text);
                  }
                  catch (IOException e)
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  }
               }
            }
         }.start();

         new Thread() {
            @Override
            public void run()
            {
               InputStream errorStream = localChild.getErrorStream();

               InputStreamReader in = new InputStreamReader(errorStream);
               BufferedReader errbuf = new BufferedReader(in);

               while (true)
               {
                  try
                  {
                     String text = errbuf.readLine();
                     System.out.println(text);
                  }
                  catch (IOException e)
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  }
               }
            }
         }.start();
      }
      catch (Exception e)
      {
         Assert.fail(e.toString());
      }

      int stopSize = story.getStoryboardSteps().size() + 5;
      synchronized (story)
      {
         while(story.getStoryboardSteps().size() < stopSize)
         {
            try
            {
               story.wait(1000);
               stopSize--;
            }
            catch (InterruptedException e)
            {
               // TODO Auto-generated catch block
               // e.printStackTrace();
            }
         }
      }


      return child;
   }

   public StoryTheo withTaskFlowBoard(TaskFlowBoard taskFlowBoard)
   {
      this.taskFlowBoard = taskFlowBoard;
      return this;
   }

   public TaskHandler withGui(MauMauClientGui gui)
   {
      this.gui = gui;

      this.gameSpace = gui.getSharedSpace();

      return this;
   }

}