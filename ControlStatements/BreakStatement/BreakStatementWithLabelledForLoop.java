package ControlStatements.BreakStatement;

//java program to to illustrate the use of the continue statement
//with label inside an inner loop to break outer loop
public class BreakStatementWithLabelledForLoop {

    public static void main (String [] Args) {
        aa: 
        for (int i = 1; i < 4; i++) {
            bb:
            for (int j = 1; j<4; j++) {
                if (i ==2 && j == 2) {
                    //using break statement with labbel
                    break aa;
                }
                System.out.println(i + " " + j );
            }
        }
    }
}
