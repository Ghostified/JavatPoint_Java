package ExceptionHandling;
/*
 * Used to handle runtime errors 
 * 
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        Example obj = new Example ();
        obj.exceptionExample();
    }
}
class Example {
    public static void exceptionExample () {
        try {
            //code that may raise an exception
            int data = 100/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //rest of the program
        System.out.println("rest of the code");
    }
}