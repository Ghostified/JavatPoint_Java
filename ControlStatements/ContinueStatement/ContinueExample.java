package ControlStatements.ContinueStatement;

//using conmtinue statement in a for loop
public class ContinueExample {
    
    public static void main (String[] Args) {

        //for loop 
        for (int i = 1; i < 10; i++) {
            if ( i == 5) {

                //using continue statement skips the rest statement
                continue;
            }

            System.out.println(i);
        }
    }
}
//Output; 5 is skipped