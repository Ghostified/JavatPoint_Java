package InputAndOutput;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File descriptor acts as an the the underlying machine-specific structure representing an open file, an open socket or another source or sink of bytes
 * 
 */
public class FileDescriptorClass {
    public static void main (String [] Args) {
        fileDescriptor();
        example();

    }

    public static void fileDescriptor () {
        FileDescriptor fd = null;
        byte [] b = {48, 49, 50,51,52,53,54,55,56,57,58,59,60};
        try {
            FileOutputStream fos = new FileOutputStream("Record.txt");
            FileInputStream fis = new FileInputStream("Record.txt");
            fd  = fos.getFD();
            fos.write(b);
            fos.flush();
            fd.sync(); //confie=rms data written to the disk
            int value = 0;
            //for every available bytes
            while ((value = fis.read()) != -1){
                char c = (char) value;
                System.out.print(c);
            }
            System.out.println("\nSync() successfully executed!!");

        } catch (IOException e) {
            e.printStackTrace();;
        }
    }

    //Example that createa a FileDescriptor object with starndard output .out
    //Then a FileOutputStream using the FileDescriptor to write data to it
    //Effectively writing to the starndard Ouput stream

    public static void example () {
        try {
            FileDescriptor fd = new FileDescriptor();

            //writing  to starndard output using the the file descrptor
            FileOutputStream fos = new FileOutputStream(fd);
            fos.write ("Hello, FileDescriptor " .getBytes());
            fos.close();

        } catch (IOException e) {
            e.getMessage();
        }
    }

}
