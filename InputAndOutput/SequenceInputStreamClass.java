package InputAndOutput;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

/*
 * The sequence input stream class is used to read data from multiple streams
 */
public class SequenceInputStreamClass {
 public static void main(String[] args) throws Exception {
    Example1.inputStreamExample();
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
 