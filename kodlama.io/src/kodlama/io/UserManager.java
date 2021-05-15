package kodlama.io;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+ " eklendi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " silindi");
	}

	public void login() {
		System.out.println("Sisteme girdiniz");
	}

}
