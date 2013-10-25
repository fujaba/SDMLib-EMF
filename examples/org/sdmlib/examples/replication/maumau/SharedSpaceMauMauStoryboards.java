package org.sdmlib.examples.replication.maumau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;
import org.sdmlib.examples.replication.SWTSharedSpace;
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
   private SharedSpace gameSpace;
   private String nodeId;
   private StoryboardWall storyboardWall;
   private MauMau mauMau;
   private ReplicationChannel channel;
   private Storyboard story;


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

      StoryTheo storyTheo = new StoryTheo()
      .withStoryboard(story)
      .withGameSpace(gameSpace)
      .withTaskFlowBoard(taskFlowBoard);
      
      story.getPropertyChangeSupport().addPropertyChangeListener(storyTheo);

      story.addObjectDiagram(
         "theo", "icons/worker.png", this,
         "taskboard", "icons/shared.png", taskFlowBoard, 
         "storyTheo", "icons/person1.png", storyTheo,
         gameSpace.getSpaceId() + "storyboard", story);


      gameSpace.run();
   }


   private TaskFlowBoard taskFlowBoard;


}
