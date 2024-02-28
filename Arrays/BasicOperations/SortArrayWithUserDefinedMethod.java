package Arrays.BasicOperations;

public class SortArrayWithUserDefinedMethod {

    public static void main(String[] args) {

        //declaring array
         int array [] = new int [] {33,32,31,45,42,76,74,23,22,11,10};
         System.out.println("Array Element before sorting :\n");
         for (int i = 0; i < array.length; i++) 
            System.out.println(array[i]);

            //invokingh the user defined method 
            sortArray(array, array.length);
            System.out.println("Array elements after sorting: \n");

            //accessing the elements of the sorted array
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
    }

    //user defined method to sort array in descending method
    private static void sortArray(int array [], int n) {
        for (int i = 1; i < n ; i++) {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j-1] > a)) // returns true when both conditions are true
            {
                array [j] = array[j-1];
                j--;
            }
            array[j] = a;
        }
    }
}
