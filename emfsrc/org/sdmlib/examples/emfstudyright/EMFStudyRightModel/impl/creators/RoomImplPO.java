package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.RoomImplSet;
import org.sdmlib.models.pattern.AttributeConstraint;

public class RoomImplPO extends PatternObject<RoomImplPO, RoomImpl>
{
   public RoomImplSet allMatches()
   {
      this.setDoAllMatches(true);
      
      RoomImplSet matches = new RoomImplSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((RoomImpl) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public RoomImplPO hasTopic(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(RoomImpl.PROPERTY_TOPIC)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public String getTopic()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((RoomImpl) getCurrentMatch()).getTopic();
      }
      return null;
   }
   
   public RoomImplPO withTopic(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((RoomImpl) getCurrentMatch()).setTopic(value);
      }
      return this;
   }
   
   public RoomImplPO hasCredits(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(RoomImpl.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public int getCredits()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((RoomImpl) getCurrentMatch()).getCredits();
      }
      return 0;
   }
   
   public RoomImplPO withCredits(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((RoomImpl) getCurrentMatch()).setCredits(value);
      }
      return this;
   }
   
}


