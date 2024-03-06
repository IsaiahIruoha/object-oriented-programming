package Assignment2;

public class Country extends Entity {
	private String capital; 
	
    // Constructors
    public Country(String name, Date born, String capital, double difficulty) {
        super(name, born, difficulty);
        this.capital = capital; 
    }

    // Copy Constructor
    public Country(Country country) {
        super(country); 
        this.capital = country.capital;
    }
    
    // Clone method
    
    public Country clone() {
        return new Country(this);
    }
    
    // toString Method
    public String toString() {
        return super.toString() + "Capital: " + capital + "\n"; 
    }
    
    // entityType method
    
    public String entityType() {
    	return "This entity is a country!"; 
    }

}
