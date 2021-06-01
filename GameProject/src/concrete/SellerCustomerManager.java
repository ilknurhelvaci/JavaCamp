
package concrete;

import abstracts.BaseSellerManager;
import adapters.SellerServiceAdapter;
import entities.Customer;
import entities.Games;


public class SellerCustomerManager extends BaseSellerManager {
   SellerServiceAdapter sellerServiceAdapter;

    public SellerCustomerManager(SellerServiceAdapter sellerServiceAdapter) {
        this.sellerServiceAdapter = sellerServiceAdapter;
    }
    
    @Override
    public void sell(Games games, Customer customer) {
        super.sell(games, customer); 
    }
    
    
}
