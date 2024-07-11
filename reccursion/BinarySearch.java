package reccursion;
/*
 * Used for finding an item in a sorted liust by dividing half the the portion that could contain the list of the item
 * time complexity o(log n)
 * spacre complexity o(log n)
 */
public class BinarySearch {

    public static int binarySearch(int [] arr, int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) /2 ;

            //if the element is present in the middle
            if (arr[mid] == x) {
                return mid;
            }

            //if array is smaller than the mid, then it can only be in the left
            if (arr[mid] > x ){
                return binarySearch(arr, left, mid -1, x);
            }

            //else the element can only be present in the right sub array
            return binarySearch(arr, mid + 1, right, x);
        }

        //element is not present in the array 
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7, 10,60, 90};

        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n-1, x);
        if (result == -1) {
            System.out.println("element not present");
        } else {
            System.out.println("Element found at Index" + result);
        }
    }
}
