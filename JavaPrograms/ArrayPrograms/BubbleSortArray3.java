package JavaPrograms.ArrayPrograms;

public class BubbleSortArray3 {

    public static void main(String[] args) {
        int arr []= {99,92,1,3,8,9,0,5,2,4,2,77};
       // System.out.println(arr);

        System.out.println("Print original array: ");

        for (int i : arr){
            System.out.print(i+ " ");
        }

       System.out.println("\nSorted array ");
       sortArray(arr);
       for (int i : arr){
        System.out.print(i + " ");
       }
        
    }

    public static void sortArray (int arr []) {

        for (int i = 0; i < arr.length -1; i++) {

            for (int j = 0; j < arr.length -i -1; j++){
                if ( arr[j] < arr[j + 1] ){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = temp;        
            
                }
            }

        }
    }
}
