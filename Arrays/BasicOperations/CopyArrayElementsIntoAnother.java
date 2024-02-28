package Arrays.BasicOperations;

public class CopyArrayElementsIntoAnother {

    public static void main(String[] args) {
        //initialize array
        int [] array1 = new int [] {1,2,3,4,5};

        //createsecond array with size of array1
        int [] array2 = new int [array1.length];

        //copying array1 elements into array2
        for (int i =0; i < array1.length; i++){
            array2[i] = array1[i];
        }

        

        //display elements of array1
        System.out.println("Elements in the original array");
        for (int i =0; i< array1.length;i++){
            System.out.print(array1[i] +" ");
        }

        System.out.println();

        //display the elements in array2
        System.out.println("Elements in array 2");
        for (int j =0 ; j < array2.length; j++) {
            System.out.print(array2[j] + " ");
        }
    }
}
