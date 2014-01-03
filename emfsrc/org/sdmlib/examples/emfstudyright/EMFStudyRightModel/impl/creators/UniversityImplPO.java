package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators.UniversityImplSet;
import org.sdmlib.models.pattern.AttributeConstraint;

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
   
}

