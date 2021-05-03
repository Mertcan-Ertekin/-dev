import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Mertcan");
		customer.setLastName("ERTEKÝN");
		customer.setNationalityId("25595254478");
		customer.setDateOfBirth(new GregorianCalendar(2003, 11 , 28).getTime());
		
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomeerManager(new ICustomerCheckService() {
			
			@Override
			public boolean CheckIfRealPerson(Customer customer) {
				return false;
			}
		});
		baseCustomerManager.Save(customer);

	}

}
