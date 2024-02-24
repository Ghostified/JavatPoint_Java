package ControlStatements;
/*
 * The continue statement forces the loop to jump to the next iteration of the loop
 * in a for loop, it causes control to immediatelly jump to the update statement
 * in a while / do while loop, control jumps to the boolean expression
 */
public class ContinueExample2 {

    public static void main(String[] args) {
        int x = 10; 

        while (x < 20 ) {
            x = x + 1; 
            if (x == 15 ) {
                continue;
            }
            System.out.println("The value of x is " + x);
        }
    }
}
