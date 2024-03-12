package ExceptionHandling;
/*
 * Finallly block is executed werther the an exception is handled or not.
 * it contains all the necessary statements that neeed to be printed regardless if the exception occurs or not
 */


public class FinallyBlock {

    public static void main(String[] args) {
        Example22 obj = new Example22();
        obj.finallyBlock();

        Example23 obj1 = new Example23();
        obj1.finallyBlock1();

        Example24 obj2 = new Example24();
        obj2.finallyBlock3();
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

//when an exception occurs but the exception is not handled by the catch block
//the program exits arbnormally, note from line 61 is not executed 
class Example23 {
    public static void finallyBlock1 (){
        try {
            System.out.println("Inside the try block");
            int array [] = {1,2,3,4};
            System.out.println(array[5]);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block always executed");
        }
        System.out.println("Rest of the code ");
    }
}

//when exception is handled in the try block
//finally is always executed 
class Example24 {
    public static void finallyBlock3 () {
        try {
            System.out.println("Inside the try block ");

            int b = 34/0;
            System.out.println(b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception handled");
            System.out.println(e);
        }

        finally {
            System.out.println("Fibnally always executed");
        }
        System.out.println("Rest of the code ");
    }
}

