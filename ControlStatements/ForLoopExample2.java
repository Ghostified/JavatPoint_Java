package ControlStatements;
/*
 * For loop is a repetition control structure 
 * it efficiently handles loops that nedd to be executed a specific number of times
 * 
 * syntax; 
 * for (initialization, boolean expression, update){
 * //statements
 * }
 */
public class ForLoopExample2 {

    //printing numbers in a range using a for loop
    //print numbers from 10 -19

    public static void main(String[] args) {
        
        for (int x = 10 ; x >= 0; x = x - 1) {
            System.out.print("Value of x is: "+x);
            System.out.print("\n");
        }
    }

}
