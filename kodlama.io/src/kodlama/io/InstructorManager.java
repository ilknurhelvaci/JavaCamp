package kodlama.io;

public class InstructorManager extends UserManager {

	
 public void addCourse(Instructor instructor) {
	 System.out.println(instructor.getFirstName() + instructor.getLastName() +  " kurs ekledi");
 }
 public void �nstroctorRate(Instructor instructor ) {
	 System.out.println("E�itmen puan�" + instructor.getInstructorRate());
 }

    
	
}
