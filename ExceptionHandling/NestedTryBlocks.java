package ExceptionHandling;


public class NestedTryBlocks {

    public static void main(String[] args) {
        Example20 obj = new Example20();
        obj.tryblock();

        Example21 obj1 = new Example21();
        obj1.nesting();
    }

}
class Example20{
    public static void tryblock() 
    {
        //outer try block
        try 
        {
            //inner try block 1
            try 
            {
            System.out.println("divide by zero");
            int b = 78/0;
            }
            
            //catch for inner block 1
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
            
            
            //inner try block 2
            try 
            {
                int a[] = new int[5];
                a[5] = 4;
            }
            
            //catch block for inner try block 2
            
            catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
                
                System.out.println("other statement");
        }
        
        
        //catch block for outer try blocc
        
        catch (Exception e)
        {
            System.out.println("Handled the exception (outer catch)");
        } 
        
        System.out.print("normal flow");


    }
}

class Example21  {
    public static void nesting (){

        //outer try block (main) 
        try
         {

            //inner try block 1
            try 
            {


                //innner try block 2
                try 
                {
                    int arr [] = {1,2,3,4};
                    //printing array elements out of bounds
                    System.out.println(arr[10]);
                }

                //handles arithmetic exception
                catch (ArithmeticException e)
                {
                    System.out.println("Arithmetic exception");
                    System.out.println("Inner try block 1");
                }
            
            
            }

            //to handle arithmetic exception
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic exception");
                System.err.println("inner try block 1");
            }
        }

        //Handle array index out of bounds 
        catch(ArrayIndexOutOfBoundsException e4) 
        {
            System.out.println(e4);
            System.out.println("outer main try block");
        }
        catch (Exception e5)
        {
            System.out.println("Exception");
            System.out.println("Handled in main block");
        }
    }
}