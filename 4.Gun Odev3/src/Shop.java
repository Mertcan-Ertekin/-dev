
public class Shop implements Entity {
	int Id;
	int CustomerId;
	int GameId;
	int CampaignId;
	
	public Shop()  {
		
	}
	
	public Shop(int id, int gameId, int customerId, int campaignId) {
		super();
		Id = id;
		CustomerId = customerId;
		GameId = gameId;
		CampaignId = campaignId;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getGameId() {
		return GameId;
	}

	public void setGameId(int gameId) {
		GameId = gameId;
	}

	public int getCampaignId() {
		return CampaignId;
	}

	public void setCampaignId(int campaignId) {
		CampaignId = campaignId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	} 
	

}
