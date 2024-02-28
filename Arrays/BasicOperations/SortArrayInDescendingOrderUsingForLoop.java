package Arrays.BasicOperations;

public class SortArrayInDescendingOrderUsingForLoop {

    public static void main(String[] args) {
        
        //creating an array instance
        int array [] = {143,77,5,6,7,8,3,2,5};
        System.out.println(" Array elements after sorting");

        //sorting logic
        for (int i =0 ; i < array.length; i++) {
            for (int j = i +1 ; j < array.length; j++) {
                int temp = 0;
                if (array [i] > array[j]) {
                    temp = array [i];
                    array [i] = array[j];
                    array [j] = temp;
                }
            }

            //print out the sorted array
            System.out.println(array[i]);
        }
    }
}
