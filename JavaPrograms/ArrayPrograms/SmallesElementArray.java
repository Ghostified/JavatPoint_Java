package JavaPrograms.ArrayPrograms;
/*
 * Java program to find the smalles element in an array 
 */
public class SmallesElementArray {

    public static void main(String[] args) {
        
    int [] arr =  {0,4,56,90,-89,-54};
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr [i] < min) {
            min = arr [i];
        }
      
    }

    System.out.println("The smallest array is " + min);

    }
}
