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

        Example11 obj2 = new Example11();
        obj2.multipleCatchBlock2();

        Example12 obj3 = new Example12();
        obj3.multipleCatchBlock3();

        Example13 obj4 = new Example13();
        obj4.multipleCatchBlock4();
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
class Example11 {
    public static void multipleCatchBlock2 () {
        try {
            int a [] = new int [5];
            a[5] = 30/0;
            System.out.println(a[10]);
        }

        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayOutOfBounds Exception occurs");
        }
        catch (Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
class Example12 {
    public static void multipleCatchBlock3 (){
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception occurs");
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch (Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
class Example13  {
    public static void multipleCatchBlock4 () {
        try {
            int a [] = new int [5];
            a[5] = 30/0;
        }
        catch (Exception e){System.out.println("Common task completed");}
        catch(ArithmeticException e) {System.out.println("task 1 completed");}
        catch(ArrayIndexOutOfBoundsException e) {System.out.println("task 2 completed");}
        System.out.println("rest of the code");
    }
}