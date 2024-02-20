package NestedLoops;
import java.util.*;
public class Pattern6 {

    public static void main(String[] args) {
      int i , j , rows;
      Scanner input =  new Scanner(System.in) ;
      System.out.print("Enter the number of rows: ");
      rows = input.nextInt();
      for (i = rows; i > 0; i--) 
      {
        for (j = rows ; j >= i; j--)
        {
            System.out.print(j + " ");

        }

        System.out.println();
      }

    }
}
