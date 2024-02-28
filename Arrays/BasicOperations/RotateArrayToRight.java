package Arrays.BasicOperations;
/*
 * Java Program to rotate arrays to the right
 */
public class RotateArrayToRight {
    public static void main(String[] args) {
        int array []= new int [] {1,2,3,4,5};
        int  n = 2;
        System.out.println("The elements in the original array:  ");
        for (int i = 0; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }

    
        for (int i = 0; i < n ; i++){
            int j , last;

            last = array [array.length -1 ];
            
            for (j = array.length -1; j > 0; j--){
                array[j] = array[j -1];
            }
            array[0] = last;
        }
        System.out.println();
        System.out.println("Array after right rotation");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
