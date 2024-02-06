
package Arrays.BasicOperations;

import java.util.*;

public class ThirdLargestUsingArrayColections {

    public static int getTheThird(Integer [] a, int total) {
        List <Integer > list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total-3);
        return element;
    }
    public static void main(String[] args) {
        Integer a [] ={1,2,3,4,5,6,7};
        Integer b [] = {77,66,55,44,33,99};
        System.out.println("Third Largest:" + getTheThird(a, 7));
        System.out.println("Third Largest" + getTheThird(b, 6));
    }
}
