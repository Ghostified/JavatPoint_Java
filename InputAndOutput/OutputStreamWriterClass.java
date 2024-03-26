package InputAndOutput;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * OutputStreamClas is used to convert a character stream to a byte stream
 */
public class OutputStreamWriterClass {

    public static void main(String[] args) {
       outputStreamWriterClass(); 
       outputStreamWriterMethods();
    }

    public static void outputStreamWriterClass () {

        try {
            OutputStream osw = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            Writer outputStreamWriter = new OutputStreamWriter(osw);

            outputStreamWriter.write("what");
            outputStreamWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void outputStreamWriterMethods () {
        String filepath = "C:\\Users\\allan.branson\\Downloads\\testout.txt";

        try (OutputStream outputStream = new FileOutputStream(filepath);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream))) {
           
            
        //Creating an outputStream using default character encoding
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        //writing characters to the file using the write () method
        outputStreamWriter.write("Hello , Hogwarts");

        //writing a portion of an array characters using the write (char [] int int method)
        char [] charArray = {'a','b','c','d','e','f'};
        outputStreamWriter.write(charArray, 0,3); //writting only the first three chars

        //wring a single char using write (int) method
        outputStreamWriter.write(' ');

        //writing a portion of the string using the write(String , int , int) method
        String string = "Wingardium Leviosa";
        outputStreamWriter.write(string, 0, 12); //writing only the first 12 characters

        //closing the stream
        outputStreamWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
