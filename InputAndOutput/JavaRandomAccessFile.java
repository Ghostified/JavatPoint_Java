package InputAndOutput;

import java.io.IOException;
import java.io.RandomAccessFile;

import javax.sound.midi.Soundbank;

/*
 * Class is used to read and write in random access file
 */
public class JavaRandomAccessFile {
    public static void main(String[] args) {
        RandomAccessFileExample obj = new RandomAccessFileExample();
        obj.randomAccessFileExample();
        
    }

}
class RandomAccessFileExample {

    public static void randomAccessFileExample() {
        final String FILEPATH = "C:\\Users\\allan.branson\\Downloads\\testout.txt";
    
        try {
            System.out.println(new String (readFromFile(FILEPATH ,0,18)));
            writeToFile (FILEPATH , "I love Hogwarts", 31);  
        } catch (IOException e ) { 
            e.getMessage();
        }
    }
 
        private static byte [] readFromFile (String filePath , int position , int size)
        throws IOException {
         RandomAccessFile file = new RandomAccessFile( filePath, "r");
         file.seek(position);
         byte [] bytes = new byte[size];
         file.read(bytes);
         file.close();
         return bytes;
 
        }
 
        private static void writeToFile (String filePath, String data, int position) 
        throws IOException {
         RandomAccessFile file = new RandomAccessFile(filePath, "rw");
         file.seek(position);
         file.write(data.getBytes());
         file.close();
        }
    
    }

