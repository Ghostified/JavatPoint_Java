package InputAndOutput;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * This class can be used to writecommon data to multiple files ,i.e one to many
 */
public class CharArrayWriterClass {

    public static void main(String[] args) {
        charWriter();
        
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

            FileReader file = new FileReader("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            BufferedReader object = new BufferedReader(file);


            for (int counter = 0; counter < 3; counter++) {
                System.out.println(object.readLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
