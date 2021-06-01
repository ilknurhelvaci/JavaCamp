/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import entities.Customer;
import entities.Games;



/**
 *
 * @author İlknur Helvacı
 */
public abstract class BaseSellerManager implements SellerService {

    @Override
    public void sell(Games games, Customer customer){
        System.out.println(games.getGameName() + " oyunu " + customer.getFirstName() + " kişisine " + games.getPrice() + " Tl'ye satıldı");
    }

  
    
}
