/*
   Copyright (c) 2012 zuendorf 
   
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
   
package org.sdmlib.examples.groupAccount;
   
import java.beans.PropertyChangeSupport;

import org.junit.Test;
import org.sdmlib.models.classes.Association;
import org.sdmlib.models.classes.Card;
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.models.classes.DataType;
import org.sdmlib.models.classes.Parameter;
import org.sdmlib.storyboards.Kanban;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.storyboards.StoryboardManager;
   
public class GroupAccountTests 
{

   @Test
   public void testGroupAccountCodegen()
   {
      Storyboard storyboard = new Storyboard();
      
      storyboard.add("Start situation: Nothing here yet. Generated classes",
         Kanban.DONE, "zuendorf", "04.04.2012 00:11:32", 1, 0);
      
      ClassModel model = new ClassModel("org.sdmlib.examples.groupAccount.model");
      
      Clazz groupAccountClass = model.createClazz("GroupAccount")
            .withMethod("initAccounts", DataType.DOUBLE, new Parameter("num", DataType.DOUBLE), new Parameter("str", DataType.STRING))
            .withMethod("updateBalances", DataType.VOID);
      
      //      groupAccountClass.withRunningConstants("RED", "YELLOW", "GREEN");
      //      groupAccountClass.withConstant("NORTH", "north");
      //      groupAccountClass.withConstant("CARD", 3);
      
      Clazz personClass = model.createClazz("Person")
            .withAttribute("name", DataType.STRING)
            .withAttribute("balance", DataType.DOUBLE);
      
      groupAccountClass.withAssoc(personClass, "persons", Card.MANY, "parent", Card.ONE);
      
      Clazz itemClass = model.createClazz("Item") 
      .withAttribute("description", DataType.STRING) 
      .withAttribute("value", DataType.DOUBLE);
      
      groupAccountClass.withAssoc(itemClass, "items", Card.MANY, "parent", Card.ONE);
      
      new Association()
      .withSource(personClass, "buyer", Card.ONE)
      .withTarget(itemClass, "items", Card.MANY);

      // model.updateFromCode("examples", "examples", "org.sdmlib.examples.groupAccount");
      
      // model.insertModelCreationCodeHere("examples");
      
      // model.removeAllGeneratedCode("examples", "examples", "examples");
      
      model.generate("examples");
      
      storyboard.addClassDiagram(model, "examples");

      storyboard.add("Resolved Bug: creatorcreator class is no longer growing on each run. ",
         Kanban.DONE, "zuendorf", "24.05.2012 00:16:18", 1, 0);
      
      StoryboardManager.get()
      .add(storyboard)
      .dumpHTML();
   }
}

