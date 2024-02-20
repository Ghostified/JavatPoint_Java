package NestedLoops;
import java.util.*;
public class pattern7 {

    public static void main(String[] args) {
        int i, j, n; 
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        n = input.nextInt();
        for (i = 0; i <=n ; i++) 
        {
            for (j = i; j >= 0; j--)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
