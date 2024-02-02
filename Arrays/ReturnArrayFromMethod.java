package Arrays;
//program to return array from method
public class ReturnArrayFromMethod {

    //creating method that returns array from method
    static int[] get() {
        return new int[]{1,2,3,4,5};
    }

    public static void main(String[] args) {

        //calling method that returns array
        int array[] = get();

        //print values of the array 
        for (int i = 0; i < array.length; i++) 
        System.out.println (array[i]);

    }
}
