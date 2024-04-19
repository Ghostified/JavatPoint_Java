package JavaPrograms.ArrayPrograms;
/*
 * Print the elements in an array which are present in the even position
 */
public class PrintArrayInEvenPosition {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println("elements for the array");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //loop through the array by incrementing the value of i by 2
        //we start from one as the first even positioned eleent is at position 1
        System.out.println();
        System.out.println("Array elements in the even position are: ");
        for (int i = 1; i < arr.length; i = i+ 2){
            System.out.println(arr[i]);
        }
    }

}
