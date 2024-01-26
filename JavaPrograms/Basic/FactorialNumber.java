package JavaPrograms.Basic;
/*
 * using for loops to find factorial of 5!
 */
public class FactorialNumber {

    public static void main (String[]Args) {
        double i;
        double factorial = 1;
        double number = 10;
        for (i =1 ; i < number; i++) {
            factorial = factorial*i;
        }
        System.out.println( "Factorial of " + number + " is: " + factorial);
    }

}
