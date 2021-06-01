
package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

/**
 *
 * @author İlknur Helvacı
 */
public class GamerCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public GamerCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void update(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
          super.update(customer);
        }
        else{
            System.out.println("Not a valid person!!");
        }
    }

    @Override
    public void delete(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
        super.delete(customer);
        }
        else{
            System.out.println("Not a valid person!!");
        } 
        super.delete(customer);
    }

    @Override
    public void add(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.add(customer); 
        }
        else{
            System.out.println("Not a valid person!!");
        }
    }
    
    
    
    
    
}
