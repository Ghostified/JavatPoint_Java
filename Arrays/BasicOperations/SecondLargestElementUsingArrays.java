package Arrays.BasicOperations;

import java.util.*;
public class SecondLargestElementUsingArrays {
    public static int getSecond (int total, int [] a) {
        Arrays.sort(a);
        return a[total -2];
    }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        int b [] = {111,22,33,44,55,66,77};
        System.out.println("Second largest:" + getSecond(9, a));
        System.out.println("Second largest: " + getSecond(07, b));
    }
}
