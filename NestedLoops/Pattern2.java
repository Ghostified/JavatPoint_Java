package NestedLoops;

public class Pattern2 {
    public static void main(String[] args) {
        int i,j,k = 1;

        //inner loop
        for (i = 1; i <= 7; i++)
        {
            //outer loop
            for (j = 1; j < i + 1; j++)
            {
                //print the value of k
                System.out.print(k++ + " ");
            }
            //trows cursor to next line
            System.out.println();
        }
    }
}
