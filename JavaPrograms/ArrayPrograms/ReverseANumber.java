package JavaPrograms.ArrayPrograms;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
       // example1();
      //  example2();
       // usingForLoops();
        reverseWithReccursion(456789);
    }

    public static void example1 () {
        int number = 987654;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }

        System.out.println("The reverse is: " + reverse);

    }

    public static void example2 () {
        int number = 1234;
        int reverse = 0;
   
        while (number != 0) {
            int remainder   = number % 10;
            reverse =  reverse * 10 + remainder;
            number = number/ 10;

        }
        System.out.println(reverse);
    }

    //using a for loop 

    public static void usingForLoops () {
        int number = 2345;
        int reverse = 0;
     for (;number != 0; ) {

        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number /10;
     }

     System.out.println(reverse);

    }
    //Using reccursion 
    public static void reverseWithReccursion  (int number ) {

        if (number < 10 ) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reverseWithReccursion(number /10);
        }

    }
}
