package week9homework;
// Write a Java program to test an array list is empty or not. Define array list with
//underground tube names.
import java.util.ArrayList;

public class ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Jubile");
        list.add("Metrolitan");
        list.add("Northern");
        list.add("Piccadilly");
        System.out.println("First array list: " + list);
        System.out.println("Checking the above array list is empty or not! "+list.isEmpty());
        list.removeAll(list);
        System.out.println("Array list after remove all elements "+list);
        System.out.println("Checking the above array list is empty or not! "+list.isEmpty());
    }
}
