// Isaiah Iruoha (20346489) 

package PersonAndDate;
import java.util.Scanner; // Allows use of the scanner functionality

public class GuessMaster {
	private int numberOfCandidateEntities;
	private Entity[] entities; 
	
	public GuessMaster()
	{
        entities = new Entity[10]; // Initialize with a fixed size array (using arrayLists can avoid this constraint) 
        numberOfCandidateEntities = 0;
    }
	
	public void addEntity(Entity entity) {
        if (numberOfCandidateEntities < entities.length) {
            entities[numberOfCandidateEntities++] = entity;
        } else {
            System.out.println("Entities Full");
        }
    }
	
	public void playGame(Entity entity) {
        Scanner keyboard = new Scanner(System.in); // Declaring Scanner locally similarly to Date Class example
        System.out.println("Guess the birth date of: " + entity.getName() + ".");
        boolean tryAgain = true;
        
        
        while(tryAgain) {
	        String input = keyboard.nextLine();
	
	        if (input.toLowerCase().equals("quit")|| input.toLowerCase().equals("exit")) { // Allows any case for the word to be typed for the command to execute 
	            System.out.println("Game Exited");
	            System.exit(0);
	        }
	
	        Date guessDay = new Date(input);
	        Date realDay = entity.getBorn();
	
	        if (guessDay.equals(realDay)) {
	            System.out.println("BINGO. You got it!!");
	            tryAgain = false;
	            return;
	        } 
	        if (guessDay.precedes(realDay)) {
	            System.out.println("Incorrect. Try a later date.");
	        } else {
	            System.out.println("Incorrect. Try an earlier date.");
	        }
        }
        
        keyboard.close(); 
        
    }
	
	public void playGame(int index) {
		if (index < numberOfCandidateEntities && index >= 0) { // Ensure that index is not out of bounds
			Entity entity = entities[index];
			playGame(entity); // Call the playGame method with the specified entity
		} else {
			System.out.println("Invalid Index"); 
		}
	}
	
	public void playGame() {
		if(numberOfCandidateEntities == 0) {
			System.out.println("No Entities Available"); 
			return; 
		}
		
		int randomNum = (int) (Math.random() * numberOfCandidateEntities); // Find a random number in the range of the indexes
		Entity randomEntity = entities[randomNum];
		playGame(randomEntity); // Call the playGame method with a randomly selected entity
	}
	
	public static void main(String []args) {
		GuessMaster gm = new GuessMaster();
		Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
		Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
		Entity usa = new Entity("United States", new Date("July", 4, 1776));
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(usa);
		
		while(true) { // Runs the game until user quits or errors out
			gm.playGame(); // Call the playGame method without specifying an entity, which will select a random one
		}
	}
}