package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.CSVisitAllClientsFlow;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.CSVisitAllClientsFlowPO;
import org.sdmlib.examples.chats.util.CSClientTaskPO;
import org.sdmlib.examples.chats.CSClientTask;

public class CSVisitAllClientsFlowPO extends PatternObject<CSVisitAllClientsFlowPO, CSVisitAllClientsFlow>
{

    public CSVisitAllClientsFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CSVisitAllClientsFlowSet matches = new CSVisitAllClientsFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CSVisitAllClientsFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public CSVisitAllClientsFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public CSVisitAllClientsFlowPO(CSVisitAllClientsFlow... hostGraphObject) {
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
          ((CSVisitAllClientsFlow) getCurrentMatch()).run();
      }
   }

   public CSVisitAllClientsFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(CSVisitAllClientsFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSVisitAllClientsFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(CSVisitAllClientsFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSVisitAllClientsFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSVisitAllClientsFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public CSVisitAllClientsFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSVisitAllClientsFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public CSVisitAllClientsFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(CSVisitAllClientsFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public CSVisitAllClientsFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSVisitAllClientsFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public CSVisitAllClientsFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((CSVisitAllClientsFlow) getCurrentMatch()).setIdMap(value);
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

   public CSVisitAllClientsFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public CSVisitAllClientsFlowPO createSubFlow(TaskFlowPO tgt)
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

   public CSVisitAllClientsFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public CSVisitAllClientsFlowPO createParent(TaskFlowPO tgt)
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

   public CSClientTaskPO hasTgtTask()
   {
      CSClientTaskPO result = new CSClientTaskPO(new CSClientTask[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(CSVisitAllClientsFlow.PROPERTY_TGTTASK, result);
      
      return result;
   }

   public CSClientTaskPO createTgtTask()
   {
      return this.startCreate().hasTgtTask().endCreate();
   }

   public CSVisitAllClientsFlowPO hasTgtTask(CSClientTaskPO tgt)
   {
      return hasLinkConstraint(tgt, CSVisitAllClientsFlow.PROPERTY_TGTTASK);
   }

   public CSVisitAllClientsFlowPO createTgtTask(CSClientTaskPO tgt)
   {
      return this.startCreate().hasTgtTask(tgt).endCreate();
   }

   public CSClientTask getTgtTask()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSVisitAllClientsFlow) this.getCurrentMatch()).getTgtTask();
      }
      return null;
   }

}
