package ControlStatements;
/*
 * Switch statement allows a variable to be tested against a list of values
 * each value is a case
 * A switch statement can be used in place of multiple if else statements
 * 
 * switch (expression ) {
 * cas: value
 * break;
 * default: 
 * }
 */
public class SwitchExample2 {

    public static void main(String[] args) {
        char grade = 'D';
        switch (grade) {
            case 'A':
            System.out.println("Excellent");
            break;
            case 'B':
            case 'C':
            System.out.println("Well done");
            break;
            case 'D':
            System.out.println("You passed");
            case 'F':
            System.out.println("Try again");
            break;
            default: 
            System.out.println("Invalid grade");
        }

        System.out.println("Your grade is: " + grade);
    }

}
