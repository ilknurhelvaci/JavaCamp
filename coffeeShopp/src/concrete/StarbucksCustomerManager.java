/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

/**
 *
 * @author İlknur Helvacı
 */
public class StarbucksCustomerManager extends BaseCustomerManager {

    //Dependency Injection uyguluyoruz bağımlılığımızı en aza indiriyoruz.
    private CustomerCheckService customerCheckService;

    @Override
    public void Save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)) {
            super.Save(customer);
        } else {
            //Daha sonra exceptionHandling ile hallet
            System.out.println("Not a valid person !!");
        }

    }

}
