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
   
package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.sdmlib.utils.PropertyChangeInterface;
import java.beans.PropertyChangeSupport;
import org.sdmlib.examples.replication.maumau.creators.CardControlerSet;

public class CardControler implements PropertyChangeListener, PropertyChangeInterface
{

   private Card card;
   private MauMauClientGui gui;
   private Label label = null;
   
   public CardControler(MultiMauMauControler mauMauControler, Card newCard)
   {
      this.mauMauControler = mauMauControler;
      this.gui = mauMauControler.getGui();
      this.card = newCard;
   }

   public CardControler()
   {
      // TODO Auto-generated constructor stub
   }

   private static int cardNo = 1;
   private CardListener listener;
   
   public Card getCard()
   {
      return card;
   }
   
   public Label getLabel()
   {
      return label;
   }
   
   public CardListener getListener()
   {
      return listener;
   }

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (card.getValue() == null || card.getSuit() == null || card.getGame() == null)
      {
         // not yet initialized 
         return;
      }

      MauMau game = card.getGame();

      if (label == null)
      {
         // create inital label
         label = new Label(gui.getShell(), SWT.BORDER | SWT.SHADOW_NONE);
         label.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
         label.setAlignment(SWT.CENTER);

         label.setBounds(42, 42, gui.CARD_WIDTH, gui.CARD_HEIGHT);

         label.moveAbove(null);
         String txt = " "; //  + card.getValue() + " " + card.getSuit();
         label.setText(txt);

         listener = new CardListener(card, mauMauControler, label);
         label.addMouseListener(listener);
         label.addMouseMoveListener(listener);
      }

      if (card.getHolder() != null && card.getHolder() instanceof Player)
      {
         Label playerLabel = mauMauControler.getPlayerLabels().get(card.getHolder());
         int xpos = playerLabel.getBounds().x + 100 + card.getHolder().getCards().size() * 40;
         int ypos = playerLabel.getBounds().y - 40 - card.getHolder().getCards().size() * 2;
         label.setBounds(xpos, ypos, gui.CARD_WIDTH, gui.CARD_HEIGHT);
         label.moveAbove(null);
      }

      if (card.getHolder() == mauMauControler.getActivePlayer())
      {
         label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
         label.moveAbove(null);

         String txt = "" + card.getValue() + " " + card.getSuit();
         label.setText(txt);
      }

      if (card.getHolder() == game.getStack())
      {
         // show card
         label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
         label.moveAbove(null);
         String txt = "" + card.getValue() + " " + card.getSuit();
         label.setText(txt);

         int xpos = MauMauClientGui.STACK_X + card.getHolder().getCards().size() * 10 - 8;
         int ypos = MauMauClientGui.STACK_Y  - card.getHolder().getCards().size() * 2;
         label.setBounds(xpos, ypos, gui.CARD_WIDTH, gui.CARD_HEIGHT);
      }

      if (card.getHolder() == game.getDeck())
      {
         label.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
         label.moveAbove(null);

         String txt = " "; //  + card.getValue() + " " + card.getSuit();
         label.setText(txt);

         int cardNo = game.getDeck().getCards().size();
         int xpos = 150 + (cardNo - 10) * 1;
         int ypos = 350 - gui.CARD_HEIGHT / 2 - (cardNo - 10) * 1;
         label.setBounds(xpos, ypos, gui.CARD_WIDTH, gui.CARD_HEIGHT);
      }

      if (game.getDeck().getCards().size() == 0 && game.getStack().getCards().size() >= 2
            && evt.getPropertyName().equals(Card.PROPERTY_HOLDER)
            && evt.getNewValue() instanceof Player)
      {
         Holder holder = (Holder) evt.getOldValue();
         if (holder.getDeckOwner() != null)
         {
            // last card from deck has been drawn. 
            game.shuffleStackToDeck();
         }
      }
   }


   
   //==========================================================================
   
   public Object get(String attrName)
   {
      if (PROPERTY_CARD.equalsIgnoreCase(attrName))
      {
         return getCard();
      }

      if (PROPERTY_LABEL.equalsIgnoreCase(attrName))
      {
         return getLabel();
      }

      if (PROPERTY_LISTENER.equalsIgnoreCase(attrName))
      {
         return getListener();
      }

      if (PROPERTY_MAUMAUCONTROLER.equalsIgnoreCase(attrName))
      {
         return getMauMauControler();
      }

      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      if (PROPERTY_CARD.equalsIgnoreCase(attrName))
      {
         setCard((org.sdmlib.examples.replication.maumau.Card) value);
         return true;
      }

      if (PROPERTY_LABEL.equalsIgnoreCase(attrName))
      {
         setLabel((org.eclipse.swt.widgets.Label) value);
         return true;
      }

      if (PROPERTY_LISTENER.equalsIgnoreCase(attrName))
      {
         setListener((org.sdmlib.examples.replication.maumau.CardListener) value);
         return true;
      }

      if (PROPERTY_MAUMAUCONTROLER.equalsIgnoreCase(attrName))
      {
         setMauMauControler((MultiMauMauControler) value);
         return true;
      }

      return false;
   }

   
   //==========================================================================
   
   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   
   public PropertyChangeSupport getPropertyChangeSupport()
   {
      return listeners;
   }
   
   public void addPropertyChangeListener(PropertyChangeListener listener) 
   {
      getPropertyChangeSupport().addPropertyChangeListener(listener);
   }

   
   //==========================================================================
   
   public void removeYou()
   {
      setMauMauControler(null);
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }

   
   //==========================================================================
   
   public static final String PROPERTY_CARD = "card";
   
   public void setCard(org.sdmlib.examples.replication.maumau.Card value)
   {
      if (this.card != value)
      {
         org.sdmlib.examples.replication.maumau.Card oldValue = this.card;
         this.card = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_CARD, oldValue, value);
      }
   }
   
   public CardControler withCard(org.sdmlib.examples.replication.maumau.Card value)
   {
      setCard(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_LABEL = "label";
   
   public void setLabel(org.eclipse.swt.widgets.Label value)
   {
      if (this.label != value)
      {
         org.eclipse.swt.widgets.Label oldValue = this.label;
         this.label = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_LABEL, oldValue, value);
      }
   }
   
   public CardControler withLabel(org.eclipse.swt.widgets.Label value)
   {
      setLabel(value);
      return this;
   } 

   
   //==========================================================================
   
   public static final String PROPERTY_LISTENER = "listener";
   
   public void setListener(org.sdmlib.examples.replication.maumau.CardListener value)
   {
      if (this.listener != value)
      {
         org.sdmlib.examples.replication.maumau.CardListener oldValue = this.listener;
         this.listener = value;
         getPropertyChangeSupport().firePropertyChange(PROPERTY_LISTENER, oldValue, value);
      }
   }
   
   public CardControler withListener(org.sdmlib.examples.replication.maumau.CardListener value)
   {
      setListener(value);
      return this;
   } 

   
   public static final CardControlerSet EMPTY_SET = new CardControlerSet();

   
   /********************************************************************
    * <pre>
    *              many                       one
    * CardControler ----------------------------------- MultiMauMauControler
    *              cardControlers                   mauMauControler
    * </pre>
    */
   
   public static final String PROPERTY_MAUMAUCONTROLER = "mauMauControler";
   
   private MultiMauMauControler mauMauControler = null;
   
   public MultiMauMauControler getMauMauControler()
   {
      return this.mauMauControler;
   }
   
   public boolean setMauMauControler(MultiMauMauControler value)
   {
      boolean changed = false;
      
      if (this.mauMauControler != value)
      {
         MultiMauMauControler oldValue = this.mauMauControler;
         
         if (this.mauMauControler != null)
         {
            this.mauMauControler = null;
            oldValue.withoutCardControlers(this);
         }
         
         this.mauMauControler = value;
         
         if (value != null)
         {
            value.withCardControlers(this);
         }
         
         getPropertyChangeSupport().firePropertyChange(PROPERTY_MAUMAUCONTROLER, oldValue, value);
         changed = true;
      }
      
      return changed;
   }
   
   public CardControler withMauMauControler(MultiMauMauControler value)
   {
      setMauMauControler(value);
      return this;
   } 
   
   public MultiMauMauControler createMauMauControler()
   {
      MultiMauMauControler value = new MultiMauMauControler();
      withMauMauControler(value);
      return value;
   } 
}

