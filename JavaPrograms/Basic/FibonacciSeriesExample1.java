package JavaPrograms.Basic;
/*
 * Fibonacci numbers , the sum of the next number is the sum of the last two previous numbers
 * 
 * e.g 0,1 , 1,2, 3, 5, 8, 13, 21,  etc
 */

 //fibonacci without  using recursion


public class FibonacciSeriesExample1 {
    public static void main (String [] Args) {
        int n1 = 0;
        int n2 = 1;
        int n3 ;
        int i;
        int count = 10;
        System.out.println(n1 + " " + n2); //printing zero and one

        //loopstarts at 2 because 0 1nd 1 are already printed
        for (i = 2; i < count ;++i) {

            n3 = n2 + n1;
            System.out.println(" "+ n3);
            n1 = n2 ;
            n2 = n3;
        }

    }

}
