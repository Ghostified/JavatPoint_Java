package ControlStatements;
/*
 * Break statement used in a for loop
 */
public class BreakExample4 {
    public static void main(String[] args) {
         int [] nums = {5,10, 15, 20, 25, 30, 35, 40, 45, 50};
         int index = 0;

         for (index = 0; index < nums.length; index = index + 1) {
            if (nums[index] == 30 ){
                break;
            }
            System.out.println("The values in the array are: " + nums[index]);
         }
    }
}
