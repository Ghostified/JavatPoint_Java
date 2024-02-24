package ControlStatements;
/*
 * For each is a repetition control structure that is effective :
 * if we do not know how many times a task is to be repeated
 * 
 * example: iterating through a list of integers
 */
import java.util.*;
public class ForEachExample2 {

    public static void main(String[] args) {
        
        List <Integer> numbers = Arrays.asList(10,20,30,40,50);

        for (Integer x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
    }
}
