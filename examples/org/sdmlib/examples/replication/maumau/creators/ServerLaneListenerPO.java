package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.ServerLaneListener;
import org.sdmlib.examples.replication.maumau.creators.ServerLaneListenerSet;
import java.lang.Object;
import org.sdmlib.models.pattern.AttributeConstraint;

public class ServerLaneListenerPO extends PatternObject<ServerLaneListenerPO, ServerLaneListener>
{
   public ServerLaneListenerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ServerLaneListenerSet matches = new ServerLaneListenerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ServerLaneListener) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public ServerLaneListenerPO hasSource(Object value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(ServerLaneListener.PROPERTY_SOURCE)
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
         return ((ServerLaneListener) getCurrentMatch()).getSource();
      }
      return null;
   }
   
   public ServerLaneListenerPO withSource(Object value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ServerLaneListener) getCurrentMatch()).setSource(value);
      }
      return this;
   }
   
}

