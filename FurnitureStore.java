
package furniture.store;

import java.util.ArrayList;
import java.util.List;

public class FurnitureStore {
    
    public static void main(String[] args) {
        
        FurnitureBusiness B = new FurnitureBusiness();
        ArrayList<Customer> customers = new ArrayList();
        ArrayList<Furniture> furniture = new ArrayList();
        
        Customer C1 = new Customer(20313 ,"Sergio Graves", "California");
        Customer C2 = new Customer(12313, "Beth Thomas", "Netherlands");
        Customer C3 = new Customer(13244, "Henry Underwood", "Nigeria");
        
        Table table = new Table();
        Chair chair = new Chair();
        Recliner recliner = new Recliner();
        Recliner recliner_2 = new Recliner("used");
        Sofa sofa = new Sofa();
        
        furniture.add(table);
        furniture.add(chair);
        furniture.add(recliner);
        furniture.add(recliner_2);
        furniture.add(sofa);
        
        B.purchase(C1, table);
        B.purchase(C1, chair);
        B.purchase(C1, recliner);
        
        B.purchase(C2, recliner_2);
        
        B.purchase(C3, sofa);
        
        customers.add(C1);
        customers.add(C2);
        customers.add(C3);
        
        for(int i = 0; i < customers.size(); i++){
            System.out.println("==============================");
            customers.get(i).printInfo();
            printFurniture(furniture, B, customers.get(i));
        }
        
        System.out.println("==============================");

        
        List<Furniture> temp;
        
            for(int i = 0; i < customers.size(); i++){
                temp = B.getPurchases(customers.get(i));
                System.out.println(customers.get(i).getName() + "'s bought items: ");
            System.out.println("==============================");
                for(int j = 0; j < temp.size(); j++){
                    System.out.println(temp.get(j).getName());
                }
                System.out.println("\n==============================");
        }
        

        
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void printFurniture(ArrayList<Furniture> x, FurnitureBusiness y, Customer z){
        for(int i = 0; i < x.size(); i++){
            System.out.println("\nName: " + x.get(i).getName());
            System.out.println("Model: " + x.get(i).getModelNr());
            System.out.println("Price: " + x.get(i).getPrice());
            if(y.hasBought(z, x.get(i))){
                System.out.println("(HAS BOUGHT)");
            }
        }
    }
    
}

