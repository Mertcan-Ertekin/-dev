
public class CampaignManager implements ICampaingService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla eklendi. "+ campaign.getCampaignName());
		
	}

	@Override
	public void Uptade(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla g�ncellendi. "+ campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla silindi. "+ campaign.getCampaignName());
		
	}

}
