package org.sdmlib.examples.replication;

import org.eclipse.swt.widgets.Display;
import org.sdmlib.replication.ReplicationChannel;
import org.sdmlib.replication.SharedSpace;
import org.sdmlib.serialization.json.JsonObject;

public class SWTSharedSpace extends SharedSpace
{
   private boolean firstMessage = true;

   @Override
   public void enqueueMsg(ReplicationChannel channel, String msg)
   {
      if (firstMessage)
      {
         firstMessage = false;
         JsonObject jsonObject = new JsonObject().withValue(msg);
         if (jsonObject.get(SharedSpace.CURRENT_HISTORY_ID) != null)
         {
            long receivedId = jsonObject.getLong(CURRENT_HISTORY_ID);
            if (receivedId > this.getLastChangeId())
            {
               this.setLastChangeId(receivedId);
               synchronized (this)
               {
                  this.notifyAll();
               }
            }
            return;
         }
      }
      
      // create a handling task and enqueue at display
      ChannelMsg channelMsg = new ChannelMsg(channel, msg);
      Display.getDefault().asyncExec(new HandleMsgTask(channelMsg));
      
   }

   private class HandleMsgTask implements Runnable
   {
      private ChannelMsg msg;

      public HandleMsgTask(ChannelMsg msg)
      {
         this.msg = msg;
      }

      @Override
      public void run()
      {
         handleMessage(msg);
      }
   }

}
