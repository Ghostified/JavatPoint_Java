package InputAndOutput;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.sound.midi.Soundbank;

/*
 * This class can be used to writecommon data to multiple files ,i.e one to many
 */
public class CharArrayWriterClass {

    public static void main(String[] args) {
        charWriter();
        charArrayWriterMethods();
        
    }
    public static void charWriter () {
        try {
            CharArrayWriter output = new CharArrayWriter();
            output.write("This is hogwarts, school of magic");
            FileWriter f1 = new FileWriter("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            FileWriter f2 = new FileWriter("C:\\Users\\allan.branson\\Downloads\\test.txt");
            FileWriter f3 = new FileWriter("C:\\Users\\allan.branson\\Downloads\\TestOut2.txt");
            FileWriter f4 = new FileWriter("C:\\Users\\allan.branson\\Downloads\\TestInput.txt");

            output.writeTo(f1);
            output.writeTo(f2);
            output.writeTo(f3);
            output.writeTo(f4);

            f1.close();
            f2.close();
            f3.close();
            f4.close();

            FileReader file = new FileReader("C:\\Users\\allan.branson\\Downloads\\TestOut2.txt");
            BufferedReader object = new BufferedReader(file);


            for (int counter = 0; counter < 3; counter++) {
                System.out.println(object.readLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void charArrayWriterMethods () {
        try {

            //Create a charArraywriter object
            CharArrayWriter writer = new CharArrayWriter();

            //write characters to the buffer 
            writer.write('H');
            writer.write("ello", 0, 3);

            //get the size of the buffer 
            int size = writer.size ();
            System.out.println("Size of the Buffer: " +size);

            //Convert the buffer to a char array and string
            char [] charArray = writer.toCharArray();
            String str = writer.toString();

            System.out.println("Content as a char array:" + new String(charArray));
            System.out.println("Content as string: " + str);

            //write the content to another writer
            Writer out = new java.io.FileWriter("C:\\Users\\allan.branson\\Downloads\\TestOut2.txt");
            writer.writeTo(out);
            out.close();

            //reset the buffer 
            writer.reset();

            //flush and close the writer
            writer.flush();
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
