
public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setCustomerId(1);
		user1.setEmail(" mrtcnertekin@gmail.com ");
		user1.setPassword("12345");
		
		User user2 = new User();
		user2.setId(2);
		user2.setCustomerId(2);
		user2.setEmail(" mertcan4345@gmail.com ");
		user2.setPassword("54321");
		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Valorant");
		game1.setPriceOfGame("Ücretsiz");
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("PUBG");
		game2.setPriceOfGame("69 TL");
        

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Mertcan");
		customer1.setLastName("ERTEKÝN");
		customer1.setNationalityId("25595254479");
		customer1.setBirthYear(2003);
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Efe");
		customer2.setLastName("ERTEKÝN");
		customer2.setNationalityId("25595254470");
		customer2.setBirthYear(2009);
			
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Valorant VP");
		campaign1.setCampaignTime("1 Hafta Boyunca");
		campaign1.setDiscount(25);
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setCampaignName("PUBG UC");
		campaign2.setCampaignTime("2 Hafta Boyunca");
		campaign2.setDiscount(50);
		
		
		Shop shop1 = new Shop();
		shop1.setId(1);
		shop1.setGameId(1);
		shop1.setCustomerId(1);
		shop1.setCampaignId(1);
		
		Shop shop2 = new Shop();
		shop2.setId(2);
		shop2.setGameId(2);
		shop2.setCustomerId(2);
		shop2.setCampaignId(2);	
		
		System.out.println("---------------------------------");
		System.out.println("       -----Müþteriler-----");
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.Add(customer1);
		customerManager.Uptade(customer1);
		customerManager.Delete(customer1);
		System.out.println("---------------------------------");
		customerManager.Add(customer2);
		customerManager.Uptade(customer2);
		customerManager.Delete(customer2);
		System.out.println("---------------------------------");
		
		System.out.println("       -----Hesaplar-----");
		UserManager userManager = new UserManager();
		userManager.LogIn(user1);
		userManager.SignIn(user1);
		userManager.Uptade(user1);
		userManager.Delete(user1);
		System.out.println("---------------------------------");
		userManager.LogIn(user2);
		userManager.SignIn(user2);
		userManager.Uptade(user2);
		userManager.Delete(user2);
		
		System.out.println("---------------------------------");
		System.out.println("        -----Sipariþler-----");
		ShopManager shopManager = new ShopManager();
		shopManager.Add(shop1);
		shopManager.Uptade(shop1);
		shopManager.Delete(shop1);
		System.out.println("---------------------------------");
		shopManager.Add(shop2);
		shopManager.Uptade(shop2);
		shopManager.Delete(shop2);

		System.out.println("---------------------------------");
		System.out.println("        -----Oyunlar-----");
		GameManager gameManager = new GameManager();
		gameManager.Add(game1);
		gameManager.Delete(game1);
		gameManager.Uptade(game1);
		System.out.println("---------------------------------");
		gameManager.Add(game2);
		gameManager.Delete(game2);
		gameManager.Uptade(game2);
		
		System.out.println("---------------------------------");
		System.out.println("        -----Kampanyalar-----");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign1);
		campaignManager.Delete(campaign1);
		campaignManager.Uptade(campaign1);
		System.out.println("---------------------------------");
		campaignManager.Add(campaign2);
		campaignManager.Delete(campaign2);
		campaignManager.Uptade(campaign2);
		
		
		
		
		
		
		
		
		
		

	}

}
