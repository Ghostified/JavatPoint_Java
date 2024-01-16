package ControlStatements;
//Most Basic of control flow
//evaluates a boolean expression
//Enables the the program to enter a block of code and if the expression evaluates true

/*
 * Syntax
 *  id (codition) {
 * Statement 1; //executes when condition is true
 * }
 */

 public class SimpleIfStatements {

    public static void main (String[]Args) {
        int x = 10;
        int y = 30;
        if ( !(x + y > 50)) {
            System.out.println(" 50 is not less than x + y");
        }
    }
}
