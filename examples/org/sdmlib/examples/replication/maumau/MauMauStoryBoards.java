package org.sdmlib.examples.replication.maumau;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;
import org.sdmlib.storyboards.Storyboard;

public class MauMauStoryBoards
{
   private int stepCounter = 1;

   @Test
   public void replicationMauMau()
   {
      // file:///C:/Users/zuendorf/eclipseworkspaces/indigo/SDMLibEMF/doc/replicationMauMau.html
      Storyboard story = new Storyboard();

      story.addStep("Abu, Karli, and Sabine want to play some replication maumau.");

      story.addStep("Abu starts a replication maumau server." );

      ReplicationMauMauServer mauMauServer = new ReplicationMauMauServer().withTestMode(true).start();

      story.addStep("Abu, Karli, and Sabine start their maumau client. On init, the clients create shared objects and they connect to the server." );

      LinkedList<Process> childs = new LinkedList<Process>();

      childs.add(startClient("Abu", story));
            
      childs.add(startClient("Karli", story));
      
      childs.add(startClient("Sabine", story));
      
      story.dumpHTML();
      
      
      for(Process p : childs)
      {
         p.destroy();
      }
   }

   private int debugSocket = 8900;
   
   private Process startClient(String name, Storyboard story)
   {
      String abuClientComand = "javaw "
            + "-Xdebug -Xrunjdwp:transport=dt_socket,address=" + (debugSocket++) 
            + ",server=y,suspend=n "
            + "-Dfile.encoding=UTF-8 "
            + "-classpath " + System.getProperty("java.class.path")
            + " org.sdmlib.examples.replication.maumau.MultiMauMauClientGui "
            + name
            ;

      Process child = null;
      try
      {
         child = Runtime.getRuntime().exec(abuClientComand);
         //         ProcessBuilder processBuilder =  new ProcessBuilder(abuClientComand);
         //         processBuilder.redirectErrorStream(true);
         //         Process child = processBuilder.start();
         InputStream inputStream = child.getInputStream();
         InputStreamReader in = new InputStreamReader(inputStream);
         BufferedReader buf = new BufferedReader(in);
         String line = null; 
         line = buf.readLine();
         line = line + "\n   " + buf.readLine();
         Assert.assertFalse("Was not able to start abu client correctly.\n" + line, line.startsWith("FATAL"));;
         story.add("<pre>   " + line + "</pre>");
      }
      catch (Exception e)
      {
         Assert.fail(e.toString());
      }
      
      int stopSize = story.getStoryboardSteps().size() + 5;
      synchronized (story)
      {
         while(story.getStoryboardSteps().size() < stopSize)
         {
            try
            {
               story.wait(1000);
               stopSize--;
            }
            catch (InterruptedException e)
            {
               // TODO Auto-generated catch block
               // e.printStackTrace();
            }
         }
      }
      
      
      return child;
   }

}
