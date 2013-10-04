package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.PlayerLaneListener;
import org.sdmlib.examples.replication.maumau.creators.PlayerLaneListenerSet;
import org.sdmlib.replication.creators.TaskHandlerSet;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.replication.creators.LaneSet;

public class PlayerLaneListenerPO extends PatternObject<PlayerLaneListenerPO, PlayerLaneListener>
{
   public PlayerLaneListenerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PlayerLaneListenerSet matches = new PlayerLaneListenerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((PlayerLaneListener) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public PlayerLaneListenerPO hasHandlerList(TaskHandlerSet value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(PlayerLaneListener.PROPERTY_HANDLERLIST)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TaskHandlerSet getHandlerList()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((PlayerLaneListener) getCurrentMatch()).getHandlerList();
      }
      return null;
   }
   
   public PlayerLaneListenerPO withHandlerList(TaskHandlerSet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PlayerLaneListener) getCurrentMatch()).setHandlerList(value);
      }
      return this;
   }
   
   public PlayerLaneListenerPO hasSources(LaneSet value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(PlayerLaneListener.PROPERTY_SOURCES)
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
         return ((PlayerLaneListener) getCurrentMatch()).getSources();
      }
      return null;
   }
   
   public PlayerLaneListenerPO withSources(LaneSet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PlayerLaneListener) getCurrentMatch()).setSources(value);
      }
      return this;
   }
   
}

