package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.PlayerLaneManager;
import org.sdmlib.examples.replication.maumau.creators.PlayerLaneListenerSet;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.replication.creators.LaneSet;

public class PlayerLaneListenerPO extends PatternObject<PlayerLaneListenerPO, PlayerLaneManager>
{
   public PlayerLaneListenerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PlayerLaneListenerSet matches = new PlayerLaneListenerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((PlayerLaneManager) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public PlayerLaneListenerPO hasSources(LaneSet value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(PlayerLaneManager.PROPERTY_SOURCES)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public LaneSet getSources()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((PlayerLaneManager) getCurrentMatch()).getSources();
      }
      return null;
   }
   
   public PlayerLaneListenerPO withSources(LaneSet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PlayerLaneManager) getCurrentMatch()).setSources(value);
      }
      return this;
   }
   
}

