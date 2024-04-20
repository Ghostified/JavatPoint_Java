package JavaPrograms.ArrayPrograms;
/*
 * Sort an array from the smallest to the largest
 * //simple buble sort algorithm
 */
public class SortArrayAscending {

    public static void main(String[] args) {

        //initialize the array
        int [] arr = {9,8,7,6,0,1,23,27,45,5,2,3,4,};

        
        int temp = 0;
        System.out.println("Elements of the original array");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        

        for (int i =0; i < arr.length; i++){ //iterates through each element of the array
            for (int  j = i + 1 ; j < arr.length; j++){ //compares the current element i with subsequent elements
                if (arr[i] > arr[j]){ 

                    //if the above condition is met, it brings the smaller value to the beginning of the array
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();      
        System.out.println("Array elements sorted in ascending order");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
