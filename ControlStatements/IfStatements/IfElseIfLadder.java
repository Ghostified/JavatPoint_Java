package ControlStatements.IfStatements;
/*
 * contains multiple if statements
 * the program enters a block of code if the condition is true
 * an else statemet is defined at the end of the chain
 * 
 * syntax:
    * if(codition 1) {
    * statement  1; //executes if condition one is true
    * }
    * else if (condition 2 ) {
    * statement 2; // executes when 2 is true 
    * } 
    * else {
    * statement 2 //executes when all conditions are false
    * }
 */
public class IfElseIfLadder {

    public static void main (String [] Args) {
        String city = "Nairobi";
        if (city == "Mombasa") {
            System.out.println(" City is Mombasa");
        } else if (city =="Nakuru") {
            System.out.println("City is Nakuru");
        }else if (city == "Kitale") {
            System.out.println("City is Kitale");
        } else {
            System.out.println(city);
        }
    }
}
