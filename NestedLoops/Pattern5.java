package NestedLoops;
import java.util.*;
public class Pattern5 {

    public static void main(String[] args) {
        int i, j, rows; 
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number of rows to print: ");
        rows = input.nextInt();
        for (i = 1; i <= rows ; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}
