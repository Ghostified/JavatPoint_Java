package ExceptionHandling;


public class NestedTryBlocks {

    public static void main(String[] args) {
        Example20 obj = new Example20();
        obj.tryblock();
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