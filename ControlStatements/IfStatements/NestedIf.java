package ControlStatements.IfStatements;
/*
 * in nested if, statements can contain a if or if-else statement inside another if or if else 
 * 
 * syntax
 *  if (condition 1) {
 * statement 1; //executes when condition one is true
 * } 
 * if (condition 2) {
 * statement 2; //executes if condition 2 is true
 * }
 * else {
 * statement 2;  //executes when condition 2 is false
 * }
 * }
 */
public class NestedIf {
    public static void main (String[] Args) {
        String address = "Nairobi,Kenya" ;

        if (address.endsWith("Kenya")) {
            if (address.contains("Westlands")) {
                System.out.println("Your city is Nairobi");
            } else if (address.contains("Nakuru")) {
                System.out.println("Your city is Naikuru");
            } else {
                System.out.println(address.split(",")[0]);
            }
        }
        else {
             System.out.println("You do not live in kenya");
        }
     }
}

