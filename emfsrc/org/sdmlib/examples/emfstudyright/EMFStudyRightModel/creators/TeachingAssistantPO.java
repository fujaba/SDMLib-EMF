package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantSet;
import org.sdmlib.models.pattern.PatternLink;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomPO;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantPO;
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

   public TeachingAssistantPO hasRoom(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, TeachingAssistant.PROPERTY_ROOM);
   }

   public TeachingAssistantPO createRoom(RoomPO tgt)
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

   public TeachingAssistantPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO hasName(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
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
   
   public TeachingAssistantPO hasStudId(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_STUDID)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO hasStudId(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_STUDID)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO createStudId(String value)
   {
      this.startCreate().hasStudId(value).endCreate();
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
   
   public TeachingAssistantPO hasCredits(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO hasCredits(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO createCredits(int value)
   {
      this.startCreate().hasCredits(value).endCreate();
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
   
   public TeachingAssistantPO hasMotivation(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_MOTIVATION)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO hasMotivation(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_MOTIVATION)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO createMotivation(int value)
   {
      this.startCreate().hasMotivation(value).endCreate();
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
   
   public TeachingAssistantPO hasAssignmentPoints(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO hasAssignmentPoints(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(TeachingAssistant.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public TeachingAssistantPO createAssignmentPoints(int value)
   {
      this.startCreate().hasAssignmentPoints(value).endCreate();
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

   public TeachingAssistantPO hasUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_UNI);
   }

   public TeachingAssistantPO createUni(UniversityPO tgt)
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

   public TeachingAssistantPO hasIn(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_IN);
   }

   public TeachingAssistantPO createIn(RoomPO tgt)
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

   public TeachingAssistantPO hasFriends(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_FRIENDS);
   }

   public TeachingAssistantPO createFriends(StudentPO tgt)
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

   public TeachingAssistantPO hasDone(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_DONE);
   }

   public TeachingAssistantPO createDone(AssignmentPO tgt)
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



