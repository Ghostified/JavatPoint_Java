package JavaPrograms.ArrayPrograms;
/*
 * Sort elemements in Descending order, from largest to the smallest element
 */
public class SortArrayDescending {

    public static void main(String[] args) {
        int array [] = {-78,2,45,34,6,56,45,7,56,8,67,9,54,0};

        //print oroginal array 
        System.out.println("Original Array: ");
        for (int i : array) {
            System.out.print( i + " ");
        }

        descendingArray(array);
        System.out.println("\nSorted Array: ");
        for (int i : array){
            System.out.print(i + " ");
        }

    }

    public static void descendingArray( int [] array) {
        for ( int i =0; i < array.length - 1; i++){
            for ( int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j ] = array [j + 1];
                    array[j + 1] = temp;
                    
                }
            }
        }
    }
}
