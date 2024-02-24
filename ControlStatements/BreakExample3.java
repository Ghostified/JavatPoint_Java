package ControlStatements;
/*
 * Break statement has two uses:
 *  - When encountered in a loop, it terminates it and hands contol to the next statement
 * - used to terminate a case in a switch statement
 * 
 * //exmaple:
 * This code breaks a while loop at 14 when its supposed to print upto 10 
 */
public class BreakExample3 {

    public static void main(String[] args) {
         int x = 10;
         while ( x < 20) {
            if (x == 15) {
                break;
            }
            System.out.println ("The values are: " + x);
            x = x + 1;
         }
    }

}
