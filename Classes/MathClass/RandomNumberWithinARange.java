package Classes.MathClass;
/*
 * Generate a random number within a range of integers
 * syntax:
 * syntax: Math.randon()*(max-min + 1) + min
 * 
 * example:
 * the min value is inclusive while the max value is exclusive
 */
public class RandomNumberWithinARange {
    public static void main(String[] args) {
        int min = 200;
        int max = 400;

        //Generate Random Number
        System.out.println("Random value of type double between " +min + " to " + max + " :");

        double a = Math.random()* (max - min + 1) + min;

        System.out.println(a);

        //Generate random int value from 200 to 400

        System.out.println("Random value of type int between " + min + " to " + max + " :");
        int b = (int)(Math.random()* (max - min + 1) + min);
        System.out.println(b);
    }
}
