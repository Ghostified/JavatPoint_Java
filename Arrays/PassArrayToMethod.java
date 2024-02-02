package Arrays;
/*
 * pass an array to a method in order to re-use the logic to any array
 */
//example
public class PassArrayToMethod {
    //create method that receives array as parameter
    static void min (int arr[]) {
        int min = arr[0];
        for (int i =1 ; i < arr.length;i++)
        if (min > arr[i])
        min = arr[i];
        System.out.println(min);
    }

    public static void main(String[] args) {
        int a [] = {49,68,8,90};
        min(a);

        int b [] = {78,89,90,1010};
        min(b);
    }
}
