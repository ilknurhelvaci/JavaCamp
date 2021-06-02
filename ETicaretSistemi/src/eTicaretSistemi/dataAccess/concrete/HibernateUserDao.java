package eTicaretSistemi.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concrete.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>(); //Kullanýcýlarý tutmak için gerekli olan list
	
	@Override
	public void register(User user) {
		System.out.println(user.getName() + " isimli kullanýcý baþarýlý bir þekilde kaydolmuþtur.");
		
	}

	@Override
	public void login(User user) {
		System.out.println(user.getName() + " adlý kullanýcý giriþ yaptý.");
		
	}

	@Override
	public void confirm(User user) {
	 System.out.println(user.getEmail() + " email adresiniz onaylanmýþtýr.");
	 user.setVerify(true);
		
	}

	@Override
	public List<User> getAll() {
		
		return this.users;
	}

}
