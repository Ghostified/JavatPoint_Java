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
            Writer w = new FileWriter("Ouput.txt");
            String content = "Welcome to Hogwarts";
            w.write(content);
            w.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
