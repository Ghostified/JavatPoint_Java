package InputAndOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
 * Bye Array Input Stream Class is used to read byte array as input stream 
 */
public class ByteArrayInputStreamClass {
    public static void main(String[] args) {
        byteArrayInputStream();
        example2();
        
    }
    public static void byteArrayInputStream () {
        try {

            //Create a byte array
            byte [] byteArray = "Hello, Gringotts ".getBytes();

            //create a ByteArrayInputStream using the new byte array
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

            //read and print each byte from the byteArrayInputStream
            int byteread ;
            while ((byteread = byteArrayInputStream.read()) != -1) {
                System.out.println((char)byteread);
            }

            System.out.println();// prints new line

            //Reset the byteArrayInputStream
            byteArrayInputStream.reset();

            //Read data int  a new byte array
            byte [] buffer = new byte[5];
            int bytesRead = byteArrayInputStream.read(buffer, 0, buffer.length);

            //print the the bytes read into the buffer as a string
            System.out.println(new String(buffer, 0, bytesRead));

            //Print the remaining bytes that can be read from the input stream
            System.out.println(byteArrayInputStream.available());

            //Skip the x bytes of input from the input stream 
            long bytesSkipped = byteArrayInputStream.skip(5);
            System.out.println("skipped " + bytesSkipped + " bytes.");
            int remainingBytes;
            while ((remainingBytes = byteArrayInputStream.read()) != -1) {
                System.out.println((char) remainingBytes);
            }
            System.out.println(byteArrayInputStream.skip(5));
            

            //close the BytesArrayInputStream
            byteArrayInputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example2 () {
        try {
            byte [] buf = { 23, 24, 25, 26, 27};

            //create  the new byte array Input Stream 
            ByteArrayInputStream input = new ByteArrayInputStream(buf);
            int k = 0;
            while ((k = input.read()) != -1){
                //convertion of a byte into acharacter
                char ch = (char) k ;//casting
                System.out.println("ASCII value of character is " + k + " ; special character is: " + ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

