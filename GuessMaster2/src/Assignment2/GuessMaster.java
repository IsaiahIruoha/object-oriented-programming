// Isaiah Iruoha (20346489) 

package Assignment2;
import java.util.Random;
import java.util.Scanner; // Allows use of the scanner functionality

import Assignment2.Entity;

public class GuessMaster {
	private int numberOfCandidateEntities;
	private Entity[] entities; 
	private int ticketsTotal; 
	
	public GuessMaster()
	{
        entities = new Entity[10]; // Initialize with a fixed size array (using arrayLists can avoid this constraint) 
        numberOfCandidateEntities = 0;
    }
	
	public void addEntity(Entity entity) { // Add an entity to the game
        if (numberOfCandidateEntities < entities.length) {
                // Clone the entity before adding it to the array
                Entity clonedEntity = entity.clone();
                entities[numberOfCandidateEntities++] = clonedEntity;
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
	
	// Validate date method
	private boolean isValidDate(int day, int month, int year) {
	    // Check if the date components fall within valid ranges
	    return (month >= 1 && month <= 12) &&
	            (day >= 1 && day <= 31) &&
	            (year >= 1000 && year <= 9999);
	}
	
	// Method to play the guessing game for the birth date of the given entity
	public void playGame(Entity entity) {
	    Scanner keyboard = new Scanner(System.in); // Create a scanner object for input
	    System.out.println(entity.welcomeMessage()); 
	    System.out.println("Guess the birth date of: " + entity.getName() + "."); // Prompt user to guess the birth date of the entity
		System.out.println("(mm/dd/yyyy)");

	    while (true) { // Continue looping until the user exits or guesses the date
	        String input = keyboard.nextLine(); // Read input
	        
	        if (input.toLowerCase().equals("quit") || input.toLowerCase().equals("exit")) { // Check if user wants game over
	            System.out.println("Thanks for playing!"); 
	            System.exit(0); 
	        }

	        Date guessDay; // Variable to hold the guessed date
	        
	        // Attempt to create a Date object from the user input (https://www.w3schools.com/java/java_try_catch.asp)
	        try {
	        	String[] parts = input.split("/");
	            int testMonth = Integer.parseInt(parts[0]);
	            int testDay = Integer.parseInt(parts[1]);
	            int testYear = Integer.parseInt(parts[2]);
	            if(!isValidDate(testDay, testMonth, testYear)){
	            	throw new IllegalArgumentException("Invalid date provided.");
	            }; 
	            
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
				ticketsTotal += entity.getAwardedTicketNumber(entity.getDifficulty()); 
				System.out.println("You won " + entity.getAwardedTicketNumber(entity.getDifficulty()) + " tickets in this round.\nYour total number of tickets is " + ticketsTotal + ".\n");
				System.out.println("**********************************\n"); 
				System.out.println(entity.closingMessage()); 
				return; 
	        }

	        // Provide feedback based on whether the guessed date is earlier or later than the actual birth date
	        if (guessDay.precedes(realDay)) {
	            System.out.println("Incorrect. Try a later date."); // Inform the user to try a later date
	        } else {
	            System.out.println("Incorrect. Try an earlier date."); // Inform the user to try an earlier date
	        }
	    }
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
		System.out.println("     GuessMaster 2.0 \n");
		System.out.println("=========================\n");
		
		
		Politician trudeau = new Politician(
	    "Justin Trudeau",
	    new Date("December", 25, 1971),
	    "Male",
	    "Liberal",
	    0.25
		);

		Singer dion = new Singer(
	    "Celine Dion",
	    new Date("March", 30, 1961),
	    "Female",
	    "La voix du bon Dieu",
	    new Date("November", 6, 1981),
	    0.5
		);

		Person isaiah = new Person(
	    "Isaiah Iruoha",
	    new Date("March", 2, 2004),
	    "Male",
	    1
		);

		Country usa = new Country(
	    "United States",
	    new Date("July", 4, 1776),
	    "Washington D.C.",
	    0.1
		);

		GuessMaster gm = new GuessMaster();
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(isaiah);
		gm.addEntity(usa);
		
		gm.playGame(); // Call the playGame method without specifying an entity, which will select a random one
	}
}