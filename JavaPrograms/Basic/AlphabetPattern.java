package JavaPrograms.Basic;
import java.util.*;
public class AlphabetPattern {

    public static void main (String[]Args) {
        int i, j, n = 8; 

        //outer loop for the number of lines
        for ( i =0; i <= n ; i++) {

            //inner loop for logic execution
            for (j = 0; j <=n; j++) {

                //print two vertical lines
                if ((j == 0 || j == n /2) && i != 0 ||
                
                //prints first line of the a;phabet
                i == 0 && j != n/2 ||
                
                
                //prints middle line
                i == n/2)
                System.out.print("*");

                else 

                System.out.print (" ");
            }

            System.out.println();

        }
    }
}
