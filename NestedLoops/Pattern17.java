package NestedLoops;

public class Pattern17 {

    public static void main (String [] Args) {
        int rows = 5; 
        //prints upper part of the pattern
        for (int i = 1; i <= rows; i++) 
        {
            //prints i spaces at the beginnong of each row
            for (int j =1; j < i; j++)
            {
                System.out.print(" ");
            }

            //prints i to rows value at the end of each row
            for (int j = i;  j<= rows; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        //prints lowe half of the pattern
        for (int i = rows -1; i >= 1; i--) 
        {
            //prints i spaces at the beginning of each row
            for (int j = 1; j< i; j++)
            {
                System.out.print(" ");
            }

            //prints i to row value at the end of each row
            for (int j =i; j <= rows; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
