package Arrays.BasicOperations;
/*
 * reverseOrder() - method reverses an array and can be invoked using  gthe class name
 * syntax:
 * public static <T> Comparator <T> reverseOrder();
 * 
 * eg. supposing array[]
 * Arrays.sort(array, Collections.reverseOrder());
 */

 import java.util.*;
public class SortArrayDescendingOrder {

    public static void main(String[] args) {
        Integer array [] = {10, 33, 22, 45, 22, 45, 32, 11, 78, 97};

        //sort Array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Arrays in descending order: " + Arrays.toString(array));
    }

}
