package eTicaretSistemi.core;

import AppleAuth.AppleAuthManager;
import eTicaretSistemi.entities.concrete.User;

public class AppleAuthAdapter implements AuthService {
	AppleAuthManager appleAuthManager;
	

	public AppleAuthAdapter(AppleAuthManager appleAuthManager) {
		super();
		this.appleAuthManager = appleAuthManager;
	}

	@Override
	public void register(User user) {
	  appleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		appleAuthManager.login(user);
		
	}

}
