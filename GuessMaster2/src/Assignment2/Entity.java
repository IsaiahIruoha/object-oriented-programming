// Isaiah Iruoha (20346489) 

package Assignment2;

public abstract class Entity implements Cloneable {
    private String name;
    private Date born;
    private double difficulty; 

    // Constructors
    public Entity(String name, Date born, double difficulty) {
        this.name = name;
        this.difficulty = difficulty;
		this.born = new Date(born); //no privacy leak
    }

    // Copy Constructor
    public Entity(Entity entity) {
    	this.name = entity.getName();
        this.difficulty = entity.getDifficulty(); 
        this.born = new Date(entity.born); //no privacy leak
    }

    // Accessors
    public String getName() {
        return name;
    }

    public Date getBorn() {
        return born;
    }
    
    public double getDifficulty() {
    	return difficulty; 
    }

    // Mutators
    public void setName(String name) { // Uses this to differentiate instance variables from arguments
        this.name = name;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
    
    // GetAwardedTicketNumber method
    
    public int getAwardedTicketNumber(double difficulty) {
    	return (int)(difficulty*100); 
    }
    
    // entityType method
    
    public abstract String entityType(); 
    
    // clone method 
    
    public abstract Entity clone(); 
    
    // welcomeMessage method 
    
    public String welcomeMessage () {
    	return "Welcome! Let's start the game! " + entityType() + "\n"; 
    }
    
    // closingMessage method 
    
    public String closingMessage () {
    	return "Congratulations! The detailed information of the entity you guess is:\nName: " + toString() + "\n";  
    }
    
    // toString Method
    public String toString() {
        return name + "\nBorn on: " + born.toString() + "\n";
    }

    // Equals method
    public boolean equals(Entity entity) {
        if (this == entity) {
            return true;
        } else if (entity == null) {
            return false;
        } else if (entity.getClass() != this.getClass()) { // Using object class method for comparison
            return false;
        } else if (this.born == null || entity.getBorn() == null) { // Check fields for null values
            return false;
        }
        return this.name.equals(entity.getName()) && this.born.equals(entity.getBorn()); // Use string and date class methods to check equality between instance variables (returns boolean)
    }
       
}