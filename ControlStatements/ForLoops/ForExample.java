package ControlStatements.ForLoops;
/*
 * For loops atre used to iterate parts of a program several times
 * use a for loop isfthe number of times is known
 * use a while loop if the number of iterations are unknown
 * use a do while loop if the number of iterations is unknown but at least one iteration is required
 * 
 * Simple for- loop syantax
 * initialization: initial condition which is executed once when the lopop starts
 * condition : executed each time to test the condition of a loop; continues execution until condition is false and must return  a boolean 
 * iteration : increaments or decreaments the variablke value
 * statement:  the statement of the loop is executed each time until condition is false
 * 
 *  for (initialization;condition; increment/decrement) {
 * //code statement to be executed
 * }
 */

 //simple for loop which prints table of 1 
public class ForExample {
    public static void main (String [] Args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
}

}
