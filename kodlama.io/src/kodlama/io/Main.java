package kodlama.io;

public class Main {

	public static void main(String[] args) {
      Student student = new Student();
      student.setId(1);
      student.setFirstName("İlknur");
      
      Instructor instructor = new Instructor("Java&React Kampı", 5);
      instructor.setFirstName("Engin");
      instructor.setLastName("Demiroğ");
 
    
     StudentManager studentManager = new StudentManager();
     studentManager.add(student);
     studentManager.doHomework(student);
     studentManager.delete(student);
     
     InstructorManager instructorManager = new InstructorManager();
     instructorManager.add(instructor);
     instructorManager.addCourse(instructor);
     instructorManager.delete(instructor);
     instructorManager.ınstroctorRate(instructor);
    
    
	}

}
