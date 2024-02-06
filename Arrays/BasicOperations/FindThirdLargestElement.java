package Arrays.BasicOperations;
/*
 * program to find the third largest element in an Array
 */
public class FindThirdLargestElement {
public static int getThirdLargest(int [] a, int total) {
    int temp;
    for (int i =0; i < total; i++){
    for (int j = i+ 1; j < total; j++){
        if (a[i] > a[j]) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    }
    return a[total -3];
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        int b [] = {44,55,66,77,88,99};
        System.out.println("Third Largest" + getThirdLargest(a, 9));
        System.out.println("Third largest" +getThirdLargest(b, 6));
    }
    }
