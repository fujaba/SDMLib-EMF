package org.sdmlib.examples.replication.maumau.creators;

import org.eclipse.swt.widgets.Label;
import org.sdmlib.examples.replication.maumau.Card;
import org.sdmlib.examples.replication.maumau.CardControler;
import org.sdmlib.examples.replication.maumau.CardListener;
import org.sdmlib.examples.replication.maumau.MultiMauMauControler;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.models.pattern.PatternObject;

public class CardControlerPO extends PatternObject<CardControlerPO, CardControler>
{
   public CardControlerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CardControlerSet matches = new CardControlerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CardControler) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public CardControlerPO hasCard(Card value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(CardControler.PROPERTY_CARD)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public Card getCard()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CardControler) getCurrentMatch()).getCard();
      }
      return null;
   }
   
   public CardControlerPO withCard(Card value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CardControler) getCurrentMatch()).setCard(value);
      }
      return this;
   }
   
   public CardControlerPO hasLabel(Label value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(CardControler.PROPERTY_LABEL)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public Label getLabel()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CardControler) getCurrentMatch()).getLabel();
      }
      return null;
   }
   
   public CardControlerPO withLabel(Label value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CardControler) getCurrentMatch()).setLabel(value);
      }
      return this;
   }
   
   public CardControlerPO hasListener(CardListener value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(CardControler.PROPERTY_LISTENER)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CardListener getListener()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CardControler) getCurrentMatch()).getListener();
      }
      return null;
   }
   
   public CardControlerPO withListener(CardListener value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CardControler) getCurrentMatch()).setListener(value);
      }
      return this;
   }
   
   public MultiMauMauControlerPO hasMauMauControler()
   {
      MultiMauMauControlerPO result = new MultiMauMauControlerPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(CardControler.PROPERTY_MAUMAUCONTROLER, result);
      
      return result;
   }

   public CardControlerPO hasMauMauControler(MultiMauMauControlerPO tgt)
   {
      LinkConstraint patternLink = (LinkConstraint) new LinkConstraint()
      .withTgt(tgt).withTgtRoleName(CardControler.PROPERTY_MAUMAUCONTROLER)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier());
      
      this.getPattern().addToElements(patternLink);
      
      this.getPattern().findMatch();
      
      return this;
   }

   public MultiMauMauControler getMauMauControler()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CardControler) this.getCurrentMatch()).getMauMauControler();
      }
      return null;
   }

}

