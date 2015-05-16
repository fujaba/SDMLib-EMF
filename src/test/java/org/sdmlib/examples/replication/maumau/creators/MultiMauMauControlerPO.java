package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.MauMau;
import org.sdmlib.examples.replication.maumau.MultiMauMauControler;
import org.sdmlib.examples.replication.maumau.Player;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.models.pattern.PatternObject;

public class MultiMauMauControlerPO extends PatternObject<MultiMauMauControlerPO, MultiMauMauControler>
{
   public MultiMauMauControlerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      MultiMauMauControlerSet matches = new MultiMauMauControlerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((MultiMauMauControler) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public MultiMauMauControlerPO hasMauMau(MauMau value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(MultiMauMauControler.PROPERTY_MAUMAU)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public MauMau getMauMau()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((MultiMauMauControler) getCurrentMatch()).getMauMau();
      }
      return null;
   }
   
   public MultiMauMauControlerPO withMauMau(MauMau value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((MultiMauMauControler) getCurrentMatch()).setMauMau(value);
      }
      return this;
   }
   
   public MultiMauMauControlerPO hasActivePlayer(Player value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(MultiMauMauControler.PROPERTY_ACTIVEPLAYER)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public Player getActivePlayer()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((MultiMauMauControler) getCurrentMatch()).getActivePlayer();
      }
      return null;
   }
   
   public MultiMauMauControlerPO withActivePlayer(Player value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((MultiMauMauControler) getCurrentMatch()).setActivePlayer(value);
      }
      return this;
   }
   
   public CardControlerPO hasCardControlers()
   {
      CardControlerPO result = new CardControlerPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(MultiMauMauControler.PROPERTY_CARDCONTROLERS, result);
      
      return result;
   }

   public MultiMauMauControlerPO hasCardControlers(CardControlerPO tgt)
   {
      LinkConstraint patternLink = (LinkConstraint) new LinkConstraint()
      .withTgt(tgt).withTgtRoleName(MultiMauMauControler.PROPERTY_CARDCONTROLERS)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier());
      
      this.getPattern().addToElements(patternLink);
      
      this.getPattern().findMatch();
      
      return this;
   }

   public CardControlerSet getCardControlers()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((MultiMauMauControler) this.getCurrentMatch()).getCardControlers();
      }
      return null;
   }

}

