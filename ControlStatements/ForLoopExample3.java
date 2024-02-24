package ControlStatements;
/*
 * printing all array elements using a for loop
 */
public class ForLoopExample3 {

    public static void main(String[] args) {
        int numbers [] = {10, 20, 30, 40, 50};

        for (int index = 0; index < numbers.length;  index = index + 1) {
            System.out.print("Value of the item: " + numbers[index]);
            System.out.print("\n");
        }
    }
}
