package NestedLoops;

public class PatternFour {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            int n = 11;
            for (int j = 1; j <= n- i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int m = 2; m <= i; m++)
            {
                System.out.print(m);
            }
            System.out.println();
        }
        for (int i =3; i >= 1; i--) 
        {
            int n = 10;
            for (int j = 0; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int m = 2; m <= i; m++)
            {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
