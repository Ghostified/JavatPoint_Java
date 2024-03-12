package ExceptionHandling;
/*
 * Finallly block is executed werther the an exception is handled or not.
 * it contains all the necessary statements that neeed to be printed regardless if the exception occurs or not
 */


public class FinallyBlock {

    public static void main(String[] args) {
        Example22 obj = new Example22();
        obj.finallyBlock();
    }
}

//finally block used when an exception does not occur
class Example22{
    public static void finallyBlock () {
        try {
            //this block does not throw an error
            int data = 22/2;
            System.out.println("data");
        }   

        //catch will not be executed
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

        //executed wether an error occurs or not
        finally {
            System.out.println("Finally block always executed");
        }

        System.out.println("Rest of the code ");
    }
}
