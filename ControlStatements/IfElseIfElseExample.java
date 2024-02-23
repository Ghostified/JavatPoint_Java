package ControlStatements;
import java.util.*;
/*
 * the if else if else statements are used to texecute multiple boolean conditions
 * 
 */
public class IfElseIfElseExample {

    public static void main (String [] Args) {

        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score: ");
        x = input.nextInt();
         
        if ( 0 >= x && x <= 20) {
            System.out.println("The grade is E");
        }
        else if (x >= 21 && x <= 40 ) {
            System.out.println("The grade is D");
        }
        else if (x >= 41 && x <= 60) {
            System.out.println("The grade is C");
        }
        else if (x >= 61 && x <= 80 ) {
            System.out.println("The grade is B");
        }
        else if (x >= 81 && x <= 100){
            System.out.println("The grade is A");
        }
        else{
            System.out.println("Score out of range");
        }
    }
}
