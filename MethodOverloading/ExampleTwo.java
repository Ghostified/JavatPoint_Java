package MethodOverloading;
/*
 * Diffrent ways of achieving overloading:
 * using diffrent return types
 * using static and non - static methods
 * 
 */

 class Calculator2 {
    public static int add (int a, int b ) {
        return a + b;
    }

    public static int add (int a , int b, int d){
        return a + b + d;
    }
 }
public class ExampleTwo {

    public static void main(String[] args) {
        System.out.println(Calculator2.add(50,100));
        System.out.println(Calculator2.add(1000, 2000, 3000));
    }

}
