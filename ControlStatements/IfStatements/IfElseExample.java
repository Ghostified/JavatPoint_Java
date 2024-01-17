package ControlStatements.IfStatements;
/*
 * executes the if block if condition is true otherwise else is executed
 */
public class IfElseExample {

    public static void main (String[] Args) {

        //define variable 
        int number = 16;

        //check if number is divisible by two or not 
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Number is odd");
        }
    }
}
