package week9homework;
// 4. Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
import java.util.HashMap;
import java.util.Map;

public class ListOfColour {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();
        list.put(1, "Red");
        list.put(2, "Blue");
        list.put(3, "Green");
        list.put(4, "Black");
        list.put(5, "Gray");
        //System.out.println(list.get(1));
        for (Map.Entry<Integer, String> colour : list.entrySet()) {
            System.out.println(colour.getKey() + ", " + colour.getValue());

        }
    }
}