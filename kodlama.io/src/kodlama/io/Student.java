package kodlama.io;

public class Student extends User {
private String course;
private String certificate;

public Student() {
	
}

public Student(String course, String certificate) {
	super();
	this.course = course;
	this.certificate = certificate;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getCertificate() {
	return certificate;
}


	
	
	
}
