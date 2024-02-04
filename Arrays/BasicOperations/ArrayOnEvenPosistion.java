package Arrays.BasicOperations;
/*
 * print array elements in an even index
 */
public class ArrayOnEvenPosistion {
    public static void main(String[] args) {
        

        int array []  = new int[] {1,2,3,4,5,6,7,8,9,10};

        //array on even
        System.out.println(" Arrays on even Position");
        for (int i = 1; i < array.length; i = i+2) {
            System.out.print(array[i] + " ");
        }

        //array on odd
        System.out.println();
        System.out.println("Arrays at odd position");
        for (int i = 0;i < array.length; i= i+2){
            System.out.print(array[i] + " ");
        }
    }
}
