package Strings.getByteMethod;
import java.io.*;
/*
 * Encoding a string into a diffrent charset
 * JVM by default encodes to UTF-8 with the getBytes() method
 */
public class Example3 {

    //main method
    public static void main(String[] args) {
        
        //input string
        String s1 = "Welcome to Hogwarts";
        System.out.println("The input string is: ");
        System.out.println(s1 + "\n");

        //Inside the try block encoding is
        //Being done using diffrent charsets 
        try 
        {
            //16 - bit UCS Transformation formart
            byte [] byteObject = s1.getBytes("UTF-16");
            System.out.println("After converted into UTF-16 the string is: ");

            for (int j =0; j < byteObject.length; j++)
            {
                System.out.print(byteObject[j] + " ");
            }

            System.out.println("\n");

            //ISO Latin Alphabet
            byte [] byteObject2 = s1.getBytes("ISO-8859-1");
            System.out.println("After converted into ISO-8859-1 the String is : ");

            for (int j = 0; j < byteObject2.length; j++) {
                System.out.print(byteObject2[j] + " ");
            }

            System.out.println("\n");

            //little Endian byte order , 16 - bit UCS transformation formart
            byte [] byteObject3 = s1.getBytes("UTF-16LE");
            System.out.println("After converted into UTF-16LE the String is: ");

            for (int j = 0; j < byteObject3.length; j++) {
                System.out.print(byteObject3[j] + " ");
            }
        }
        catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported charset set " + e.getMessage());
        }
        

    }
}
