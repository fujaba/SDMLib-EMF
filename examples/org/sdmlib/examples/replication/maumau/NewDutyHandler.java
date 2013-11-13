package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

public class NewDutyHandler extends ChangeHandler
{
   
   
   public class DutyNumberListener implements
         PropertyChangeListener
   {
      @Override
      public void propertyChange(PropertyChangeEvent evt)
      {
         dutyLabel.setText(currentPlayer.getName() + ": draw " + duty.getNumber()
            + " cards");
      }
   }

   private MultiMauMauControler maumauControler;
   private Label dutyLabel = null;
   private Player currentPlayer;
   private Duty duty;

   public NewDutyHandler(MultiMauMauControler maumauControler)
   {
      this.maumauControler = maumauControler;
   }

   @Override
   public boolean propertyChange(PropertyChangeEvent evt)
   {
      if (evt != null && MauMau.PROPERTY_DUTY.equals(evt.getPropertyName()) && evt.getNewValue() != null && dutyLabel == null)
      {
         MauMauClientGui gui = maumauControler.getGui();
         
         dutyLabel = new Label(gui.getShell(), SWT.NONE);
         
         dutyLabel.setBounds(MauMauClientGui.STACK_X + 100, MauMauClientGui.STACK_Y, 292, 50);
         dutyLabel.setAlignment(SWT.CENTER);
         
         MauMau mauMau = maumauControler.getMauMau();
         
         currentPlayer = mauMau.getCurrentMove();
         
         duty = mauMau.getDuty();
         
         DutyNumberListener listener = new DutyNumberListener();
         duty.getPropertyChangeSupport().addPropertyChangeListener(Duty.PROPERTY_NUMBER, listener);
         listener.propertyChange(null);
         
         gui.withDutyLabel(dutyLabel);
         
         return true;
      }
      else if (evt != null && MauMau.PROPERTY_DUTY.equals(evt.getPropertyName()) && evt.getOldValue() != null && dutyLabel != null)
      {
         dutyLabel.dispose();
         dutyLabel = null;
         return true;
      }

      return false;
   }
}
