package Strings.getCharsMethod;
/*
 * if the srcBeginIndex and srcEndIndex are equal, the getChars() method does not copy the content of the array into the car array []
 * 
 */
public class Example3 {

    public static void main(String[] args) {
        String s1 = new String("Welcome to Javatpoint");

        //creating a char array of size 25
        char [] charArray = new char[25];

        //setting start and end indices as the same
        int srcBeginIndex = 11;
        int srcEndIndex = 11;
        int dstBeginIndex = 2;

        try {
            //invoking the getchars() method
            s1.getChars(srcBeginIndex, srcEndIndex, charArray, dstBeginIndex);
            System.out.println(charArray);
        }
        catch (Exception excptn) {
            System.out.println(excptn);
        }
        System.out.println("The getChars() method prints nothing if the srcBeginIndex and the srcEndIndex are equal");
    }
}
