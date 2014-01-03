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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl;
import org.sdmlib.models.modelsets.StringList;
import java.util.List;
import org.sdmlib.models.modelsets.intList;

public class StudentImplSet extends SDMSet<StudentImpl>
{
   public StudentImpl first()
   {
      for (StudentImpl obj : this)
      {
         return obj;
      }
      
      return null;
   }


   public StudentImplPO startModelPattern()
   {
      org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern pattern = new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern();
      
      StudentImplPO patternObject = pattern.hasElementStudentImplPO();
      
      patternObject.withCandidates(this);
      
      pattern.setHasMatch(true);
      pattern.findMatch();
      
      return patternObject;
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.StudentImpl";
   }


   public StudentImplSet with(StudentImpl value)
   {
      this.add(value);
      return this;
   }
   
   public StudentImplSet without(StudentImpl value)
   {
      this.remove(value);
      return this;
   }
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public StudentImplSet hasName(String value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withName(String value)
   {
      for (StudentImpl obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

   public intList getCredits()
   {
      intList result = new intList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getCredits());
      }
      
      return result;
   }

   public StudentImplSet hasCredits(int value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value == obj.getCredits())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withCredits(int value)
   {
      for (StudentImpl obj : this)
      {
         obj.setCredits(value);
      }
      
      return this;
   }

   public intList getMotivation()
   {
      intList result = new intList();
      
      for (StudentImpl obj : this)
      {
         result.add(obj.getMotivation());
      }
      
      return result;
   }

   public StudentImplSet hasMotivation(int value)
   {
      StudentImplSet result = new StudentImplSet();
      
      for (StudentImpl obj : this)
      {
         if (value == obj.getMotivation())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public StudentImplSet withMotivation(int value)
   {
      for (StudentImpl obj : this)
      {
         obj.setMotivation(value);
      }
      
      return this;
   }

}

