package NestedLoops;

public class RepeatingAlphabetPattern {
    public static void main(String[] args) {
        int letter = 65 ; //ASCII value of A

        //inner loop for rows
        for (int i = 0; i <=9; i++)
        {
            //outer loop for columns
            for (int j =0; j <= i; j++)
            {
                //prints the char
                System.out.print((char)letter + " ");
            }
            letter++;
            System.out.println();
        }
    }
}
