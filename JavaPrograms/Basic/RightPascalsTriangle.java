package JavaPrograms.Basic;
import java.util.*;
public class RightPascalsTriangle {

    public static void main(String[] args) {
        int i , j, rows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        rows = input.nextInt();
        for ( i =0; i <= rows -1 ; i++) {
            for (j = 0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = rows - 1; i >= 0; i--){
            for (j = 0; j < i - 1; j ++){
                System.out.print("*" + " ");
            }

            System.out.println(" ");
        }
    }

}
