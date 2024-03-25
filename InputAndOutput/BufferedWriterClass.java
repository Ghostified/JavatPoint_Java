package InputAndOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * The BufferedWriter  Class is useed to provide bufferig to writer classes 
 */
public class BufferedWriterClass {

    public static void main(String[] args) {
        //bufferedWriterExample();
        bufferedWriterExample2();
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
    public static void bufferedWriterExample2 () {
        try {
            FileWriter filewrite = new FileWriter("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            BufferedWriter bufferedWriter  = new BufferedWriter(filewrite);

            //writing data to the buffered writer
            bufferedWriter.write ("Hello, this is Slytherin");
            bufferedWriter.newLine();  //adding a new line
            bufferedWriter.write("Thiis is the common room"); 

            //flushing and closing the bufferedWriter
            bufferedWriter.flush();
            bufferedWriter.close ();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Done");

        try {
            //creating a file and read from local repo
            FileReader file = new FileReader ("C:\\Users\\allan.branson\\Downloads\\testout.txt");

            //Reading content from the file
            BufferedReader fileInput = new BufferedReader(file);

            //printing the first three lines of the file
            for (int counter = 0; counter < 3; counter++) {
                System.out.println(fileInput.readLine());
            }

            fileInput.close();
            file.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
