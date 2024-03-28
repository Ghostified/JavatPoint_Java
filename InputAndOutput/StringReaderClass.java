package InputAndOutput;

import java.io.IOException;
import java.io.StringReader;

/*
 * Java StringReader is a character stream with string as its source 
 * It takes an input string and changes it into a character sytring
 */
public class StringReaderClass {

    public static void main(String[] args) {
        stringReader();
        stringReaderMethods();
        
    }
    public static void stringReader (){
        
        try {
            String str = "Welcome to Hogwarts School of Magic";
            StringReader reader = new StringReader(str);
            int k = 0 ;
            while ((k = reader.read()) != -1) {
                System.out.println((char)k);
            }
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void stringReaderMethods () {

        String inputString = "School of Magic";

        try (StringReader stringReader = new StringReader(inputString)){
            //Read a single character
            int character = stringReader.read();
            System.out.println("Read a single character: " + character);


            //Read characters into an array
            char [] buffer = new char[5];
            int bytesRead = stringReader.read(buffer, 0, buffer.length);
            System.out.println("Read charcters into an array");
            for (int i = 0; i < bytesRead; i++) {
                System.out.println(buffer[i]);
            }

            System.out.println();

            //Check if the stream is ready
            System.out.println("Stream Ready: " + stringReader.ready());

            //Mark the current posistion
            stringReader.mark(5);

            //skip characters 
            long skipped = stringReader.skip(7);
            System.out.println("Skipped characters: " + skipped);

            //reset the stream to the marked position
            stringReader.reset();

            //Read characters until the end of the string
            StringBuilder stringBuilder = new StringBuilder();
            int nextChar;
            while ((nextChar= stringReader.read()) != -1) {
                stringBuilder.append((char)nextChar);
            }
            System.out.println("Read characters untill the end of the string: " + stringBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
