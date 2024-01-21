package package1;
import java.util.Scanner;

public class WorkHourApp {
	public int hoursperday;
	public int numdays;
	
	public static void main(String args[]) {
		//Create an object of the Scanner class
		Scanner input = new Scanner(System.in);
		WorkHourApp obj = new WorkHourApp();
		
		//Ask user for input number
		System.out.println("Enter your hours per day:");
		//Read input from user
		obj.hoursperday = input.nextInt();
		
		//Ask user for input number
		System.out.println("Enter your num of days:");
		//Read input from user
		obj.numdays = input.nextInt();

		//Close the input stream
		input.close();
		
		
		for (int day = 1; day <= obj.numdays; day++) {
            int totalHoursWorked = day * obj.hoursperday;
            System.out.println("Day " + day + ", Total Hours worked = " + day + " Days * " + obj.hoursperday + " hours = " + totalHoursWorked + " hours.");
        }
	 }
}
