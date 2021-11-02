package week9homework;
// 2. Re write the student mark sheet programme using if else and while loop.
import java.util.Scanner;

public class PrintMarkSheet {

    public void mark() {
        int Math = 0;
        int Science = 0;
        int English = 0;
        int marks = 100;
        float Percentage, Total;
        //   boolean Result;
        // char Grade;

        System.out.println(" -----------------------------------");
        System.out.println("|                                   |");
        System.out.println("| Mark Sheet                        |");
        System.out.println("|___________________________________|");
        Scanner scan = new Scanner(System.in);
        System.out.println("|Enter your Name:                   |");
        String name = scan.next();
        System.out.println("|Enter your Roll No:                |");
        int RollNo = scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("| Subjects : Mark                   |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter mark of Math :               |");
        Math = scan.nextInt();
        while (Math > 100 || Math < 0) {
            System.out.println("Invalid input: Enter maths marks again: ");
            Math = scan.nextInt();
        }
        System.out.println("|Enter mark of Science :            |");
        Science = scan.nextInt();
        while (Science > 100 || Science < 0) {
            System.out.println("Invalid input: Enter science marks again: ");
            Science = scan.nextInt();
        }
        System.out.println("|Enter mark of  English :           |");
        English = scan.nextInt();
        while (English > 100 || English < 0) {
            System.out.println("Invalid input: Enter English marks again: ");
            English = scan.nextInt();
        }
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Total :                 |");
        Total = Math + Science + English;
        System.out.println(Total);
        System.out.println("|___________________________________|");
        System.out.println("| Percentage :                      |");
        Percentage = Total / 3;
        System.out.println(Percentage);
        System.out.println("| Result :                          |");


        if (Math < 35 || Science < 35 || English < 35) {
            System.out.println("Fail");
        } else {
            if (Percentage < 35) {
                System.out.println("Fail");
            } else if (Percentage > 35) {
                System.out.println("Pass");

                System.out.println("| Grade :                           |");
                if (Percentage >= 80) {
                    System.out.println(" A+ ");
                } else if (Percentage >= 60) {
                    System.out.println(" A ");
                } else if (Percentage >= 50) {
                    System.out.println(" B ");
                } else if (Percentage >= 35) {
                    System.out.println(" C ");
                }

                System.out.println("|___________________________________|");
            }

        }


    }

    public static void main(String[] args) {
        PrintMarkSheet obj = new PrintMarkSheet();
        obj.mark();

    }
}
