package eTicaretSistemi.core;

import GoogleAuth.GoogleAuthManager;
import eTicaretSistemi.entities.concrete.User;

public class GoogleAuthAdapter implements AuthService{
   GoogleAuthManager googleAuthManager;
   

	public GoogleAuthAdapter(GoogleAuthManager googleAuthManager) {
	super();
	this.googleAuthManager = googleAuthManager;
}

	@Override
	public void register(User user) {
	     googleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		googleAuthManager.login(user);
		
	}

}
