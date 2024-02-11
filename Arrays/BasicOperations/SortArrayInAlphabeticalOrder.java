package Arrays.BasicOperations;
import java.util.*;
public class SortArrayInAlphabeticalOrder {

    public static void main(String[] args) {
        String [] array = {"Mango", "Orange", "Grapes", "Bananas", "Apples"};

        //sort array in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array sorted in descending order" + Arrays.toString(array));

        //Sort arry in ascending order using the Arrays.sort () method
        Arrays.sort(array);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(array));

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
