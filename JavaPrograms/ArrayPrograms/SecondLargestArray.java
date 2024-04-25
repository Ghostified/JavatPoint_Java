package JavaPrograms.ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ControlStatements.BreakStatement.Break;

public class SecondLargestArray {

    public static void main(String[] args) {
        int  [] x = {1,2,3,4,5,6};
        //Integer [] y = {89,77,90,66,55};
        // example1();
         //System.out.println("Second largest: " + example3(x, 5));
        // System.out.println("Second largest: " + example5(y, 6));
        
         System.out.println(example6(x));
    }

    public static void example1 () {

        int [] arr = {34,44,66,87,22,56,89,70};
        //int temp; 

        System.out.println("Elements of the original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int temp; 

        for (int i = 0; i < arr.length; i++ ) {
            for (int j =0; j < i+ 1; j++) {
                if (arr[i] > arr [j] ) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr [j] = temp;
        

                }
            }
        }


        System.out.println();
        System.out.println("Second largest element: ");
        for (int i = 0; i <  arr.length; i ++) {
            if (arr[i] == arr[1])
            break;
            
        }
        System.out.println(arr[1]);
    }
    //Using Arays.Sort () method

    public static int example3(int [] a , int total){
        Arrays.sort(a);
        return a[total - 2];

    }
//using collections
    public static  int example5(Integer [] a, int total ){

        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);

        int element = list.get(total - 2);
        return element;
    }

    static int []   example6 (int [] a ) {
        int temp;
        for (int i =0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if ( a[j] < a[j + 1]) {
    
                     temp = a[j];
                     a[i] = a[j + 1];
                     a[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted Array: ");
    for (int x = 0; x < a.length; x++){
        System.out.print(a[x] + " ");
    }
        
        return  a;
    }
 }
