package GoogleAuth;

import eTicaretSistemi.entities.concrete.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Sayýn " + user.getName() + " " + user.getSurname() + " google hesabýnýz ile kayýt oldunuz.");
		
	}
    public void login(User user) {
    	System.out.println("Sayýn " + user.getName() + " " + user.getSurname() + " google hesabýnýz ile giriþ yaptýnýz");
    }
	
	
}
