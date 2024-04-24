package JavaPrograms.ArrayPrograms;

public class SortArrayInDescendingOrder {

    public static void main(String[] args) {
        int arr [] = {67,4,68,3,45,2,67,5};
        int temp = 0;
        System.out.println("Elements of the original array ");
        for (int i :arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j< arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements sorted in descending order");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
