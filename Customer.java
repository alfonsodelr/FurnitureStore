
package furniture.store;

public class Customer {
    
    Customer(){
        id = 0;
        name = "";
        address = "";
    }
    
    Customer(int id_, String name_, String address_){
        id = id_;
        name = name_;
        address = address_;
    }
    
     public int convert(String x){
        int return_this = 0;
        
        for(int i = 0; i < x.length(); i++){
            return_this += (int)x.charAt(i);
        }
        
        return return_this;
    }
    
         @Override 
    public int hashCode(){
        int hash = 0;
        
        hash =  7 * hash + id;
        hash =  7 *hash + (address == null ? 0 : address.hashCode());
        hash =  7 * hash + (name == null ? 0 : name.hashCode());
        return hash;
    }
    
        @Override
    public boolean equals(Object o){
         
        if(this == o)
            return true;

        if(o == null || o.getClass()!= this.getClass())
            return false;

        Customer c = (Customer) o;
        
        return (c.name.equals(this.name)  && c.id == this.id && c.address.equals(this.address));
        
    }
    
    
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setID(int x){
        id = x;
    }
    public void setName(String x){
        name = x;
    }
    public void setAddress(String x){
        address = x;
    }
    
    
    public void printInfo(){
        System.out.println( "Name: "+ getName());
        System.out.println( "Address:  " + getAddress());
        System.out.println( "ID: " + getID());
    }
    
    public int id;
    public String name;
    public String address;
    
}
