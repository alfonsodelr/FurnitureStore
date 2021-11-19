
package furniture.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FurnitureBusiness {
    
    public boolean check(Customer c){
        Iterator<Map.Entry<Customer, List<Furniture>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
  
            Map.Entry<Customer, List<Furniture>> entry = iterator.next();
  
            if (c == entry.getKey()) {
  
                return true;
            }
        }
        return false;
    }
    
    public void purchase(Customer c, Furniture f){
        
        if(!check(c)){ // if customer does not exist then create new 
            List<Furniture> list = new ArrayList();
            list.add(f);
            map.put(c, list);
        }else{
            map.get(c).add(f); // c is the key (current customer) to access his/her list
        }
    }
    
    public boolean hasBought(Customer c, Furniture f){
        
        for(int i = 0; i < map.get(c).size(); i++){
            if((map.get(c).get(i)).equals(f)){
                return true;
            }
        }
        return false;
    } 
   
    public void printAll(Customer c){
        for(int i = 0; i < map.get(c).size(); i++){
            System.out.println(map.get(c).get(i));
        }
    }
    
    public List<Furniture> getPurchases(Customer c){
        return map.get(c);
    }
   
    
    private HashMap<Customer, List<Furniture>> map = new HashMap();
}

