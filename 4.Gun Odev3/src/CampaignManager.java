
public class CampaignManager implements ICampaingService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya başarıyla eklendi. "+ campaign.getCampaignName());
		
	}

	@Override
	public void Uptade(Campaign campaign) {
		System.out.println("Kampanya başarıyla güncellendi. "+ campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya başarıyla silindi. "+ campaign.getCampaignName());
		
	}

}
