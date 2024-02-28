package JavaPrograms.Basic;
/*
 * Palindrome number is a number that stays the same after being reversed e.g 171,343,34543
 * 
 * Syntax for a program to check palindrome number :
 * Get  number to check for palindrome
 * Hold the number in a temporary variable
 * Reverse the number
 * Compare the temporary number with the reversed number
 * If both numbers are the same, print out: Number is a palindrome
 * Else print: not a palindrome
 */
public class PalindromeNumber {
    
    public static void main (String[]Args) {
        int r;
        int sum = 0;
        int temp;

        //the variable number to be checked as palindrome
        int n = 354;

        temp = n ;
        while (n > 0) {

            //getting remainder
            r = n% 10;
            sum = (sum * 10) + r;
            n = n /10;
        }
        if (temp == sum)
            System.out.println("Palindrome Number");
        else
        System.out.println("Not a palindrome");
    }
}
