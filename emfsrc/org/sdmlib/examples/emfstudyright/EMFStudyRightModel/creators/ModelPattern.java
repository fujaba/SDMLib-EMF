package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import org.sdmlib.models.pattern.Pattern;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.UniversityImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.RoomImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.RoomImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.AssignmentImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.StudentImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.UniversityPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.AssignmentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;

public class ModelPattern extends Pattern
{
   public ModelPattern()
   {
      super(CreatorCreator.createIdMap("hg"));
   }
   
   public ModelPattern startCreate()
   {
      super.startCreate();
      return this;
   }

   public UniversityImplPO hasElementUniversityImplPO()
   {
      UniversityImplPO value = new UniversityImplPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public UniversityImplPO hasElementUniversityImplPO(UniversityImpl hostGraphObject)
   {
      UniversityImplPO value = new UniversityImplPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public RoomImplPO hasElementRoomImplPO()
   {
      RoomImplPO value = new RoomImplPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public RoomImplPO hasElementRoomImplPO(RoomImpl hostGraphObject)
   {
      RoomImplPO value = new RoomImplPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public AssignmentImplPO hasElementAssignmentImplPO()
   {
      AssignmentImplPO value = new AssignmentImplPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public AssignmentImplPO hasElementAssignmentImplPO(AssignmentImpl hostGraphObject)
   {
      AssignmentImplPO value = new AssignmentImplPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public StudentImplPO hasElementStudentImplPO()
   {
      StudentImplPO value = new StudentImplPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public StudentImplPO hasElementStudentImplPO(StudentImpl hostGraphObject)
   {
      StudentImplPO value = new StudentImplPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public UniversityPO hasElementUniversityPO()
   {
      UniversityPO value = new UniversityPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public UniversityPO hasElementUniversityPO(University hostGraphObject)
   {
      UniversityPO value = new UniversityPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public RoomPO hasElementRoomPO()
   {
      RoomPO value = new RoomPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public RoomPO hasElementRoomPO(Room hostGraphObject)
   {
      RoomPO value = new RoomPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public AssignmentPO hasElementAssignmentPO()
   {
      AssignmentPO value = new AssignmentPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public AssignmentPO hasElementAssignmentPO(Assignment hostGraphObject)
   {
      AssignmentPO value = new AssignmentPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

   public StudentPO hasElementStudentPO()
   {
      StudentPO value = new StudentPO();
      this.addToElements(value);
      value.setModifier(this.getModifier());
      
      this.findMatch();
      
      return value;
   }
   
   public StudentPO hasElementStudentPO(Student hostGraphObject)
   {
      StudentPO value = new StudentPO();
      this.addToElements(value);
      value.setModifier(Pattern.BOUND);
      
      value.setCurrentMatch(hostGraphObject);
      
      this.findMatch();
      
      return value;
   } 

}



