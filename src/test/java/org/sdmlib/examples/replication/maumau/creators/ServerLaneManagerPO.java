package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.ServerLaneManager;
import org.sdmlib.examples.replication.maumau.creators.ServerLaneManagerSet;
import java.lang.Object;
import org.sdmlib.models.pattern.AttributeConstraint;

public class ServerLaneManagerPO extends PatternObject<ServerLaneManagerPO, ServerLaneManager>
{
   public ServerLaneManagerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ServerLaneManagerSet matches = new ServerLaneManagerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ServerLaneManager) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public ServerLaneManagerPO hasSource(Object value)
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
   
   public ServerLaneManagerPO withSource(Object value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ServerLaneManager) getCurrentMatch()).setSource(value);
      }
      return this;
   }
   
}

