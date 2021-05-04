
public class ShopManager implements IShopService{

	@Override
	public void Add(Shop shop) {
		System.out.println("Siparişiniz oluşturuldu. Bilgileriniz aşağıdadır. ");
		System.out.println("---------");
		System.out.println("Id: "+shop.getId());
		System.out.println("Customer Id: "+shop.getCustomerId());
		System.out.println("Game Id: "+shop.getGameId());
		System.out.println("Campaign Id: "+shop.getCampaignId());
		
	}

	@Override
	public void Uptade(Shop shop) {
		System.out.println("Siparişiniz güncellenmiştir. Yeni bilgiler şunlardır.");
		System.out.println("---------");
		System.out.println("Id: "+shop.getId());
		System.out.println("Customer Id: "+shop.getCustomerId());
		System.out.println("Game Id: "+shop.getGameId());
		System.out.println("Campaign Id: "+shop.getCampaignId());
		
	}

	@Override
	public void Delete(Shop shop) {
		System.out.println("Siparişiniz silinmiştir.");
		System.out.println("---------");
		System.out.println("Id: "+shop.getId());
		System.out.println("Customer Id: "+shop.getCustomerId());
		System.out.println("Game Id: "+shop.getGameId());
		System.out.println("Campaign Id: "+shop.getCampaignId());
		
	}

}
