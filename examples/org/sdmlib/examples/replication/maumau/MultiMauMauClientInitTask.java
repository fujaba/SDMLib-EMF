package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

import org.sdmlib.examples.replication.ChatRoot;
import org.sdmlib.examples.replication.SWTSharedSpace;
import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.replication.ChangeHistory;
import org.sdmlib.replication.Lane;
import org.sdmlib.replication.ReplicationChannel;
import org.sdmlib.replication.ReplicationServer;
import org.sdmlib.replication.SharedModelRoot;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.replication.TaskFlowBoard;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.serialization.json.JsonObject;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.storyboards.StoryboardWall;
import org.sdmlib.storyboards.creators.StoryboardWallCreator;


public class MultiMauMauClientInitTask implements Runnable
{

   private MauMauClientGui gui;
   private String[] args;
   private MultiMauMauControler gameControler;
   private String nodeId;
   private MauMau mauMau;
   private PlayerLaneListener laneListener;
   private SharedSpace gameSpace;
   private StoryboardWall storyboardWall;

   public MultiMauMauClientInitTask(MauMauClientGui gui, String[] args)
   {
      this.gui = gui;
      this.args = args;
   }

   @Override
   public void run()
   {
      nodeId = args[0];

      gameSpace = new SWTSharedSpace()
      .withSpaceId("game42")
      .withNodeId(nodeId);

      gameSpace.setName("GameSpace" + nodeId);

      ReplicationChannel channel = gameSpace.createChannels()
            .withConnect("localhost", ReplicationMauMauServer.REPLICATION_SERVER_PORT);
      channel.setName("ReplicationChannel" + nodeId + "Server");
      channel.start();

      // connect to shared space
      JsonObject jsonObject = new JsonObject();
      jsonObject.put(SharedSpace.PROPERTY_SPACEID, gameSpace.getSpaceId());

      String line = jsonObject.toString();
      channel.send(line);

      // set up history
      ChangeHistory history = new ChangeHistory();
      gameSpace.setHistory(history);

      // create initial maumau model
      JsonIdMap map = org.sdmlib.examples.replication.maumau.creators.CreatorCreator.createIdMap(nodeId);
      map.withCreator(org.sdmlib.replication.creators.CreatorCreator.getCreatorSet());
      map.withCreator(StoryboardWallCreator.createIdMap("x").getCreators());
      gameSpace.withMap(map);
      
      gui.withSharedSpace(gameSpace);
      
      gameSpace.waitForCurrentHistoryId();

      storyboardWall = new StoryboardWall();
      map.put(gameSpace.getSpaceId() + "storyboardWall", storyboardWall);
      
      Storyboard storyboard = new Storyboard("examples", nodeId + "MultiMauMauClientInitTaskRun");
      map.put(gameSpace.getSpaceId() + "storyboard", storyboard);
      
      storyboardWall.withStoryboard(storyboard);
      
      // store storyboard in gui to provide access for all subsequent actors
      gui.withStoryboard(storyboard);

      mauMau = new MauMau();
      map.put(gameSpace.getSpaceId() + "_root", mauMau);

      gameControler = new MultiMauMauControler(mauMau, gui, gameSpace).init();
      mauMau.getPropertyChangeSupport().addPropertyChangeListener(gameControler);

      gui.withMauMau(mauMau);
      gui.withMauMauControler(gameControler);
      
      Player me = new Player();
      me.withName(nodeId);
      System.out.println("Player name: " + me.getName());
      gameControler.setActivePlayer(me);
      mauMau.withPlayers(me);
      
      // create task board 
      TaskFlowBoard taskFlowBoard = new TaskFlowBoard();
      map.put(gameSpace.getSpaceId() + "taskBoard", taskFlowBoard);
      
      Lane myLane = new Lane().withName(nodeId + "Lane");
      taskFlowBoard.addToLanes(myLane);
      
      PlayerLaneListener laneListener = new PlayerLaneListener().init(gui, myLane);
      myLane.getPropertyChangeSupport().addPropertyChangeListener(laneListener);
      laneListener.getSources().add(myLane);
      
      storyboard.add("MultiMauMauClientInitTask creates root objects in shared space and adds listeners");
      storyboard.addObjectDiagram(
         nodeId + "Init", "icons/worker.png", this,
         "taskboard", "icons/shared.png", taskFlowBoard, 
         nodeId + "LaneListener", "icons/person1.png", laneListener,
         nodeId + "StartGameHandler", laneListener.getHandlerList().getFirst(),
         "maumau", "icons/shared.png", mauMau, 
         nodeId, me,
         "abuMauMauController", "icons/person1.png", gameControler
         );
   }
}
