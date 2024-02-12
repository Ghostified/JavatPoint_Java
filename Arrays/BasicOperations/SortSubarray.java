package Arrays.BasicOperations;

import java.util.Arrays;

/*
 * if a [] = {1,4,6,2,3,6,7,4,5,9,8,0} and we wnt to sort arrys from 4 - 9
 * it will sort the sub arry and leave other arrays as is
 * the sort() method in the Arrays classin ascending order  for primitive data types
 * 
 * syntax; 
 * public static void sort(int [] a, int fromIndex, int toIndex)
 * 
 * the fromIndex participates in the sort
 * the toIndex does not participate in the sort
 */
public class SortSubarray {

    public static void main(String[] args) {
        //define array
        int array [] = {1,2,3,8,7,5,4,4,6,4,9,8,9,11,10,13,12,15};

        //sort array from index 2 - 17
        Arrays.sort(array, 2, 17);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
