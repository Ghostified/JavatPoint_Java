package ControlStatements.IfStatements;
/*
 * the ladder statement executes one condition from multiple statements
 * 
 * syntax:
 * if (condition 1) {
 * //execute if conditiion one is true
 * }
 * else if(codition 2) {
 * //execute if condition 2 is true
 * else {
 * //code to execute if all conditions are false
 * }
 */

 //program of a grading system to check for fail , D Grade, C grade, B grade, A grade and A+
public class IfElseIfExample {

    public static void main (String[]Args) {
        int marks = 99;
        if (marks < 50 ) {
            System.out.println("Fail");
        }
        else if ( marks >= 50 && marks < 60 ) {
            System.out.println("D Grade");
        }
        else if (marks >= 60 && marks < 70) {
            System.out.println("C Grade");
        }
        else if (marks >= 70 && marks < 80 ) {
            System.out.println("B Grade");
        }
        else if (marks >= 80 && marks < 90) {
            System.out.println("A Grade");
        }
        else if (marks > 90 && marks < 100 ) {
            System.out.println("A+ Grade");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
