package org.sdmlib.examples.replication;

import java.net.Socket;

import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.Role.R;
import org.sdmlib.storyboards.Storyboard;

public class ReplicationChatModel
{
   public static void main(String[] args)
   {
      Storyboard storyboard = new Storyboard("examples", "ReplicationChatModel");
      
      ClassModel model = new ClassModel("org.sdmlib.examples.replication");
      
      Clazz chatRoot = model.createClazz("ChatRoot");
      
      Clazz chatMsg = chatRoot.createClassAndAssoc("ChatMsg", "msgs", R.MANY, "root", R.ONE)
            .withAttributes(
               "text", R.STRING, 
               "time", R.LONG,
               "sender", R.STRING
                  );
      
      model.generate("examples");
      
      storyboard.addSVGImage(model.dumpClassDiagram("examples", "ReplicationChatModel01"));
      
      storyboard.dumpHTML();
   }

}
