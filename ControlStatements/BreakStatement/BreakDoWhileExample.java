package ControlStatements.BreakStatement;
//Program to illustrate use of a break statement in a do while loop
public class BreakDoWhileExample {

    public static void main (String[]Args) {

        //declaring variables
        int i = 1;

        //do while loop
        do  {
            if (i == 5) {

                //usimg a break statement
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
        while (i <= 10);
    }
}
