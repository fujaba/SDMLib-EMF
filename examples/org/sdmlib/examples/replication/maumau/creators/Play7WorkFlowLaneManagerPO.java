package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.Play7WorkFlowLaneManager;
import org.sdmlib.examples.replication.maumau.creators.Play7WorkFlowLaneManagerSet;
import java.lang.Object;
import org.sdmlib.models.pattern.AttributeConstraint;

public class Play7WorkFlowLaneManagerPO extends PatternObject<Play7WorkFlowLaneManagerPO, Play7WorkFlowLaneManager>
{
   public Play7WorkFlowLaneManagerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      Play7WorkFlowLaneManagerSet matches = new Play7WorkFlowLaneManagerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Play7WorkFlowLaneManager) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public Play7WorkFlowLaneManagerPO hasSource(Object value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Play7WorkFlowLaneManager.PROPERTY_SOURCE)
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
         return ((Play7WorkFlowLaneManager) getCurrentMatch()).getSource();
      }
      return null;
   }
   
   public Play7WorkFlowLaneManagerPO withSource(Object value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Play7WorkFlowLaneManager) getCurrentMatch()).setSource(value);
      }
      return this;
   }
   
}

