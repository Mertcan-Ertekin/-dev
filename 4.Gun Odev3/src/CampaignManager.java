
public class CampaignManager implements ICampaingService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya baþarýyla eklendi. "+ campaign.getCampaignName());
		
	}

	@Override
	public void Uptade(Campaign campaign) {
		System.out.println("Kampanya baþarýyla güncellendi. "+ campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya baþarýyla silindi. "+ campaign.getCampaignName());
		
	}

}
