package NestedLoops;

public class RightAngleAlphabeticPattern {

    public static void main(String[] args) {
      int alphabet = 65; //ASCcii value for A is 65

      //inner loop for rows
      for (int i = 0; i <= 8; i++)
      {
        //outer loop for columns
        for (int j  = 0; j <= i; j++)
        {
            //adds the value of j inthe ASCII Value of A and prints out corresponding alphabet
            System.out.print((char) (alphabet + j) + " ");
        }

        System.out.println();
      }

    }
}
