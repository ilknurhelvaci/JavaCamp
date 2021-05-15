package kodlama.io;

public class Instructor extends User {
	private String courseName;
	private int instructorRate;
	

	
	public Instructor(String courseName, int instructorRate) {
		super();
		this.courseName = courseName;
		this.instructorRate = instructorRate;
	}
    public Instructor() {
		
	}
	


	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getInstructorRate() {
		return instructorRate;
	}

	public void setInstructorRate(int instructorRate) {
		this.instructorRate = instructorRate;
	}
	
	

}
