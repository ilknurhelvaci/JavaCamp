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
public interface CustomerService {
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    
}
