package kodlama.io;

public class InstructorManager extends UserManager {

	
 public void addCourse(Instructor instructor) {
	 System.out.println(instructor.getFirstName() + instructor.getLastName() +  " kurs ekledi");
 }
 public void ýnstroctorRate(Instructor instructor ) {
	 System.out.println("Eðitmen puaný" + instructor.getInstructorRate());
 }

    
	
}
