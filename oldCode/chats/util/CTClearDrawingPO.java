package org.sdmlib.examples.chats.util;

import org.sdmlib.models.pattern.PatternObject;
import org.sdmlib.examples.chats.CTClearDrawing;
import org.sdmlib.examples.chats.util.CSVisitAllClientsFlowPO;
import org.sdmlib.examples.chats.CSClientTask;
import org.sdmlib.examples.chats.CSVisitAllClientsFlow;
import org.sdmlib.examples.chats.util.CTClearDrawingPO;

public class CTClearDrawingPO extends PatternObject<CTClearDrawingPO, CTClearDrawing>
{

    public CTClearDrawingSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CTClearDrawingSet matches = new CTClearDrawingSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CTClearDrawing) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public CTClearDrawingPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public CTClearDrawingPO(CTClearDrawing... hostGraphObject) {
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

   public CTClearDrawingPO hasParent(CSVisitAllClientsFlowPO tgt)
   {
      return hasLinkConstraint(tgt, CSClientTask.PROPERTY_PARENT);
   }

   public CTClearDrawingPO createParent(CSVisitAllClientsFlowPO tgt)
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
