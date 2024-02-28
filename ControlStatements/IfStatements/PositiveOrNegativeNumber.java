package ControlStatements.IfStatements;

public class PositiveOrNegativeNumber {

    public static void main (String[]Args) {
        int number = 06;
        if (number > 0) {
            System.out.println("Number is positive");
        }
        else if (number < 0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
