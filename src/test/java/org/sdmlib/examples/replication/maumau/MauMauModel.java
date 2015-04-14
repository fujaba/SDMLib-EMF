package org.sdmlib.examples.replication.maumau;

import static org.sdmlib.models.classes.Role.R.MANY;
import static org.sdmlib.models.classes.Role.R.ONE;

import org.eclipse.swt.widgets.Label;
import org.junit.Test;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.Role.R;
import org.sdmlib.replication.Lane;
import org.sdmlib.storyboards.Storyboard;

public class MauMauModel
{
   private static final String STRING = "String";
   private static final String INT = "int";

   @Test
   public void testMauMauModel()
   {
      // file:///C:/Users/zuendorf/eclipseworkspaces/indigo/SDMLibEMF/doc/MauMauModel.html
      Storyboard storyboard = new Storyboard("examples");

      ClassModel model = new ClassModel("org.sdmlib.examples.replication.maumau");

      Clazz mauMauClass = model.createClazz("MauMau");

      Clazz cardClass = mauMauClass.createClassAndAssoc("Card", "cards", MANY, "game", ONE)
            .withAttributes(
               "suit", Suit.class.getSimpleName(),
               "value", Value.class.getName()
                  );
      
      Clazz holderClass = mauMauClass.createClassAndAssoc("Holder", "deck", R.ONE, "deckOwner", R.ONE)
            .withAssoc(cardClass, "cards", R.MANY, "holder", R.ONE);
      
      mauMauClass.withAssoc(holderClass, "stack", R.ONE, "stackOwner", R.ONE);

      Clazz playerClass = mauMauClass.createClassAndAssoc("Player", "players", MANY, "game", ONE)
            .withSuperClazzes(holderClass)
            .withAttributes("name", STRING);
      
      playerClass.withAssoc(playerClass, "next", ONE, "prev", ONE);

      mauMauClass.withAssoc(playerClass, "currentMove", R.ONE, "assignment", R.ONE);
      
      Clazz dutyClass = model.createClazz("Duty", "kind", STRING, "number", INT);
      
      playerClass.withAssoc(dutyClass, "duty", ONE, "player", ONE);
      mauMauClass.withAssoc(dutyClass, "duty", R.ONE, "game", R.ONE);

      
      // add some listeners to the model
      model.createClazz(ReplicationMauMauServer.class.getName());
     
      model.createClazz(ServerLaneManager.class.getName(), "source", Object.class.getName());
      model.createClazz(Play7WorkFlowLaneManager.class.getName(), "source", Object.class.getName());
      model.createClazz(PlayerLaneManager.class.getName(), "source", Object.class.getName());
      
      Clazz multiMauMauControler = model.createClazz(MultiMauMauControler.class.getName(), 
         "mauMau", mauMauClass.getName(), 
         "activePlayer", playerClass.getName());
      
      Clazz cardControler = multiMauMauControler.createClassAndAssoc(CardControler.class.getName(), "cardControlers", R.MANY, "mauMauControler", R.ONE)
            .withAttributes(
               "card", Card.class.getName(),
               "label", Label.class.getName(),
               "listener", CardListener.class.getName()
                  );
      
      model.createClazz(Label.class.getName(), "text", R.STRING).withWrapped(true);
      
      
      storyboard.addClassDiagram(model);

      model.generate("examples");

      storyboard.dumpHTML();
   }
}
