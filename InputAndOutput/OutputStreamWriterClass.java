package InputAndOutput;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * OutputStreamClas is used to convert a character stream to a byte stream
 */
public class OutputStreamWriterClass {

    public static void main(String[] args) {
       outputStreamWriterClass(); 
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
}
