package eTicaretSistemi.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concrete.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>(); //Kullan�c�lar� tutmak i�in gerekli olan list
	
	@Override
	public void register(User user) {
		System.out.println(user.getName() + " isimli kullan�c� ba�ar�l� bir �ekilde kaydolmu�tur.");
		
	}

	@Override
	public void login(User user) {
		System.out.println(user.getName() + " adl� kullan�c� giri� yapt�.");
		
	}

	@Override
	public void confirm(User user) {
	 System.out.println(user.getEmail() + " email adresiniz onaylanm��t�r.");
	 user.setVerify(true);
		
	}

	@Override
	public List<User> getAll() {
		
		return this.users;
	}

}
