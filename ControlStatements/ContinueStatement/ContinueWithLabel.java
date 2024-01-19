package ControlStatements.ContinueStatement;


//label inside an inner loop to continue an outer loop
public class ContinueWithLabel {
    
    public static void main (String[]Args)  {

        aa:
        for (int i = 1; i < 4; i++) {
            bb:
            for (int j = 1; j < 4; j++) {
        if (i ==2 && j == 2) {

                //using continue statement with label
                continue aa;
        }
        System.out.println(i + " " + j);

            }
        }
    }
}
