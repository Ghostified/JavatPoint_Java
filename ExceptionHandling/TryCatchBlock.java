package ExceptionHandling;
/*
 * Used to enclose code that might throw an exception
 * Must be included within the method
 */
public class TryCatchBlock {

    public static void main(String[] args) {
        
    }
}
class Example1{
    public static void TryCatchBlockExample1 () {
        try {
            int data = 500/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code....");
    }
}