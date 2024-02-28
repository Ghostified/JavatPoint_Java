package JavaPrograms.Basic;
public class LeftTriangleStarPattern {

    public static void main(String []Args) {
        //i for rows , j for columns
        //rows denotes the number of rows to print

        int i, j , row = 6;
        

        //outer loop for rows
        for (i =0; i < row; i++) {
            
            //inner loop for space

            for (j = 2* (row -i); j >= 0; j--) {

                //print space between two stars 
                System.out .print(" ");
            }

            //inner loop for columns {
                for (j =0; j <= i; j++) {
                    //print stars 
                    System.out.print("* ");
                    
                }

                System.out.println();
            }
        }
    }

