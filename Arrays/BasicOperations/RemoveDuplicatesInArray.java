package Arrays.BasicOperations;

public class RemoveDuplicatesInArray {
 public static int removeDuplicate (int array [], int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    int [] temp = new int [n];
    int j = 0;
    for (int i =0; i < n - 1; i++) {
         if (array[i]!= array[ i + 1]) {
            temp [j++] = array[i];
         }
    }

    temp [j++] = array [n-1];

    for (int i= 0; i < j ; i++) {
        array[i] = temp[i];
    }

    return j;
 }
    public static void main(String[] args) {
        int array [] = {11,11,22,22,33,44,44,55,55,66,66,77};
        int length = array.length;
        length = removeDuplicate(array, length);

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
