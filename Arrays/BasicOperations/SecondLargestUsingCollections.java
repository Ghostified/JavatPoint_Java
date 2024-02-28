package Arrays.BasicOperations;

import java.util.*;
public class SecondLargestUsingCollections {

    public static int getTheSecond( Integer [] a,int total){

        List <Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total - 2);
        return element;
    }

    public static void main(String[] args) {
        Integer a [] = { 1,2,3,4,5,6};
        Integer b [] = {11,22,33,44,55,66};

        System.out.println("Second Largest" + getTheSecond(a, 6));
        System.out.println("Second Largest: " + getTheSecond(b, 6));
    }
}
