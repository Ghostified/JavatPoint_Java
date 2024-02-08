package Arrays.BasicOperations;

public class RemoveDuplicateInArrayUsingSeparateIndex {

    public static int removeDuplicate (int array[], int n ) {

        if (n == 0 || n == 1){
        return 1;
    }

    int j = 0; //for next element
    for (int i =0; i < n-1;i++) {
        if (array[i] != array[i + 1]) {
            array [j++] = array [i];
        }
    }
    array [j++] = array[n-1];
    return j;

}
public static void main(String[] args) {
    int array [] = {10,10,20,20,30,30,44,55,55,66,66,77,77};
    int length = array.length;
    length = removeDuplicate(array, length);

    //print array elements
    for (int i = 0; i < length; i++) 
    System.out.print(array[i]+ " ");
}
}