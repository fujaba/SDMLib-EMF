package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.ChatMessageFlow;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.examples.chats.PeerToPeerChat;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.ChatMessageFlowPO;

public class ChatMessageFlowPO extends PatternObject<ChatMessageFlowPO, ChatMessageFlow>
{

    public ChatMessageFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ChatMessageFlowSet matches = new ChatMessageFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ChatMessageFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public ChatMessageFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public ChatMessageFlowPO(ChatMessageFlow... hostGraphObject) {
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
          ((ChatMessageFlow) getCurrentMatch()).run();
      }
   }

   public ChatMessageFlowPO hasMsg(String value)
   {
      new AttributeConstraint()
      .withAttrName(ChatMessageFlow.PROPERTY_MSG)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatMessageFlowPO hasMsg(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(ChatMessageFlow.PROPERTY_MSG)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatMessageFlowPO createMsg(String value)
   {
      this.startCreate().hasMsg(value).endCreate();
      return this;
   }
   
   public String getMsg()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ChatMessageFlow) getCurrentMatch()).getMsg();
      }
      return null;
   }
   
   public ChatMessageFlowPO withMsg(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ChatMessageFlow) getCurrentMatch()).setMsg(value);
      }
      return this;
   }
   
   public ChatMessageFlowPO hasGui(PeerToPeerChat value)
   {
      new AttributeConstraint()
      .withAttrName(ChatMessageFlow.PROPERTY_GUI)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatMessageFlowPO createGui(PeerToPeerChat value)
   {
      this.startCreate().hasGui(value).endCreate();
      return this;
   }
   
   public PeerToPeerChat getGui()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ChatMessageFlow) getCurrentMatch()).getGui();
      }
      return null;
   }
   
   public ChatMessageFlowPO withGui(PeerToPeerChat value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ChatMessageFlow) getCurrentMatch()).setGui(value);
      }
      return this;
   }
   
   public ChatMessageFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(ChatMessageFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatMessageFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(ChatMessageFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatMessageFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ChatMessageFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public ChatMessageFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ChatMessageFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public ChatMessageFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(ChatMessageFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatMessageFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ChatMessageFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public ChatMessageFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ChatMessageFlow) getCurrentMatch()).setIdMap(value);
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

   public ChatMessageFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public ChatMessageFlowPO createSubFlow(TaskFlowPO tgt)
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

   public ChatMessageFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public ChatMessageFlowPO createParent(TaskFlowPO tgt)
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
