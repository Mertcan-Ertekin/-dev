
public class CustomerManager implements ICustomerService{

	public ICustomerCheckService _customerCheck;

	public CustomerManager(ICustomerCheckService _customerCheck) {
		this._customerCheck = _customerCheck;
	}

	@Override
    public void Add(Customer customer) {
		
        if(_customerCheck.checkIfRealPerson(customer)) 
        {
            System.out.println(customer.getFirstName()+" M��teri eklendi. "); 
        }
        
        else 
        {
            System.out.println("Bilgileriniz do�ru de�il. ");
        }


    }

	@Override
	public void Uptade(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Bilgileriniz g�ncellendi. ");

	}

	@Override
	public void Delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Bilgileriniz silindi. ");

	}

}
