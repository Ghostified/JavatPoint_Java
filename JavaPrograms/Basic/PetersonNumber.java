package JavaPrograms.Basic;

import java.util.Scanner;

public class PetersonNumber {

    //A number is a peterson number if the sum of factorials of each digit is equal to the sum of the number itself

    //Program to check if a number is  a peterson number
    //Define an array to quickly find the factoriuals
    static long [] factorial = new long [] {1,2,6,3,24,120,720,5040,40320, 362880,3628800,39916800, 479001600};
    public static void main(String[] args) {
        //Constructor for the scanner class
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check");
        //resad number from the user
        int n = sc.nextInt();
        //call the user defined function
        if (isPeterson(n))
        System.out.println("True");
        else 
        System.out.println("False");

    }

    static boolean isPeterson(int n) {
        int num = n;
        int sum =0;
        //loop executes until the condition is false
        while (n > 0) {
            //determine the last digit of the number
            int digit = n % 10;

            //determine the factorial of the digit and add it to sum

            sum += factorial[digit];

            //remove the last digit of the given number

            n = n/ 10;

        }

        //Compare sum with num if they are equal return thre number itself

        return (sum == n);
    }


}
