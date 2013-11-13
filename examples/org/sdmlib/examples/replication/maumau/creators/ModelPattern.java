package org.sdmlib.examples.replication.maumau.creators;

import org.eclipse.swt.widgets.Label;
import org.sdmlib.examples.replication.maumau.Card;
import org.sdmlib.examples.replication.maumau.CardControler;
import org.sdmlib.examples.replication.maumau.CardListener;
import org.sdmlib.examples.replication.maumau.Duty;
import org.sdmlib.examples.replication.maumau.Holder;
import org.sdmlib.examples.replication.maumau.MauMau;
import org.sdmlib.examples.replication.maumau.MultiMauMauControler;
import org.sdmlib.examples.replication.maumau.Player;
import org.sdmlib.examples.replication.maumau.PlayerLaneManager;
import org.sdmlib.examples.replication.maumau.ReplicationMauMauServer;
import org.sdmlib.examples.replication.maumau.ServerLaneManager;
import org.sdmlib.examples.replication.maumau.Suit;
import org.sdmlib.examples.replication.maumau.Value;
import org.sdmlib.models.pattern.Pattern;
import org.sdmlib.replication.creators.LaneSet;
import org.sdmlib.examples.replication.maumau.creators.MauMauPO;
import org.sdmlib.examples.replication.maumau.creators.CardPO;
import org.sdmlib.examples.replication.maumau.creators.HolderPO;
import org.sdmlib.examples.replication.maumau.creators.PlayerPO;
import org.sdmlib.examples.replication.maumau.creators.DutyPO;
import org.sdmlib.examples.replication.maumau.creators.ReplicationMauMauServerPO;
import org.sdmlib.examples.replication.maumau.creators.ServerLaneManagerPO;
import org.sdmlib.examples.replication.maumau.creators.Play7WorkFlowLaneManagerPO;
import org.sdmlib.examples.replication.maumau.Play7WorkFlowLaneManager;
import org.sdmlib.examples.replication.maumau.creators.PlayerLaneManagerPO;
import org.sdmlib.examples.replication.maumau.creators.MultiMauMauControlerPO;
import org.sdmlib.examples.replication.maumau.creators.CardControlerPO;
import org.sdmlib.examples.replication.maumau.creators.LabelPO;
import org.sdmlib.examples.replication.maumau.creators.SuitPO;
import org.sdmlib.examples.replication.maumau.creators.ValuePO;
import org.sdmlib.examples.replication.maumau.creators.ObjectPO;
import org.sdmlib.examples.replication.maumau.creators.CardListenerPO;

public class ModelPattern extends Pattern
{
   public ModelPattern()
   {
      super(CreatorCreator.createIdMap("hg"));
   }
   
   public ModelPattern startCreate()
   {
      super.startCreate();
      return this;
   }

   public MauMauPO hasElementMauMauPO()
   {
      MauMauPO value = new MauMauPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public MauMauPO hasElementMauMauPO(MauMau hostGraphObject)
   {
      MauMauPO value = new MauMauPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public CardPO hasElementCardPO()
   {
      CardPO value = new CardPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public CardPO hasElementCardPO(Card hostGraphObject)
   {
      CardPO value = new CardPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public HolderPO hasElementHolderPO()
   {
      HolderPO value = new HolderPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public HolderPO hasElementHolderPO(Holder hostGraphObject)
   {
      HolderPO value = new HolderPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public PlayerPO hasElementPlayerPO()
   {
      PlayerPO value = new PlayerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public PlayerPO hasElementPlayerPO(Player hostGraphObject)
   {
      PlayerPO value = new PlayerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public DutyPO hasElementDutyPO()
   {
      DutyPO value = new DutyPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public DutyPO hasElementDutyPO(Duty hostGraphObject)
   {
      DutyPO value = new DutyPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public ReplicationMauMauServerPO hasElementReplicationMauMauServerPO()
   {
      ReplicationMauMauServerPO value = new ReplicationMauMauServerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public ReplicationMauMauServerPO hasElementReplicationMauMauServerPO(ReplicationMauMauServer hostGraphObject)
   {
      ReplicationMauMauServerPO value = new ReplicationMauMauServerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public ServerLaneListenerPO hasElementServerLaneListenerPO()
   {
      ServerLaneListenerPO value = new ServerLaneListenerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public ServerLaneListenerPO hasElementServerLaneListenerPO(ServerLaneManager hostGraphObject)
   {
      ServerLaneListenerPO value = new ServerLaneListenerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public MultiMauMauControlerPO hasElementMultiMauMauControlerPO()
   {
      MultiMauMauControlerPO value = new MultiMauMauControlerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public MultiMauMauControlerPO hasElementMultiMauMauControlerPO(MultiMauMauControler hostGraphObject)
   {
      MultiMauMauControlerPO value = new MultiMauMauControlerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public CardControlerPO hasElementCardControlerPO()
   {
      CardControlerPO value = new CardControlerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public CardControlerPO hasElementCardControlerPO(CardControler hostGraphObject)
   {
      CardControlerPO value = new CardControlerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public PlayerLaneListenerPO hasElementPlayerLaneListenerPO()
   {
      PlayerLaneListenerPO value = new PlayerLaneListenerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public PlayerLaneListenerPO hasElementPlayerLaneListenerPO(PlayerLaneManager hostGraphObject)
   {
      PlayerLaneListenerPO value = new PlayerLaneListenerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public LabelPO hasElementLabelPO()
   {
      LabelPO value = new LabelPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public LabelPO hasElementLabelPO(Label hostGraphObject)
   {
      LabelPO value = new LabelPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public SuitPO hasElementSuitPO()
   {
      SuitPO value = new SuitPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public SuitPO hasElementSuitPO(Suit hostGraphObject)
   {
      SuitPO value = new SuitPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public ValuePO hasElementValuePO()
   {
      ValuePO value = new ValuePO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public ValuePO hasElementValuePO(Value hostGraphObject)
   {
      ValuePO value = new ValuePO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public ObjectPO hasElementObjectPO()
   {
      ObjectPO value = new ObjectPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public ObjectPO hasElementObjectPO(Object hostGraphObject)
   {
      ObjectPO value = new ObjectPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public CardListenerPO hasElementCardListenerPO()
   {
      CardListenerPO value = new CardListenerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public CardListenerPO hasElementCardListenerPO(CardListener hostGraphObject)
   {
      CardListenerPO value = new CardListenerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public LaneSetPO hasElementLaneSetPO()
   {
      LaneSetPO value = new LaneSetPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public LaneSetPO hasElementLaneSetPO(LaneSet hostGraphObject)
   {
      LaneSetPO value = new LaneSetPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public ServerLaneManagerPO hasElementServerLaneManagerPO()
   {
      ServerLaneManagerPO value = new ServerLaneManagerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public ServerLaneManagerPO hasElementServerLaneManagerPO(ServerLaneManager hostGraphObject)
   {
      ServerLaneManagerPO value = new ServerLaneManagerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public Play7WorkFlowLaneManagerPO hasElementPlay7WorkFlowLaneManagerPO()
   {
      Play7WorkFlowLaneManagerPO value = new Play7WorkFlowLaneManagerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public Play7WorkFlowLaneManagerPO hasElementPlay7WorkFlowLaneManagerPO(Play7WorkFlowLaneManager hostGraphObject)
   {
      Play7WorkFlowLaneManagerPO value = new Play7WorkFlowLaneManagerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public PlayerLaneManagerPO hasElementPlayerLaneManagerPO()
   {
      PlayerLaneManagerPO value = new PlayerLaneManagerPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public PlayerLaneManagerPO hasElementPlayerLaneManagerPO(PlayerLaneManager hostGraphObject)
   {
      PlayerLaneManagerPO value = new PlayerLaneManagerPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

}



