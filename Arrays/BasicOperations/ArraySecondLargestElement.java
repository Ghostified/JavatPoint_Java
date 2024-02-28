package Arrays.BasicOperations;

public class ArraySecondLargestElement {
public static int getSecondLargest (int total, int [] a) {
    int temp;
    for (int i = 0; i < total; i++) {
        for (int j = i +  1; j < total; j++) {
            if (a[i] > a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    return a[total-2];
}
public static void main(String[] args) {
    int a [] = {1,2,3,4,5,6};
    int b [] = {22,33,44,55,66};
    System.out.println("second largest:" + getSecondLargest(6, a));
    System.out.println("second Largest" + getSecondLargest(5, b));
}
}
