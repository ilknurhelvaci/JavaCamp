
package abstracts;

import entities.Customer;
import entities.Games;

public abstract class BaseCampaignManager implements CampaignService{

    @Override
    public void campaignAdd(Games games, Customer customer) {
        System.out.println(games.getGameName() + " oyunu " + customer.getFirstName() + " tarafından % " + games.getDiscount() + " indirime girdi.");
    }

    @Override
    public void campaignUpdate(Games games, Customer customer) {
        System.out.println(games.getGameName() + " oyununun yeni fiyatı: " + games.getPrice());
    }

    @Override
    public void campaignDelete(Games games, Customer customer) {
        System.out.println(games.getGameName() + " oyununun kampanyasına " + customer.getFirstName() + " kişisi tarafından son verildi.");
    }

 
    
}
