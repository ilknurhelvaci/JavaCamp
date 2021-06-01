/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

import abstracts.CustomerCheckService;
import entities.Customer;

/**
 *
 * @author İlknur Helvacı
 */
public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;

    }

}
