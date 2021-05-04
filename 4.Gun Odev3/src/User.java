
public class User implements Entity{
	
	int Id;
	String Email;
	String Password;
    int CustomerId;
    
    public User() {
    	
    }
    
	public User(int id, String email, String password, int customerId) {
		super();
		Id = id;
		Email = email;
		Password = password;
		CustomerId = customerId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
    
    

}
