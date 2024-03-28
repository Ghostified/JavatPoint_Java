package InputAndOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/*
 * The stroing writer class is a character stream that collects output from the string buffer, 
 * which can be used to construct a string
 */
public class StringWriterClass {
    public static void main(String[] args) {
        stringWriter();
        stringWriterExample();
        
    }

    public static void stringWriter () {
        try {

            char [] ary = new char[512];
            StringWriter writer = new StringWriter();
            FileInputStream input = null;
            BufferedReader buffer = null;
            input = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            buffer = new BufferedReader(new InputStreamReader(input,"UTF-8"));
            int x;
            while ((x = buffer.read()) != -1) {
                writer.write(ary,0,x);
            }
            System.out.println(writer.toString());
            writer.close();
            buffer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void stringWriterExample () {
        StringWriter stringWriter = new StringWriter();

        //Write string characters to the stringwriter
        stringWriter.write("Hello, ");
        stringWriter.write("World!");
        stringWriter.append(' ');
        stringWriter.append("Welcome to stringWriter");

        //Get the constructed string
        String result = stringWriter.toString();
        System.out.println("The constructed String : " +result);

        //Close the StringWriter  -> not necessary
        //stringWriter.close();

    }
}
