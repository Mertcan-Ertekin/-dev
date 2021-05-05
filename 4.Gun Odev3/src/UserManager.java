
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
		System.out.println(user.getEmail()+ " Bilgileriniz güncellendi. Yeni bilgiler şunlardır. ");
		System.out.println("------------------------");
		System.out.println(user.getId());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println("------------------------");
		
	}

	@Override
	public void Delete(User user) {
		System.out.println(user.getEmail()+ " Bilgileriniz silindi ");
		
	}

}
