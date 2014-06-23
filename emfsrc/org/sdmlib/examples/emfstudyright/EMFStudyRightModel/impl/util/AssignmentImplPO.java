package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.util.AssignmentImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;

public class AssignmentImplPO extends PatternObject<AssignmentImplPO, AssignmentImpl>
{

    public AssignmentImplSet allMatches()
   {
      this.setDoAllMatches(true);
      
      AssignmentImplSet matches = new AssignmentImplSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((AssignmentImpl) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public AssignmentImplPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public AssignmentImplPO(AssignmentImpl... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public AssignmentImplPO hasName(String value)
   {
      new AttributeConstraint()
      .withAttrName(AssignmentImpl.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentImplPO hasName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(AssignmentImpl.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentImplPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((AssignmentImpl) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public AssignmentImplPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((AssignmentImpl) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public AssignmentImplPO hasPoints(int value)
   {
      new AttributeConstraint()
      .withAttrName(AssignmentImpl.PROPERTY_POINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentImplPO hasPoints(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(AssignmentImpl.PROPERTY_POINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentImplPO createPoints(int value)
   {
      this.startCreate().hasPoints(value).endCreate();
      return this;
   }
   
   public int getPoints()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((AssignmentImpl) getCurrentMatch()).getPoints();
      }
      return 0;
   }
   
   public AssignmentImplPO withPoints(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((AssignmentImpl) getCurrentMatch()).setPoints(value);
      }
      return this;
   }
   
   public StudentPO hasStudents()
   {
      StudentPO result = new StudentPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Assignment.PROPERTY_STUDENTS, result);
      
      return result;
   }

   public StudentPO createStudents()
   {
      return this.startCreate().hasStudents().endCreate();
   }

   public AssignmentImplPO hasStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Assignment.PROPERTY_STUDENTS);
   }

   public AssignmentImplPO createStudents(StudentPO tgt)
   {
      return this.startCreate().hasStudents(tgt).endCreate();
   }

   public StudentSet getStudents()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Assignment) this.getCurrentMatch()).getStudentsSet();
      }
      return null;
   }

   public RoomPO hasRoom()
   {
      RoomPO result = new RoomPO(new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(Assignment.PROPERTY_ROOM, result);
      
      return result;
   }

   public RoomPO createRoom()
   {
      return this.startCreate().hasRoom().endCreate();
   }

   public AssignmentImplPO hasRoom(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Assignment.PROPERTY_ROOM);
   }

   public AssignmentImplPO createRoom(RoomPO tgt)
   {
      return this.startCreate().hasRoom(tgt).endCreate();
   }

   public Room getRoom()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Assignment) this.getCurrentMatch()).getRoom();
      }
      return null;
   }

}
