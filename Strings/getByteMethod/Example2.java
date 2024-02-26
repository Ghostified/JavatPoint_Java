package Strings.getByteMethod;
/*
 * Using the getBytes method, a string can be encoded and passed again into the string constructor to get the string
 */
public class Example2 {

    public static void main (String[]Args) {

        //Creating a string
        String s1 = "Harry Potter";

        //Encoding the string into bytes 
        byte[] object =  s1.getBytes();
        
        //looping through the string array
        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }

        //paaing the string to a constructor to get the string
        String s2 = new String(object);
        System.out.println(s2);

    }

}
