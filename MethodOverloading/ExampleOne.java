package MethodOverloading;
/*
 * used to increase program readability
 * its performed within a class
 * itys an example of compile time polymorphism
 * 
 */

 class Calculator{
    public static int  add (int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
 }
public class ExampleOne {
    public static void main (String [] Args) {
        Calculator a = new Calculator();

        int result = Calculator.add(1,2);
        System.out.println(result);

        result = Calculator.add(1,2,3);
        System.out.println(result);
    }
}
