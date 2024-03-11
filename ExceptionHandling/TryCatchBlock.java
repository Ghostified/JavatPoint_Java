package ExceptionHandling;
/*
 * Used to enclose code that might throw an exception
 * Must be included within the method
 */
public class TryCatchBlock {

    public static void main(String[] args) {

        Example2 obj = new Example2();
        obj.customCatchBlock();

        Example3 obj1 = new Example3();
        obj1.resolveException();

        Example4 obj2 = new Example4();
        obj2.arrayIndexOutOfBounds();
        
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
 //print a custom exception message
 class Example2 {
    public static void customCatchBlock () {

        try {
            int data = 500/0;

        }
        catch (Exception e) {
            System.out.println("Amathematical error -- Thios is custom");
        }

        System.out.println("Rest of the code");
    }
 }
 //resloving an exception
  class Example3  {
    public static void resolveException () {
        int i = 50; 
        int j = 0;
        int data;
        try {

            //may throw an exception
            data = i/j;
        }
        //handling exception
        catch (Exception e) 
        {
            //resolving
            System.out.println(i/(j+2));
        }
    }
  }
  class Example4 {
    public static void arrayIndexOutOfBounds (){
        try {
        int [] arr = {1,2,3,4,5};
        System.out.println(arr[10]); //may throw exception
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code ");
    } 
  }