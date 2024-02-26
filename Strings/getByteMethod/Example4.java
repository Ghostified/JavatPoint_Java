package Strings.getByteMethod;
/*
 * Example where the getBytes() method throws an exception for UnsupportedEncodingException
 */
public class Example4 {

    public static void main (String [] Args) {

        //input string
        String s1 = "Harry Potter";
        System.out.println("The input string is: ");
        System.out.println(s1 + "\n");

        //encoding to UTF17
        byte [] byteObject = s1.getBytes("UTF-17");
        System.out.println("After converting to UTF-17 formart: ");

        for (int i = 0; i < byteObject.length; i++) {
            System.out.print(byteObject[i]);
        }
    }

}
