package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 * The sequence input stream class is used to read data from multiple streams
 */
public class SequenceInputStreamClass {
 public static void main(String[] args) throws Exception {
    Example1.inputStreamExample();

    ReadingTwofiles.concurrentReadAndWrite();

    Example3.sequenceInput();
 }
}
 class Example1 {
    static void inputStreamExample () throws Exception{
        FileInputStream input1 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
        FileInputStream input2 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
        SequenceInputStream sis = new SequenceInputStream(input1,input2);

        int j ;
        while ((j = sis.read())!= -1) {
            System.out.println((char)j);
        }
        sis.close();
        input1.close();
        input2.close();
    }
 }

 //Example that reads the data fromn two files and writes in another file 
 class ReadingTwofiles {
    static void concurrentReadAndWrite () throws Exception {
        FileInputStream file1 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
        FileInputStream file2 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout2.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testinput.txt");

        SequenceInputStream sis = new SequenceInputStream( file1,file2);

        int i ;
        while ((i = sis.read())!= -1) {
            fout.write(i);
        }
        sis.close();
        fout.close();
        file1.close();
        file2.close();
        System.out.println("Success");
    }
 }

 class Example3 {
    static void sequenceInput () {
        try {
            //Creating two input streams
            FileInputStream fis = new FileInputStream ("C:\\Users\\allan.branson\\Downloads\\testinput.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");

            //creating a sequenceInputStream by combining the two input stream
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);

            //Reading the data from the Sequence input stream
            int data ;
            while ((data = sis.read()) != -1) {
                System.out.println((char)data); //Print characters from the the stream
            }

          //  closing the sequenceInput();
          sis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
 }