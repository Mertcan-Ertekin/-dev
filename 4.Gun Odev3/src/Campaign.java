
public class Campaign implements Entity {
	int Id;
	String CampaignName;
	String CampaignTime;
	int discount;
	
	public Campaign()  {
		
	}
	
	public Campaign(int id, String campaignName, String campaignTime, int discount) {
		super();
		Id = id;
		CampaignName = campaignName;
		CampaignTime = campaignTime;
		this.discount = discount;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}

	public String getCampaingTime() {
		return CampaignTime;
	}

	public void setCampaignTime(String campaignTime) {
		CampaignTime = campaignTime;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}


}
