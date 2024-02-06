package Arrays.BasicOperations;
/*
 * Third largest in ana arry using Arrays
 */
import java.util.*;
public class ThirdLargestNumber {

    public static int thirdLargest(int [] a, int total) {
        Arrays.sort(a);
        return a[total- 3];
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        int b [] = {22,33,44,55,66};
        System.out.println("Third Largest" + thirdLargest(a, 9));
        System.out.println("ThirdLargest" + thirdLargest(b, 5));
    }
}
