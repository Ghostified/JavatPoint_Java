package JavaPrograms.Basic;

public class StarPatternOne {
public static void main(String[] args) {
    //i for rows j for columns
    //rows denotes number of rows to print
    int i, j, row = 6;
    //outer loop for rows
    for(i =0; i < row; i++) {
        //inner loop for columns
        for ( j=0; j <=i; j++){
            //print starts
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
