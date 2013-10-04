package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;
import org.sdmlib.examples.replication.SWTSharedSpace;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.ReplicationChannel;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.serialization.json.JsonObject;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.storyboards.StoryboardStep;
import org.sdmlib.storyboards.StoryboardWall;
import org.sdmlib.storyboards.creators.StoryboardWallCreator;

public class SharedSpaceMauMauStoryboards
{
   private class StoryTheo implements PropertyChangeListener
   {
      private Storyboard storyboard;
      
      private int stepHandled = 0;

      @Override
      public void propertyChange(PropertyChangeEvent evt)
      {
         int stepDoneCounter = story.getStepDoneCounter();
         
         if (evt.getPropertyName().equals(Storyboard.PROPERTY_STEPDONECOUNTER)
               && stepDoneCounter > stepHandled)
         {
            stepHandled = stepDoneCounter;
            
            boolean oldState = gameSpace.isApplyingChangeMsg();
            gameSpace.setApplyingChangeMsg(false);
            try
            { 
               if (stepDoneCounter == 3)
               {
                  // server is ready. Start first client
                  story.addStep("Abu, starts a maumau client. On init, the client creates shared objects and it connects to the server." );

                  childs.add(startClient("Abu", story));
               } 
               else if (stepDoneCounter == 4)
               {
                  story.addStep("Karli, starts a maumau client. ");

                  childs.add(startClient("Karli", story));
               }
               else if (stepDoneCounter == 5)
               {
                  story.addStep("Sabine, starts a maumau client. ");

                  childs.add(startClient("Sabine", story));
               }
               else if (stepDoneCounter == 6)
               {
                  story.addStep("Theo signals Karli to click the Start Game button.");
                  Lane karliLane = taskFlowBoard.getLanes("KarliLane");
                  karliLane.addToTasks(new BoardTask().withName(MultiMauMau.CLICK_START_BUTTON));
               }
               else if (stepDoneCounter == 7)
               {
                  // ask abu to show card listeners and do a screen dump
                  story.addStep("Theo asks Abu to show his card listeners and to do a screen dump.");
                  Lane abuLane = taskFlowBoard.getLanes("AbuLane");
                  abuLane.addToTasks(new BoardTask().withName(MultiMauMau.CARDS_ARE_DELT_SCREEN_DUMP));
               }
               else if (stepDoneCounter == 8)
               {
                  story.addStep("Theo asks Karli to do a screen dump and to draw cards.");
                  Lane karliLane = taskFlowBoard.getLanes("KarliLane");
                  karliLane.addToTasks(new BoardTask().withName(MultiMauMau.KARLI_DRAW_CARDS));
               }
               else if (stepDoneCounter >= 9)
               {
                  story.dumpHTML();

                  channel.send(SharedSpace.TERMINATE);
               }
            }
            finally
            {
               gameSpace.setApplyingChangeMsg(oldState);
            }

         }
      }

      public StoryTheo withStoryboard(Storyboard story)
      {
         this.storyboard = story;
         return this;
      }

      public Storyboard getStoryboard()
      {
         return storyboard;
      }
   }

   private SharedSpace gameSpace;
   private String nodeId;
   private StoryboardWall storyboardWall;
   private MauMau mauMau;
   private ReplicationChannel channel;
   private Storyboard story;
   private LinkedList<Process> childs = new LinkedList<Process>();


   @Test
   public void testSharedSpaceMauMau()
   {
      story = new Storyboard();

      story.addStep("Abu, Karli, and Sabine want to play some replication maumau.");

      story.addStep("Abu starts a replication maumau server. "
            + "(Actually Theo the tester starts the server and connects to it. "
            + "The current storyboard is shared and storyTheo is added as a listener to the story. "
            + "When other participants add story steps, storyTheo get informed and initiates the next actions.)" );

      JsonIdMap map = org.sdmlib.examples.replication.maumau.creators.CreatorCreator.createIdMap(nodeId);
      map.withCreator(org.sdmlib.replication.creators.CreatorCreator.getCreatorSet());
      map.withCreator(StoryboardWallCreator.createIdMap("x").getCreators());

      ReplicationMauMauServer mauMauServer = new ReplicationMauMauServer().withTestMode(true).start();

      // open a shared space to get access to the taskboard
      nodeId = "Theo";
      gameSpace = new SharedSpace()
      .withSpaceId("game42")
      .withNodeId(nodeId );

      gameSpace.setName("GameSpace" + nodeId);

      channel = gameSpace.createChannels()
            .withConnect("localhost", ReplicationMauMauServer.REPLICATION_SERVER_PORT);
      channel.setName("ReplicationChannel" + nodeId + "Server");
      channel.start();
      
      // connect to shared space
      JsonObject jsonObject = new JsonObject();
      jsonObject.put(SharedSpace.PROPERTY_SPACEID, gameSpace.getSpaceId());

      String line = jsonObject.toString();
      channel.send(line);

      gameSpace.withMap(map);

      gameSpace.waitForCurrentHistoryId();

      storyboardWall = new StoryboardWall();
      map.put(gameSpace.getSpaceId() + "storyboardWall", storyboardWall);
      map.put(gameSpace.getSpaceId() + "storyboard", story);
      storyboardWall.setStoryboard(story);

      mauMau = new MauMau();
      map.put(gameSpace.getSpaceId() + "_root", mauMau);

      taskFlowBoard = new TaskFlowBoard();
      map.put(gameSpace.getSpaceId() + "taskBoard", taskFlowBoard);

      StoryTheo storyTheo = new StoryTheo().withStoryboard(story);
      story.getPropertyChangeSupport().addPropertyChangeListener(storyTheo);

      story.addObjectDiagram(
         "theo", "icons/worker.png", this,
         "taskboard", "icons/shared.png", taskFlowBoard, 
         "storyTheo", "icons/person1.png", storyTheo,
         gameSpace.getSpaceId() + "storyboard", story);


      gameSpace.run();
   }


   private int debugSocket = 8900;
   private TaskFlowBoard taskFlowBoard;

   private Process startClient(String name, Storyboard story)
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


}
