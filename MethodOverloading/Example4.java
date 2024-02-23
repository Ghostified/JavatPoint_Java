package MethodOverloading;
/*
 * Achieving method overloading using diffrent types of arguments with non static methods in a class
 */

 class Calculator3 {
    public int add (int a , int b) {
        return a + b ;
    }

    public String add (String a, String b) {
        return a +" " +  b;
    }
 }
public class Example4 {

    public static void main(String[] args) {
        Calculator3 calculate = new Calculator3();
        System.out.println(calculate.add("Allan" , "Branson"));
        System.out.println(calculate.add(1000,2000));

    }

}
