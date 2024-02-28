package Polymorphism.MethodOverloading;
/*
 * Method overloading is when the same class has multiple methods with the same name but diffrent parameters
 * We can overload a method by changing the number of arguments
 */

 //Example: We create two methods add() 
 //the first add() performs addition of two intergers
 //the second add () performs addition of three intergers
 
 class Addition {
    static int add(int a, int b  ) {
        return a + b;
    }
    static int add (int a , int b, int c ) {
        return a + b + c;
    }
 }
public class ChangeNumberOfArguments {

    public static void main (String [] Args) {
        System.out.println(Addition.add(11, 11));
        System.out.println(Addition.add(10, 020, 030));
    }
}
