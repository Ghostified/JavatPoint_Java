package ControlStatements;
/*
 * Switch case statement based on Strings
 */
public class SwitchCaseExample4 {

    public static void main (String [] Args) {

        String grade = "D";

        switch (grade) {
            case "A":
            System.out.println("Excellent");
            break;

            case "B":

            case "C" :
            System.out.println("Well Done");
            break;

            case "D":
            System.out.println("You passed");

            case "F":
            System.out.println("Better try again");

            default:
            System.out.println("Invalid Grade");
        }

        System.out.println ("Your grade is: " + grade);
    }
}
