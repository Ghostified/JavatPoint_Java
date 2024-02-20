package NestedLoops;
import java.util.*;
public class Pattern9 {

    public static void main(String[] args) {
        
        int i, j , rows;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();

        for (i =1; i <= rows ; i++)
        {
            for (j = 1; j <= i; j++)
            {
                if (j %2 == 0)
                {
                    System.out.print(0);
                }
                else 
                {
                    System.out.print(1);
                }
                
            }
            System.out.println();
        }
    }
}
