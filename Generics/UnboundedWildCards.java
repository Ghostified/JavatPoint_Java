package Generics;
/*
 * Unbounded wildcard type represents the list on an unknown type such as List <?>
 * 
 */

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCards {

    public static void display (List <?> list)
    {
        for (Object o : list)
        {
            System.out.println(o);
        }
    }

    public static void main (String [] args) {
        List <Integer> l1 = Arrays. asList  (1,2,3);
        System.out.println("Displaying the Integer Values ");
        display(l1);
        List<String> l2 = Arrays.asList("One", "Two ", "Three");
        display(l2);
    }

}
