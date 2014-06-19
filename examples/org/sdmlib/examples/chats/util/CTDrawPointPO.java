package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.CTDrawPoint;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.chats.util.CSVisitAllClientsFlowPO;
import org.sdmlib.examples.chats.CSClientTask;
import org.sdmlib.examples.chats.CSVisitAllClientsFlow;
import org.sdmlib.examples.chats.util.CTDrawPointPO;

public class CTDrawPointPO extends PatternObject<CTDrawPointPO, CTDrawPoint>
{

    public CTDrawPointSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CTDrawPointSet matches = new CTDrawPointSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CTDrawPoint) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public CTDrawPointPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public CTDrawPointPO(CTDrawPoint... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public CTDrawPointPO hasX(int value)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_X)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO hasX(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_X)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO createX(int value)
   {
      this.startCreate().hasX(value).endCreate();
      return this;
   }
   
   public int getX()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CTDrawPoint) getCurrentMatch()).getX();
      }
      return 0;
   }
   
   public CTDrawPointPO withX(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CTDrawPoint) getCurrentMatch()).setX(value);
      }
      return this;
   }
   
   public CTDrawPointPO hasY(int value)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_Y)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO hasY(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_Y)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO createY(int value)
   {
      this.startCreate().hasY(value).endCreate();
      return this;
   }
   
   public int getY()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CTDrawPoint) getCurrentMatch()).getY();
      }
      return 0;
   }
   
   public CTDrawPointPO withY(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CTDrawPoint) getCurrentMatch()).setY(value);
      }
      return this;
   }
   
   public CTDrawPointPO hasR(int value)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_R)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO hasR(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_R)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO createR(int value)
   {
      this.startCreate().hasR(value).endCreate();
      return this;
   }
   
   public int getR()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CTDrawPoint) getCurrentMatch()).getR();
      }
      return 0;
   }
   
   public CTDrawPointPO withR(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CTDrawPoint) getCurrentMatch()).setR(value);
      }
      return this;
   }
   
   public CTDrawPointPO hasG(int value)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_G)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO hasG(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_G)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO createG(int value)
   {
      this.startCreate().hasG(value).endCreate();
      return this;
   }
   
   public int getG()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CTDrawPoint) getCurrentMatch()).getG();
      }
      return 0;
   }
   
   public CTDrawPointPO withG(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CTDrawPoint) getCurrentMatch()).setG(value);
      }
      return this;
   }
   
   public CTDrawPointPO hasB(int value)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_B)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO hasB(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CTDrawPoint.PROPERTY_B)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CTDrawPointPO createB(int value)
   {
      this.startCreate().hasB(value).endCreate();
      return this;
   }
   
   public int getB()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CTDrawPoint) getCurrentMatch()).getB();
      }
      return 0;
   }
   
   public CTDrawPointPO withB(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CTDrawPoint) getCurrentMatch()).setB(value);
      }
      return this;
   }
   
   public CSVisitAllClientsFlowPO hasParent()
   {
      CSVisitAllClientsFlowPO result = new CSVisitAllClientsFlowPO(new CSVisitAllClientsFlow[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(CSClientTask.PROPERTY_PARENT, result);
      
      return result;
   }

   public CSVisitAllClientsFlowPO createParent()
   {
      return this.startCreate().hasParent().endCreate();
   }

   public CTDrawPointPO hasParent(CSVisitAllClientsFlowPO tgt)
   {
      return hasLinkConstraint(tgt, CSClientTask.PROPERTY_PARENT);
   }

   public CTDrawPointPO createParent(CSVisitAllClientsFlowPO tgt)
   {
      return this.startCreate().hasParent(tgt).endCreate();
   }

   public CSVisitAllClientsFlow getParent()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSClientTask) this.getCurrentMatch()).getParent();
      }
      return null;
   }

}
