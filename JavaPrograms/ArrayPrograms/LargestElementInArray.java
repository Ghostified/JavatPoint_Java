package JavaPrograms.ArrayPrograms;
/*
 * Program to findf the largest element  in an arry
 */
public class LargestElementInArray {

    public static void main(String[] args) {
        
        int [] arr = {2,4,5,67,5,44,66,-67};
        int max = arr[0];
        for (int i = 0; i< arr.length; i++)  {
            if (arr [i] > max) {
            max = (arr[i]);
            }
        }System.out.println("The largest element is: " +  max);
    }

}
