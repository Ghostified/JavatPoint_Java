package JavaPrograms.ArrayPrograms;
/*
 * Java program to rotate array to the right a number of times 
 */
public class RightRotateArrayElements {

    public static void main(String[] args) {

        //declare an array
        int arr [] = {1,2,3,4,5};

        //set the number of times an arry should be rotated
        int n = 1;

        //print original array 
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }

        //rotate array by n times to the right
        for (int i = 0; i < n; i ++) {
            int j;
            int last;

            //store the last element of the array
            last = arr[arr.length - 1];

            for ( j = arr.length-1; j > 0; j--){
                //shift elements nby one
                arr[j]  = arr[j-1];
            }

            //last element of the array will e added to the start of the array
            arr[0] = last;
        }

        System.out.println();
        
        //display arry after rotation
        System.out.println("Arry after rotation");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
