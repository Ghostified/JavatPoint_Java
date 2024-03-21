package InputAndOutput;

import java.io.*;

/*
 * Filter iutput stream extends the DtaOutputStream and Buffered Output Stream class 
 * It adds additional functions
 */
public class FilterOutputStreamClass {
    public static void main(String[] args) {
        filterOutputStream();
        filterOutputStreamMethods();
        
    }

    public static void filterOutputStream () {
        try {

            File data = new File("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            
            FileOutputStream file = new FileOutputStream(data);
            FilterOutputStream filter = new FilterOutputStream(file);
            String s = "Welcome to Hogwarts";
            byte b [] = s.getBytes();
            filter.write(b);
            filter.flush();
            filter.close();;
            file.close();
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void filterOutputStreamMethods () {
        try {

            //Create an output stream to to write data to a file 
            FileOutputStream file = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");

            //Creat a filterOutputStream Object with the FileOutputStream as its parameter
            FilterOutputStream object = new FilterOutputStream(file);

            //Write data to the output stream using the FileOutputStream Object
            object.write("Hello world".getBytes());

            //Flush the output stream to ensure all dta is written
            object.flush ();

            //close the stream
            object.close();

            System.out.println("Data written successfully ");

        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
