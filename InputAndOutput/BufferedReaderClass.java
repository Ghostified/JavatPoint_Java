package InputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * The BufferedReader class is used to read the text from a character based input stream 
 * 
 */
public class BufferedReaderClass {

    public static void main(String[] args) {
        //readingText();
        readFromConsole();
        
    }

    //ExampleOne - reading data froma text file 
    public static void readingText () {
        try { 
            FileReader file = new FileReader("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            BufferedReader buffRead = new BufferedReader(file);

            for (int counter = 0;  counter < 2; counter++) {
                System.out.println(buffRead.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Reading data from console by inputstraeam Reader and BufferedReader
    public static void readFromConsole () {
        try {

            InputStreamReader inputReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputReader);
            System.out.println("Enter your House: ");
            String name = bufferedReader.readLine();
            System.out.println("Welcome to : " + name);

        } catch (IOException E) {
            E.printStackTrace();
        }
    }
}
