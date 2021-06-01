
package abstracts;

import entities.Customer;
import entities.Games;

public interface SellerService {
    void sell(Games games, Customer customer);
}
