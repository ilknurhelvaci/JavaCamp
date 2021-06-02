package eTicaretSistemi.business.abstracts;

import eTicaretSistemi.entities.concrete.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void confirm(User user);
	void registerWithAccount(User user); //Herhangi bir hesap ile kay�t ol metodu �u an google hesab� ama de�i�ebilir
	void loginWithAccount(User user);
	

}
