/*
   Copyright (c) 2014 zuendorf 
   
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
   
package org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.creators;

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl;
import org.sdmlib.models.modelsets.StringList;
import java.util.List;
import org.sdmlib.models.modelsets.intList;

public class AssignmentImplSet extends SDMSet<AssignmentImpl>
{
   public AssignmentImpl first()
   {
      for (AssignmentImpl obj : this)
      {
         return obj;
      }
      
      return null;
   }


   public AssignmentImplPO startModelPattern()
   {
      org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern pattern = new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern();
      
      AssignmentImplPO patternObject = pattern.hasElementAssignmentImplPO();
      
      patternObject.withCandidates(this);
      
      pattern.setHasMatch(true);
      pattern.findMatch();
      
      return patternObject;
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.AssignmentImpl";
   }


   public AssignmentImplSet with(AssignmentImpl value)
   {
      this.add(value);
      return this;
   }
   
   public AssignmentImplSet without(AssignmentImpl value)
   {
      this.remove(value);
      return this;
   }
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (AssignmentImpl obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public AssignmentImplSet hasName(String value)
   {
      AssignmentImplSet result = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public AssignmentImplSet withName(String value)
   {
      for (AssignmentImpl obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   public intList getPoints()
   {
      intList result = new intList();
      
      for (AssignmentImpl obj : this)
      {
         result.add(obj.getPoints());
      }
      
      return result;
   }

   public AssignmentImplSet hasPoints(int value)
   {
      AssignmentImplSet result = new AssignmentImplSet();
      
      for (AssignmentImpl obj : this)
      {
         if (value == obj.getPoints())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public AssignmentImplSet withPoints(int value)
   {
      for (AssignmentImpl obj : this)
      {
         obj.setPoints(value);
      }
      
      return this;
   }

}

