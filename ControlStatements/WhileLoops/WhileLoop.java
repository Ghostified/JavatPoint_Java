package ControlStatements.WhileLoops;
/*
 * While loops are entry controlled as the condition is alwayts checkjed at the entrance of the loop
 * If condition is true then the loop is  executed 
 * otherwise the statement outside the loop will be executed
 * 
 * syntax: 
 * while (condition) {
 * //looping statement
 * }
 */
public class WhileLoop {

    public static void main(String[] args) {

        int i = 0;
        System.out.println("Print the list of the first 10 even numbers");
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }
    }
}

