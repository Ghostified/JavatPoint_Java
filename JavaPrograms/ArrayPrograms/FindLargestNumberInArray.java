package JavaPrograms.ArrayPrograms;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        findLargestNumber();
    }

    public static void findLargestNumber () {

        int arr [] = {8,2,33,4,5,6};
        int size = arr.length;
        int temp;

        System.out.println("Before  sorting: ");
         for (int i : arr) {
            System.out.print( i + " ");
         }
        
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] <    arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
         }
         System.out.println();
         System.out.println("After sorting: ");
         for (int i : arr) {
            System.out.print( i + " ");
         }

         System.out.println();
         System.out.println("Largest Number in the  Array is " + arr[0]);

    }
}
