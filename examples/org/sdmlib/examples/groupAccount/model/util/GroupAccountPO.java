package org.sdmlib.examples.groupAccount.model.util;

import org.sdmlib.examples.groupAccount.model.GroupAccount;
import org.sdmlib.examples.groupAccount.model.Item;
import org.sdmlib.examples.groupAccount.model.Person;
import org.sdmlib.models.pattern.PatternObject;

public class GroupAccountPO extends PatternObject<GroupAccountPO, GroupAccount>
{

    public GroupAccountSet allMatches()
   {
      this.setDoAllMatches(true);
      
      GroupAccountSet matches = new GroupAccountSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((GroupAccount) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public GroupAccountPO(){
      newInstance(CreatorCreator.createIdMap("PatternObjectType"));
   }

   public GroupAccountPO(GroupAccount... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(CreatorCreator.createIdMap("PatternObjectType"), hostGraphObject);
   }
   
   //==========================================================================
   
   public double initAccounts(double num, String str)
   {
      if (this.getPattern().getHasMatch())
      {
         return ((GroupAccount) getCurrentMatch()).initAccounts(num, str);
      }
      return 0;
   }

   
   //==========================================================================
   
   public void updateBalances()
   {
      if (this.getPattern().getHasMatch())
      {
          ((GroupAccount) getCurrentMatch()).updateBalances();
      }
   }

   public PersonPO hasPersons()
   {
      PersonPO result = new PersonPO(new Person[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(GroupAccount.PROPERTY_PERSONS, result);
      
      return result;
   }

   public PersonPO createPersons()
   {
      return this.startCreate().hasPersons().endCreate();
   }

   public GroupAccountPO hasPersons(PersonPO tgt)
   {
      return hasLinkConstraint(tgt, GroupAccount.PROPERTY_PERSONS);
   }

   public GroupAccountPO createPersons(PersonPO tgt)
   {
      return this.startCreate().hasPersons(tgt).endCreate();
   }

   public PersonSet getPersons()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((GroupAccount) this.getCurrentMatch()).getPersons();
      }
      return null;
   }

   public ItemPO hasItems()
   {
      ItemPO result = new ItemPO(new Item[]{});
      
      result.setModifier(this.getPattern().getModifier());
      super.hasLink(GroupAccount.PROPERTY_ITEMS, result);
      
      return result;
   }

   public ItemPO createItems()
   {
      return this.startCreate().hasItems().endCreate();
   }

   public GroupAccountPO hasItems(ItemPO tgt)
   {
      return hasLinkConstraint(tgt, GroupAccount.PROPERTY_ITEMS);
   }

   public GroupAccountPO createItems(ItemPO tgt)
   {
      return this.startCreate().hasItems(tgt).endCreate();
   }

   public ItemSet getItems()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((GroupAccount) this.getCurrentMatch()).getItems();
      }
      return null;
   }

}
