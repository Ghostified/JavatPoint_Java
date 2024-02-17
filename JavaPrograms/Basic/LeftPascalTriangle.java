package JavaPrograms.Basic;
import java.util.*;
public class LeftPascalTriangle {

    public static void main(String[] args) {
        int i, j, k, rows;
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the number of rows: ");
        rows = input.nextInt();
        for (i = 0; i <= rows ; i++) {
            for (j = i; j < rows ; j++) {
                System.out.print(" ");
            }
            for (k =0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
         for (i = rows ; i >= 0; i--) {
            for (j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
         }
         input.close();
    }
}
