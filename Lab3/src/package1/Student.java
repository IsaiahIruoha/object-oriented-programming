package package1;

public class Student extends Person {

	private int coursesCount;
	private String[] courseCodes; 
	private int[] grades;
	private static int maxCourses = 20; 
	
	public Student (String name, String address, int studentNumber) {
		super(name, address, studentNumber); 
		coursesCount = 0; 
		courseCodes = new String[maxCourses];
        grades = new int[maxCourses];	
        
	}
	
	// toString Method
	public String toString() {
		return "Student: " + super.toString(); 
	}
	
	// Add a course taken to the courseCode array and the course grade
	public void addGrade(String courseCode, int courseGrade) {
		this.courseCodes[coursesCount] = courseCode; 
		this.grades[coursesCount] = courseGrade; 
		coursesCount += 1; 
	}
	
	// Prints grades out of taken courses
	public void printGrades() {
		for(int i = 0; i < coursesCount; i++) {
			System.out.println(this.courseCodes[i] + ": " + this.grades[i]); 
		}
	}
	
}
