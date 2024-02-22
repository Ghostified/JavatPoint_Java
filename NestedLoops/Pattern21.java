package NestedLoops;
import java.util.*;
public class Pattern21 {

    public static void main (String [] Args) {
        int i, j, min, n ; //n is the the number upto which we want to print
        System.out.print("Enter the value of n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        //loop for upper left part
        for ( i = 1; i <= n; i++)
        {
            for (j = 1; j<=n ; j++)
            {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }

            //llop for right part
            for( j = n -1; j >= 1; j--) 
            {
                min = i < j ? i: j ;
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();
        }

        //loop for lower left part
        for (i = n- 1; i >= 1; i--)
        {
            for (j = 1; j <= n; j++)
            {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }

            //loop for lower right part
            for (j = n -1; j>= 1; j--)
            {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }

            System.out.println();
        }
    }
}
