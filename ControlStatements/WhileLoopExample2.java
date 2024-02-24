package ControlStatements;
/*
 * Printing elements of an array with a while loop
 */
public class WhileLoopExample2 {

    public static void main(String[] args) {
        int [] nums = {10, 20, 30, 40, 50};

        int index = 0; 
        while ( index < 5) {
            System.out.print("The values are: " + nums[index]);
            index = index + 1;
            System.out.print("\n");

        }
    }
}
