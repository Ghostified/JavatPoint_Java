package ControlStatements.ContinueStatement;

public class ContinueWhileLoop {

    public static void main (String [] Args) {

        //while loop
        int i =1;
        while (i < 10) {
            if (i == 5) {

                //using continue statement
                i++;
                continue;
            }

            System.out.println(i);
            i++;

        }
    }
}
