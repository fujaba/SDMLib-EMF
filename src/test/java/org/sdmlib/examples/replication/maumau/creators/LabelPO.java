package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.examples.replication.maumau.creators.LabelSet;
import org.sdmlib.models.pattern.AttributeConstraint;

public class LabelPO extends PatternObject<LabelPO, Label>
{
   public LabelSet allMatches()
   {
      this.setDoAllMatches(true);
      
      LabelSet matches = new LabelSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Label) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public LabelPO hasText(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(LabelCreator.PROPERTY_TEXT)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public String getText()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Label) getCurrentMatch()).getText();
      }
      return null;
   }
   
   public LabelPO withText(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Label) getCurrentMatch()).setText(value);
      }
      return this;
   }
   
}

