package InputAndOutput;
/*
 * The DeflatorOutputStream and InflatorInputStream classes provide mechanisms to Compress and Decompress Files
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;

public class DeflatorAndInflator {

    public static void main(String[] args) {
        compressFile();

    }

    // Example We read data from a file and compress it to another file using
    // DeflatorOutputStream
    static void compressFile() {
        try {
            FileInputStream fin = new FileInputStream("Example.txt");
            FileOutputStream fout = new FileOutputStream("Output.txt");
            DeflaterOutputStream dout = new DeflaterOutputStream(fout);

            int i;
            while ((i = fin.read()) != -1) {
                dout.write((byte) i);
                dout.flush();
            }

            fin.close();
            dout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The rest of the code");
    }

}
