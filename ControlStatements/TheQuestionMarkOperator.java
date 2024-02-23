package ControlStatements;
/*
 * The conditional operator ?  can be used instead of an if else statement
 * e.g EXP1 ? EXP2 : Exp3;
 * to determine the value of the expression:
 *  if the value of exp1 is true, then the value of exp 2 is the value of the whole expression
 *  if the value of exp2 is false, then the value of exp3 is the value of the whole expression
 */
import java.util.*;
public class TheQuestionMarkOperator {

    public static void main(String[] args) {

        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = input.nextInt();

        b = (a == 1) ? 20 : 30;
        System.out.println("The value of b is : " + b);

        b= (a == 10) ? 20 :  30;
        System.out.println("The value of b is: " + b);
    }

}
