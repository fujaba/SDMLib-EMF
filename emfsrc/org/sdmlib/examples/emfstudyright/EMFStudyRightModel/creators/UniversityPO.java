package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators;

import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.PatternObject;

public class UniversityPO extends PatternObject<UniversityPO, University>
{
   public UniversitySet allMatches()
   {
      this.setDoAllMatches(true);
      
      UniversitySet matches = new UniversitySet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((University) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public RoomPO hasRooms()
   {
      RoomPO result = new RoomPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(University.PROPERTY_ROOMS, result);
      
      return result;
   }

   public RoomPO createRooms()
   {
      return this.startCreate().hasRooms().endCreate();
   }

   public UniversityPO hasRooms(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, University.PROPERTY_ROOMS);
   }

   public UniversityPO createRooms(RoomPO tgt)
   {
      return this.startCreate().hasRooms(tgt).endCreate();
   }

   public StudentPO hasStudents()
   {
      StudentPO result = new StudentPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(University.PROPERTY_STUDENTS, result);
      
      return result;
   }

   public StudentPO createStudents()
   {
      return this.startCreate().hasStudents().endCreate();
   }

   public UniversityPO hasStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, University.PROPERTY_STUDENTS);
   }

   public UniversityPO createStudents(StudentPO tgt)
   {
      return this.startCreate().hasStudents(tgt).endCreate();
   }

   public RoomSet getRooms()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((University) this.getCurrentMatch()).getRoomsSet();
      }
      return null;
   }

   public StudentSet getStudents()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((University) this.getCurrentMatch()).getStudentsSet();
      }
      return null;
   }

   public UniversityPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(University.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public UniversityPO hasName(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(University.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public UniversityPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((University) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public UniversityPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((University) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
}



