package week9homework;
//9. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map
import java.util.HashMap;

public class HashMapObject {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and value
        people.put("Richard", 2);
        people.put("George", 4);
        people.put("Robert", 3);
        people.put("jake", 1);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
