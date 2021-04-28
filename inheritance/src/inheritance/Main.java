package inheritance;

public class Main {

	public static void main(String[] args) {
		individualCustomer mertcan = new individualCustomer();
		mertcan.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "67890";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "24680";
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add(hepsiBurada);
		customerManager.Add(mertcan);
		customerManager.Add(sendikaCustomer);
		
		Customer[] customers = {mertcan, hepsiBurada, sendikaCustomer};
        
		customerManager.AddMultiple(customers);
	}

}
