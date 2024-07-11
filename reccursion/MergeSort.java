package reccursion;

import java.util.Arrays;

/*
 * Its a divide and conquer algorithm
 * it divides an array into two halves
 * class itself for the two halves and then merges the two halves
 * time comlexity = o(n log n)
 * space complexity o(n)
 */
public class MergeSort {

    public static void merge (int [] arr, int left, int mid, int right) {

        //Calcyulate the sizes of the two sub-arrays to be merged
        int n1 = mid - left +1;
        int n2 = right - mid;

        //create a temporary array to hold the two halves
        int [] L = new int[n1];
        int [] R = new int[n2];

        //copy data int the temporary array
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        //initialize the indexes of the the first and second sub arrays
        int i = 0, j =0;

        //initialize the index of the merged sub-array
        int k = left;

        //merge the two halves back into the orriginal array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j] ) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R [j];
                j++;
            }
            k++;
        }

        //copy the remaining elements of o l[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        //Copy the remaining elements of R[] , if any
        while (j <n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    //The sort method is the main method that implements the merge sort
    public static void sort (int [] arr, int left, int right) {
        if (left < right){
            //find the middle point
            int mid = (left + right )/ 2;

            //recursively sort the first and second halves
            sort (arr, left, mid);
            sort(arr, mid + 1, right);

            //merge the sorted halves
            merge(arr , left, mid, right);
        }
    }


    public static void main(String[] args) {
        int [] arr = {12, 13, 44, 56, 56, 72, 32, 21, 97};
        sort(arr, 0, arr.length -1);
        System.out.println("sorted array: " + Arrays.toString(arr));
    }
}
