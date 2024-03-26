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
        printStreamMethods();gi
        
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

     public static void printStreamMethods () {
        //create a printstream object for system.out
        PrintStream ps = new PrintStream(System.out);

        //Print diffrent data types 
        ps.printf("Hello") ;  //string
        ps.print (124); //int
        ps.println();//new line

        //println methods 
        ps.println(true); //boolean
        ps.println('C'); //char
        ps.println (new char [] {'a','b','c','d'}); //char array
        ps.println(456);
        ps.println (785L) ; //long
        ps.println (3.14f); 
        ps.println(new Object());

        //printf method
        ps.printf("The value of %s is %.2f%n", "PI", Math.PI); //Formartted string

        //close the PrintStream
        ps.close();
     }
}
