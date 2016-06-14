package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.University;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Room;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.UniversityPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.RoomSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentPO;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.Student;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.util.StudentSet;

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


   public UniversityPO(){
      newInstance(null);
   }

   public UniversityPO(University... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(null, hostGraphObject);
   }
   public UniversityPO filterName(String value)
   {
      new AttributeConstraint()
      .withAttrName(UniversityCreator.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public UniversityPO filterName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(UniversityCreator.PROPERTY_NAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public UniversityPO createName(String value)
   {
      this.startCreate().filterName(value).endCreate();
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
   
   public RoomPO filterRooms()
   {
      RoomPO result = new RoomPO(new Room[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(UniversityCreator.PROPERTY_ROOMS, result);
      
      return result;
   }

   public RoomPO createRooms()
   {
      return this.startCreate().filterRooms().endCreate();
   }

   public UniversityPO filterRooms(RoomPO tgt)
   {
      return hasLinkConstraint(tgt, UniversityCreator.PROPERTY_ROOMS);
   }

   public UniversityPO createRooms(RoomPO tgt)
   {
      return this.startCreate().filterRooms(tgt).endCreate();
   }

   public RoomSet getRooms()
   {
      if (this.getPattern().getHasMatch())
      {
         return new RoomSet(((University) this.getCurrentMatch()).getRooms());
      }
      return null;
   }

   public StudentPO filterStudents()
   {
      StudentPO result = new StudentPO(new Student[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(UniversityCreator.PROPERTY_STUDENTS, result);
      
      return result;
   }

   public StudentPO createStudents()
   {
      return this.startCreate().filterStudents().endCreate();
   }

   public UniversityPO filterStudents(StudentPO tgt)
   {
      return hasLinkConstraint(tgt, UniversityCreator.PROPERTY_STUDENTS);
   }

   public UniversityPO createStudents(StudentPO tgt)
   {
      return this.startCreate().filterStudents(tgt).endCreate();
   }

   public StudentSet getStudents()
   {
      if (this.getPattern().getHasMatch())
      {
         return new StudentSet(((University) this.getCurrentMatch()).getStudents());
      }
      return null;
   }

}
