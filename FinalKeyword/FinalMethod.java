package FinalKeyword;
/*
 * if a method is marked as final,
 * One can not override it
 */

 class Car {

    //creating a final method
    final void run () {
        System.out.println("running");
    }
 }

 class Toyota extends Car {
    void run() {
        System.out.println("Running at 100Km/hr");
    }
 }
public class FinalMethod {

    public static void main (String[]Args) {
        Toyota celica = new Toyota();
        celica.run();
    }
}

// output = compile time error
