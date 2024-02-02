package Arrays;
/*
 * use for each loop to print array 
 * syntax:
 * for (data-type variable: array) {
 * //loop body
 * }
 */

//print array with a for- each loop
public class ForEachLoopArray {
    public static void main(String[] args) {
        int array [] = { 10,20,30,40};

        //print array with for -each loop
        for (int i : array) {
            System.out.println(i);
        }
    }

}
