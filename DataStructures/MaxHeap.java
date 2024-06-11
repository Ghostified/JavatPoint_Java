package DataStructures;

import java.util.Arrays;

//Build a max heap of an array [10,20,15,30,40]
public class MaxHeap {

    private static void swap (int [] arr, int i, int j) {
        int temp = arr [i];
        arr [i] = arr [j];
        arr [j] = temp;
    }

    //function to heapify a subtree rooted at index i
    private static void heapify (int [] arr, int n, int i) {
        int largest = i; //initialize the largest as root 
        int left = 2 * i  + 1; //left = 2 * i +1;
        int right = 2 * i +2; //right = 2 * i + 2;

        //if left child is larger than root
        if (left < n  && arr [left] > arr [largest]){
            largest = left;
        }

        //if right is the large than the largest so far
        if (right < n &&  arr[right] > arr [largest]){
            largest = right;
        }

        //if largest is not root 

        if (largest != i) {
            swap (arr , i, largest);

            //recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    //Function to build  a max heap
    public static void buildMaxHeap (int [] arr) {
        int n = arr.length;

        //build heap (re -arrange array)
        for (int i = n/2 -1; i >= 0; i--) {
            heapify(arr, n, i);
        }

    }

    //main function to test heap
    public static void main(String[] args) {
        int [] arr = {10, 20, 15, 30, 40,} ;
        System.out.println("Original array: " + Arrays.toString(arr) );

        //build max heap
        buildMaxHeap(arr);

        System.out.println("Max Heap; " + Arrays.toString(arr));
    }


}
