/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import entities.Customer;

/**
 *
 * @author İlknur Helvacı
 */
public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void Save(Customer customer) {
        System.out.println("Saved to db : " + customer.getFirstName());
    }

}
