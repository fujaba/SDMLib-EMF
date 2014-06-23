package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversityPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.StudentImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;

public class StudentImplPO extends PatternObject<StudentImplPO, StudentImpl>
{

    public StudentImplSet allMatches()
   {
      this.setDoAllMatches(true);
      
      StudentImplSet matches = new StudentImplSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((StudentImpl) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public StudentImplPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public StudentImplPO(StudentImpl... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public StudentImplPO hasName(String value)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO hasName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public StudentImplPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public StudentImplPO hasStudId(String value)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_STUDID)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO hasStudId(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_STUDID)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO createStudId(String value)
   {
      this.startCreate().hasStudId(value).endCreate();
      return this;
   }
   
   public String getStudId()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getStudId();
      }
      return null;
   }
   
   public StudentImplPO withStudId(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setStudId(value);
      }
      return this;
   }
   
   public StudentImplPO hasCredits(int value)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO hasCredits(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO createCredits(int value)
   {
      this.startCreate().hasCredits(value).endCreate();
      return this;
   }
   
   public int getCredits()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getCredits();
      }
      return 0;
   }
   
   public StudentImplPO withCredits(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setCredits(value);
      }
      return this;
   }
   
   public StudentImplPO hasMotivation(int value)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_MOTIVATION)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO hasMotivation(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_MOTIVATION)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO createMotivation(int value)
   {
      this.startCreate().hasMotivation(value).endCreate();
      return this;
   }
   
   public int getMotivation()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getMotivation();
      }
      return 0;
   }
   
   public StudentImplPO withMotivation(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setMotivation(value);
      }
      return this;
   }
   
   public StudentImplPO hasAssignmentPoints(int value)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO hasAssignmentPoints(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public StudentImplPO createAssignmentPoints(int value)
   {
      this.startCreate().hasAssignmentPoints(value).endCreate();
      return this;
   }
   
   public int getAssignmentPoints()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getAssignmentPoints();
      }
      return 0;
   }
   
   public StudentImplPO withAssignmentPoints(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setAssignmentPoints(value);
      }
      return this;
   }
   
   public UniversityPO hasUni()
   {
      UniversityPO result = new UniversityPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Student.PROPERTY_UNI, result);
      
      return result;
   }

   public UniversityPO createUni()
   {
      return this.startCreate().hasUni().endCreate();
   }

   public StudentImplPO hasUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_UNI);
   }

   public StudentImplPO createUni(UniversityPO tgt)
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
      RoomPO result = new RoomPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Student.PROPERTY_IN, result);
      
      return result;
   }

   public RoomPO createIn()
   {
      return this.startCreate().hasIn().endCreate();
   }

   public StudentImplPO hasIn(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_IN);
   }

   public StudentImplPO createIn(RoomPO tgt)
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
      StudentPO result = new StudentPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Student.PROPERTY_FRIENDS, result);
      
      return result;
   }

   public StudentPO createFriends()
   {
      return this.startCreate().hasFriends().endCreate();
   }

   public StudentImplPO hasFriends(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_FRIENDS);
   }

   public StudentImplPO createFriends(StudentPO tgt)
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
      AssignmentPO result = new AssignmentPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Student.PROPERTY_DONE, result);
      
      return result;
   }

   public AssignmentPO createDone()
   {
      return this.startCreate().hasDone().endCreate();
   }

   public StudentImplPO hasDone(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, Student.PROPERTY_DONE);
   }

   public StudentImplPO createDone(AssignmentPO tgt)
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
