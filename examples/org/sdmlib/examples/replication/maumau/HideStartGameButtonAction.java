package org.sdmlib.examples.replication.maumau;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.sdmlib.replication.BoardTask;
import org.sdmlib.replication.RemoteTaskBoard;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.swt.ScreenShotRunnable;

public class HideStartGameButtonAction implements PropertyChangeListener
{

   private MauMauClientGui gui = null;

   public HideStartGameButtonAction withGui(MauMauClientGui gui)
   {
      this.gui = gui;
      return this;
   }

   private Label startGameLabel;

   @Override
   public void propertyChange(PropertyChangeEvent evt)
   {
      if (evt.getNewValue() != null
            && BoardTask.START.equals(evt.getNewValue()))
      {
         boolean oldState = gui.getSharedSpace().isApplyingChangeMsg();

         try
         {
            gui.getSharedSpace().setApplyingChangeMsg(false);

            gui.getStartGameLabel().dispose();
         }
         finally
         {
            gui.getSharedSpace().setApplyingChangeMsg(oldState);
         }
      }
   }
}
