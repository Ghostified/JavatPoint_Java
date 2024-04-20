package JavaPrograms.ArrayPrograms;


//Sort arrays from sl=mallest to ascending 

public class BubbleSortAnArray {



    public static void main(String[] args) {
        int arr [] = {23,32,54,56,55,78,72,79,81,80, 97,92, 91};

        //print array before sorting
        System.out.println("Orginal array");
        printArray(arr);

        //sort array
        bubbleSort(arr);
        System.out.println("Array after sort");
        printArray(arr);


    
    }

    public  static void bubbleSort (int [] arr) {

        int n = arr.length;

        //perform bubble sort
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n-1 ; j++) {

                //comapre elements and swap if out of order
                if (arr[j] > arr[j + 1]){
                    int temp = arr [j];
                    arr [j] = arr[j + 1];
                    arr[j + 1 ] = temp;
                }
            }
        }
    }

    public static void printArray (int [] array) {
        for (int element : array) {
        System.out.print(element + " ");
        }
        System.out.println();
    }


}
