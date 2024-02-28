package ControlStatements.IfStatements;
import java.util.*;

public class NestedIfExample2 {

    public static void main (String[]ASrgs) {
        
        
        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.println("Enter a year");
        year = scanner.nextInt();

        if (year > 0) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
                System.out.println("Its a leap year");
            }
            else {
                System.out.println("Its not a leap year");
            }
        } else {
            System.out.println("Enter a valid positive year");
        }
        scanner.close();
    }

}
