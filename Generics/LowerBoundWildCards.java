package Generics;

import java.util.Arrays;
import java.util.List;

/*
 * The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a super type of that type.
 */
public class LowerBoundWildCards {
    public  static void addNumbers (List <? super Integer> list) {

        for (Object n : list )
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List <Integer> l1  = Arrays.asList(1,2,3);
        System.out.println("Showing integer values");
        addNumbers(l1);

        List <Number> l2 = Arrays.asList(1.8,1.7,1.3);
        System.out.println("Displaying the numbers ");
        addNumbers(l2);
    }

}
