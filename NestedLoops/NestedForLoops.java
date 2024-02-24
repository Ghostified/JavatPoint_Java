package NestedLoops;
/*
 * These are loops containing other loops
 * 
 * Example:
 * Printing a table from 1 -10
 */
public class NestedForLoops {

    public static void main(String[] args) {
        
        //initializing loop counters
        int num = 1;
        int i = 1;

        //outer for loop
        for ( num = 1; num <= 10; num = num + 1) {

            //inner loop
            System.out.print("Table of " + num + " is: ");
            for (i = 1; i <= 10; i = i +1){
                //printing table
                System.out.print(num * i + " ");
            }

            //print a new line
            System.out.println();
        }
    }
}
