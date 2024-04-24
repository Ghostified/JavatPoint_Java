package JavaPrograms.ArrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindThirdLargestElementInArray {
    public static void main(String[] args) {

        int x [] = {91,34,56,77,88,99};
        example1();
        System.out.println(sortArray(x, 6));
        
    }

    public static void example1 () {
        int a [] = {1,2,3,4,5,6};
        int b [] = {99,45,66,77,34,34,22};
        System.out.println();

        int temp;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j< a.length; j++ ) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i =0; i < a.length; i++) {
            if (a[i] == a[2])
            break;
        }
        System.out.println(a[2]);
    }

     //find third largest number using sort method in Arrays class
     public static int sortArray(int[] b, int total) {
        Arrays.sort(b);
        return b[total -3];
    }

}


