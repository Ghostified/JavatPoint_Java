package JavaPrograms.ArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        //findLargestNumber();
        example11();
    }

    public static void findLargestNumber () {

        int arr [] = {8,2,33,4,5,6};
        int size = arr.length;
        int temp;

        System.out.println("Before  sorting: ");
         for (int i : arr) {
            System.out.print( i + " ");
         }
        
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] <    arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
         }
         System.out.println();
         System.out.println("After sorting: ");
         for (int i : arr) {
            System.out.print( i + " ");
         }

         System.out.println();
         System.out.println("Largest Number in the  Array is " + arr[0]);

    }

    //Find the largest array using the Arrays.Sort Method

    public static void example11 () {
        int[]  a = {1,2,34,55,67,488,7};
        int total = a.length;

        Arrays.sort(a);

        for (int  i = 0; i < a.length; i++ ) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Largest Element: ");

        System.out.println(a[total - 1]);
        
    }

}
