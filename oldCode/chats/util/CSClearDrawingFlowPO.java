package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.CSClearDrawingFlow;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.CSClearDrawingFlowPO;

public class CSClearDrawingFlowPO extends PatternObject<CSClearDrawingFlowPO, CSClearDrawingFlow>
{

    public CSClearDrawingFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CSClearDrawingFlowSet matches = new CSClearDrawingFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CSClearDrawingFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public CSClearDrawingFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public CSClearDrawingFlowPO(CSClearDrawingFlow... hostGraphObject) {
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
          ((CSClearDrawingFlow) getCurrentMatch()).run();
      }
   }

   public CSClearDrawingFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSClearDrawingFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSClearDrawingFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSClearDrawingFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSClearDrawingFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSClearDrawingFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public CSClearDrawingFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSClearDrawingFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public CSClearDrawingFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(CSClearDrawingFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSClearDrawingFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSClearDrawingFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public CSClearDrawingFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSClearDrawingFlow) getCurrentMatch()).setIdMap(value);
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

   public CSClearDrawingFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public CSClearDrawingFlowPO createSubFlow(TaskFlowPO tgt)
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

   public CSClearDrawingFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public CSClearDrawingFlowPO createParent(TaskFlowPO tgt)
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
