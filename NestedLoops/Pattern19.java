package NestedLoops;
import java.util.*;
public class Pattern19 {

    public static void main(String[] args) {
        int i, j , rows; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number pof rows to be printed: ");
        rows = input.nextInt();

        for (i =1; i <= rows; i++)
        {
            int num = i;
            for (j = 1; j <= i; j++)
            {
                System.out.print(num+" ");
                num = num + rows -j ;
            }
            System.out.println();
        }
    }

}
