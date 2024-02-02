package Arrays;
/*
 * A jagged array is an array of arrays with diffrent number of columns
 * its an odd number of 2d array
 */

 //example
public class JaggedArray {
    public static void main(String[] args) {
        
        //declation of a 2d array with odd columns
        int array [] [] = new int [3] [];
        array [0] = new int [3];
        array [1] = new int [4];
        array [2] = new int [5];

        //initialize jagged array
        int count = 0;
        for (int i =0; i < array.length;i++)
            for (int j = 0; j < array[i].length; j++) 
                array[i][j] = count++;
            

            //printing data
            for (int i = 0; i< array.length; i++) {
                for (int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();//new line
            }
        }
    }

