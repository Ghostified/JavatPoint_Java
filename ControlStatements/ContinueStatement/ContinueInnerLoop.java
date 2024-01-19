package ControlStatements.ContinueStatement;

public class ContinueInnerLoop {

    public static void main (String [] Args) {

        //outer loop
        for (int i = 1; i < 4; i++) {

            //inner loop
            for (int j = 1; j < 4; j++) {

                if (i == 2  && j == 2) {

                    //using the continue statement
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
