package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.TeachingAssistantPO;

public class TeachingAssistantPO extends PatternObject<TeachingAssistantPO, TeachingAssistant>
{

    public TeachingAssistantSet allMatches()
   {
      this.setDoAllMatches(true);
      
      TeachingAssistantSet matches = new TeachingAssistantSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((TeachingAssistant) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public TeachingAssistantPO(){
      newInstance(null);
   }

   public TeachingAssistantPO(TeachingAssistant... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(null, hostGraphObject);
   }
   public TeachingAssistantPO filterNoOfHours(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_NOOFHOURS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO filterNoOfHours(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_NOOFHOURS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO createNoOfHours(int value)
   {
      this.startCreate().filterNoOfHours(value).endCreate();
      return this;
   }
   
   public int getNoOfHours()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistant) getCurrentMatch()).getNoOfHours();
      }
      return 0;
   }
   
   public TeachingAssistantPO withNoOfHours(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistant) getCurrentMatch()).setNoOfHours(value);
      }
      return this;
   }
   
   public TeachingAssistantPO filterName(String value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO filterName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO createName(String value)
   {
      this.startCreate().filterName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistant) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public TeachingAssistantPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistant) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public TeachingAssistantPO filterStudId(String value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_STUDID)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO filterStudId(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_STUDID)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO createStudId(String value)
   {
      this.startCreate().filterStudId(value).endCreate();
      return this;
   }
   
   public String getStudId()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistant) getCurrentMatch()).getStudId();
      }
      return null;
   }
   
   public TeachingAssistantPO withStudId(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistant) getCurrentMatch()).setStudId(value);
      }
      return this;
   }
   
   public TeachingAssistantPO filterCredits(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO filterCredits(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO createCredits(int value)
   {
      this.startCreate().filterCredits(value).endCreate();
      return this;
   }
   
   public int getCredits()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistant) getCurrentMatch()).getCredits();
      }
      return 0;
   }
   
   public TeachingAssistantPO withCredits(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistant) getCurrentMatch()).setCredits(value);
      }
      return this;
   }
   
   public TeachingAssistantPO filterMotivation(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_MOTIVATION)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO filterMotivation(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_MOTIVATION)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO createMotivation(int value)
   {
      this.startCreate().filterMotivation(value).endCreate();
      return this;
   }
   
   public int getMotivation()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistant) getCurrentMatch()).getMotivation();
      }
      return 0;
   }
   
   public TeachingAssistantPO withMotivation(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistant) getCurrentMatch()).setMotivation(value);
      }
      return this;
   }
   
   public TeachingAssistantPO filterAssignmentPoints(int value)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO filterAssignmentPoints(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(TeachingAssistantCreator.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public TeachingAssistantPO createAssignmentPoints(int value)
   {
      this.startCreate().filterAssignmentPoints(value).endCreate();
      return this;
   }
   
   public int getAssignmentPoints()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TeachingAssistant) getCurrentMatch()).getAssignmentPoints();
      }
      return 0;
   }
   
   public TeachingAssistantPO withAssignmentPoints(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((TeachingAssistant) getCurrentMatch()).setAssignmentPoints(value);
      }
      return this;
   }
   
   public RoomPO filterRoom()
   {
      RoomPO result = new RoomPO(new Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(TeachingAssistantCreator.PROPERTY_ROOM, result);
      
      return result;
   }

   public RoomPO createRoom()
   {
      return this.startCreate().filterRoom().endCreate();
   }

   public TeachingAssistantPO filterRoom(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, TeachingAssistantCreator.PROPERTY_ROOM);
   }

   public TeachingAssistantPO createRoom(RoomPO tgt)
   {
      return this.startCreate().filterRoom(tgt).endCreate();
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
