package ControlStatements;
/*
 * Print array elements using a do while loop
 */
public class DoWhileExample3 {

    public static void main(String[] args) {
        int [] nums = {10,20,30,40,50};
        int index = 0;

        do {
            System.out.print("Value of the items: " + nums[index]);
            index = index + 1;
            System.out.print("\n");
        } while ( index < 5);
    }

}
