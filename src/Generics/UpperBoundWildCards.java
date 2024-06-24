package Generics;

import java.util.ArrayList;

/*
 * aN UPPER BOUND WILD CARD decreases the restrictions on a variable
 * It restrics an unknown type to a specific type or subtype
 * i.e List <? extends Number> 
 */

public class UpperBoundWildCards {

    private static Double add (ArrayList <? extends Number > num) {
        double sum = 0.0;

        for (Number n : num) {
            sum = sum + n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList <Integer > l1 = new ArrayList<>() ;
        l1.add (10);
        l1.add (20);
        System.out.println("Displaying sum = " + add(l1));

        ArrayList <Double> l2 = new ArrayList<>();
        l2.add (30.0);
        l2.add(40.0);
        System.out.println("Displaying sum = " + add(l2));
    }

}
