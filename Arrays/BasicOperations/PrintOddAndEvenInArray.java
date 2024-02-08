package Arrays.BasicOperations;

public class PrintOddAndEvenInArray {

    public static void main (String Args []) {
        int array [] = {1,2,3,4,5,6,7,8,9,10,12};
        System.out.println("Odd Numbers");
        for (int i =0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                System.out.println(array[i] + " ");
            }
        }
        

        //print even
    
        System.out.println("Even Elements");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            } 
        }
    }
}
