package eTicaretSistemi.business.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.core.AuthService;
import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concrete.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private AuthService authService; //Google hesabýyla giriþ istiyor , ya da Apple ile istersek
	
	

	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
	   	if(user.getPassword().length() < 6 ) {
	   		System.out.println("Parolanýz ez az 6 karakter uzunluðunda olmalýdýr.");
	   	}
	   	//Eposta formatýna uyup uymadýðýný kontrol ediyoruz
	   	final String EMAIL_PATTERN ="^[A-Za-z0-9+_.-]+@(.+)$";
	   	final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	   	Matcher matcher = pattern.matcher(user.getEmail());
	   	
	   	if(!matcher.matches()) { //Bütün karakterleri gezip eþleþip eþleþmediðine bakýyor
	   		System.out.println(user.getEmail() + " girmiþ olduðunuz e-posta, e-poste formatýna uygun deðildir.");
	   	}
	   	for(User users : userDao.getAll()) {
	   		if(users.getEmail().equals(user.getEmail())) { //Kullanýcýn girdiði e-posta daha önce kullanýlmýþsa 
	   			System.out.println(user.getEmail() + " bu e-mail adresi zaten mevcut!!");
	   		}
	   	}
	   	if(user.getName().length()<2 || user.getSurname().length()<2) {
	   		System.out.println("Ad ve Soyad en az 2 karakterden oluþmalýdýr.");
	   	}
		
	}

	@Override
	public void login(User user) {
		if(user.isVerify() == true) { //Doðrulama e-postasý gitmiþ demektir
			userDao.login(user);
			
		}else {
			System.out.println("Giriþ baþarýsýz lütfen e posta adresinizi kontrol edip tekrar deneyiniz.");
		}
		
		
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify() == true) { //e-posta adresi doðrulanmýþsa
			userDao.confirm(user);
		}
		else {
			System.out.println("Sayýn "+ user.getName() + "" + user.getSurname() + " e-posta adresiniz doðrulanmamýþtýr.");
		}
		
		
	}

	@Override
	public void registerWithAccount(User user) { //Ýlerde Apple hesabý da eklyebiliriz
		user.setVerify(true);
		this.authService.register(user);
	
		
	}

	@Override
	public void loginWithAccount(User user) {
		if(user.isVerify() == true) {
			this.authService.login(user);
		}else {
			System.out.println("Henüz kayýt olmadýnýz");
		}
		
		
	}

}
