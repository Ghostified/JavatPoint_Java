package reccursion;



public class Factorial {

    public static int fact (int n) {
    
        int result; 
        if (n == 0) {
            return 1;
        } else {
            result = n *fact( n -1);
        }
        return result;
    }

    public static void main(String[] args) {

    System.out.println("The factorial of 10 is " + fact(10));
    }

}


