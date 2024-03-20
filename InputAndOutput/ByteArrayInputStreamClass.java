package InputAndOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
 * Bye Array Input Stream Class is used to read byte array as input stream 
 */
public class ByteArrayInputStreamClass {
    public static void main(String[] args) {
        byteArrayInputStream();
        
    }
    public static void byteArrayInputStream () {
        try {

            //Create a byte array
            byte [] byteArray = "Hello, Griggotts ".getBytes();

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

            //close the BytesArrayInputStream
            byteArrayInputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

