package week9homework;
// 6.Write a Java program to retrieve an element (at a specified index) from a given
//array list.
import java.util.ArrayList;
import java.util.List;

public class RetrieveAnElement {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        stringList.add(0,"Volvo");
        stringList.add(1,"BMW");
        stringList.add(2,"TOYOTA");
        stringList.add(3,"Audi");
        stringList.add(4,"Ford");


        System.out.println(stringList);
        System.out.println();
        //retrieve array element
        String  element=stringList.get(2);
        System.out.println("retrieve array elememnt is: "+element);
        String  element1=stringList.get(4);
        System.out.println("retrieve array elememnt is: "+element1);
    }
}
