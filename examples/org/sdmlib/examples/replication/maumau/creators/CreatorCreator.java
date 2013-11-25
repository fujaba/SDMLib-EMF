package org.sdmlib.examples.replication.maumau.creators;

import java.util.LinkedHashSet;
import org.sdmlib.serialization.interfaces.SendableEntityCreator;
import org.sdmlib.serialization.json.JsonIdMap;
import org.sdmlib.serialization.json.SDMLibJsonIdMap;

public class CreatorCreator
{
   public static LinkedHashSet<SendableEntityCreator> creatorSet = null;
   
   public static LinkedHashSet<SendableEntityCreator> getCreatorSet()
   {
      if (creatorSet == null)
      {
         creatorSet = new LinkedHashSet<SendableEntityCreator>();
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.MauMauCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.MauMauPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.CardCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.CardPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.HolderCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.HolderPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.PlayerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.PlayerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.DutyCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.DutyPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ReplicationMauMauServerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ReplicationMauMauServerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ServerLaneListenerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ServerLaneListenerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.MultiMauMauControlerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.MultiMauMauControlerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.CardControlerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.CardControlerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.PlayerLaneListenerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.PlayerLaneListenerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.LabelCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.LabelPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.SuitCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.SuitPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ValueCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ValuePOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ObjectCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ObjectPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.CardListenerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.CardListenerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.LaneSetCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.LaneSetPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ServerLaneManagerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.ServerLaneManagerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.Play7WorkFlowLaneManagerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.Play7WorkFlowLaneManagerPOCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.PlayerLaneManagerCreator());
         creatorSet.add(new org.sdmlib.examples.replication.maumau.creators.PlayerLaneManagerPOCreator());
         creatorSet.addAll(org.sdmlib.models.pattern.creators.CreatorCreator.getCreatorSet());
      }
      
      return creatorSet;
   }

   public static JsonIdMap createIdMap(String sessionID)
   {
      JsonIdMap jsonIdMap = (JsonIdMap) new SDMLibJsonIdMap().withSessionId(sessionID);
      
      jsonIdMap.withCreator(getCreatorSet());

      return jsonIdMap;
   }
}


