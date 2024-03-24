package InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * It is an abstract class for writing to character streams 
 */
public class JavaWriteClass {
    public static void main(String[] args) {
        writerExample1();
        
    }

    public static void writerExample1 () {
        try {
            //Create a file writer to write to a file
            Writer w = new FileWriter("Ouput.txt");

            //write characters using various methods
            String content = "Welcome to Hogwarts";
            w.write(content);

            w.write("Hello Hogwarts!\n");

            //flusgh the stream to ensure all the data is written
            w.flush();

            //close stream to release resources 
            w.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
