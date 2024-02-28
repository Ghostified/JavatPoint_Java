package ControlStatements.BreakStatement;

/*
 * Breaks only the inner loop if the break is used in the inner loop
 */
public class BreakStatementWithInnerLoop {

    public static void main (String [] Args) {
    //outer loop
    for(int i = 1; i < 4; i++) {

        //inner loop
        for (int j = 1; j < 4; j++) {
            if (i == 2 && j == 2) {
                break; //using break statement
            }
            System.out.println(i + " " + j);
        }
    }
}
}
