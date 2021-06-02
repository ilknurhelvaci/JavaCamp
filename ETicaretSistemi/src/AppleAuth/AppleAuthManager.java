package AppleAuth;

import eTicaretSistemi.entities.concrete.User;

public class AppleAuthManager {
	//Opsiyonel yapýlmýþtýr ilerde Apple ile giriþ yapmak istersek kod deðiþikliðin yapmamýza gerek kalmadan halledebiliriz.
	
	public void register(User user) {
		System.out.println("Sayýn " + user.getName() + " " + user.getSurname() + " apple hesabýnýz ile kayýt oldunuz.");
		
	}
    public void login(User user) {
    	System.out.println("Sayýn " + user.getName() + " " + user.getSurname() + " apple hesabýnýz ile giriþ yaptýnýz");
    }
	
	

}
