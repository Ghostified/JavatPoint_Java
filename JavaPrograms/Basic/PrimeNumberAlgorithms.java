package JavaPrograms.Basic;

//Find all the prime numbers between  1 to n


public class PrimeNumberAlgorithms {

    public static void main(String[] args) {

        int z = 1000000;
    

        TimeTracker.trackTime(() -> {
            for (int  i =0; i < z; i ++) {
                System.out.println("The number " + i + " is a prime number: "  + checkPrime(i));
          
            }
            System.out.println();
    
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

}
 class TimeTracker {

    static void trackTime (Runnable method) {
        long start = System.nanoTime();
        method.run();
        Long end = System.nanoTime();
        Long period = (end - start) / 1000000000;
        System.out.println("The time taken is " + period + " seconds.");
        
    }
 }


