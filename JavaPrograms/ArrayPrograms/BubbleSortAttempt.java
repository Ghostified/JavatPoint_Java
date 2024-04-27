package JavaPrograms.ArrayPrograms;

//Sorting array elements from the smallest to the largest

public class BubbleSortAttempt {

    public static void main(String[] args) {
        myBubbleSort();
        
    }

    public static void myBubbleSort(){

        int array []= {66,44,27,45,99,109,33,65};
        int  size = array.length;
        int temp = 0;
        
        System.out.println("Before Sorting Elements");
        for (int arr : array){
            System.out.print(arr + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size -1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array [j];
                    array[j] = array[j + 1];
                    array [j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting  Array Elements");
        for (int arr : array){
            System.out.print(arr + " ");
        }
        System.out.println();
    }

}
