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
import org.sdmlib.models.classes.ClassModel;
import org.sdmlib.models.classes.Clazz;
import org.sdmlib.serialization.PropertyChangeInterface;
import org.sdmlib.storyboards.Storyboard;
import org.sdmlib.storyboards.StoryboardManager;
   
public class GroupAccountTests implements PropertyChangeInterface 
{

   @Test
   public void testGroupAccountCodegen()
   {
      Storyboard storyboard = new Storyboard("examples");
      
      storyboard.add("Start situation: Nothing here yet. Generated classes",
         DONE, "zuendorf", "04.04.2012 00:11:32", 1, 0);
      
      ClassModel model = new ClassModel("org.sdmlib.examples.groupAccount");
      
      Clazz groupAccountClass = new Clazz("GroupAccount")
      .withMethods("initAccounts(double,String)", DOUBLE)
      .withMethods("updateBalances()", "void");
      
      //      groupAccountClass.withRunningConstants("RED", "YELLOW", "GREEN");
      //      groupAccountClass.withConstant("NORTH", "north");
      //      groupAccountClass.withConstant("CARD", 3);
      
      Clazz personClass = new Clazz(
         "Person",
         "name", STRING,
         "balance", DOUBLE);
      
      groupAccountClass.withAssoc(personClass, "persons", MANY, "parent", ONE);
      
      Clazz itemClass = new Clazz("Item", 
         "description", STRING, 
         "value", DOUBLE);
      
      groupAccountClass.withAssoc(itemClass, "items", MANY, "parent", ONE);
      
      new Association()
      .withSource("buyer", personClass, ONE)
      .withTarget("items", itemClass, MANY);

      // model.updateFromCode("examples", "examples", "org.sdmlib.examples.groupAccount");
      
      // model.insertModelCreationCodeHere("examples");
      
      // model.removeAllGeneratedCode("examples", "examples", "examples");
      
      model.generate("examples", "examples");
      
      storyboard.addSVGImage(model.dumpClassDiagram("examples", "GroupAccountClassDiag01"));

      storyboard.add("Resolved Bug: creatorcreator class is no longer growing on each run. ",
         DONE, "zuendorf", "24.05.2012 00:16:18", 1, 0);
      
      StoryboardManager.get()
      .add(storyboard)
      .dumpHTML();
   }

   private static final String MODELING = "modeling";
   private static final String ACTIVE = "active";
   private static final String DONE = "done";
   private static final String IMPLEMENTATION = "implementation";
   private static final String BACKLOG = "backlog";

   
   //==========================================================================
   
   public Object get(String attrName)
   {
      return null;
   }

   
   //==========================================================================
   
   public boolean set(String attrName, Object value)
   {
      return false;
   }

   
   //==========================================================================
   
   protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);
   
   public PropertyChangeSupport getPropertyChangeSupport()
   {
      return listeners;
   }

   
   //==========================================================================
   
   public void removeYou()
   {
      getPropertyChangeSupport().firePropertyChange("REMOVE_YOU", this, null);
   }
}

