package NestedLoops;

public class Pattern16 {

    public static void main(String[] args) {
        
        int i, j, rows = 9;

        //prints upper half 
        for (i = rows; i >= 1; i--) 
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //print lower half
        for (i =2; i <= rows; i++) 
        {
            for (j =1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
