package Arrays;
/*
 * Copying an array using the arrayCopy() method
 */
//example
public class CopyingAnArray {
    public static void main(String[] args) {
        
        //declare source array
        char [] copyFrom = {'a','e','i','o','u'};

        //declare destination
        char[] copyTo = new char[5];

        //copy using the System.arrayCopy() method
        System.arraycopy(copyFrom, 2, copyTo,0, 3);

        //print destination
        System.out.println(String.valueOf(copyTo));
    }
}
