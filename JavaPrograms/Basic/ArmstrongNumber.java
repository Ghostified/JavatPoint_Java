package JavaPrograms.Basic;
/*
 * An armstrong number = is a is a positive integer number that is equalto the mth power of ther digits
 * e.g 1^1 = 1
 * 153 = 1^3 + 5^3 + 3^3 = 153 
 */

 import java.util.Scanner;
 import java.lang.Math;
public class ArmstrongNumber {

    //function to check if a number is an armstrong or not
    static boolean isArmstrong (int n) {
        int temp, digits = 0, last =0, sum = 0;

        //assigning n into a temp value
        temp = n;

        //loop execute until the condition is false
        while (temp > 0) {
            temp =temp/10;
            digits++;
        }
        temp = n;
        while (temp > 0) {

            //determine the last digit from the number
            last = temp % 10;

            //calculates the power of a number up to thr digit times and adds the resultant to the sum variable
            sum += (Math.pow(last, digits));

            //removes the last digit
            temp = temp/10;
        }

        //compares the sum with n
        if (n==sum)

        //returns if sum and n are equal
        return true;

        //return false if sum and n are not equal
        else return false;
    }
    //driver code 
    public static void main (String[]Args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");

        //read limit from user
        num = sc.nextInt();
        System.out.println("Armstrong numbers upto " + num + " are: ");
        for(int i =0; i < num; i++)

        //function calling
        if (isArmstrong(i))

        //print the Armstrong numbers
        System.out.println(i + " ");
    }

}
