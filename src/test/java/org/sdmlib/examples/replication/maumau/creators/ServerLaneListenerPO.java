package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.ServerLaneManager;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.PatternObject;

public class ServerLaneListenerPO extends PatternObject<ServerLaneListenerPO, ServerLaneManager>
{
   public ServerLaneListenerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ServerLaneListenerSet matches = new ServerLaneListenerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ServerLaneManager) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public ServerLaneListenerPO hasSource(Object value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(ServerLaneManager.PROPERTY_SOURCE)
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
         return ((ServerLaneManager) getCurrentMatch()).getSource();
      }
      return null;
   }
   
   public ServerLaneListenerPO withSource(Object value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ServerLaneManager) getCurrentMatch()).setSource(value);
      }
      return this;
   }
   
}

