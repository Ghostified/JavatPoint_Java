package Generics;
//Type Parameters
/*
 * T - Type
 * E - Element
 * K - Key
 * N- Number
 * V - Value
 *we can create a generic method that can accept any kind of elements 
 The scope of arguments is limited to the method where is declared 
 it also allows static and non-static methods
 * 
 */

public class GenericMethods {

    public  static <E> void printArray (E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] intArray = {10,20,30,40,50};
        String [] stringArray = {"The", "Lord", "Of", "the ", "Rings"} ;

        System.out.println("Printing array of integers");
        printArray(intArray);

        System.out.println("Printing string Array");
        printArray(stringArray);
    }
}
