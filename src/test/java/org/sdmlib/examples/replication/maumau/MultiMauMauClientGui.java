package org.sdmlib.examples.replication.maumau;

import org.eclipse.swt.widgets.Display;

public class MultiMauMauClientGui
{
   /**
    * Launch the application.
    * @param args
    */
   public static void main(String[] args)
   {
      try
      {
         MauMauClientGui gui = new MauMauClientGui();

         Display.getDefault().asyncExec(new MultiMauMauClientInitTask(gui, args));

         System.out.println("Starting maumau client for " + args[0]);

         gui.open();
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

}
