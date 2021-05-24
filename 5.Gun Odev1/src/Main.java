import Business.concretes.UserManager;
import Core.concretes.GoogleAuthAdapter;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new HibernateUserDao());
		User user = new User(1, "Mertcan", "Ertekin", "mrtcnertekin@gmail.com", "123456");

		userManager.register(user);
		userManager.verifyEmail(user.isVerification());

		userManager.login("mrtcnertekin@gmail.com", "123456");

		System.out.println();
		System.out.println("------------- Google ile giriş -------------");
		System.out.println();

		GoogleAuthAdapter google = new GoogleAuthAdapter();
		google.loginGoogle("mrtcnertekin@gmail.com");
	}

}
