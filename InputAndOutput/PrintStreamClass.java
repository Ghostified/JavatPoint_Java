package InputAndOutput;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/*
 * The PrintStream class is used to write data into another stream
 * 
 */
public class PrintStreamClass {

    public static void main(String[] args) {
        printStream();
        
    }

    //Example
    /*
     * printing integer and string values
     */

     public static void printStream() {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");

            PrintStream pout = new PrintStream(fout);
            pout.println(2016);
            pout.println("Welcome to Hogwarts");
            pout.close();
            pout.flush();
            System.out.println("Done");

            FileReader reader = new FileReader("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            BufferedReader bout = new BufferedReader(reader);

            for (int i = 0; i < 3 ; i++) {
                System.out.println(bout.readLine());
            }

            //printing an integer value by formart specifier using the printf method in PrintStream Class
            int a = 19;
            System.out.printf("%d", a);
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}
