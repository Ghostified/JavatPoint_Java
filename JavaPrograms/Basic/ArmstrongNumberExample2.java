package JavaPrograms.Basic;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumberExample2 {

    //function to check if a number is Armstrong or not
    static boolean isArmstrong (int n) {
        int temp, digits=0, last=0, sum=0;

        //assigning n into a a temp variable
        temp =n ;

        //loop executes until condition is false
        while (temp > 0) {
            temp = temp /10;
            digits++;
        }
        temp =n ;
        while (temp > 0) {

            //determine last digit from the number
            last = temp % 10;

            //calculate the power of the a number upto digit times and add the resultant to sum variable
             sum += (Math.pow(last,digits));

             //remove last digit
             temp = temp/10;
        }

        //compare sum with n
        if (n == sum)

        //retun if sum and n are aqual 
        return true;

        //return false if sum and n are not equal
        else return false;
    }

    //main method 
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        //read limit from the user 
        num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
