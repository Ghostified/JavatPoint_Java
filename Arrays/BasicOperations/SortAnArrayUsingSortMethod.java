package Arrays.BasicOperations;
import java.util.*;

/*
 * Th juva util package provides the sort method using a quick sort algorithm
 * syntax = sort(int[]a)
 * 
 */
public class SortAnArrayUsingSortMethod {

    public static void main(String [] Args) {

        //define array of integer type
        int array [] = {1,2,3,4,5,6,7,5,9};

        //invoking the sort method
        Arrays.sort(array);
        System.out.println("Elements of the array sorted in ascending order");

        //use a loop to print the array 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
