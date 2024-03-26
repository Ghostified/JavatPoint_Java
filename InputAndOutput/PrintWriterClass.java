package InputAndOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * PrintWriter Class is an extension of the writer class
 * it is used to print formartted representation of objects to the the text-output stream
 */
public class PrintWriterClass {

    public static void main(String[] args) {
        printWriter1();
        
    }

    //example of writing the data on a console and in a text file using the PrintWriter class methods
    public static void printWriter1 () {
        try {

            //Data to write to the console using PrintWriter
            PrintWriter writer = new PrintWriter(System.out);
            writer.write("Welcome to Hogwarts");
            writer.flush();
            writer.close();

            //Data to write in a file using a PrintWriter
            PrintWriter writer1 = null;
            writer1 = new PrintWriter(new File("C:\\Users\\allan.branson\\Downloads\\testout.txt"));
            writer1.write ("Dear Mr Potter, you are a wizard");
            writer1.flush();
            writer1.close();

            FileReader fr = new FileReader("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            BufferedReader bf = new BufferedReader(fr);
            for (int counter = 0; counter < 3; counter++) {
                System.out.println(bf.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
