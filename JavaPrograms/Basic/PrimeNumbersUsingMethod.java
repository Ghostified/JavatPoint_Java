package JavaPrograms.Basic;

public class PrimeNumbersUsingMethod {

    static void checkPrime (int n) {
        int i, m=0, flag = 0;
        m = n/2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for(i = 2; i <= m; i++) {
                if (n%1 == 0) {
                    System.out.println(n + " is not a prime number");
                    flag = 1; 
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }

        }
        public static void main (String [] Args) {
            checkPrime(1);
            checkPrime(3);
            checkPrime(4);
            checkPrime(5);
        }
    }
