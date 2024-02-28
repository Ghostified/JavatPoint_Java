package Arrays.BasicOperations;
/*
 * sum of array {1,2,3,4,5} = 15
 */
public class SumOfElementsinArray {
    public static void main(String[] args) {
        int array [] = new int[] {1,2,3,4,5};
        int sum = 0;
        for (int i =0; i < array.length; i++){
            sum = sum + array [i];
        }
        System.out.println("Sum of all the elemnts = " + sum);
    }

}
