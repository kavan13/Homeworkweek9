package week9homework;
// . 5 Write a Java program to iterate through all elements in an array list using
//Iterator
import java.util.ArrayList;

import java.util.ListIterator;

public class Iterator {

        public static void main(String[] args) {

            ArrayList<String> nameList = new ArrayList<>();
            nameList.add("kavan");
            nameList.add("Patel");
            nameList.add("is a ");
            nameList.add("Tester");

           ListIterator<String> listIterator = nameList.listIterator();
            while (listIterator.hasNext()) {
               System.out.println(listIterator.next());
            }
        }
    }
