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
}
