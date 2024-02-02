package Arrays.BasicOperations;
//program to rotate arry to the left
public class RotateArraytoTheLeft {
    public static void main(String[] args) {
        int [] array = new int [] {1,2,3,4,5};

        //determine the number of times the arry will be rotated
        int n = 3;

        //display the original array
        System.out.println("Original Array");
        for (int i = 0; i< array.length; i++){
        System.out.print(array[i] + " ");
    }

    //rotate array by n times towards the left
    for (int i = 0; i < n ; i++){
        int j , first;

        //store the first element of the array
        first = array[0];
        for (j = 0; j < array.length-1; j++) {

            //shift array elements one by one
            array[j] = array[j + 1];
        }

        //first element will be added at the end
        array[j] = first;      
    }
    System.out.println();
    
    //display result of array after rotation
    System.out.println("Array elements after rotation n number of times");
    for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] +" ");
    }
}

}
