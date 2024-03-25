package ExceptionHandling;

public class HowExceptionsAreThrown {
   // Java Program to demonstrate how an exception is thrown
    //how runtime system searches a callstack
    //to find Apporopriate Exception Handler

    //class
    //ExceptionThown
    static int divideByZero(int a , int b) {
        //this ststement will cause ArithmeticException
        //(divide by zero)
        int i = a/b;
        return i; 
    }

    static int computeDiv (int a , int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        }
        //catch block to catch number formart exception
        //Exception does not match with arithmetic exception
        catch (NumberFormatException x){
            //display message 
            System.out.println("Number formart exception occured");
        }
        return res;
    }

    //method 2
    //find appropriate excception handler
    //i.e matching catch block
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        //try block to check for exception
        try {
            int i = computeDiv(a, b);
        }
        //catch block to handle exception
        //exceptions
        catch (ArithmeticException ex) {

            //getMesssage () will print description
            //of exception (here / by zero)
            System.out.println(ex.getMessage());
        }
    }
}
