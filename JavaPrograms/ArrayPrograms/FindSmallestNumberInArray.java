package JavaPrograms.ArrayPrograms;

import java.util.*;

public class FindSmallestNumberInArray {

    public static void main(String[] args) {

        //using bubble sort
        example1();

        //Using Collection
        Integer [] b = {1,2,3,5,-30,-30, -40,-40,-2};
         int size = b.length;
         System.out.println("The smallest element");
         System.out.println(example2(b, size));

         //Using the Arrays.sort() method
         int x [] = {43,33,22,56,65,21,3,67};
         example3(x);
        
    }

    public static void example1 () {

        int [] arr = {99,103,44,-3,45 ,-10,-20,1,2,3,4,5,6};
        int size = arr.length;
        int temp = 0; 

        System.out.println("Original Array Elements:");
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < size -1; j++ ){
                if (arr[j] > arr[j+ 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
         System.out.println();
        System.out.println(" Array Elements After Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Second Smallest element in an array : ");
        System.out.println(arr[1]);
    }
    //Using Collections 
    public static int example2 (Integer [] a, int total) {
        List <Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int result = list.get(1);
        return result;
    }

    //Using Arrays.sort() method
    public static int example3(int [] a){
        Arrays.sort(a); 
        System.out.println("The second Smallest element: " + a[1]);
        return a[1];
    }

}
