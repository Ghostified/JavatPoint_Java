package Classes.WrapperClass;

/*
 * Wrapper classes provides a method of converting a primitive to an object and an object to primitive
 * 
 * Autoboxing is an automatic method of converting a primitive data type into its corresponding wrapper class
 * eg:
 * long - long
 * short > Short
 * char to Charactes
 * boolean to Boolean
 * int to Integer
 * float to Float
 * double to Double
 * 
 * //Why we need wrapper classes
 * change value in a method
 * convert objects into streams in serialization
 * synchronization
 * collection frameworks only deal with objects like ArrayLists
 */

 //program to convert primitive to objects of int to Integer
public class Autoboxing {
    public static void main(String[] args) {
        
        //convertint int to ineger
        int a = 20;

        //explicit conversion of int into integer
        Integer i = Integer.valueOf(a);

        //autoboxing 
        Integer j = a;

        System.out.println(a + " " + i + " " + j);
    }
}
