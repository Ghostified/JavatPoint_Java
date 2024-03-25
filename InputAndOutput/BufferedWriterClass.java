package InputAndOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/*
 * The BufferedWriter  Class is useed to provide bufferig to writer classes 
 */
public class BufferedWriterClass {

    public static void main(String[] args) {
        bufferedWriterExample();
    }

    public static void  bufferedWriterExample () {
        try {
            FileWriter write = new FileWriter("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            BufferedWriter buffer = new BufferedWriter(write);
            buffer.write("Welcome to Ravenclaw");
            buffer.close();
            System.out.println("Success");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
