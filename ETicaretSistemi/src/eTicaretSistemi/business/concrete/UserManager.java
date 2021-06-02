package eTicaretSistemi.business.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.core.AuthService;
import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concrete.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private AuthService authService; //Google hesab�yla giri� istiyor , ya da Apple ile istersek
	
	

	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
	   	if(user.getPassword().length() < 6 ) {
	   		System.out.println("Parolan�z ez az 6 karakter uzunlu�unda olmal�d�r.");
	   	}
	   	//Eposta format�na uyup uymad���n� kontrol ediyoruz
	   	final String EMAIL_PATTERN ="^[A-Za-z0-9+_.-]+@(.+)$";
	   	final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	   	Matcher matcher = pattern.matcher(user.getEmail());
	   	
	   	if(!matcher.matches()) { //B�t�n karakterleri gezip e�le�ip e�le�medi�ine bak�yor
	   		System.out.println(user.getEmail() + " girmi� oldu�unuz e-posta, e-poste format�na uygun de�ildir.");
	   	}
	   	for(User users : userDao.getAll()) {
	   		if(users.getEmail().equals(user.getEmail())) { //Kullan�c�n girdi�i e-posta daha �nce kullan�lm��sa 
	   			System.out.println(user.getEmail() + " bu e-mail adresi zaten mevcut!!");
	   		}
	   	}
	   	if(user.getName().length()<2 || user.getSurname().length()<2) {
	   		System.out.println("Ad ve Soyad en az 2 karakterden olu�mal�d�r.");
	   	}
		
	}

	@Override
	public void login(User user) {
		if(user.isVerify() == true) { //Do�rulama e-postas� gitmi� demektir
			userDao.login(user);
			
		}else {
			System.out.println("Giri� ba�ar�s�z l�tfen e posta adresinizi kontrol edip tekrar deneyiniz.");
		}
		
		
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify() == true) { //e-posta adresi do�rulanm��sa
			userDao.confirm(user);
		}
		else {
			System.out.println("Say�n "+ user.getName() + "" + user.getSurname() + " e-posta adresiniz do�rulanmam��t�r.");
		}
		
		
	}

	@Override
	public void registerWithAccount(User user) { //�lerde Apple hesab� da eklyebiliriz
		user.setVerify(true);
		this.authService.register(user);
	
		
	}

	@Override
	public void loginWithAccount(User user) {
		if(user.isVerify() == true) {
			this.authService.login(user);
		}else {
			System.out.println("Hen�z kay�t olmad�n�z");
		}
		
		
	}

}
