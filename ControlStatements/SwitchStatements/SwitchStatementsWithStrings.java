package ControlStatements.SwitchStatements;

public class SwitchStatementsWithStrings {
    public static void main (String[]Args) {

        //Declare string variable
        String levelString = "Novice";
        int level = 0;

        //using string ina a switch expression
        switch (levelString) {

            //using string literals in a switch case
            case "Beginner " : level = 1;
            break;
            case "Novice" : level = 2;
            break;
            case "Intermediate" : level =3;
            break;
            case "Advanced" : level = 4;
            break;
            case "Expert" : level = 5;
            break;
            default : level = 0;
        }

        System.out.println("Your level is: " + level);

    }
}
