package eTicaretSistemi.dataAccess.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concrete.User;

public interface UserDao {
	void register(User user); //Kay�t olma i�lemi
	void login(User user); //Giri�
	void confirm(User user); //Onay
	
	List<User> getAll(); //Kullan�c�lar� almam�z i�in

}
