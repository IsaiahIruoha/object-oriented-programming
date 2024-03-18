package package1;

import java.util.ArrayList;
import java.util.Random; 
import java.util.Date;

public class Lab5 {

	public static void main(String[] args)
    {
        ArrayList<Integer> intArray = new ArrayList<Integer>(5); 
        
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
            intArray.add(rand.nextInt(100));
        }
        
        System.out.println("Original intArray: " + intArray);

        ArrayList<Integer> revIntArray = new ArrayList<Integer>();
        
        for (Integer num : intArray) {
            revIntArray.add(0, num);
        }
        
        System.out.println("Reversed revIntArray: " + revIntArray);
        
        ArrayList<HourlyEmployee> employees = new ArrayList<HourlyEmployee>(100);
        
        employees.add(new HourlyEmployee("isaiah", new Date(), 15.00, 40));
        employees.add(new HourlyEmployee("alex", new Date(), 16.50, 35));
        employees.add(new HourlyEmployee("julia", new Date(), 12.75, 45));
        employees.add(new HourlyEmployee("rachel", new Date(), 18.25, 30));
        
        System.out.println("Content of the ArrayList: " + employees);
        
        System.out.println("Size of the ArrayList: " + employees.size());
        employees.set(0, new HourlyEmployee("mikey", new Date(), 23, 45));
        
        System.out.println("Content of the ArrayList after update: " + employees);
        
        employees.remove(2); 
        employees.trimToSize();
        
        System.out.println("Final content of the ArrayList: " + employees);
        System.out.println("Final size of the ArrayList: " + employees.size());
        
        
        Pair<String> couple1 = new Pair<>("Felicia", "Laha");
        Pair<String> couple2 = new Pair<>("Felicia", "Laha"); 
        Pair<String> couple3 = new Pair<>("Rudie", "Mertin");

        System.out.println("couple1 equals couple2: " + couple1.equals(couple2));
        System.out.println("couple1 equals couple3: " + couple1.equals(couple3)); 
        
        Triple<String, Double, String> trip1 = new Triple<>("Toronto", 547.0, "Montreal");
        Triple<String, Double, String> trip2 = new Triple<>("Toronto", 264.5, "Kingston");
        Triple<String, Double, String> trip3 = new Triple<>("Toronto", 547.0, "Montreal"); 

        System.out.println("trip1 equals trip2: " + trip1.equals(trip2)); 
        System.out.println("trip1 equals trip3: " + trip1.equals(trip3));
        System.out.println("trip2 equals trip3: " + trip2.equals(trip3)); 
        
    }
}
