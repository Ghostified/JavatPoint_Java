package JavaPrograms.ArrayPrograms;
/*
 * Java programs to print arrays in the odd position
 */
public class PrintArrayInIddPosition {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Elements in the original array");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Arrays in odd positions");

        for (int i = 0; i< arr.length; i = i+2) {
            System.out.print(arr[i] + " ");
        }
    }

}
