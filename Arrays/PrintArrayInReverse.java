package Arrays;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        int array [] = new int [] {3,4,5,6,7};
        System.out.println("Original Array");
        for (int i = 0; i < array.length ;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse Order");

        //loop through array in reverse
        for (int i = array.length - 1;i >= 0; i--) {
            System.out.print(array[i]+ " ");
        }
    }
}
