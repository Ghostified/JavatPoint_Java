package ControlStatements.IfStatements;
/*
 * Nested if represents an if statement within another if statement
 * The inner block is only executed if teh outer block is true
 * 
 * syntax: 
 * if (condition){
 * //code to be executed
 *  if (condition ) {
 * //executed code
 * }
 * }
 */
public class NestedIfExample {
    
    public static void main (String [] Args) {

        //craeting two variables age & weight
        int age = 18;
        int weight = 49;

        //applying condition on age and weight
        if (age >= 20) {
            if (weight > 50) {
                System.out.println("Eligible for blood donation");
            }
        }
        else {
            System.out.println("You are not eligible for blood donation");
        }
    }

}
