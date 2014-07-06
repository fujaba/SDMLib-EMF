package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversityPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.RoomImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.TeachingAssistantPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.TeachingAssistantSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.AssignmentSet;

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


   public RoomImplPO(){
      newInstance(org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap("PatternObjectType"));
   }

   public RoomImplPO(RoomImpl... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public RoomImplPO hasTopic(String value)
   {
      new AttributeConstraint()
      .withAttrName(RoomImpl.PROPERTY_TOPIC)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomImplPO hasTopic(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(RoomImpl.PROPERTY_TOPIC)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomImplPO createTopic(String value)
   {
      this.startCreate().hasTopic(value).endCreate();
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
      new AttributeConstraint()
      .withAttrName(RoomImpl.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomImplPO hasCredits(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(RoomImpl.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomImplPO createCredits(int value)
   {
      this.startCreate().hasCredits(value).endCreate();
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
   
   public UniversityPO hasUni()
   {
      UniversityPO result = new UniversityPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Room.PROPERTY_UNI, result);
      
      return result;
   }

   public UniversityPO createUni()
   {
      return this.startCreate().hasUni().endCreate();
   }

   public RoomImplPO hasUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_UNI);
   }

   public RoomImplPO createUni(UniversityPO tgt)
   {
      return this.startCreate().hasUni(tgt).endCreate();
   }

   public University getUni()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) this.getCurrentMatch()).getUni();
      }
      return null;
   }

   public StudentPO hasStudents()
   {
      StudentPO result = new StudentPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Room.PROPERTY_STUDENTS, result);
      
      return result;
   }

   public StudentPO createStudents()
   {
      return this.startCreate().hasStudents().endCreate();
   }

   public RoomImplPO hasStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_STUDENTS);
   }

   public RoomImplPO createStudents(StudentPO tgt)
   {
      return this.startCreate().hasStudents(tgt).endCreate();
   }

   public StudentSet getStudents()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) this.getCurrentMatch()).getStudentsSet();
      }
      return null;
   }

   public TeachingAssistantPO hasTas()
   {
      TeachingAssistantPO result = new TeachingAssistantPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Room.PROPERTY_TAS, result);
      
      return result;
   }

   public TeachingAssistantPO createTas()
   {
      return this.startCreate().hasTas().endCreate();
   }

   public RoomImplPO hasTas(TeachingAssistantPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_TAS);
   }

   public RoomImplPO createTas(TeachingAssistantPO tgt)
   {
      return this.startCreate().hasTas(tgt).endCreate();
   }

   public TeachingAssistantSet getTas()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) this.getCurrentMatch()).getTasSet();
      }
      return null;
   }

   public RoomPO hasDoors()
   {
      RoomPO result = new RoomPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Room.PROPERTY_DOORS, result);
      
      return result;
   }

   public RoomPO createDoors()
   {
      return this.startCreate().hasDoors().endCreate();
   }

   public RoomImplPO hasDoors(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_DOORS);
   }

   public RoomImplPO createDoors(RoomPO tgt)
   {
      return this.startCreate().hasDoors(tgt).endCreate();
   }

   public RoomSet getDoors()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) this.getCurrentMatch()).getDoorsSet();
      }
      return null;
   }

   public AssignmentPO hasAssignments()
   {
      AssignmentPO result = new AssignmentPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Room.PROPERTY_ASSIGNMENTS, result);
      
      return result;
   }

   public AssignmentPO createAssignments()
   {
      return this.startCreate().hasAssignments().endCreate();
   }

   public RoomImplPO hasAssignments(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_ASSIGNMENTS);
   }

   public RoomImplPO createAssignments(AssignmentPO tgt)
   {
      return this.startCreate().hasAssignments(tgt).endCreate();
   }

   public AssignmentSet getAssignments()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Room) this.getCurrentMatch()).getAssignmentsSet();
      }
      return null;
   }

}
