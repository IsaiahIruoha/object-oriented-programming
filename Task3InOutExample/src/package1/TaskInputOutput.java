package package1;
import java.util.Scanner;

public class TaskInputOutput {
	//Declare variable
		public int first;
		public int second;
		
		public static void main(String args[]) {
			//Create an object of the Scanner class
			Scanner input = new Scanner(System.in);
			TaskInputOutput obj = new TaskInputOutput();
			
			//Ask user for input number
			System.out.println("Enter your first number:");
			//Read input from user
			obj.first = input.nextInt();

			//Enter navigator or driver
			System.out.println("Enter your second number:");
			obj.second = input.nextInt();
			
			//Close the input stream
			input.close();
			
			//Output to user
			System.out.println("Multiplication:" +(obj.first*obj.second));
			System.out.println("Addition:" +(obj.first+obj.second));		
	}
}
