package Business.abstracts;


import Entities.concretes.User;

public interface UserService {
	void login(String gMail, String password);
	
	void register(User user);
	
	void sendEmail(User user);
	
	void verifyEmail(boolean verificationCode);
	

}
