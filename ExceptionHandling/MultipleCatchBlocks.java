package ExceptionHandling;
/*
 *Atry block can be followed by multiplr catch blocks
 Each catch block must contain  a diffrent exception handler
 Catch blocks mjust be ordered from the most specific to most general
 */
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Example10 obj = new Example10();
        obj.multipleCatchBlocks();
    }

}
class Example10 {
    public static void multipleCatchBlocks () {
        try {
            int a [] = new int [5];
            a [5] = 30/0;

        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayOutOfBounds Exception");
        }
        catch (Exception e)
        {
            System.out.println("Parent exception Occurs");
        }
        System.out.println("Rest of the code");
    }
}
