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
public interface CampaignService {
    void campaignAdd(Games games , Customer customer);
    void campaignUpdate(Games games, Customer customer);
    void campaignDelete(Games games, Customer customer);
    
    
}
