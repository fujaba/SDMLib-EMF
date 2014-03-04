package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.models.pattern.PatternLink;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.UniversityPO;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.TeachingAssistant;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.TeachingAssistantSet;
import org.sdmlib.models.pattern.AttributeConstraint;

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
   
   public UniversityPO hasUni()
   {
      UniversityPO result = new UniversityPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Room.PROPERTY_UNI, result);
      
      return result;
   }

   public UniversityPO createUni()
   {
      return this.startCreate().hasUni().endCreate();
   }

   public RoomPO hasUni(UniversityPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_UNI);
   }

   public RoomPO createUni(UniversityPO tgt)
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

   public AssignmentPO hasAssignments()
   {
      AssignmentPO result = new AssignmentPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Room.PROPERTY_ASSIGNMENTS, result);
      
      return result;
   }

   public AssignmentPO createAssignments()
   {
      return this.startCreate().hasAssignments().endCreate();
   }

   public RoomPO hasAssignments(AssignmentPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_ASSIGNMENTS);
   }

   public RoomPO createAssignments(AssignmentPO tgt)
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

   public StudentPO hasStudents()
   {
      StudentPO result = new StudentPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Room.PROPERTY_STUDENTS, result);
      
      return result;
   }

   public StudentPO createStudents()
   {
      return this.startCreate().hasStudents().endCreate();
   }

   public RoomPO hasStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_STUDENTS);
   }

   public RoomPO createStudents(StudentPO tgt)
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
      TeachingAssistantPO result = new TeachingAssistantPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Room.PROPERTY_TAS, result);
      
      return result;
   }

   public TeachingAssistantPO createTas()
   {
      return this.startCreate().hasTas().endCreate();
   }

   public RoomPO hasTas(TeachingAssistantPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_TAS);
   }

   public RoomPO createTas(TeachingAssistantPO tgt)
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
      RoomPO result = new RoomPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Room.PROPERTY_DOORS, result);
      
      return result;
   }

   public RoomPO createDoors()
   {
      return this.startCreate().hasDoors().endCreate();
   }

   public RoomPO hasDoors(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Room.PROPERTY_DOORS);
   }

   public RoomPO createDoors(RoomPO tgt)
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

   public RoomPO hasTopic(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Room.PROPERTY_TOPIC)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomPO hasTopic(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Room.PROPERTY_TOPIC)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomPO createTopic(String value)
   {
      this.startCreate().hasTopic(value).endCreate();
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
   
   public RoomPO hasCredits(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Room.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomPO hasCredits(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Room.PROPERTY_CREDITS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public RoomPO createCredits(int value)
   {
      this.startCreate().hasCredits(value).endCreate();
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
   
}




