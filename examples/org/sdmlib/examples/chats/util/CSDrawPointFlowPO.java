package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.CSDrawPointFlow;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.CSDrawPointFlowPO;

public class CSDrawPointFlowPO extends PatternObject<CSDrawPointFlowPO, CSDrawPointFlow>
{

    public CSDrawPointFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CSDrawPointFlowSet matches = new CSDrawPointFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CSDrawPointFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public CSDrawPointFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public CSDrawPointFlowPO(CSDrawPointFlow... hostGraphObject) {
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
          ((CSDrawPointFlow) getCurrentMatch()).run();
      }
   }

   public CSDrawPointFlowPO hasX(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_X)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO hasX(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_X)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO createX(int value)
   {
      this.startCreate().hasX(value).endCreate();
      return this;
   }
   
   public int getX()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSDrawPointFlow) getCurrentMatch()).getX();
      }
      return 0;
   }
   
   public CSDrawPointFlowPO withX(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSDrawPointFlow) getCurrentMatch()).setX(value);
      }
      return this;
   }
   
   public CSDrawPointFlowPO hasY(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_Y)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO hasY(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_Y)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO createY(int value)
   {
      this.startCreate().hasY(value).endCreate();
      return this;
   }
   
   public int getY()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSDrawPointFlow) getCurrentMatch()).getY();
      }
      return 0;
   }
   
   public CSDrawPointFlowPO withY(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSDrawPointFlow) getCurrentMatch()).setY(value);
      }
      return this;
   }
   
   public CSDrawPointFlowPO hasR(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_R)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO hasR(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_R)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO createR(int value)
   {
      this.startCreate().hasR(value).endCreate();
      return this;
   }
   
   public int getR()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSDrawPointFlow) getCurrentMatch()).getR();
      }
      return 0;
   }
   
   public CSDrawPointFlowPO withR(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSDrawPointFlow) getCurrentMatch()).setR(value);
      }
      return this;
   }
   
   public CSDrawPointFlowPO hasG(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_G)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO hasG(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_G)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO createG(int value)
   {
      this.startCreate().hasG(value).endCreate();
      return this;
   }
   
   public int getG()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSDrawPointFlow) getCurrentMatch()).getG();
      }
      return 0;
   }
   
   public CSDrawPointFlowPO withG(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSDrawPointFlow) getCurrentMatch()).setG(value);
      }
      return this;
   }
   
   public CSDrawPointFlowPO hasB(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_B)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO hasB(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_B)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO createB(int value)
   {
      this.startCreate().hasB(value).endCreate();
      return this;
   }
   
   public int getB()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSDrawPointFlow) getCurrentMatch()).getB();
      }
      return 0;
   }
   
   public CSDrawPointFlowPO withB(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSDrawPointFlow) getCurrentMatch()).setB(value);
      }
      return this;
   }
   
   public CSDrawPointFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSDrawPointFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public CSDrawPointFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSDrawPointFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public CSDrawPointFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(CSDrawPointFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSDrawPointFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSDrawPointFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public CSDrawPointFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSDrawPointFlow) getCurrentMatch()).setIdMap(value);
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

   public CSDrawPointFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public CSDrawPointFlowPO createSubFlow(TaskFlowPO tgt)
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

   public CSDrawPointFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public CSDrawPointFlowPO createParent(TaskFlowPO tgt)
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
