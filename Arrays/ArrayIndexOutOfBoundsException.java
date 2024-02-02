package Arrays;
/*
 * JVM throws an ArratIndexOutOfBoundsException if:
 * length of an array is negative, 
 * equal to the array size
 * greater than array size
 * DURING TRAVERSAL
 */
public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int arr[] = {39,90,93,65};
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[5]);
        }
    }
}
