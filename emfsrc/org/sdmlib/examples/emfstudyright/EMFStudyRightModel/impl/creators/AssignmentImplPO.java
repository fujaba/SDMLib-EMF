package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.AssignmentImplSet;
import org.sdmlib.models.pattern.AttributeConstraint;

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
   
   public AssignmentImplPO hasName(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(AssignmentImpl.PROPERTY_NAME)
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
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(AssignmentImpl.PROPERTY_POINTS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
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
   
}


