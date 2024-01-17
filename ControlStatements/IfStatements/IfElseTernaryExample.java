package ControlStatements.IfStatements;
/*
 * ternary operator (? :)
 * its a shorthand to check conditions
 * if condition is true the value of the ? is returned
 * if condition is false the value of : is treturned
 */

public class IfElseTernaryExample {
    public static void main (String[] Args) {

        int number = 12;

        //using ternary operator
        String output = (number % 2 == 0)?"even number " : "odd number";
        System.out.println(output);

    }
}
