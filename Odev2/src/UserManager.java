
public class UserManager {
	
	public void add(User user)    {
		System.out.println(user.Id +" "+ user.name +" Adl� kullan�c� eklendi.");
		
	}
	
	public void delete(User user)    {
		System.out.println(user.Id +" "+ user.name +" Adl� kullan�c� silindi.");
		
	}
	
	public void uptade(User user)    {
		System.out.println(user.Id +" "+ user.name +" Adl� kullan�c�n�n bilgileri g�ncellendi.");
		
	}
}
