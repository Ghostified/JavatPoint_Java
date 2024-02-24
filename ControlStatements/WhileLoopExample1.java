package ControlStatements;
/*
 * A while loop executes a block of code as long as the initial expression is true
 * Its an entry control loop
 * 
 * Example: print numbers in a range with a while loop
 */
public class WhileLoopExample1 {

    public static void main(String[] args) {
        
        int x = 10;
        while (x < 20 ){
            System.out.print(x);
            x++;
            System.out.print("\n");
        }
    }
}
