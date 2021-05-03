
public class NeroCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService CustomerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService CustomerCheckService)  {
		 this.CustomerCheckService = CustomerCheckService;
	}
	
	public void Save(Customer customer) {
		
		if (CustomerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("db'ye kaydet : " + customer.getFirstName());
			
		}
		else {
			System.out.println("Geçerli bir kiþi deðil");
		}
		
		
	}

}
