package ControlStatements;
/*
 * Its an exit control loop
 * It guarantees to execute at least once
 * 
 * syntax 
 *      do {
 *      // statements
 *      } while (boolean expression);
 * 
 * If the boolean is true, the control jumps back to do, if false, it exits the loop
 * 
 * //Example: Print range of numbers with a do while loop
 */
public class DoWhileExample2 {

    public static void main(String[] args) {
         int x = 10;
         do {
            System.out.print("The value of x is : " + x);
            x = x + 1;
            System.out.print("\n");
         } while (x < 20);
    }

}
