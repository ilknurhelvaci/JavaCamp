
package adapters;

import abstracts.SellerDiscountService;
import entities.Games;

public class SellerServiceAdapter implements SellerDiscountService{

    @Override
    public double discountedPrice(Games games) {
        return games.getPrice() - (games.getPrice()*games.getDiscount())/100;
    }

    
}
