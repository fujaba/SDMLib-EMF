package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Assignment;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.PatternObject;

public class AssignmentPO extends PatternObject<AssignmentPO, Assignment>
{
   public AssignmentSet allMatches()
   {
      this.setDoAllMatches(true);
      
      AssignmentSet matches = new AssignmentSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Assignment) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public RoomPO hasRoom()
   {
      RoomPO result = new RoomPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Assignment.PROPERTY_ROOM, result);
      
      return result;
   }

   public RoomPO createRoom()
   {
      return this.startCreate().hasRoom().endCreate();
   }

   public AssignmentPO hasRoom(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, Assignment.PROPERTY_ROOM);
   }

   public AssignmentPO createRoom(RoomPO tgt)
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

   public StudentPO hasStudents()
   {
      StudentPO result = new StudentPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Assignment.PROPERTY_STUDENTS, result);
      
      return result;
   }

   public StudentPO createStudents()
   {
      return this.startCreate().hasStudents().endCreate();
   }

   public AssignmentPO hasStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, Assignment.PROPERTY_STUDENTS);
   }

   public AssignmentPO createStudents(StudentPO tgt)
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

   public AssignmentPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Assignment.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentPO hasName(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Assignment.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Assignment) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public AssignmentPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Assignment) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public AssignmentPO hasPoints(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Assignment.PROPERTY_POINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentPO hasPoints(int lower, int upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Assignment.PROPERTY_POINTS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public AssignmentPO createPoints(int value)
   {
      this.startCreate().hasPoints(value).endCreate();
      return this;
   }
   
   public int getPoints()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Assignment) getCurrentMatch()).getPoints();
      }
      return 0;
   }
   
   public AssignmentPO withPoints(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Assignment) getCurrentMatch()).setPoints(value);
      }
      return this;
   }
   
}



