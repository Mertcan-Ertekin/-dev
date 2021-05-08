package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

import Business.abstracts.UserService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService {
	
	private User user;

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void login(String email, String password) {
		if(emailPasswordCheck(email, password)) {
			System.out.println("Giriş başarılı");
		}
	}

	@Override
	public void register(User user) {
		if (checkEmailExist(user.getgMail()) && checkEmailFormat(user.getgMail()) && nameCheck(user.getFirstName()) 
				&& controlPassword(user.getPassword())) {
			userDao.add(user);
			System.out.println("Kayıt işlemi başarılı ");
			sendEmail(user);
		}
	}

	@Override
	public void sendEmail(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("İşlemi doğrulamak için şifrenizi tekrar giriniz : ");
		long verificationcode = scanner.nextLong();
		
		if(verificationcode == 123456) {
			user.setVerification(true);
		}else {
			user.setVerification(false);
		}

	}

	@Override
	public void verifyEmail(boolean verificationCode) {
		if (verificationCode) {
			System.out.println("Hesabınız doğrulandı.");
		} else {
			System.out.println("Hesap doğrulaması başarısız.");
		}
	}

	// BusinessCodes
	private boolean controlPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Şifre uzunluğu 6 karakterden uzun olmalıdır.");
			return false;
		} else {
			return true;
		}
	}

	private boolean checkEmailFormat(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Gmail formatınız yanlış tekrar deneyiniz.");
			return false;
		}
	}

	private boolean checkEmailExist(String email) {
		for (User user : userDao.getall()) {
			if (email == user.getgMail()) {
				System.out.println("Bu email ile kayıt mevcut farklı bir gmail deneyiniz.");
				return false;
			}
		}
		return true;
	}

	private boolean nameCheck(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("İsim 2 karakterden uzun olmalıdır.");
			return false;
		} else {
			return true;
		}
	}
	
	private boolean emailPasswordCheck(String email,String password) {
		for(int i = 0; i< userDao.getall().size(); i++) {
			if(userDao.getall().get(i).getgMail() == email && userDao.getall().get(i).getPassword() == password) {
				if(userDao.getall().get(i).isVerification())
				{
					return true;
				}else {
					System.out.println("Hesabınız doðrulanmamış.");
					return false;
				}
			}
		}
		System.out.println("Geçerli bir kullanıcı adı veya şifre girişi yapmadınız. ");
		return false;
	}

}
