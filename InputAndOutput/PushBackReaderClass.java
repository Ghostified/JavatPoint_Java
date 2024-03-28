package InputAndOutput;
/*
 * Used to create a character stream reader class that allows pushing back characters into a strean
 * It provides methods to read characters from the stream and manipulate the stream by pushing back characters
 */

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

//import javax.sound.midi.Soundbank;

public class PushBackReaderClass {

    public static void main(String[] args) {
        pushBackReaderClassMethods();
        readerExample();
        
    }

    public static void pushBackReaderClassMethods () {

        String text = " Welcome to Hogwarts";

        try {
            //create a pushback reader with a stringreader as the input source
            PushbackReader pushbackReader = new PushbackReader( new StringReader(text));

            //Read the characters from teh stream
            int character;
            while ((character = pushbackReader.read()) != -1) {

                //if the character is 'o' push it back to the stream
                if ((char) character == 'e') {
                    pushbackReader.unread(character);
                }

                //Read the character again
                character = pushbackReader.read();
                //print the character
                System.out.println((char)character);
            }

            //close the pushBackReader
            pushbackReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  void readerExample () {

        try {
            char [] ary = {'1','-','-','2','-','3','4','-','-','-','5','6'};
            CharArrayReader reader = new    CharArrayReader(ary);
            PushbackReader push = new PushbackReader(reader);
            int i;
            while  ((i =push.read())!= -1){
                if (i == '-') {
                    int j ;
                    if ((j = push.read()) == '-'){
                        System.out.println("#*");
                    }
                    else {
                        push.unread(j); //push back singke character
                        System.out.println((char)i);
                    }
                }
                else {
                    System.out.println((char)i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
