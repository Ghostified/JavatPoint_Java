package InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter Class is used to write character oriented data to a file
 * Unlike a FileOutputStream , strings do not get converted in byte arrays 
 * 
 */
public class FileWriterClass {

    public static void main(String[] args) {

        fileWriter();
        fileWriterMethod();
        
    }

    public static void fileWriter () {
        try {

            FileWriter fw = new FileWriter("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            fw.write("Hogwarts is fun");
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success");
    }

    public static void fileWriterMethod () {
        String filename = "Example.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            //writing a string to a file
             String text = "The diary of Tom Riddle ";

             writer.write(text);
             writer.write("\n");

             //writing a single character to the file;
             char ch = 'A';
             writer.write(ch);
             writer.write("\n");

             //Writing a char array to the file
             char [] charArray = {'A', 'B', 'C'};
             writer.write(charArray);
             writer.write("\n");

             System.out.println("Data has been written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
