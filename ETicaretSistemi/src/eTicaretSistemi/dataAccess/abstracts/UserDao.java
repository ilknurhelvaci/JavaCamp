package eTicaretSistemi.dataAccess.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concrete.User;

public interface UserDao {
	void register(User user); //Kayýt olma iþlemi
	void login(User user); //Giriþ
	void confirm(User user); //Onay
	
	List<User> getAll(); //Kullanýcýlarý almamýz için

}
