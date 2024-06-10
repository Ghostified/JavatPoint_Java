package JavaPrograms.Basic;

import java.util.Scanner;

//Find all the prime numbers between  1 to n


public class PrimeNumberAlgorithms {

    public static void main(String[] args) {

        int z = 11000000;
    

        TimeTracker.trackTime(() -> {
            for (int  i =0; i < z; i ++) {
                System.out.println("The number " + i + " is a prime number: "  + checkPrime(i));
          
            }
            System.out.println();
    
        });

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        scan.close();
        TimeTracker.trackTime( () -> {
            sievePrimes(n);
        });
        
    }

    //print prime method
    public static boolean checkPrime (int n) {
        if (n == 1) {
            return false;
        }

         if (n ==2  || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for (int i = 5; i *i <= n; i =i+6) {
            if (n %i == 0 || n % (i +2 ) == 0){
                return false;
            }
        }

    return true;

    }

    //Sieve of Eratosthenes

    //creata  a boolean array of size index n;
    //loop through n for n where i =2
    //mark if i is true = marked
    //if (number is unmarked):
    //for j = i * 2 to n
    //mark all its multiples
    //Increment i throuh n where i is umarked
    //print all umarrked 

    static void sievePrimes (int n) 
    {

        boolean [] primeArray  = new boolean [n + 1]; 

        for (int i = 2; i <= n; i++)
        {
            primeArray[i] = true;
        }

    for (int i =2; i * i <= n ; i++) 
    {
        if (primeArray[i] ){
            for (int j =i * i; j <=n; j += i){
                primeArray[j] = false;

            }
        }
    }

    System.out.println("Prime numbers up to : " + n + " are: ");

    for (int i =2; i <=n ; i++){
        if (primeArray[i]) {
            System.out.println(i + " ");
        }
    }
    System.out.println();

}


 class TimeTracker {

    static void trackTime (Runnable method) {
        long start = System.nanoTime();
        method.run();
        Long end = System.nanoTime();
        Long period = (end - start) / 1000000;
        System.out.println("The time taken is " + period + " milliseconds.");
        
    }
 }
}


