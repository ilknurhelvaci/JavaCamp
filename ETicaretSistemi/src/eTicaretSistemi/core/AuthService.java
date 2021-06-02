package eTicaretSistemi.core;

import eTicaretSistemi.entities.concrete.User;

public interface AuthService {
	void register(User user);
	void login(User user);
	

}
