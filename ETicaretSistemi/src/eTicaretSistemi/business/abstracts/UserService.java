package eTicaretSistemi.business.abstracts;

import eTicaretSistemi.entities.concrete.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void confirm(User user);
	void registerWithAccount(User user); //Herhangi bir hesap ile kayýt ol metodu þu an google hesabý ama deðiþebilir
	void loginWithAccount(User user);
	

}
