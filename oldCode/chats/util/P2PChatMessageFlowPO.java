package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.P2PChatMessageFlow;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.P2PChatMessageFlowPO;

public class P2PChatMessageFlowPO extends PatternObject<P2PChatMessageFlowPO, P2PChatMessageFlow>
{

    public P2PChatMessageFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      P2PChatMessageFlowSet matches = new P2PChatMessageFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((P2PChatMessageFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public P2PChatMessageFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public P2PChatMessageFlowPO(P2PChatMessageFlow... hostGraphObject) {
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
          ((P2PChatMessageFlow) getCurrentMatch()).run();
      }
   }

   public P2PChatMessageFlowPO hasMsg(String value)
   {
      new AttributeConstraint()
      .withAttrName(P2PChatMessageFlow.PROPERTY_MSG)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PChatMessageFlowPO hasMsg(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(P2PChatMessageFlow.PROPERTY_MSG)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PChatMessageFlowPO createMsg(String value)
   {
      this.startCreate().hasMsg(value).endCreate();
      return this;
   }
   
   public String getMsg()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PChatMessageFlow) getCurrentMatch()).getMsg();
      }
      return null;
   }
   
   public P2PChatMessageFlowPO withMsg(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PChatMessageFlow) getCurrentMatch()).setMsg(value);
      }
      return this;
   }
   
   public P2PChatMessageFlowPO hasPos(int value)
   {
      new AttributeConstraint()
      .withAttrName(P2PChatMessageFlow.PROPERTY_POS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PChatMessageFlowPO hasPos(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(P2PChatMessageFlow.PROPERTY_POS)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PChatMessageFlowPO createPos(int value)
   {
      this.startCreate().hasPos(value).endCreate();
      return this;
   }
   
   public int getPos()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PChatMessageFlow) getCurrentMatch()).getPos();
      }
      return 0;
   }
   
   public P2PChatMessageFlowPO withPos(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PChatMessageFlow) getCurrentMatch()).setPos(value);
      }
      return this;
   }
   
   public P2PChatMessageFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(P2PChatMessageFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PChatMessageFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(P2PChatMessageFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PChatMessageFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PChatMessageFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public P2PChatMessageFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PChatMessageFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public P2PChatMessageFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(P2PChatMessageFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PChatMessageFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PChatMessageFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public P2PChatMessageFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PChatMessageFlow) getCurrentMatch()).setIdMap(value);
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

   public P2PChatMessageFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public P2PChatMessageFlowPO createSubFlow(TaskFlowPO tgt)
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

   public P2PChatMessageFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public P2PChatMessageFlowPO createParent(TaskFlowPO tgt)
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
