package Arrays.BasicOperations;
import java.util.*;
public class SortMethodToSortAnArray {

    public static void main (String []Args) {

        //define array of integer type
        int [] array = new int [] {22,33,22,44,55,76,89,96,45,325};

        //invoke the sort method
        Arrays.sort(array);

        System.out.println("Elements of the array sorted in descending order");

         for (int i =0; i < array.length; i++) {
            System.out.println (array[i]);
         }

    }
}
