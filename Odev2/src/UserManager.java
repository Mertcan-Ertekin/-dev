
public class UserManager {
	
	public void add(User user)    {
		System.out.println(user.Id +" "+ user.name +" Adlý kullanýcý eklendi.");
		
	}
	
	public void delete(User user)    {
		System.out.println(user.Id +" "+ user.name +" Adlý kullanýcý silindi.");
		
	}
	
	public void uptade(User user)    {
		System.out.println(user.Id +" "+ user.name +" Adlý kullanýcýnýn bilgileri güncellendi.");
		
	}
}
