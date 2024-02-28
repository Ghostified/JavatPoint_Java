package Arrays;
/*
 * passing an anonymous array so that the array does not have to be dclared
 * when passing to a method
 */
public class PassingAnAnonymousArray {
//creating array that receives array as a method
static void printArray(int arr[] ) {
    for (int i =0; i < arr.length; i++)
    System.out.println(arr[i]);
    }
    static void printChar (char array[]) {
        for (int z =0; z< array.length; z++)
        System.out.println(array[z]);
    }
public static void main(String[] args) {
    printArray(new int[]{50,60,70,89,70});

    printChar(new char[] {'a','b'});
}
}
