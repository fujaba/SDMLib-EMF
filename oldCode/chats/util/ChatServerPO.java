package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.ChatServer;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.logger.util.PeerProxySet;

public class ChatServerPO extends PatternObject<ChatServerPO, ChatServer>
{

    public ChatServerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      ChatServerSet matches = new ChatServerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((ChatServer) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public ChatServerPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public ChatServerPO(ChatServer... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public ChatServerPO hasAllMessages(String value)
   {
      new AttributeConstraint()
      .withAttrName(ChatServer.PROPERTY_ALLMESSAGES)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatServerPO hasAllMessages(String lower, String upper)
   {
      new AttributeConstraint()
      .withAttrName(ChatServer.PROPERTY_ALLMESSAGES)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatServerPO createAllMessages(String value)
   {
      this.startCreate().hasAllMessages(value).endCreate();
      return this;
   }
   
   public String getAllMessages()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ChatServer) getCurrentMatch()).getAllMessages();
      }
      return null;
   }
   
   public ChatServerPO withAllMessages(String value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ChatServer) getCurrentMatch()).setAllMessages(value);
      }
      return this;
   }
   
   public ChatServerPO hasAllPeers(PeerProxySet value)
   {
      new AttributeConstraint()
      .withAttrName(ChatServer.PROPERTY_ALLPEERS)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      this.getPattern().findMatch();
      
      return this;
   }
   
   public ChatServerPO createAllPeers(PeerProxySet value)
   {
      this.startCreate().hasAllPeers(value).endCreate();
      return this;
   }
   
   public PeerProxySet getAllPeers()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((ChatServer) getCurrentMatch()).getAllPeers();
      }
      return null;
   }
   
   public ChatServerPO withAllPeers(PeerProxySet value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((ChatServer) getCurrentMatch()).setAllPeers(value);
      }
      return this;
   }
   
}
