package Polymorphism.MethodOverloading;
/*
 * Method overloading can be done by changing the data types
 */

 //Example: the data types in the addition class differ
class Addition2{
    static int add(int a , int b) {
        return a + b;
    }
    static double add (double a , double b) {
        return a + b ;
    }
}

 public class ChangingDataTypes {
    public static void main (String[]Args){
        System.out.println(Addition2.add(10, 05));
        System.out.println(Addition2.add(5.5, 6.3));
    }
}
