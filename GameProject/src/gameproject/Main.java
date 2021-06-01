
package gameproject;

import abstracts.BaseCampaignManager;
import abstracts.BaseCustomerManager;
import abstracts.BaseSellerManager;
import adapters.EdevletServiceAdapter;
import adapters.SellerServiceAdapter;
import concrete.CampainingManager;
import concrete.GamerCustomerManager;
import concrete.SellerCustomerManager;
import entities.Gamer;
import entities.Games;
import entities.Seller;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author İlknur Helvacı
 */
public class Main {

    public static void main(String[] args) {
     BaseCustomerManager baseCustomerManager = new GamerCustomerManager(new EdevletServiceAdapter());
     BaseCampaignManager baseCampaignManager = new CampainingManager(new SellerServiceAdapter());
     BaseSellerManager baseSellerManager = new SellerCustomerManager(new SellerServiceAdapter());
     Gamer gamer = new Gamer(1, "İlknur", "Helvacı", LocalDate.of(1999, 4, 14), "14523657415", "ilknur_helvaci"); //Tc kimlik 11 haneli olmazsa not avalid person hatasını görürüz 
     Seller seller = new Seller(2, "Zeynep", "Ergun",LocalDate.of(1998, 5, 8), "14523658977", "145632");
     Games games1 = new Games("Pubg", 2230, 30);
     Games games2 = new Games("CS", 1230, 10);
     baseCustomerManager.add(gamer);
     baseCustomerManager.delete(gamer);
     baseCustomerManager.update(gamer);
     
     baseSellerManager.sell(games1, gamer);
     baseSellerManager.sell(games2, gamer);
     
     baseCampaignManager.campaignAdd(games1, seller);
     baseCampaignManager.campaignUpdate(games1, seller);
     baseCampaignManager.campaignDelete(games1, seller);
     
     
     
    }
    
}
