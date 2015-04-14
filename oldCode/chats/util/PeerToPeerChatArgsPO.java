package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.PeerToPeerChatArgs;
import org.sdmlib.models.pattern.AttributeConstraint;

public class PeerToPeerChatArgsPO extends PatternObject<PeerToPeerChatArgsPO, PeerToPeerChatArgs>
{

    public PeerToPeerChatArgsSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PeerToPeerChatArgsSet matches = new PeerToPeerChatArgsSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((PeerToPeerChatArgs) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public PeerToPeerChatArgsPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public PeerToPeerChatArgsPO(PeerToPeerChatArgs... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public PeerToPeerChatArgsPO hasUserName(String value)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_USERNAME)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO hasUserName(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_USERNAME)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO createUserName(String value)
   {
      this.startCreate().hasUserName(value).endCreate();
      return this;
   }
   
   public String getUserName()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((PeerToPeerChatArgs) getCurrentMatch()).getUserName();
      }
      return null;
   }
   
   public PeerToPeerChatArgsPO withUserName(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PeerToPeerChatArgs) getCurrentMatch()).setUserName(value);
      }
      return this;
   }
   
   public PeerToPeerChatArgsPO hasLocalPort(int value)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_LOCALPORT)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO hasLocalPort(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_LOCALPORT)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO createLocalPort(int value)
   {
      this.startCreate().hasLocalPort(value).endCreate();
      return this;
   }
   
   public int getLocalPort()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((PeerToPeerChatArgs) getCurrentMatch()).getLocalPort();
      }
      return 0;
   }
   
   public PeerToPeerChatArgsPO withLocalPort(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PeerToPeerChatArgs) getCurrentMatch()).setLocalPort(value);
      }
      return this;
   }
   
   public PeerToPeerChatArgsPO hasPeerIp(String value)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_PEERIP)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO hasPeerIp(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_PEERIP)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO createPeerIp(String value)
   {
      this.startCreate().hasPeerIp(value).endCreate();
      return this;
   }
   
   public String getPeerIp()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((PeerToPeerChatArgs) getCurrentMatch()).getPeerIp();
      }
      return null;
   }
   
   public PeerToPeerChatArgsPO withPeerIp(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PeerToPeerChatArgs) getCurrentMatch()).setPeerIp(value);
      }
      return this;
   }
   
   public PeerToPeerChatArgsPO hasPeerPort(int value)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_PEERPORT)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO hasPeerPort(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(PeerToPeerChatArgs.PROPERTY_PEERPORT)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public PeerToPeerChatArgsPO createPeerPort(int value)
   {
      this.startCreate().hasPeerPort(value).endCreate();
      return this;
   }
   
   public int getPeerPort()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((PeerToPeerChatArgs) getCurrentMatch()).getPeerPort();
      }
      return 0;
   }
   
   public PeerToPeerChatArgsPO withPeerPort(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((PeerToPeerChatArgs) getCurrentMatch()).setPeerPort(value);
      }
      return this;
   }
   
}
