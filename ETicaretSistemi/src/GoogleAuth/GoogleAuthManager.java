package GoogleAuth;

import eTicaretSistemi.entities.concrete.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Say�n " + user.getName() + " " + user.getSurname() + " google hesab�n�z ile kay�t oldunuz.");
		
	}
    public void login(User user) {
    	System.out.println("Say�n " + user.getName() + " " + user.getSurname() + " google hesab�n�z ile giri� yapt�n�z");
    }
	
	
}
