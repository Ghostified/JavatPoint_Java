package InputAndOutput;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;

/*
 * A class used to read input of character streams
 */
public class JavaReader {

    public static void main(String[] args) {
        readerExample1();

        //calling the method javaReaderrExample2
        javaReaderExample2();
        
    }

    public static void readerExample1 () {
        try {

            //Create a file reader object 
            Reader reader = new FileReader("C:\\Users\\allan.branson\\Downloads\\testout.txt");
           
            int data = reader.read();

            //check if file character stream is not empty
            while (data !=  -1 ) {
                System.out.println((char) data);
                data = reader.read();
            }
            //close reader to release resources
            reader.close();

            System.out.println("done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void javaReaderExample2 () {

            String text = "Welcome to Griffindor";

            //Using a string reader to create a Reader 
            try (Reader reader = new StringReader(text)) {
                //reading dingle characters 
                int singleChar ;
                while ((singleChar = reader.read()) != -1) {
                    System.out.println((char) singleChar);
                }
                System.out.println();
                
                //resetting the stream
                reader.reset();

                //Reading characters into an array 
                char [] charArray = new char[5];
                int charRead = reader.read(charArray);
                System.out.println("Chars read into the array: " + new String(charArray, 0, charRead));

                //Reading characters into a portion of an array
                char [] partialArry = new char[10];
                int partialCharRead = reader.read(partialArry, 2, 6);
                System.out.println("Chars read into a partial array: " + new String(partialArry , 2, partialCharRead));

                //skipping characters 
                long skippedChars = reader.skip(2);
                System.out.println("Skipped characters: " + skippedChars);

                //Marking the current posistion
                reader.mark(5);
                reader.skip(3);

                //reading characters into a char buffer
                CharBuffer charBuffer = CharBuffer.allocate(5);
                reader.read(charBuffer);
                charBuffer.flip();
                System.out.println("Chars read into the charBuffer: " +charBuffer.toString());

                //checking if the stream is ready to be read
                System.out.println("is ready? " + reader.ready());

            }catch (IOException e) {
                System.err.println("Error reading from stream " + e.getMessage());
        } 
    }
}
