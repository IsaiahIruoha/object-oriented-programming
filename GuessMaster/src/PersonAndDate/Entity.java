// Isaiah Iruoha (20346489) 

package PersonAndDate;

public class Entity {
    private String name;
    private Date born;

    // Constructors
    public Entity(String name, Date born) {
        this.name = name;
        this.born = born;
    }

    // Copy Constructor
    public Entity(Entity entity) {
        this.name = entity.getName();
        this.born = new Date(entity.getBorn()); // Avoids privacy leaks by creating a new object
    }

    // Accessors
    public String getName() {
        return name;
    }

    public Date getBorn() {
        return born;
    }

    // Mutators
    public void setName(String name) { // Uses this to differentiate instance variables from arguments
        this.name = name;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    // toString Method
    public String toString() {
        String entityText = name + ", born on " + born.toString();
        return entityText;
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