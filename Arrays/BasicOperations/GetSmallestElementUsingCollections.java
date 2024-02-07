package Arrays.BasicOperations;

import java.util.*;

public class GetSmallestElementUsingCollections {
    public static int getSmall (int total, Integer[]a) {
        List <Integer> list  = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(0);
        return element;
    }

    public static void main(String[] args) {
        Integer a [] = {1,2,3,4,5,6};
        Integer b [] = {22,33,44,55,66};
        System.out.println("The smallest element: " + getSmall(6, a));
        System.out.println("The smallest element: " + getSmall(5, b));

    }
}
