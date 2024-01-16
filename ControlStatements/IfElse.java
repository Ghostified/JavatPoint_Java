package ControlStatements;
/*
 * is an extension of the if statement
 * the else block is executed if the condition of the if statement returns false
 * 
 */
public class IfElse {

    public static void main (String[]Args) {
        int x = 10;
        int y = 20;
        if( x + y < 10) {
            System.out.println("x + y < 10");
        } else {
            System.out.println(" x + y > 10 ");
        }
    }
}
