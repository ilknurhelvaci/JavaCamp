package kodlama.io;

public class StudentManager extends UserManager{
  @Override
	public void add(User user) {
		System.out.println(user.getFirstName()+ " eklendi");
	}
  @Override
  public void delete(User user) {
		System.out.println(user.getFirstName() + " silindi");
	}
    @Override
     public void login() {
		System.out.println("Sisteme girdiniz");
	}
    public void doHomework(Student student) {
    	System.out.println(student.getFirstName() + " ödevini yaptý");
    }
	
}
