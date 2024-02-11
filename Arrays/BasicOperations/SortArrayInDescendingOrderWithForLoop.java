package Arrays.BasicOperations;

public class SortArrayInDescendingOrderWithForLoop {

    public static void main(String[] args) {
        
        //create an array instance
        int array [] = new int [] { 3,23,-2, 45, 78, 72, 99, -1, 102, 89};
        System.out.println("Array elements before sorting");

        for  (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array after sorting: ");

        //sorting logic
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                int temp = 0;
                if (array[i] < array[j]) {
                     temp = array[i];
                     array [i] = array[j];
                     array [j] = temp;
                }
            }

            //prints out the sorted array
            
            System.out.print(array[i] + " ");
        }
    }
}
