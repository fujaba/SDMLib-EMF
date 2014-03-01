package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.UniversityImplSet;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.PatternLink;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.UniversityImplPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.StudentSet;

public class UniversityImplPO extends PatternObject<UniversityImplPO, UniversityImpl>
{
   public UniversityImplSet allMatches()
   {
      this.setDoAllMatches(true);
      
      UniversityImplSet matches = new UniversityImplSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((UniversityImpl) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public UniversityImplPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(UniversityImpl.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public UniversityImplPO hasName(String lower, String upper)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(UniversityImpl.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public UniversityImplPO createName(String value)
   {
      this.startCreate().hasName(value).endCreate();
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((UniversityImpl) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public UniversityImplPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((UniversityImpl) getCurrentMatch()).setName(value);
      }
      return this;
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

   public UniversityImplPO hasRooms(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, University.PROPERTY_ROOMS);
   }

   public UniversityImplPO createRooms(RoomPO tgt)
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

   public UniversityImplPO hasStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, University.PROPERTY_STUDENTS);
   }

   public UniversityImplPO createStudents(StudentPO tgt)
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

}


