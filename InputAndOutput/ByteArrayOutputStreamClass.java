package InputAndOutput;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

//The ByteArrayOutputStream is used to write common data into multiple files 
public class ByteArrayOutputStreamClass {

    public static void main(String[] args) throws Exception {

        FileOutputStream fout1 = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
        FileOutputStream fout2 = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout2.txt");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();
        System.out.println("Success");
        Example2();
          
    }
    
    public static void Example2 (){
        try {

            //Create a new ByteArrayOutputStream
            ByteArrayOutputStream byteArrayobject = new ByteArrayOutputStream();

            //Write data to the ByteArrayOutputStream
            byteArrayobject.write("Hello Hogwarts".getBytes());

            //Convert the data to a byte array
            byte [] array1 = byteArrayobject.toByteArray();

            //display the size of the byte array
            System.out.println("The size of the byte array is " + byteArrayobject.size());

            //dispaly the contents of the byte array to string
            System.out.println("The content of the byte array " + byteArrayobject.toString());
            System.out.println("Content of byte array: " + new String(array1));

            //reset the ByteArrayOutputStream
            byteArrayobject.reset();

            //Write more datato the ByteArrayOutputStream 
            byteArrayobject.write("This is a test".getBytes());

            //write the content of the ByteArrayOutputStream to a file
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\test.txt");
            byteArrayobject.writeTo(fileOutputStream);

            //Close the streams
            byteArrayobject.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
 