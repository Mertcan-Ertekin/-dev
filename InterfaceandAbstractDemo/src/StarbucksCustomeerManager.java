
public class StarbucksCustomeerManager extends BaseCustomerManager {
	private ICustomerCheckService _CustomerCheckService;
	
	public StarbucksCustomeerManager(ICustomerCheckService CustomerCheckService) {
		_CustomerCheckService = CustomerCheckService;

	}
	
	public void Save(Customer customer)  {
		if (_CustomerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("db'ye kaydet : "+ customer.getFirstName());		
		} 
		
		else {
			System.out.println("Geçerli bir kiþi deðil");
		}
		
	}
	

}
