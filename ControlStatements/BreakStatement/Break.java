package ControlStatements.BreakStatement;
/*
 * Break is a jumpstatement
 * Used to break the current flow and transfer control to a statement outside the loop or switch statement
 * It only breaks the inner loop in the case of a nested loop
 * 
 */
public class Break {

    public static void main (String []Args) {
        for (int i = 0; i <= 10; i++){
            System.out.println(i); 
        if (i== 6) {
            break;
        }
    }
    }

}
