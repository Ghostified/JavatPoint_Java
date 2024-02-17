package JavaPrograms.Basic;
import java.util.*;
public class DiamondShapePattern {

    public static void main(String[] args) {
        int row, j, i, space =1;
        System.out.println("Enter the number of rows you want to print:");
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        space = row -1;
        for (j = 1; j <= row; j++){
            for (i = 1; i <= space; i++){
        
        System.out.print(" ");
    }
    space --;
    for (i =1; i <=2 * j -1; i ++) {
        System.out.print("*");
    }
    System.out.println(" ");
}
space = 1;
for (j = 1; j <= row -1; j++ ) {
    for (i =1; i <= space; i++){
        System.out.print(" ");
    }
    space ++;
    for (i = 1; i <=2*(row -j)-1; i++) {
        System.out.print("*");
    }
    System.out.println(" ");
}
}
}
