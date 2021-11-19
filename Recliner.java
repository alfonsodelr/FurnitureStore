
package furniture.store;

public class Recliner extends Furniture{
    Recliner(){
        price = 129.99;
        name = "Recliner";
        modelNr = 12312;
    }
    Recliner(String x){
        price = 129.99;
        name = "Recliner (" + x + ")";
        modelNr = 12312;
    }
}
