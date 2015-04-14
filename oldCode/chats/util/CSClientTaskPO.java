package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.CSClientTask;
import org.sdmlib.examples.chats.util.CSVisitAllClientsFlowPO;
import org.sdmlib.examples.chats.CSVisitAllClientsFlow;
import org.sdmlib.examples.chats.util.CSClientTaskPO;

public class CSClientTaskPO extends PatternObject<CSClientTaskPO, CSClientTask>
{

    public CSClientTaskSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CSClientTaskSet matches = new CSClientTaskSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CSClientTask) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public CSClientTaskPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public CSClientTaskPO(CSClientTask... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   public CSVisitAllClientsFlowPO hasParent()
   {
      CSVisitAllClientsFlowPO result = new CSVisitAllClientsFlowPO(new CSVisitAllClientsFlow[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(CSClientTask.PROPERTY_PARENT, result);
      
      return result;
   }

   public CSVisitAllClientsFlowPO createParent()
   {
      return this.startCreate().hasParent().endCreate();
   }

   public CSClientTaskPO hasParent(CSVisitAllClientsFlowPO tgt)
   {
      return hasLinkConstraint(tgt, CSClientTask.PROPERTY_PARENT);
   }

   public CSClientTaskPO createParent(CSVisitAllClientsFlowPO tgt)
   {
      return this.startCreate().hasParent(tgt).endCreate();
   }

   public CSVisitAllClientsFlow getParent()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((CSClientTask) this.getCurrentMatch()).getParent();
      }
      return null;
   }

}
