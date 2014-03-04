package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.TeachingAssistantImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.TeachingAssistantImplSet;
import org.sdmlib.models.pattern.PatternLink;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.TeachingAssistantImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.UniversityPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;

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
   
   public RoomPO hasRoom()
   {
      RoomPO result = new RoomPO();
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

   public TeachingAssistantImplPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
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
   
   public UniversityPO hasUni()
   {
      UniversityPO result = new UniversityPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Student.PROPERTY_UNI, result);
      
      return result;
   }

   public UniversityPO createUni()
   {
      return this.startCreate().hasUni().endCreate();
   }

   public TeachingAssistantImplPO hasUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_UNI);
   }

   public TeachingAssistantImplPO createUni(UniversityPO tgt)
   {
      return this.startCreate().hasUni(tgt).endCreate();
   }

   public University getUni()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) this.getCurrentMatch()).getUni();
      }
      return null;
   }

   public RoomPO hasIn()
   {
      RoomPO result = new RoomPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Student.PROPERTY_IN, result);
      
      return result;
   }

   public RoomPO createIn()
   {
      return this.startCreate().hasIn().endCreate();
   }

   public TeachingAssistantImplPO hasIn(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_IN);
   }

   public TeachingAssistantImplPO createIn(RoomPO tgt)
   {
      return this.startCreate().hasIn(tgt).endCreate();
   }

   public Room getIn()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) this.getCurrentMatch()).getIn();
      }
      return null;
   }

   public StudentPO hasFriends()
   {
      StudentPO result = new StudentPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Student.PROPERTY_FRIENDS, result);
      
      return result;
   }

   public StudentPO createFriends()
   {
      return this.startCreate().hasFriends().endCreate();
   }

   public TeachingAssistantImplPO hasFriends(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_FRIENDS);
   }

   public TeachingAssistantImplPO createFriends(StudentPO tgt)
   {
      return this.startCreate().hasFriends(tgt).endCreate();
   }

   public StudentSet getFriends()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) this.getCurrentMatch()).getFriendsSet();
      }
      return null;
   }

   public AssignmentPO hasDone()
   {
      AssignmentPO result = new AssignmentPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Student.PROPERTY_DONE, result);
      
      return result;
   }

   public AssignmentPO createDone()
   {
      return this.startCreate().hasDone().endCreate();
   }

   public TeachingAssistantImplPO hasDone(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_DONE);
   }

   public TeachingAssistantImplPO createDone(AssignmentPO tgt)
   {
      return this.startCreate().hasDone(tgt).endCreate();
   }

   public AssignmentSet getDone()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) this.getCurrentMatch()).getDoneSet();
      }
      return null;
   }

}



