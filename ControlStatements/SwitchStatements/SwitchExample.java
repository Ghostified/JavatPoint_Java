package ControlStatements.SwitchStatements;

/*
 * switch statements can have an infinite caseS
 * switch cases have to be unique
 */

public class SwitchExample {

    public static void main (String []Args) {
        
        //Declaring variables for a switch statement
        int number = 16;

        //switch expression
        switch (number) {

            //case statements
            case (10): System.out.println("10");
            break;
            case (20): System.out.println("20");
            break;
            case (30): System.out.println("30");
            break;
            case (40):System.out.println("40");
            break;

            //default statement
            default:System.out.println("Not in range of 10 - 40");
        }
    }

}
