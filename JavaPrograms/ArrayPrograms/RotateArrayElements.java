package JavaPrograms.ArrayPrograms;

import java.lang.reflect.Array;

public class RotateArrayElements {
 public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};

    //n to set the number of times the array shoould be rotated
    int n = 5;

    //Display the original array
    for (int i = 0; i < Array.getLength(arr); i++) {
        System.out.print( arr[i] + " ");
    }

    //Rottate the given array n number of times
    for (int i = 0; i < n; i++) {

        int j ;
        int first;

        //Stores the first element of the array
        first = arr [0];
        for (j = 0; j < arr.length -1; j++){
            arr[j] = arr[j + 1];
        }

        //first element of the array will be added at the end
        arr[j] = first;

    }
    System.out.println();
    //results of the rotation are : 
    System.out.println("Array after rotation");
    for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
 }
}
