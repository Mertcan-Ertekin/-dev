package Core.concretes;

import Core.abstracts.AuthService;
import googleAuth.GoogleAuthManager;

public class GoogleAuthAdapter implements AuthService {

	@Override
	public void loginGoogle(String gMail) {
		GoogleAuthManager authManager = new GoogleAuthManager();
		authManager.login(gMail);
		
	}

}
