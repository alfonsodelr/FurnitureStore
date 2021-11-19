
package furniture.store;

public abstract class Furniture {
    
    public int hashCode(){
        int hash = 0;
        
        hash =  7 * hash + modelNr;
        hash =  7 * hash + (name == null ? 0 : name.hashCode());
        return hash;
    }
    
        @Override
    public boolean equals(Object o){
         
        if(this == o)
            return true;

        if(o == null || o.getClass()!= this.getClass())
            return false;

        Furniture c = (Furniture) o;
        
        return (c.name.equals(this.name)  && (c.modelNr == this.modelNr));
        
    }
    
   double getPrice(){
       return price;
   }
   int getModelNr(){
       return modelNr;
   }
   String getName(){
       return name;
   }
    
     String name = "";
     int modelNr = 0;
     double price = 0;
}
