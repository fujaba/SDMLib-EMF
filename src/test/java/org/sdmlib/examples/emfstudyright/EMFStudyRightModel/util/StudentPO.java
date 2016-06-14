package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversityPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;

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


   public StudentPO(){
      newInstance(null);
   }

   public StudentPO(Student... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(null, hostGraphObject);
   }
   public StudentPO filterName(String value)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO filterName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO createName(String value)
   {
      this.startCreate().filterName(value).endCreate();
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
   
   public StudentPO filterStudId(String value)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_STUDID)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO filterStudId(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_STUDID)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO createStudId(String value)
   {
      this.startCreate().filterStudId(value).endCreate();
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
   
   public StudentPO filterCredits(int value)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO filterCredits(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO createCredits(int value)
   {
      this.startCreate().filterCredits(value).endCreate();
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
   
   public StudentPO filterMotivation(int value)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_MOTIVATION)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO filterMotivation(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_MOTIVATION)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO createMotivation(int value)
   {
      this.startCreate().filterMotivation(value).endCreate();
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
   
   public StudentPO filterAssignmentPoints(int value)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO filterAssignmentPoints(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(StudentCreator.PROPERTY_ASSIGNMENTPOINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public StudentPO createAssignmentPoints(int value)
   {
      this.startCreate().filterAssignmentPoints(value).endCreate();
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
   
   public UniversityPO filterUni()
   {
      UniversityPO result = new UniversityPO(new University[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(StudentCreator.PROPERTY_UNI, result);
      
      return result;
   }

   public UniversityPO createUni()
   {
      return this.startCreate().filterUni().endCreate();
   }

   public StudentPO filterUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, StudentCreator.PROPERTY_UNI);
   }

   public StudentPO createUni(UniversityPO tgt)
   {
      return this.startCreate().filterUni(tgt).endCreate();
   }

   public University getUni()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) this.getCurrentMatch()).getUni();
      }
      return null;
   }

   public RoomPO filterIn()
   {
      RoomPO result = new RoomPO(new Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(StudentCreator.PROPERTY_IN, result);
      
      return result;
   }

   public RoomPO createIn()
   {
      return this.startCreate().filterIn().endCreate();
   }

   public StudentPO filterIn(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, StudentCreator.PROPERTY_IN);
   }

   public StudentPO createIn(RoomPO tgt)
   {
      return this.startCreate().filterIn(tgt).endCreate();
   }

   public Room getIn()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Student) this.getCurrentMatch()).getIn();
      }
      return null;
   }

   public StudentPO filterFriendsRev()
   {
      StudentPO result = new StudentPO(new Student[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(StudentCreator.PROPERTY_FRIENDSREV, result);
      
      return result;
   }

   public StudentPO createFriendsRev()
   {
      return this.startCreate().filterFriendsRev().endCreate();
   }

   public StudentPO filterFriendsRev(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, StudentCreator.PROPERTY_FRIENDSREV);
   }

   public StudentPO createFriendsRev(StudentPO tgt)
   {
      return this.startCreate().filterFriendsRev(tgt).endCreate();
   }

   public StudentSet getFriendsRev()
   {
      if (this.getPattern().getHasMatch())
      {
         return new StudentSet(((Student) this.getCurrentMatch()).getFriendsRev());
      }
      return null;
   }

   public StudentPO filterFriends()
   {
      StudentPO result = new StudentPO(new Student[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(StudentCreator.PROPERTY_FRIENDS, result);
      
      return result;
   }

   public StudentPO createFriends()
   {
      return this.startCreate().filterFriends().endCreate();
   }

   public StudentPO filterFriends(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, StudentCreator.PROPERTY_FRIENDS);
   }

   public StudentPO createFriends(StudentPO tgt)
   {
      return this.startCreate().filterFriends(tgt).endCreate();
   }

   public StudentSet getFriends()
   {
      if (this.getPattern().getHasMatch())
      {
         return new StudentSet(((Student) this.getCurrentMatch()).getFriends());
      }
      return null;
   }

   public AssignmentPO filterDone()
   {
      AssignmentPO result = new AssignmentPO(new Assignment[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(StudentCreator.PROPERTY_DONE, result);
      
      return result;
   }

   public AssignmentPO createDone()
   {
      return this.startCreate().filterDone().endCreate();
   }

   public StudentPO filterDone(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, StudentCreator.PROPERTY_DONE);
   }

   public StudentPO createDone(AssignmentPO tgt)
   {
      return this.startCreate().filterDone(tgt).endCreate();
   }

   public AssignmentSet getDone()
   {
      if (this.getPattern().getHasMatch())
      {
         return new AssignmentSet(((Student) this.getCurrentMatch()).getDone());
      }
      return null;
   }

}
