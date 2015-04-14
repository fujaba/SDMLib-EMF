package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.ClientLoginFlow;
import org.sdmlib.logger.util.PeerProxySet;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.ClientLoginFlowPO;

public class ClientLoginFlowPO extends PatternObject<ClientLoginFlowPO, ClientLoginFlow>
{

    public ClientLoginFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ClientLoginFlowSet matches = new ClientLoginFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ClientLoginFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public ClientLoginFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public ClientLoginFlowPO(ClientLoginFlow... hostGraphObject) {
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
          ((ClientLoginFlow) getCurrentMatch()).run();
      }
   }

   public ClientLoginFlowPO hasServer(PeerProxySet value)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_SERVER)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO createServer(PeerProxySet value)
   {
      this.startCreate().hasServer(value).endCreate();
      return this;
   }
   
   public PeerProxySet getServer()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClientLoginFlow) getCurrentMatch()).getServer();
      }
      return null;
   }
   
   public ClientLoginFlowPO withServer(PeerProxySet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClientLoginFlow) getCurrentMatch()).setServer(value);
      }
      return this;
   }
   
   public ClientLoginFlowPO hasClientIP(String value)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_CLIENTIP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO hasClientIP(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_CLIENTIP)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO createClientIP(String value)
   {
      this.startCreate().hasClientIP(value).endCreate();
      return this;
   }
   
   public String getClientIP()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClientLoginFlow) getCurrentMatch()).getClientIP();
      }
      return null;
   }
   
   public ClientLoginFlowPO withClientIP(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClientLoginFlow) getCurrentMatch()).setClientIP(value);
      }
      return this;
   }
   
   public ClientLoginFlowPO hasClientPort(int value)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_CLIENTPORT)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO hasClientPort(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_CLIENTPORT)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO createClientPort(int value)
   {
      this.startCreate().hasClientPort(value).endCreate();
      return this;
   }
   
   public int getClientPort()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClientLoginFlow) getCurrentMatch()).getClientPort();
      }
      return 0;
   }
   
   public ClientLoginFlowPO withClientPort(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClientLoginFlow) getCurrentMatch()).setClientPort(value);
      }
      return this;
   }
   
   public ClientLoginFlowPO hasAllMessagesText(String value)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_ALLMESSAGESTEXT)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO hasAllMessagesText(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_ALLMESSAGESTEXT)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO createAllMessagesText(String value)
   {
      this.startCreate().hasAllMessagesText(value).endCreate();
      return this;
   }
   
   public String getAllMessagesText()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClientLoginFlow) getCurrentMatch()).getAllMessagesText();
      }
      return null;
   }
   
   public ClientLoginFlowPO withAllMessagesText(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClientLoginFlow) getCurrentMatch()).setAllMessagesText(value);
      }
      return this;
   }
   
   public ClientLoginFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClientLoginFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public ClientLoginFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClientLoginFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public ClientLoginFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(ClientLoginFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ClientLoginFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ClientLoginFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public ClientLoginFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ClientLoginFlow) getCurrentMatch()).setIdMap(value);
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

   public ClientLoginFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public ClientLoginFlowPO createSubFlow(TaskFlowPO tgt)
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

   public ClientLoginFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public ClientLoginFlowPO createParent(TaskFlowPO tgt)
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
