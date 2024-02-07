package Arrays.BasicOperations;

public class SmallestNumberInArray {

    public static int getSmallest(int total, int [] a) {
        int temp;
        for (int i =0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i]  > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,7};
        int b [] = {11,22,33,44,55,55};
        System.out.println("The smallest is : " + getSmallest(8, a));
        System.out.println("The smallest is : " + getSmallest(6,b));
    }
}
