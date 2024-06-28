package Generics;

import java.util.Arrays;
import java.util.List;

/*
 * Used when we have no specified generic type
 */
public class UnboundedWildCardGeneric {

    //generic method with wildcard
    public static void printList (List <?> list) {
        for (Object element : list) {
            System.out.print(element  + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List <Integer> intList = Arrays.asList(1,2,3,4,5);
        List <String> stringList = Arrays.asList("Griffindor", "Ravenclaw", "Hufflepuff", "Slytherin");

        printList(intList);
        printList(stringList);
    }

}
