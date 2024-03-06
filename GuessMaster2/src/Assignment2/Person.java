package Assignment2;

public class Person extends Entity {
	private String gender; 
	
    // Constructors
    public Person(String name, Date born, String gender, double difficulty) {
        super(name, born, difficulty);
        this.gender = gender; 
    }

    // Copy Constructor
    public Person(Person person) {
        super(person); 
        this.gender = person.gender;
    }
    
    // Clone method
    
    public Person clone() {
        return new Person(this);
    }
    
    // toString Method
    public String toString() {
        return super.toString() + "Gender: " + gender + "\n"; 
    }
    
    // entityType method
    
    public String entityType() {
    	return "This entity is a person!"; 
    }
}