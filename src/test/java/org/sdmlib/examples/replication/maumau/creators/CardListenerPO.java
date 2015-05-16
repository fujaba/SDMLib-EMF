package org.sdmlib.examples.replication.maumau.creators;

import org.sdmlib.examples.replication.maumau.CardListener;
import org.sdmlib.models.pattern.PatternObject;

public class CardListenerPO extends PatternObject<CardListenerPO, CardListener>
{
   public CardListenerSet allMatches()
   {
      this.setDoAllMatches(true);
      
      CardListenerSet matches = new CardListenerSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((CardListener) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }
   
}

