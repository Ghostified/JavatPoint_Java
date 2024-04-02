package InputAndOutput;
/*
 * The DeflatorOutputStream and InflatorInputStream classes provide mechanisms to Compress and Decompress Files
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class DeflatorAndInflator {

    public static void main(String[] args) {
        compressFile();
       decompressFile();

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

    //InflatorInputStream
    //The InflatorInputStream Class is used to decompress the file in deflate Compress formart
    //Example of decompressing a file

    static void decompressFile () {
        try {

            FileInputStream fin = new FileInputStream("Output.txt");
            InflaterInputStream inflator = new InflaterInputStream(fin);
            FileOutputStream fout = new FileOutputStream("jpt.txt");

            int i ;
            while ((i=fin.read()) != -1) {
                fout.write((byte)i);
                fout.flush();
            }

            fin.close();
            fout.close();


        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }

}
