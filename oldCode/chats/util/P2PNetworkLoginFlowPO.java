package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.P2PNetworkLoginFlow;
import org.sdmlib.logger.util.PeerProxySet;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.serialization.SDMLibJsonIdMap;
import org.sdmlib.logger.util.TaskFlowPO;
import org.sdmlib.logger.TaskFlow;
import org.sdmlib.examples.chats.util.P2PNetworkLoginFlowPO;

public class P2PNetworkLoginFlowPO extends PatternObject<P2PNetworkLoginFlowPO, P2PNetworkLoginFlow>
{

    public P2PNetworkLoginFlowSet allMatches()
   {
      this.setDoAllMatches(true);
      
      P2PNetworkLoginFlowSet matches = new P2PNetworkLoginFlowSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((P2PNetworkLoginFlow) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public P2PNetworkLoginFlowPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public P2PNetworkLoginFlowPO(P2PNetworkLoginFlow... hostGraphObject) {
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
          ((P2PNetworkLoginFlow) getCurrentMatch()).run();
      }
   }

   
   //==========================================================================
   
   public Object getTaskNames()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getTaskNames();
      }
      return null;
   }

   public P2PNetworkLoginFlowPO hasFirstPeer(PeerProxySet value)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_FIRSTPEER)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO createFirstPeer(PeerProxySet value)
   {
      this.startCreate().hasFirstPeer(value).endCreate();
      return this;
   }
   
   public PeerProxySet getFirstPeer()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getFirstPeer();
      }
      return null;
   }
   
   public P2PNetworkLoginFlowPO withFirstPeer(PeerProxySet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PNetworkLoginFlow) getCurrentMatch()).setFirstPeer(value);
      }
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasClientPeer(PeerProxySet value)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_CLIENTPEER)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO createClientPeer(PeerProxySet value)
   {
      this.startCreate().hasClientPeer(value).endCreate();
      return this;
   }
   
   public PeerProxySet getClientPeer()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getClientPeer();
      }
      return null;
   }
   
   public P2PNetworkLoginFlowPO withClientPeer(PeerProxySet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PNetworkLoginFlow) getCurrentMatch()).setClientPeer(value);
      }
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasClientName(String value)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_CLIENTNAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasClientName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_CLIENTNAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO createClientName(String value)
   {
      this.startCreate().hasClientName(value).endCreate();
      return this;
   }
   
   public String getClientName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getClientName();
      }
      return null;
   }
   
   public P2PNetworkLoginFlowPO withClientName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PNetworkLoginFlow) getCurrentMatch()).setClientName(value);
      }
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasAllMessages(String value)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_ALLMESSAGES)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasAllMessages(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_ALLMESSAGES)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO createAllMessages(String value)
   {
      this.startCreate().hasAllMessages(value).endCreate();
      return this;
   }
   
   public String getAllMessages()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getAllMessages();
      }
      return null;
   }
   
   public P2PNetworkLoginFlowPO withAllMessages(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PNetworkLoginFlow) getCurrentMatch()).setAllMessages(value);
      }
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasPeerList(PeerProxySet value)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_PEERLIST)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO createPeerList(PeerProxySet value)
   {
      this.startCreate().hasPeerList(value).endCreate();
      return this;
   }
   
   public PeerProxySet getPeerList()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getPeerList();
      }
      return null;
   }
   
   public P2PNetworkLoginFlowPO withPeerList(PeerProxySet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PNetworkLoginFlow) getCurrentMatch()).setPeerList(value);
      }
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasTaskNo(int value)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_TASKNO)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasTaskNo(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_TASKNO)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO createTaskNo(int value)
   {
      this.startCreate().hasTaskNo(value).endCreate();
      return this;
   }
   
   public int getTaskNo()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getTaskNo();
      }
      return 0;
   }
   
   public P2PNetworkLoginFlowPO withTaskNo(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PNetworkLoginFlow) getCurrentMatch()).setTaskNo(value);
      }
      return this;
   }
   
   public P2PNetworkLoginFlowPO hasIdMap(SDMLibJsonIdMap value)
   {
      new AttributeConstraint()
      .withAttrName(P2PNetworkLoginFlow.PROPERTY_IDMAP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public P2PNetworkLoginFlowPO createIdMap(SDMLibJsonIdMap value)
   {
      this.startCreate().hasIdMap(value).endCreate();
      return this;
   }
   
   public SDMLibJsonIdMap getIdMap()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((P2PNetworkLoginFlow) getCurrentMatch()).getIdMap();
      }
      return null;
   }
   
   public P2PNetworkLoginFlowPO withIdMap(SDMLibJsonIdMap value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((P2PNetworkLoginFlow) getCurrentMatch()).setIdMap(value);
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

   public P2PNetworkLoginFlowPO hasSubFlow(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_SUBFLOW);
   }

   public P2PNetworkLoginFlowPO createSubFlow(TaskFlowPO tgt)
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

   public P2PNetworkLoginFlowPO hasParent(TaskFlowPO tgt)
   {
      return hasLinkConstraint(tgt, TaskFlow.PROPERTY_PARENT);
   }

   public P2PNetworkLoginFlowPO createParent(TaskFlowPO tgt)
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
