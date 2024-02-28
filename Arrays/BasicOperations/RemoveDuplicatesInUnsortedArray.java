package Arrays.BasicOperations;
import java.util.*;
public class RemoveDuplicatesInUnsortedArray {

    public static int removeDuplicateUnsortedArray(int array [], int n) {
        if (n == 0 || n == 1)  {
            return n;
        }
        int [] temp = new int [n];
        int j = 0;
        for (int i =0; i< n - 1; i++) {
            if (array [i] != array [i + 1]) {
                temp [j++] = array [i];
            }
        }

        temp [j++] = array [n-1];

        //changing original array
        for (int i = 0; i < j; i++){
            array[i] = temp [i];
        }
        return j;
    }

    public static void main(String[] args) {

        //declaring unsorted array
        int [] array = {11,2,3,44,5,88,66,55,99,55,44,3,2,22,11,2 };

        //sort array
        Arrays.sort (array);

        int length = array.length;
        length = removeDuplicateUnsortedArray(array, length);

        //printing out array
        for (int i = 0; i < length; i++)
        System.out.print(array[i] + " ");
    }
}
