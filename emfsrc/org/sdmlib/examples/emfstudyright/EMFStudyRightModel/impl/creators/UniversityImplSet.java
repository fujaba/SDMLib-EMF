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
import org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl;
import org.sdmlib.models.modelsets.StringList;
import java.util.List;

public class UniversityImplSet extends SDMSet<UniversityImpl>
{
   public UniversityImpl first()
   {
      for (UniversityImpl obj : this)
      {
         return obj;
      }
      
      return null;
   }


   public UniversityImplPO startModelPattern()
   {
      org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern pattern = new org.sdmlib.examples.emfstudyright.EMFStudyRightModel.creators.ModelPattern();
      
      UniversityImplPO patternObject = pattern.hasElementUniversityImplPO();
      
      patternObject.withCandidates(this);
      
      pattern.setHasMatch(true);
      pattern.findMatch();
      
      return patternObject;
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.emfstudyright.EMFStudyRightModel.impl.UniversityImpl";
   }


   public UniversityImplSet with(UniversityImpl value)
   {
      this.add(value);
      return this;
   }
   
   public UniversityImplSet without(UniversityImpl value)
   {
      this.remove(value);
      return this;
   }
   public StringList getName()
   {
      StringList result = new StringList();
      
      for (UniversityImpl obj : this)
      {
         result.add(obj.getName());
      }
      
      return result;
   }

   public UniversityImplSet hasName(String value)
   {
      UniversityImplSet result = new UniversityImplSet();
      
      for (UniversityImpl obj : this)
      {
         if (value.equals(obj.getName()))
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public UniversityImplSet withName(String value)
   {
      for (UniversityImpl obj : this)
      {
         obj.setName(value);
      }
      
      return this;
   }

}

