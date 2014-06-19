package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.DrawPointFlow;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.chats.PeerToPeerChat;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.DrawPointFlowPO;

public class DrawPointFlowPO extends PatternObject<DrawPointFlowPO, DrawPointFlow>
{

    public DrawPointFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      DrawPointFlowSet matches = new DrawPointFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((DrawPointFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public DrawPointFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public DrawPointFlowPO(DrawPointFlow... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   
   //==========================================================================
   
   public void run()
   {
      if (this.getPattern().getHasMatch())
      {
          ((DrawPointFlow) getCurrentMatch()).run();
      }
   }

   public DrawPointFlowPO hasX(int value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_X)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO hasX(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_X)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createX(int value)
   {
      this.startCreate().hasX(value).endCreate();
      return this;
   }
   
   public int getX()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getX();
      }
      return 0;
   }
   
   public DrawPointFlowPO withX(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setX(value);
      }
      return this;
   }
   
   public DrawPointFlowPO hasY(int value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_Y)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO hasY(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_Y)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createY(int value)
   {
      this.startCreate().hasY(value).endCreate();
      return this;
   }
   
   public int getY()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getY();
      }
      return 0;
   }
   
   public DrawPointFlowPO withY(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setY(value);
      }
      return this;
   }
   
   public DrawPointFlowPO hasR(int value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_R)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO hasR(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_R)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createR(int value)
   {
      this.startCreate().hasR(value).endCreate();
      return this;
   }
   
   public int getR()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getR();
      }
      return 0;
   }
   
   public DrawPointFlowPO withR(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setR(value);
      }
      return this;
   }
   
   public DrawPointFlowPO hasG(int value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_G)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO hasG(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_G)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createG(int value)
   {
      this.startCreate().hasG(value).endCreate();
      return this;
   }
   
   public int getG()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getG();
      }
      return 0;
   }
   
   public DrawPointFlowPO withG(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setG(value);
      }
      return this;
   }
   
   public DrawPointFlowPO hasB(int value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_B)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO hasB(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_B)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createB(int value)
   {
      this.startCreate().hasB(value).endCreate();
      return this;
   }
   
   public int getB()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getB();
      }
      return 0;
   }
   
   public DrawPointFlowPO withB(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setB(value);
      }
      return this;
   }
   
   public DrawPointFlowPO hasGui(PeerToPeerChat value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_GUI)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createGui(PeerToPeerChat value)
   {
      this.startCreate().hasGui(value).endCreate();
      return this;
   }
   
   public PeerToPeerChat getGui()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getGui();
      }
      return null;
   }
   
   public DrawPointFlowPO withGui(PeerToPeerChat value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setGui(value);
      }
      return this;
   }
   
   public DrawPointFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public DrawPointFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public DrawPointFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(DrawPointFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public DrawPointFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((DrawPointFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public DrawPointFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((DrawPointFlow) getCurrentMatch()).setIdMap(value);
      }
      return this;
   }
   
   public TaskFlowPO hasSubFlow()
   {
      TaskFlowPO result = new TaskFlowPO(new org.sdmlib.logger.TaskFlow[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(TaskFlow.PROPERTY_SUBFLOW, result);
      
      return result;
   }

   public TaskFlowPO createSubFlow()
   {
      return this.startCreate().hasSubFlow().endCreate();
   }

   public DrawPointFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public DrawPointFlowPO createSubFlow(TaskFlowPO tgt)
   {
      return this.startCreate().hasSubFlow(tgt).endCreate();
   }

   public TaskFlow getSubFlow()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TaskFlow) this.getCurrentMatch()).getSubFlow();
      }
      return null;
   }

   public TaskFlowPO hasParent()
   {
      TaskFlowPO result = new TaskFlowPO(new org.sdmlib.logger.TaskFlow[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(TaskFlow.PROPERTY_PARENT, result);
      
      return result;
   }

   public TaskFlowPO createParent()
   {
      return this.startCreate().hasParent().endCreate();
   }

   public DrawPointFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public DrawPointFlowPO createParent(TaskFlowPO tgt)
   {
      return this.startCreate().hasParent(tgt).endCreate();
   }

   public TaskFlow getParent()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((TaskFlow) this.getCurrentMatch()).getParent();
      }
      return null;
   }

}
