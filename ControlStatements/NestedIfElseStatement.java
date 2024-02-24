package ControlStatements;
/*
 * Used to evaluate multiple expressions for better decison making when a given codition is true
 * 
 * if (condition 1){
 * //code block 
 *  if (condition 2){
 * //code block}
 * }
 */
public class NestedIfElseStatement {
//find the largest number among three using nested if statements
    public static void main(String[] args) {
        int x =55, y =20, z =30; 

        if ( x >= y ) {
            if ( x >= z) {
                System.out.println(x + " is the latrgest ");
            }
            else {
                System.out.println(z+ " is the largest");
            }
        } else {
            if ( y >=z ) {
                System.out.println(y+ " is the largest");
            } else {
                System.out.println(z + " is the largest");
            }
        }
    }
}
