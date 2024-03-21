package InputAndOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Allows the an application to write primitive data types to the output strem class in a machine indpendent way
 */

public class DataOutputStreamClass {
 
    public static void main (String [] Args) {
        DataOutputStreamClassMethods();

    }

    public static void DataOutputStreamClassMethods () {
        try {

            //Create a FileOutputStream to write data in the specified file
            FileOutputStream fos = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");

            //Craete a data output stream instance dos and pass the 
            // fileOutputStream Instance (fos) to its constructor, 
            // to write primitive data in the FileOutputStream
            DataOutputStream dos = new DataOutputStream(fos);

            // Writing primitive data types to the outputstream
            dos.writeInt(35); //WriteInt
            dos.writeChar('a'); //write char
            dos.writeByte(34); //write byte
            dos.writeDouble(3.14); //write double
            dos.writeBoolean(false); //write bool
            dos.writeUTF("Hello Hogwarts"); //write  a UF=TF encoded string
            

            dos.flush();
            System.out.println("Data has been written to the file");
            dos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
