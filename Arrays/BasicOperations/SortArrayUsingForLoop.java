package Arrays.BasicOperations;

import java.util.Arrays;

public class SortArrayUsingForLoop {

    public static void main(String[] args) {
        int array [] = new int [] {33,44,33,32,4,54,43,76,83,71,67,65,};

        System.out.println("Array after sorting");

        //Sorting logic
         for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                int temp = 0;
               if  (array [i] > array [j]) {
                     temp = array[i];
                     array [i] = array[j];
                     array [j] = temp;
                }
            }

            System.out.print(array[i] + " ");
         }
    }
}
