package JavaPrograms.ArrayPrograms;

public class SecondLargestArray {

    public static void main(String[] args) {
        
        example1();
    }

    public static void example1 () {

        int [] arr = {34,44,66,87,22,56,89,70};
        //int temp; 

        System.out.println("Elements of the original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int temp; 

        for (int i = 0; i < arr.length; i++ ) {
            for (int j =0; j < i+ 1; j++) {
                if (arr[i] > arr [j] ) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr [j] = temp;
        

                }
            }
        }


        System.out.println();
        System.out.println("Second largest element: ");
        for (int i = 0; i <  arr.length; i ++) {
            if (arr[i] == arr[1])
            break;
            
        }
        System.out.println(arr[1]);
    }
}
