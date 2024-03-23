package InputAndOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/*
 * DataInputStreamClass  allows an application to read primitive data types
 */
public class DataInputStreamClass {
 public static void main(String[] args) {
    dataInputStreamMethods();
    example2();
    
 }

 public static void dataInputStreamMethods () {
    try {
        FileInputStream fis = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");

        DataInputStream dis = new DataInputStream(fis);
        
        //Read data using various methods of Data Input Stream
        String stringValue = dis.readUTF();
        byte readByte = dis.readByte();
        short shortValue = dis.readShort();
         int intValue = dis.readInt();
         long longValue = dis.readLong();
        char character = dis.readChar();
        float floatValue = dis.readFloat();
        double doubles = dis.readDouble();

        //print the read data
        System.out.println("Byte value: " + readByte);
        System.out.println("Short value : " + shortValue);
        System.out.println("int value : " + intValue);
        System.out.println("Long Value: " +longValue);
        System.out.println("Character Value " + character);
        System.out.println("Float Vlaue:  " + floatValue);
        System.out.println("Double Value: " + doubles);
        System.out.println("String value " + stringValue.trim());
        System.out.println("UTF -8 string: " + stringValue);

        //Close DataInputStream
        dis.close();

    } catch (IOException   e) {
        e.printStackTrace();
    }
 }

 public static void example2 () {
    try {
        InputStream input = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt"); 

        DataInputStream instance = new DataInputStream(input);
        int count = input.available();
        byte [] arr =new byte[count];
        instance.read(arr);

        for (byte bt : arr){
            char k = (char) bt;
            System.out.println(k + " ");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
 }
}
