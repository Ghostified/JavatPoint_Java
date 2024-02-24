package ControlStatements;

import java.util.*;

/*
 * Using a for each loop to iterate through a list of Strings
 */
public class ForEachExample3 {

    public static void main(String[] args) {
        List <String> names = Arrays.asList("Harry", "Ron", "Hermione");

        for (String name : names) {
            System.out.print( name);
            System.out.print(",");
        }
    }
}
