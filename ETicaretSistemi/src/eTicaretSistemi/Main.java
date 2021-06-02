package eTicaretSistemi;

import AppleAuth.AppleAuthManager;
import GoogleAuth.GoogleAuthManager;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.concrete.UserManager;
import eTicaretSistemi.core.AppleAuthAdapter;
import eTicaretSistemi.core.GoogleAuthAdapter;
import eTicaretSistemi.dataAccess.concrete.HibernateUserDao;
import eTicaretSistemi.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new AppleAuthAdapter(new AppleAuthManager()));
		//Bu k�s�mda Google ya da Apple ile giri� yapabilirsiniz iki servisi de yetkilendirdik
	
		User user = new User("�lknur", "Helvaci", "ilknurhelvaci3gmail.com", "1234564", true);
		User user1 = new User("Beyza", "Sar�", "beyzasari@gmail.com", "12345", true);
		
		userService.register(user);
		userService.confirm(user);
		userService.login(user);
		userService.registerWithAccount(user);
		userService.loginWithAccount(user);
		

	}

}
