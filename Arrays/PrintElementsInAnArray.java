package Arrays;

public class PrintElementsInAnArray {
    public static void main(String[] args) {
        //initialize an array
        int [] array = new int [] {1,2,3,4,5,6,7,8,9};
        System.out.println("Elements in a given array");
        //loop through the array by incrementing value of i
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
