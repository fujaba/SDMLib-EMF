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
   
package org.sdmlib.examples.chats.util;

import org.sdmlib.models.modelsets.SDMSet;
import org.sdmlib.examples.chats.CTDrawPoint;
import java.util.Collection;
import org.sdmlib.models.modelsets.intList;
import org.sdmlib.models.modelsets.ObjectSet;
import org.sdmlib.examples.chats.CSVisitAllClientsFlow;

public class CTDrawPointSet extends SDMSet<CTDrawPoint>
{


   public CTDrawPointPO hasCTDrawPointPO()
   {
      return new CTDrawPointPO(this.toArray(new CTDrawPoint[this.size()]));
   }


   @Override
   public String getEntryType()
   {
      return "org.sdmlib.examples.chats.CTDrawPoint";
   }


   @SuppressWarnings("unchecked")
   public CTDrawPointSet with(Object value)
   {
      if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<CTDrawPoint>)value);
      }
      else if (value != null)
      {
         this.add((CTDrawPoint) value);
      }
      
      return this;
   }
   
   public CTDrawPointSet without(CTDrawPoint value)
   {
      this.remove(value);
      return this;
   }

   public intList getX()
   {
      intList result = new intList();
      
      for (CTDrawPoint obj : this)
      {
         result.add(obj.getX());
      }
      
      return result;
   }

   public CTDrawPointSet hasX(int value)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (value == obj.getX())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet hasX(int lower, int upper)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (lower <= obj.getX() && obj.getX() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet withX(int value)
   {
      for (CTDrawPoint obj : this)
      {
         obj.setX(value);
      }
      
      return this;
   }

   public intList getY()
   {
      intList result = new intList();
      
      for (CTDrawPoint obj : this)
      {
         result.add(obj.getY());
      }
      
      return result;
   }

   public CTDrawPointSet hasY(int value)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (value == obj.getY())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet hasY(int lower, int upper)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (lower <= obj.getY() && obj.getY() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet withY(int value)
   {
      for (CTDrawPoint obj : this)
      {
         obj.setY(value);
      }
      
      return this;
   }

   public intList getR()
   {
      intList result = new intList();
      
      for (CTDrawPoint obj : this)
      {
         result.add(obj.getR());
      }
      
      return result;
   }

   public CTDrawPointSet hasR(int value)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (value == obj.getR())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet hasR(int lower, int upper)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (lower <= obj.getR() && obj.getR() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet withR(int value)
   {
      for (CTDrawPoint obj : this)
      {
         obj.setR(value);
      }
      
      return this;
   }

   public intList getG()
   {
      intList result = new intList();
      
      for (CTDrawPoint obj : this)
      {
         result.add(obj.getG());
      }
      
      return result;
   }

   public CTDrawPointSet hasG(int value)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (value == obj.getG())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet hasG(int lower, int upper)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (lower <= obj.getG() && obj.getG() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet withG(int value)
   {
      for (CTDrawPoint obj : this)
      {
         obj.setG(value);
      }
      
      return this;
   }

   public intList getB()
   {
      intList result = new intList();
      
      for (CTDrawPoint obj : this)
      {
         result.add(obj.getB());
      }
      
      return result;
   }

   public CTDrawPointSet hasB(int value)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (value == obj.getB())
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet hasB(int lower, int upper)
   {
      CTDrawPointSet result = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (lower <= obj.getB() && obj.getB() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }

   public CTDrawPointSet withB(int value)
   {
      for (CTDrawPoint obj : this)
      {
         obj.setB(value);
      }
      
      return this;
   }

   public CSVisitAllClientsFlowSet getParent()
   {
      CSVisitAllClientsFlowSet result = new CSVisitAllClientsFlowSet();
      
      for (CTDrawPoint obj : this)
      {
         result.add(obj.getParent());
      }
      
      return result;
   }

   public CTDrawPointSet hasParent(Object value)
   {
      ObjectSet neighbors = new ObjectSet();

      if (value instanceof Collection)
      {
         neighbors.addAll((Collection<?>) value);
      }
      else
      {
         neighbors.add(value);
      }
      
      CTDrawPointSet answer = new CTDrawPointSet();
      
      for (CTDrawPoint obj : this)
      {
         if (neighbors.contains(obj.getParent()))
         {
            answer.add(obj);
         }
      }
      
      return answer;
   }

   public CTDrawPointSet withParent(CSVisitAllClientsFlow value)
   {
      for (CTDrawPoint obj : this)
      {
         obj.withParent(value);
      }
      
      return this;
   }

}
