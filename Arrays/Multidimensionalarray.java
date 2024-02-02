package Arrays;
/*]
 * data is stored in rows and colums
 * 
 * syntax:
 * dataType [] [] arrayRefVar;
 * 
 * example of 3 row 3 column array
 * int [] [] array = new int [3] [3]
 */

 //declare , initialize and instantiate a 2d array
public class Multidimensionalarray {
    public static void main (String[]Args) {
        int array [] [] = {{20,31,42}, {80,90,70}, {30,40,50}};

        //print
        for (int i = 0; i <3; i++) {
            for  (int j =0; j< 3; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

}
