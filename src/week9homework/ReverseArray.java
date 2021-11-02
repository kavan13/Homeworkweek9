package week9homework;
import java.util.Arrays;

// 3. Write a Java program to reverse an array of integer values.
public class ReverseArray {
    public static void main(String[] args) {
       int[] array = {10,25,20,15,45,30,28,12};

        System.out.println("Actual Array : " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int value = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = value;
        }
        System.out.println("Reverse Array : " + Arrays.toString(array));
    }
}
