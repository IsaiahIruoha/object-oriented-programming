package package1;

public class GradStudent extends Student {
	private int numCommitteeMembers;
	private int numExamsTaken;
	private String [] gradExams; 
	private String [] gradExamResults; 
	private static final int maxNumberAttempts = 6; 
	
	public GradStudent(String name, String address, int studentNumber) {
		super(name, address, studentNumber); 
		numCommitteeMembers = 0;
		numExamsTaken = 0;
		gradExams = new String[maxNumberAttempts]; 
		gradExamResults = new String[maxNumberAttempts]; 
	}
	
	public void setCommitteeNum(int num) {
		numCommitteeMembers = num; 
	}
	
	public int getCommitteeNum() {
		return numCommitteeMembers; 
	}
	
	public void addGrade(String examName, String examGrade) {
		if(numExamsTaken < maxNumberAttempts) {
			gradExams[numExamsTaken] = examGrade; 
			gradExamResults[numExamsTaken] = examName; 
			numExamsTaken += 1; 
		} else {
			System.out.println("Exceeded maximum exam attempts."); 
		}
	}
	
	public String toString() {
        return "Grad " + super.toString();
    }

	public void printExamGrades() {
        System.out.println("");
        for (int i = 0; i < numExamsTaken; i++) {
            System.out.println(gradExamResults[i] + ": " + gradExams[i]);
        }
    }
	
}
