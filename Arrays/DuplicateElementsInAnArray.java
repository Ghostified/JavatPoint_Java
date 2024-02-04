package Arrays;
//Program to print out duplicate elements in Array
public class DuplicateElementsInAnArray {
    public static void main(String[] args) {
        
        //initialize an array
        int [] array = new int [] {1,2,3,4,4,5,5,6,7,7,8,8};
        System.out.println("Duplicate elements in a given array");
        //searches for duplicate elements
        for (int i = 0; i < array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                System.out.println(array[j]);
            }
        }
    }

}
