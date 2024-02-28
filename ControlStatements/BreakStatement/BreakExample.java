package ControlStatements.BreakStatement;

//program to illustrate break statement
public class BreakExample {

    public static void main (String[]Args) {

        //using for loop 
        for(int i = 1; i< 10; i++) {
            if (i == 5) {

                //break loop
                break;
            }
            System.out.println(i);
        }
    }
}
