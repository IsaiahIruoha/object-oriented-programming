// Isaiah Iruoha (20346489) 

package PersonAndDate;
import java.util.Random;
import java.util.Scanner; // Allows use of the scanner functionality

public class GuessMaster {
	private int numberOfCandidateEntities;
	private Entity[] entities; 
	
	public GuessMaster()
	{
        entities = new Entity[10]; // Initialize with a fixed size array (using arrayLists can avoid this constraint) 
        numberOfCandidateEntities = 0;
    }
	
	public void addEntity(Entity entity) { // Add an entity to the game
        if (numberOfCandidateEntities < entities.length) {
        	entities[numberOfCandidateEntities++] = new Entity(entity);
        } else {
            System.out.println("Entities Full");
        }
    }
	
	public void playGame(int index) {
		if (index < numberOfCandidateEntities && index >= 0) { // Ensure that index is not out of bounds
			Entity entity = entities[index];
			playGame(entity); // Call the playGame method with the specified entity
		} else {
			System.out.println("Invalid Index"); 
		}
	}
	
	// Method to play the guessing game for the birth date of the given entity
	public void playGame(Entity entity) {
	    Scanner keyboard = new Scanner(System.in); // Create a scanner object for input
	    System.out.println("Guess the birth date of: " + entity.getName() + "."); // Prompt usr to guess the birth date of the entity
		System.out.println("(mm/dd/yyyy)");

	    while (true) { // Continue looping until the user exits or guesses the date
	        String input = keyboard.nextLine(); // Read input
	        
	        if (input.toLowerCase().equals("quit") || input.toLowerCase().equals("exit")) { // Check if user wants game over
	            System.out.println("Game Exited"); 
	            System.exit(0); 
	        }

	        Date guessDay; // Variable to hold the guessed date
	        
	        // Attempt to create a Date object from the user input (https://www.w3schools.com/java/java_try_catch.asp)
	        try {
	            guessDay = new Date(input); // Parse the user input as a date
	        } catch (Exception error) {
	            System.out.println("Invalid date format. Enter month/day/year format: "); // Prompt the user for a valid date format
	            continue; // Skip to the next iteration of the loop
	        }

	        Date realDay = entity.getBorn(); // Get the actual birth date of the entity

	        // Check if the guessed date matches the actual birth date
	        if (guessDay.equals(realDay)) {
	        	Random random = new Random();
				int rd = random.nextInt(50);
				rd += 50; 
				System.out.println("*************Bingo!***************\n");
				System.out.printf("***Your bonus is %d$****\n", rd*100);
				break;
	        }

	        // Provide feedback based on whether the guessed date is earlier or later than the actual birth date
	        if (guessDay.precedes(realDay)) {
	            System.out.println("Incorrect. Try a later date."); // Inform the user to try a later date
	        } else {
	            System.out.println("Incorrect. Try an earlier date."); // Inform the user to try an earlier date
	        }
	    }

	    keyboard.close(); // Close the scanner to release system resources
	}

	// Validate date method
	private boolean isValidDate(Date date) {
	    // Check if the date components fall within valid ranges
	    return (date.getMonth() >= 1 && date.getMonth() <= 12) &&
	            (date.getDay() >= 1 && date.getDay() <= 31) &&
	            (date.getYear() >= 1000 && date.getYear() <= 9999);
	}
	
	public void playGame() {
		if(numberOfCandidateEntities == 0) {
			System.out.println("No Entities Available"); 
			return; 
		}
		while (true) {
			int randomNum = (int) (Math.random() * numberOfCandidateEntities); // Find a random number in the range of the indexes
			Entity randomEntity = entities[randomNum];
			playGame(randomEntity); // Call the playGame method with a randomly selected entity
		}
	}
	
	public static void main(String []args) {
		System.out.println("=========================\n");
		System.out.println("     GuessMaster 1.0 \n");
		System.out.println("=========================");
		GuessMaster gm = new GuessMaster();
		Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
		Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
		Entity usa = new Entity("United States", new Date("July", 4, 1776));
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(usa);
		
		gm.playGame(); // Call the playGame method without specifying an entity, which will select a random one
	}
}