package Polymorphism.MethodOverloading;
/*
 * One data type can be promoted implicitly to another 
 * if the no matching data type is found
 */
//example
class OverloadingCalculation1{
    void sum (int a, long b) {
        System.out.println( a + b);
    }
    void sum (int a , int b, int c) {
        System.out.println(a + b + c);
    }
}

public class MethodOverloadingByTypePromotion {

    public static void main (String[]Args) {
        OverloadingCalculation1 object = new OverloadingCalculation1();
        object.sum(20,20);
        object.sum(20,20,20);
    }

}
