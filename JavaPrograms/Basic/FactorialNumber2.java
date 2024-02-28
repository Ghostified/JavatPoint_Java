package JavaPrograms.Basic;
/*
 * getting a factorial using recursion
 */


public class FactorialNumber2 {
    static int factorial (int n) {
        if (n == 0) 
        return 1;
        else 
        return(n * factorial(n -1));
    }

    public static void main (String[] Args) {
        int i;
        int  fact = 1;
        int number = 5;
        fact = factorial (number);
        System.out.println("Factorial of number " + number + " is: " + fact);
    }
}
