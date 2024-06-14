package JavaPrograms.Basic;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println(factorial(n));
        
    }

    static int factorial (int n) {

        //Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = 1;
        //loop from 2 to n
        for (int i = 2; i <= n ; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
