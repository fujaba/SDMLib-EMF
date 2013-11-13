package org.sdmlib.examples.replication.maumau;

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
import org.sdmlib.replication.Node;
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
   public void testPlay7()
   {
      story = new Storyboard();

      story.addStep("Abu, Karli, and Sabine want to play some replication maumau.");

      story.addStep("The testPlay7 starts a game server and connects to it." );

      JsonIdMap map = org.sdmlib.examples.replication.maumau.creators.CreatorCreator.createIdMap(nodeId);
      map.withCreator(org.sdmlib.replication.creators.CreatorCreator.getCreatorSet());
      map.withCreator(StoryboardWallCreator.createIdMap("x").getCreators());

      ReplicationMauMauServer mauMauServer = new ReplicationMauMauServer().withTestMode(true).start();

      // open a shared space to get access to the taskboard
      nodeId = "testPlay7";
      gameSpace = new SharedSpace()
      .withSpaceId("game42")
      .withNodeId(nodeId );

      gameSpace.setName("GameSpace" + nodeId);

      channel = gameSpace.createChannels()
            .withConnect("localhost", ReplicationMauMauServer.REPLICATION_SERVER_PORT);
      channel.setName("ReplicationChannel" + nodeId + "Server");
      channel.start();
      
      // connect to shared space
      channel.sendSpaceConnectionRequest(gameSpace.getSpaceId());
      
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

      Lane play7WorkFlowLane = taskFlowBoard.createLanes(Play7WorkFlow.PLAY7_WORK_FLOW_LANE);
      
      Play7WorkFlowLaneManager play7WorkFlow = new Play7WorkFlowLaneManager()
      .withStoryboard(story)
      .withGameSpace(gameSpace)
      .withTaskFlowBoard(taskFlowBoard)
      .withSource(play7WorkFlowLane);
      
      play7WorkFlowLane.getPropertyChangeSupport().addPropertyChangeListener(play7WorkFlow);
      
      BoardTask startAbuTask = taskFlowBoard.createTask(Play7WorkFlow.PLAY7_WORK_FLOW_LANE, Play7WorkFlow.START_CLIENTS);
      
      story.setStepCounter(3);
      story.addStep("testPlay7 initiates the startClients task");
      story.addObjectDiagram(
         nodeId + "Node", "icons/node.png", new Node(),
         "play7Tester", "icons/worker.png", this,
         "taskboard", "icons/shared.png", taskFlowBoard, 
         Play7WorkFlow.PLAY7_WORK_FLOW_LANE, "icons/person1.png", play7WorkFlow);

      startAbuTask.setStatus(BoardTask.START);
      
      gameSpace.run();
   }


   private TaskFlowBoard taskFlowBoard;


}
