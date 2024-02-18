package JavaPrograms.Basic;
import java.util.*;
public class SandGlassStarPattern {

    public static void main (String[] Args) {
        int i, j, k, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter thr numbers of rows to print: ");
        n = input.nextInt();
        for (i =0; i <= n -1  ; i++){
            for (j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= n -1 ; k++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

        for (i = n -1; i >= 0; i --) {

            for ( j= 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= n -1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        input.close();

    }
}
