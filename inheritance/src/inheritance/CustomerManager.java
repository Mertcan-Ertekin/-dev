package inheritance;

public class CustomerManager {
	public void Add(Customer customers) {
		System.out.println(customers.customerNumber + " kaydedildi.");
		
	}
    
	public void AddMultiple(Customer[] customers) {
		for (Customer customer : customers) {
		Add(customer);
			
		}
	}

}
