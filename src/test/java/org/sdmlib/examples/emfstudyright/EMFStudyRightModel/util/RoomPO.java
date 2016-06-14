package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversityPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.TeachingAssistantPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.TeachingAssistantSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;

public class RoomPO extends PatternObject<RoomPO, Room>
{

    public RoomSet allMatches()
   {
      this.setDoAllMatches(true);
      
      RoomSet matches = new RoomSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Room) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public RoomPO(){
      newInstance(null);
   }

   public RoomPO(Room... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(null, hostGraphObject);
   }
   public RoomPO filterTopic(String value)
   {
      new AttributeConstraint()
      .withAttrName(RoomCreator.PROPERTY_TOPIC)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public RoomPO filterTopic(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(RoomCreator.PROPERTY_TOPIC)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public RoomPO createTopic(String value)
   {
      this.startCreate().filterTopic(value).endCreate();
      return this;
   }
   
   public String getTopic()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) getCurrentMatch()).getTopic();
      }
      return null;
   }
   
   public RoomPO withTopic(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Room) getCurrentMatch()).setTopic(value);
      }
      return this;
   }
   
   public RoomPO filterCredits(int value)
   {
      new AttributeConstraint()
      .withAttrName(RoomCreator.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public RoomPO filterCredits(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(RoomCreator.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public RoomPO createCredits(int value)
   {
      this.startCreate().filterCredits(value).endCreate();
      return this;
   }
   
   public int getCredits()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) getCurrentMatch()).getCredits();
      }
      return 0;
   }
   
   public RoomPO withCredits(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Room) getCurrentMatch()).setCredits(value);
      }
      return this;
   }
   
   public UniversityPO filterUni()
   {
      UniversityPO result = new UniversityPO(new University[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(RoomCreator.PROPERTY_UNI, result);
      
      return result;
   }

   public UniversityPO createUni()
   {
      return this.startCreate().filterUni().endCreate();
   }

   public RoomPO filterUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, RoomCreator.PROPERTY_UNI);
   }

   public RoomPO createUni(UniversityPO tgt)
   {
      return this.startCreate().filterUni(tgt).endCreate();
   }

   public University getUni()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) this.getCurrentMatch()).getUni();
      }
      return null;
   }

   public StudentPO filterStudents()
   {
      StudentPO result = new StudentPO(new Student[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(RoomCreator.PROPERTY_STUDENTS, result);
      
      return result;
   }

   public StudentPO createStudents()
   {
      return this.startCreate().filterStudents().endCreate();
   }

   public RoomPO filterStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, RoomCreator.PROPERTY_STUDENTS);
   }

   public RoomPO createStudents(StudentPO tgt)
   {
      return this.startCreate().filterStudents(tgt).endCreate();
   }

   public StudentSet getStudents()
   {
      if (this.getPattern().getHasMatch())
      {
         return new StudentSet(((Room) this.getCurrentMatch()).getStudents());
      }
      return null;
   }

   public TeachingAssistantPO filterTas()
   {
      TeachingAssistantPO result = new TeachingAssistantPO(new TeachingAssistant[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(RoomCreator.PROPERTY_TAS, result);
      
      return result;
   }

   public TeachingAssistantPO createTas()
   {
      return this.startCreate().filterTas().endCreate();
   }

   public RoomPO filterTas(TeachingAssistantPO tgt)
   {
      return hasLinkConstraint(tgt, RoomCreator.PROPERTY_TAS);
   }

   public RoomPO createTas(TeachingAssistantPO tgt)
   {
      return this.startCreate().filterTas(tgt).endCreate();
   }

   public TeachingAssistantSet getTas()
   {
      if (this.getPattern().getHasMatch())
      {
         return new TeachingAssistantSet(((Room) this.getCurrentMatch()).getTas());
      }
      return null;
   }

   public RoomPO filterDoorsRev()
   {
      RoomPO result = new RoomPO(new Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(RoomCreator.PROPERTY_DOORSREV, result);
      
      return result;
   }

   public RoomPO createDoorsRev()
   {
      return this.startCreate().filterDoorsRev().endCreate();
   }

   public RoomPO filterDoorsRev(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, RoomCreator.PROPERTY_DOORSREV);
   }

   public RoomPO createDoorsRev(RoomPO tgt)
   {
      return this.startCreate().filterDoorsRev(tgt).endCreate();
   }

   public RoomSet getDoorsRev()
   {
      if (this.getPattern().getHasMatch())
      {
         return new RoomSet(((Room) this.getCurrentMatch()).getDoorsRev());
      }
      return null;
   }

   public RoomPO filterDoors()
   {
      RoomPO result = new RoomPO(new Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(RoomCreator.PROPERTY_DOORS, result);
      
      return result;
   }

   public RoomPO createDoors()
   {
      return this.startCreate().filterDoors().endCreate();
   }

   public RoomPO filterDoors(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, RoomCreator.PROPERTY_DOORS);
   }

   public RoomPO createDoors(RoomPO tgt)
   {
      return this.startCreate().filterDoors(tgt).endCreate();
   }

   public RoomSet getDoors()
   {
      if (this.getPattern().getHasMatch())
      {
         return new RoomSet(((Room) this.getCurrentMatch()).getDoors());
      }
      return null;
   }

   public AssignmentPO filterAssignments()
   {
      AssignmentPO result = new AssignmentPO(new Assignment[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(RoomCreator.PROPERTY_ASSIGNMENTS, result);
      
      return result;
   }

   public AssignmentPO createAssignments()
   {
      return this.startCreate().filterAssignments().endCreate();
   }

   public RoomPO filterAssignments(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, RoomCreator.PROPERTY_ASSIGNMENTS);
   }

   public RoomPO createAssignments(AssignmentPO tgt)
   {
      return this.startCreate().filterAssignments(tgt).endCreate();
   }

   public AssignmentSet getAssignments()
   {
      if (this.getPattern().getHasMatch())
      {
         return new AssignmentSet(((Room) this.getCurrentMatch()).getAssignments());
      }
      return null;
   }

}
