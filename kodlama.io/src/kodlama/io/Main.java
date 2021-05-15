package kodlama.io;

public class Main {

	public static void main(String[] args) {
      Student student = new Student();
      student.setId(1);
      student.setFirstName("�lknur");
      
      Instructor instructor = new Instructor("Java&React Kamp�", 5);
      instructor.setFirstName("Engin");
      instructor.setLastName("Demiro�");
 
    
     StudentManager studentManager = new StudentManager();
     studentManager.add(student);
     studentManager.doHomework(student);
     studentManager.delete(student);
     
     InstructorManager instructorManager = new InstructorManager();
     instructorManager.add(instructor);
     instructorManager.addCourse(instructor);
     instructorManager.delete(instructor);
     instructorManager.�nstroctorRate(instructor);
    
    
	}

}
