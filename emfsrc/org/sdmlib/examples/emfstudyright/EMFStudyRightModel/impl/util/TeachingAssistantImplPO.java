package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.TeachingAssistantImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class TeachingAssistantImplPO extends PatternObject<TeachingAssistantImplPO, TeachingAssistantImpl>
{

    public TeachingAssistantImplSet allMatches()
   {
      this.setDoAllMatches(true);
      
      TeachingAssistantImplSet matches = new TeachingAssistantImplSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((TeachingAssistantImpl) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public TeachingAssistantImplPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public TeachingAssistantImplPO(TeachingAssistantImpl... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public TeachingAssistantImplPO hasNoOfHours(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_NOOFHOURS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO hasNoOfHours(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_NOOFHOURS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO createNoOfHours(int value)
   {
      this.startCreate().hasNoOfHours(value).endCreate();
      return this;
   }
   
   public int getNoOfHours()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistantImpl) getCurrentMatch()).getNoOfHours();
      }
      return 0;
   }
   
   public TeachingAssistantImplPO withNoOfHours(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistantImpl) getCurrentMatch()).setNoOfHours(value);
      }
      return this;
   }
   
   public TeachingAssistantImplPO hasName(String value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO hasName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistantImpl) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public TeachingAssistantImplPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistantImpl) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public TeachingAssistantImplPO hasStudId(String value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_STUDID)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO hasStudId(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_STUDID)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO createStudId(String value)
   {
      this.startCreate().hasStudId(value).endCreate();
      return this;
   }
   
   public String getStudId()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistantImpl) getCurrentMatch()).getStudId();
      }
      return null;
   }
   
   public TeachingAssistantImplPO withStudId(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistantImpl) getCurrentMatch()).setStudId(value);
      }
      return this;
   }
   
   public TeachingAssistantImplPO hasCredits(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO hasCredits(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO createCredits(int value)
   {
      this.startCreate().hasCredits(value).endCreate();
      return this;
   }
   
   public int getCredits()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistantImpl) getCurrentMatch()).getCredits();
      }
      return 0;
   }
   
   public TeachingAssistantImplPO withCredits(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistantImpl) getCurrentMatch()).setCredits(value);
      }
      return this;
   }
   
   public TeachingAssistantImplPO hasMotivation(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_MOTIVATION)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO hasMotivation(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_MOTIVATION)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO createMotivation(int value)
   {
      this.startCreate().hasMotivation(value).endCreate();
      return this;
   }
   
   public int getMotivation()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistantImpl) getCurrentMatch()).getMotivation();
      }
      return 0;
   }
   
   public TeachingAssistantImplPO withMotivation(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistantImpl) getCurrentMatch()).setMotivation(value);
      }
      return this;
   }
   
   public TeachingAssistantImplPO hasAssignmentPoints(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO hasAssignmentPoints(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantImpl.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantImplPO createAssignmentPoints(int value)
   {
      this.startCreate().hasAssignmentPoints(value).endCreate();
      return this;
   }
   
   public int getAssignmentPoints()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistantImpl) getCurrentMatch()).getAssignmentPoints();
      }
      return 0;
   }
   
   public TeachingAssistantImplPO withAssignmentPoints(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistantImpl) getCurrentMatch()).setAssignmentPoints(value);
      }
      return this;
   }
   
   public RoomPO hasRoom()
   {
      RoomPO result = new RoomPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(TeachingAssistant.PROPERTY_ROOM, result);
      
      return result;
   }

   public RoomPO createRoom()
   {
      return this.startCreate().hasRoom().endCreate();
   }

   public TeachingAssistantImplPO hasRoom(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, TeachingAssistant.PROPERTY_ROOM);
   }

   public TeachingAssistantImplPO createRoom(RoomPO tgt)
   {
      return this.startCreate().hasRoom(tgt).endCreate();
   }

   public Room getRoom()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistant) this.getCurrentMatch()).getRoom();
      }
      return null;
   }

}
