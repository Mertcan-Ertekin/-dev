
public class CustomerManager implements ICustomerService{

	public ICustomerCheckService _customerCheck;

	public CustomerManager(ICustomerCheckService _customerCheck) {
		this._customerCheck = _customerCheck;
	}

	@Override
    public void Add(Customer customer) {
		
        if(_customerCheck.checkIfRealPerson(customer)) 
        {
            System.out.println(customer.getFirstName()+" Müþteri eklendi. "); 
        }
        
        else 
        {
            System.out.println("Bilgileriniz doðru deðil. ");
        }


    }

	@Override
	public void Uptade(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Bilgileriniz güncellendi. ");

	}

	@Override
	public void Delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Bilgileriniz silindi. ");

	}

}
