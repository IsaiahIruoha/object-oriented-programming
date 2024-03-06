package Assignment2;

public class Politician extends Person {
	private String party; 
	
    // Constructors
    public Politician(String name, Date born, String gender, String party, double difficulty) {
        super(name, born, gender, difficulty);
        this.party = party; 
    }

    // Copy Constructor
    public Politician(Politician politician) {
        super(politician); 
        this.party = politician.party;
    }
    
    // Clone method
    
    public Politician clone() {
        return new Politician(this);
    }
    
    // toString Method
    public String toString() {
        return super.toString() + "Party: " + party + "\n"; 
    }
    
    // entityType method
    
    public String entityType() {
    	return "This entity is a politician!"; 
    }
}