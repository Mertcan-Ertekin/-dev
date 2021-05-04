
public class UserManager implements IUserService {

	@Override
	public void LogIn(User user) {
		System.out.println("Kayıt olundu. " + user.getEmail() + " Hoş geldiniz. ");
		
	}
	
	@Override
	public void SignIn(User user) {
		System.out.println(user.getEmail()+ " Başarıyla giriş yaptınız. ");
	
	}

	@Override
	public void Uptade(User user) {
		System.out.println(user.getEmail()+ " Bilgileriniz güncellendi. ");
		
	}

	@Override
	public void Delete(User user) {
		System.out.println(user.getEmail()+ " Bilgileriniz silindi ");
		
	}

}
