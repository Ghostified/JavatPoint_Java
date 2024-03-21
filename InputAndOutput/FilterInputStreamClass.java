package InputAndOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/*
 * The FilterInputStream class extends the InputStream Class used for reading data from a file
 */
public class FilterInputStreamClass {
    public static void main(String[] args) {
        long start = System.nanoTime();
        filterInputExample();
        example2();
        long duration = (System.nanoTime() - start)/1000000;
        System.out.println(duration + " milliseconds");
    }

    public static void filterInputExample () {
        try {

            File data = new File ("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            FileInputStream file = new FileInputStream(data);
            FilterInputStream filter = new BufferedInputStream(file);

            int k = 0;
            while ((k = filter.read()) != -1) {
                System.out.println((char)k);
            }

            file.close();
            filter.close();

        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public static void example2 () {
        try {

            //create an input stream to read data from a file
            FileInputStream data = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");

            //create a FilterInputStream object with FileInputStream as its parameter
            FilterInputStream filter = new BufferedInputStream(data);

            //Read data from the stream 
            int mydata = 0;
            while ((mydata = filter.read()) != -1) {
                System.out.println((char)mydata);
            }

            //close the input stream 
            data.close();

        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
