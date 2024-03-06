package Assignment2;

public class Singer extends Person {
	private String debutAlbum; 
	private Date debutAlbumReleaseDate; 
	
    // Constructors
    public Singer(String name, Date born, String gender, String debutAlbum, Date debutAlbumReleaseDate, double difficulty) {
        super(name, born, gender, difficulty);
        this.debutAlbum = debutAlbum; 
        this.debutAlbumReleaseDate = new Date(debutAlbumReleaseDate); 
    }

    // Copy Constructor
    public Singer(Singer singer) {
        super(singer); 
        this.debutAlbum = singer.debutAlbum;
        this.debutAlbumReleaseDate = new Date(singer.debutAlbumReleaseDate); 
    }
    
    // Clone method
    
    public Singer clone() {
        return new Singer(this);
    }
    
    // toString Method
    public String toString() {
        return super.toString() + "Debut Album: " + debutAlbum + "\n" + "Release Date: " + debutAlbumReleaseDate + "\n"; 
    }
    
    // entityType method
    
    public String entityType() {
    	return "This entity is a singer!"; 
    }
}