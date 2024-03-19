package InputAndOutput;

//this class obtains input bytes from a file
/*
 * It is used to reading bytes-oriented data from a
 */
import java.io.*;
public class FileInputStreams {
    //creating an object of the DataStreamExample Class
    public static void main(String[] args) {
        DataStreamExample.dataStreamExample();
    }

}
class DataStreamExample {
    static void dataStreamExample () {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            int i = 0;
            while ( (i = fin.read())!= -1){
            System.out.println((char)i);
            }
            fin.close();
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


