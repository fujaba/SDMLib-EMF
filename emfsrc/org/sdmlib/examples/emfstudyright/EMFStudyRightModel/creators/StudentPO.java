package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.models.pattern.PatternLink;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.UniversityPO;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;
import org.sdmlib.models.pattern.AttributeConstraint;

public class StudentPO extends PatternObject<StudentPO, Student>
{
   public StudentSet allMatches()
   {
      this.setDoAllMatches(true);
      
      StudentSet matches = new StudentSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Student) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
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

   public StudentPO hasUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_UNI);
   }

   public StudentPO createUni(UniversityPO tgt)
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

   public StudentPO hasFriends(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_FRIENDS);
   }

   public StudentPO createFriends(StudentPO tgt)
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

   public StudentPO hasIn(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_IN);
   }

   public StudentPO createIn(RoomPO tgt)
   {
      return this.startCreate().hasIn(tgt).endCreate();
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

   public StudentPO hasDone(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_DONE);
   }

   public StudentPO createDone(AssignmentPO tgt)
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

   public Room getIn()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) this.getCurrentMatch()).getIn();
      }
      return null;
   }

   public StudentPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO hasName(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public StudentPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Student) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public StudentPO hasStudId(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_STUDID)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO hasStudId(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_STUDID)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO createStudId(String value)
   {
      this.startCreate().hasStudId(value).endCreate();
      return this;
   }
   
   public String getStudId()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) getCurrentMatch()).getStudId();
      }
      return null;
   }
   
   public StudentPO withStudId(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Student) getCurrentMatch()).setStudId(value);
      }
      return this;
   }
   
   public StudentPO hasCredits(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO hasCredits(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO createCredits(int value)
   {
      this.startCreate().hasCredits(value).endCreate();
      return this;
   }
   
   public int getCredits()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) getCurrentMatch()).getCredits();
      }
      return 0;
   }
   
   public StudentPO withCredits(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Student) getCurrentMatch()).setCredits(value);
      }
      return this;
   }
   
   public StudentPO hasMotivation(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_MOTIVATION)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO hasMotivation(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_MOTIVATION)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO createMotivation(int value)
   {
      this.startCreate().hasMotivation(value).endCreate();
      return this;
   }
   
   public int getMotivation()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) getCurrentMatch()).getMotivation();
      }
      return 0;
   }
   
   public StudentPO withMotivation(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Student) getCurrentMatch()).setMotivation(value);
      }
      return this;
   }
   
   public StudentPO hasAssignmentPoints(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO hasAssignmentPoints(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Student.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentPO createAssignmentPoints(int value)
   {
      this.startCreate().hasAssignmentPoints(value).endCreate();
      return this;
   }
   
   public int getAssignmentPoints()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) getCurrentMatch()).getAssignmentPoints();
      }
      return 0;
   }
   
   public StudentPO withAssignmentPoints(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Student) getCurrentMatch()).setAssignmentPoints(value);
      }
      return this;
   }
   
}





