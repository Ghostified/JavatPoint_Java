package NestedLoops;
import java.util.*;
public class Pattern8 {

    public static void main(String[] args) {
        
        //number of rows to print 
        int rows;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of rows to print: ");
        rows = input.nextInt();

        for (int i = 1; i <= rows ; i++) 
        {
            int num;
            if (i%2 == 0)
            {
                num = 0;
                for (int j= 0; j <= rows;j++) 
                {
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }

            else 
            {
                num = 1;
                for (int j = 0; j <= rows; j++)
                {
                    System.out.print(num);
                    num = (num == 0) ? 1 : 0;
                }
            }

            System.out.println();
        }

    }
}
