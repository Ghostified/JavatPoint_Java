package InputAndOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * The input stream reader class is used for reading bytes and decodes the into charas in a specified charset
 */
public class InputStreamReaderClass {
    public static void main(String[] args) {
        Example20();
        InputStreamReaderMethods();
        
    }

    public static void Example20 () {
        try (InputStream stream = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt")) {

            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.println((char)data);
                data = reader.read();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * Creating ana InputStreamReader with diffrent constructors
     * Reading files with the read() method
     * Check i the stream is ready to be read using the ready () method
     * closing the stream with the close () method
     */

     public static void InputStreamReaderMethods () {
        String filepath = "C:\\Users\\allan.branson\\Downloads\\testout.txt";

        try (InputStream inputStream = new FileInputStream(filepath)){

            //Creating an INputStreamReader  using the default constructor encoding
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            //Reading characters from the file with the read () method
            int charCode ;
            while ((charCode = inputStreamReader.read()) != -1) {

                //convert the character code to char and print
                char character = (char) charCode;
                System.out.println(character);
            }

            //closing the stream
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}
