package Arrays.BasicOperations;

import java.util.Arrays;

public class SmallestElementUsingArrays {

    public static int getSmallest(int total, int [] a) {
        Arrays.sort(a);
        return a[0];
    }

    public static void main(String[] args) {

        int a [] = {1,2,3,4,5,6};
        int b [] = {22,33,44,55};
        System.out.println("The smallest element: " + getSmallest(6, a));
        System.out.println("The smallest element: " + getSmallest(4, b));
    }
}