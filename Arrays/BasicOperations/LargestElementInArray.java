package Arrays.BasicOperations;
//program to print the maximum number in an array
public class LargestElementInArray {
    public static void main(String[] args) {
        
        int array [] =new int[] {34,54,67,89,100,23,35,11};

        //Largest element
        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] > max)
            max = array[i];
        }
        System.out.println("The largest element in a given array");
        System.out.println(max);

        //smallest element
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min)
            min  = array[i];
        }
        System.out.println("The smallest element in  the array");
        System.out.println(min);
    }
}
