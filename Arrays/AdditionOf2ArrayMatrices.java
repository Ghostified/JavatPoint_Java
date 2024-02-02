package Arrays;

public class AdditionOf2ArrayMatrices {

    public static void main(String[] args) {
        //creating two matrices 
        int a [] []= {{20,30,40},{50,60,70}, {11,22,33}};
        int b [] [] = {{17,27,37},{47,57,67},{77,87,97}};

        //creating an another matrix to store the sum of the two matrices
        int c [] [] = new int [3][3];

        //addition and printing the sum of the a & b
        for (int i = 0; i <3;i++){
            for(int j =0; j< 3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
