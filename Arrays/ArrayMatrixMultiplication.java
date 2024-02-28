package Arrays;

public class ArrayMatrixMultiplication {

    public static void main(String[] args) {
        //create two matrices
        int a [][] = {{1,1,1},{2,2,2},{3,3,3}};
        int b [][] = {{3,3,3},{4,4,4},{5,5,5}};

        //creating another matrix to store the matrix
        int c [][] = new int[3][3];

        //multiplying and printing multiplication of the two
        for (int i = 0; i < 3; i++) {
            for (int j =0; j < 3; j++){
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
