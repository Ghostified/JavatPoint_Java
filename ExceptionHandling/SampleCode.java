package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class SampleCode {
    public static void main(String[] args) {
        //example20();
        //inputMismatch();
        arrayOutOfBounds();
    }
    public static void example20 () {
         try {
            int num1 = 20;
         int num = 0;
        int  result = num1/num; //
         System.out.println(result);
         } catch (ArithmeticException e)
         {
            e.printStackTrace();
         } catch (NullPointerException e) {

            e.printStackTrace();
         }
         
    }

    public static void inputMismatch () {

        while (true) { 
        try { 
        //Happens when dealing with user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scan.nextInt();
        System.out.println("Enter a second number");
        int number2 = scan. nextInt();


        int result = number + number2;
        System.out.println("The sum is "  + result);

        break; 
        } catch (InputMismatchException e) {
            System.out.println("Input a number");
            e.getMessage();
        }
    }
    }

    //Array index out of bounds :
    public static void arrayOutOfBounds () {
        try {
            int [] number = {1,2,3};
            System.out.println(number[4]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }
}
