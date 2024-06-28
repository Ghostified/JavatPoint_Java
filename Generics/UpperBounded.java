package Generics;

import java.util.Arrays;
import java.util.List;

/*
 * Generics can be upper bounded (<? extends T ) or
 * lower bounded (<? super T> )
 */
public class UpperBounded {
    //example of a an uper bounded wildcard in generics
    public static void printUpperBound (List <? extends Number > list) {
        for (Number num : list) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List <Integer > integerList = Arrays.asList(1,2,3,4,5);
        List <Double > doubleList = Arrays.asList(1.0, 3.0, 4.5, 4.0);

        printUpperBound(integerList);
        printUpperBound(doubleList);
    }

}
