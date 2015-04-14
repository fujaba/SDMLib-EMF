/*
   Copyright (c) 2013 zuendorf 
   
   Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
   and associated documentation files (the "Software"), to deal in the Software without restriction, 
   including without limitation the rights to use, copy, modify, merge, publish, distribute, 
   sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is 
   furnished to do so, subject to the following conditions: 
   
   The above copyright notice and this permission notice shall be included in all copies or 
   substantial portions of the Software. 
   
   The Software shall be used for Good, not Evil. 
   
   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
   BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
   DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */
   
package org.sdmlib.examples.replication.maumau.creators;

import java.util.LinkedHashSet;
import org.sdmlib.examples.replication.maumau.CardControler;
import org.sdmlib.models.modelsets.StringList;
import org.sdmlib.examples.replication.maumau.creators.CardSet;
import org.sdmlib.examples.replication.maumau.Card;
import org.sdmlib.examples.replication.maumau.creators.LabelSet;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.examples.replication.maumau.creators.CardListenerSet;
import org.sdmlib.examples.replication.maumau.CardListener;
import org.sdmlib.examples.replication.maumau.creators.MultiMauMauControlerSet;
import org.sdmlib.examples.replication.maumau.MultiMauMauControler;

public class CardControlerSet extends LinkedHashSet<CardControler> implements org.sdmlib.models.modelsets.ModelSet
{


   public String toString()
   {
      StringList stringList = new StringList();
      
      for (CardControler elem : this)
      {
         stringList.add(elem.toString());
      }
      
      return "(" + stringList.concat(", ") + ")";
   }


   public String getEntryType()
   {
      return "org.sdmlib.examples.replication.maumau.CardControler";
   }


   public CardControlerSet with(CardControler value)
   {
      this.add(value);
      return this;
   }
   
   public CardControlerSet without(CardControler value)
   {
      this.remove(value);
      return this;
   }
   public CardSet getCard()
   {
      CardSet result = new CardSet();
      
      for (CardControler obj : this)
      {
         result.add(obj.getCard());
      }
      
      return result;
   }

   public CardControlerSet withCard(Card value)
   {
      for (CardControler obj : this)
      {
         obj.setCard(value);
      }
      
      return this;
   }

   public LabelSet getLabel()
   {
      LabelSet result = new LabelSet();
      
      for (CardControler obj : this)
      {
         result.add(obj.getLabel());
      }
      
      return result;
   }

   public CardControlerSet withLabel(Label value)
   {
      for (CardControler obj : this)
      {
         obj.setLabel(value);
      }
      
      return this;
   }

   public CardListenerSet getListener()
   {
      CardListenerSet result = new CardListenerSet();
      
      for (CardControler obj : this)
      {
         result.add(obj.getListener());
      }
      
      return result;
   }

   public CardControlerSet withListener(CardListener value)
   {
      for (CardControler obj : this)
      {
         obj.setListener(value);
      }
      
      return this;
   }

   public MultiMauMauControlerSet getMauMauControler()
   {
      MultiMauMauControlerSet result = new MultiMauMauControlerSet();
      
      for (CardControler obj : this)
      {
         result.add(obj.getMauMauControler());
      }
      
      return result;
   }

   public CardControlerSet withMauMauControler(MultiMauMauControler value)
   {
      for (CardControler obj : this)
      {
         obj.withMauMauControler(value);
      }
      
      return this;
   }


   public CardControler hasCard(Card wantedCard)
   {
      for (CardControler cc : this)
      {
         if (cc.getCard() == wantedCard)
         {
            return cc;
         }
      }
      return null;
   }

}

