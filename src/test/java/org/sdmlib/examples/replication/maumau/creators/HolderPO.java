package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.Holder;
import org.sdmlib.examples.replication.maumau.MauMau;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.models.pattern.PatternObject;

public class HolderPO extends PatternObject<HolderPO, Holder>
{
   public HolderSet allMatches()
   {
      this.setDoAllMatches(true);
      
      HolderSet matches = new HolderSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Holder) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public MauMauPO hasDeckOwner()
   {
      MauMauPO result = new MauMauPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Holder.PROPERTY_DECKOWNER, result);
      
      return result;
   }

   public HolderPO hasDeckOwner(MauMauPO tgt)
   {
      LinkConstraint patternLink = (LinkConstraint) new LinkConstraint()
      .withTgt(tgt).withTgtRoleName(Holder.PROPERTY_DECKOWNER)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier());
      
      this.getPattern().addToElements(patternLink);
      
      this.getPattern().findMatch();
      
      return this;
   }

   public MauMau getDeckOwner()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Holder) this.getCurrentMatch()).getDeckOwner();
      }
      return null;
   }

   public CardPO hasCards()
   {
      CardPO result = new CardPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Holder.PROPERTY_CARDS, result);
      
      return result;
   }

   public HolderPO hasCards(CardPO tgt)
   {
      LinkConstraint patternLink = (LinkConstraint) new LinkConstraint()
      .withTgt(tgt).withTgtRoleName(Holder.PROPERTY_CARDS)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier());
      
      this.getPattern().addToElements(patternLink);
      
      this.getPattern().findMatch();
      
      return this;
   }

   public CardSet getCards()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Holder) this.getCurrentMatch()).getCards();
      }
      return null;
   }

   public MauMauPO hasStackOwner()
   {
      MauMauPO result = new MauMauPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Holder.PROPERTY_STACKOWNER, result);
      
      return result;
   }

   public HolderPO hasStackOwner(MauMauPO tgt)
   {
      LinkConstraint patternLink = (LinkConstraint) new LinkConstraint()
      .withTgt(tgt).withTgtRoleName(Holder.PROPERTY_STACKOWNER)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier());
      
      this.getPattern().addToElements(patternLink);
      
      this.getPattern().findMatch();
      
      return this;
   }

   public MauMau getStackOwner()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Holder) this.getCurrentMatch()).getStackOwner();
      }
      return null;
   }

}

