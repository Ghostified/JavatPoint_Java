package ControlStatements;
/*
 * Using a break statement to break an infinite wile loop
 */
public class BreakExample5 {

    public static void main(String[] args) {
         int x =  10 ;
         while( true ) {
            System.out.println("The value of x is : " + x );
            x = x + 1;
            if ( x == 15) {
                break;
            }
         }
    }
}
