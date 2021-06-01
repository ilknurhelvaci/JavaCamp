
package concrete;

import abstracts.BaseCampaignManager;
import adapters.SellerServiceAdapter;
import entities.Customer;
import entities.Games;

/**
 *
 * @author İlknur Helvacı
 */
public class CampainingManager extends BaseCampaignManager {
    SellerServiceAdapter sellerServiceAdapter ;

    public CampainingManager(SellerServiceAdapter sellerServiceAdapter) {
        this.sellerServiceAdapter = sellerServiceAdapter;
    }

    @Override
    public void campaignDelete(Games games, Customer customer) {
        super.campaignDelete(games, customer);
    }

    @Override
    public void campaignUpdate(Games games, Customer customer) {
        games.setPrice((int)this.sellerServiceAdapter.discountedPrice(games));
        super.campaignUpdate(games, customer);
    }

    @Override
    public void campaignAdd(Games games, Customer customer) {
        super.campaignAdd(games, customer);
    }
    
    
    
}
