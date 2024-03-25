package InputAndOutput;

import java.io.CharArrayReader;
import java.io.IOException;

/*
 * The char Array class is used to read charactyer array as a reader (Stream)
 */
public class CharArrayReaderClass {
    public static void main(String[] args) {
        charArrayReader();
        charArrayReader2();
    }
    public static void charArrayReader () {
        try {
        char [] array = {'a','b','c','d','e'};
        CharArrayReader reader = new CharArrayReader(array);
        int k = 0;
        //Read end of the file
        while ((k = reader.read()) != -1){
            char ch = (char) k;
            System.out.println(ch + ":");
            System.out.println(k);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

}
 public static void charArrayReader2 () {
     char [] charArray = {'H','E','L','L','O'};

     try (CharArrayReader reader = new CharArrayReader(charArray)) {
        int character;
        while ((character = reader.read()) != -1) {
            System.out.println((char) character);
        }
     } catch (IOException e) {
        e.printStackTrace();
     }
  }
}
