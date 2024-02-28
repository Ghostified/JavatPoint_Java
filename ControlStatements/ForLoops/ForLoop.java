package ControlStatements.ForLoops;
/*
 * used to execute a set of instructions repeatedly
 * A for loop initializes a variable, check the condition and ,increment or decrement
 * For loops are used when we know exactly how man times a a code block is to be executed 
 * 
 */
public class ForLoop {

    public static void main (String [] Args) {
        int sum = 0;
        for ( int j = 1; j<= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of the first 10 natural numbers is " + sum);
    }
}
