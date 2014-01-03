package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.StudentImplSet;
import org.sdmlib.models.pattern.AttributeConstraint;

public class StudentImplPO extends PatternObject<StudentImplPO, StudentImpl>
{
   public StudentImplSet allMatches()
   {
      this.setDoAllMatches(true);
      
      StudentImplSet matches = new StudentImplSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((StudentImpl) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public StudentImplPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_NAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public String getName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getName();
      }
      return null;
   }
   
   public StudentImplPO withName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setName(value);
      }
      return this;
   }
   
   public StudentImplPO hasCredits(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_CREDITS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public int getCredits()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getCredits();
      }
      return 0;
   }
   
   public StudentImplPO withCredits(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setCredits(value);
      }
      return this;
   }
   
   public StudentImplPO hasMotivation(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(StudentImpl.PROPERTY_MOTIVATION)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public int getMotivation()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((StudentImpl) getCurrentMatch()).getMotivation();
      }
      return 0;
   }
   
   public StudentImplPO withMotivation(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((StudentImpl) getCurrentMatch()).setMotivation(value);
      }
      return this;
   }
   
}


