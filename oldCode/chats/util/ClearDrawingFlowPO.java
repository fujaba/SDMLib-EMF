package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.ClearDrawingFlow;
import org.sdmlib.examples.chats.PeerToPeerChat;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.ClearDrawingFlowPO;

public class ClearDrawingFlowPO extends PatternObject<ClearDrawingFlowPO, ClearDrawingFlow>
{

    public ClearDrawingFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ClearDrawingFlowSet matches = new ClearDrawingFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ClearDrawingFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public ClearDrawingFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public ClearDrawingFlowPO(ClearDrawingFlow... hostGraphObject) {
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
          ((ClearDrawingFlow) getCurrentMatch()).run();
      }
   }

   public ClearDrawingFlowPO hasGui(PeerToPeerChat value)
   {
      new AttributeConstraint()
      .withAttrName(ClearDrawingFlow.PROPERTY_GUI)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClearDrawingFlowPO createGui(PeerToPeerChat value)
   {
      this.startCreate().hasGui(value).endCreate();
      return this;
   }
   
   public PeerToPeerChat getGui()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClearDrawingFlow) getCurrentMatch()).getGui();
      }
      return null;
   }
   
   public ClearDrawingFlowPO withGui(PeerToPeerChat value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClearDrawingFlow) getCurrentMatch()).setGui(value);
      }
      return this;
   }
   
   public ClearDrawingFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(ClearDrawingFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClearDrawingFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(ClearDrawingFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClearDrawingFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClearDrawingFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public ClearDrawingFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClearDrawingFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public ClearDrawingFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(ClearDrawingFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClearDrawingFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClearDrawingFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public ClearDrawingFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClearDrawingFlow) getCurrentMatch()).setIdMap(value);
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

   public ClearDrawingFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public ClearDrawingFlowPO createSubFlow(TaskFlowPO tgt)
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

   public ClearDrawingFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public ClearDrawingFlowPO createParent(TaskFlowPO tgt)
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
