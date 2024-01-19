package ControlStatements.ContinueStatement;

public class ContinueDoWhileLoop {

    public static void main (String[] Args) {

        //variable declaration
        int i = 1;

        //do while loop

        do {
            if ( i == 5) {

                //using continue statement
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while ( i < 10);
    }
}
