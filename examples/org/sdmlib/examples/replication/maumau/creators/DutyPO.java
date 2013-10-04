package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.replication.maumau.Duty;
import org.sdmlib.examples.replication.maumau.creators.DutySet;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.PatternLink;
import org.sdmlib.examples.replication.maumau.creators.PlayerPO;
import org.sdmlib.models.pattern.LinkConstraint;
import org.sdmlib.examples.replication.maumau.creators.DutyPO;
import org.sdmlib.examples.replication.maumau.Player;
import org.sdmlib.examples.replication.maumau.creators.MauMauPO;
import org.sdmlib.examples.replication.maumau.MauMau;

public class DutyPO extends PatternObject<DutyPO, Duty>
{
   public DutySet allMatches()
   {
      this.setDoAllMatches(true);
      
      DutySet matches = new DutySet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Duty) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
   public DutyPO hasKind(String value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Duty.PROPERTY_KIND)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public String getKind()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Duty) getCurrentMatch()).getKind();
      }
      return null;
   }
   
   public DutyPO withKind(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Duty) getCurrentMatch()).setKind(value);
      }
      return this;
   }
   
   public DutyPO hasNumber(int value)
   {
      AttributeConstraint constr = (AttributeConstraint) new AttributeConstraint()
      .withAttrName(Duty.PROPERTY_NUMBER)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public int getNumber()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Duty) getCurrentMatch()).getNumber();
      }
      return 0;
   }
   
   public DutyPO withNumber(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Duty) getCurrentMatch()).setNumber(value);
      }
      return this;
   }
   
   public PlayerPO hasPlayer()
   {
      PlayerPO result = new PlayerPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Duty.PROPERTY_PLAYER, result);
      
      return result;
   }

   public DutyPO hasPlayer(PlayerPO tgt)
   {
      LinkConstraint patternLink = (LinkConstraint) new LinkConstraint()
      .withTgt(tgt).withTgtRoleName(Duty.PROPERTY_PLAYER)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier());
      
      this.getPattern().addToElements(patternLink);
      
      this.getPattern().findMatch();
      
      return this;
   }

   public Player getPlayer()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Duty) this.getCurrentMatch()).getPlayer();
      }
      return null;
   }

   public MauMauPO hasGame()
   {
      MauMauPO result = new MauMauPO();
      result.setModifier(this.getPattern().getModifier());
      
      super.hasLink(Duty.PROPERTY_GAME, result);
      
      return result;
   }

   public DutyPO hasGame(MauMauPO tgt)
   {
      LinkConstraint patternLink = (LinkConstraint) new LinkConstraint()
      .withTgt(tgt).withTgtRoleName(Duty.PROPERTY_GAME)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier());
      
      this.getPattern().addToElements(patternLink);
      
      this.getPattern().findMatch();
      
      return this;
   }

   public MauMau getGame()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Duty) this.getCurrentMatch()).getGame();
      }
      return null;
   }

}

