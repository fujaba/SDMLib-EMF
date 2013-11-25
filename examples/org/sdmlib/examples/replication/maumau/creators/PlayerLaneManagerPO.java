package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.PlayerLaneManager;
import org.sdmlib.examples.replication.maumau.creators.PlayerLaneManagerSet;
import java.lang.Object;
import org.sdmlib.models.pattern.AttributeConstraint;

public class PlayerLaneManagerPO extends PatternObject<PlayerLaneManagerPO, PlayerLaneManager>
{
   public PlayerLaneManagerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PlayerLaneManagerSet matches = new PlayerLaneManagerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((PlayerLaneManager) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public PlayerLaneManagerPO hasSource(Object value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(PlayerLaneManager.PROPERTY_SOURCE)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public Object getSource()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((PlayerLaneManager) getCurrentMatch()).getSource();
      }
      return null;
   }
   
   public PlayerLaneManagerPO withSource(Object value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PlayerLaneManager) getCurrentMatch()).setSource(value);
      }
      return this;
   }
   
}

