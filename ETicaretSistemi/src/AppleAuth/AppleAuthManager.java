package AppleAuth;

import eTicaretSistemi.entities.concrete.User;

public class AppleAuthManager {
	//Opsiyonel yap�lm��t�r ilerde Apple ile giri� yapmak istersek kod de�i�ikli�in yapmam�za gerek kalmadan halledebiliriz.
	
	public void register(User user) {
		System.out.println("Say�n " + user.getName() + " " + user.getSurname() + " apple hesab�n�z ile kay�t oldunuz.");
		
	}
    public void login(User user) {
    	System.out.println("Say�n " + user.getName() + " " + user.getSurname() + " apple hesab�n�z ile giri� yapt�n�z");
    }
	
	

}
