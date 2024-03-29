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

        RandomAccessFileExample2.randomAccessFileExample2();
        
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
 class RandomAccessFileExample2 {
    public static void randomAccessFileExample2 () {

        //RandomAccessFileExample2 Instance  = new RandomAccessFileExample2();

        try {
            //create a RandomAccessFile in read-write mode
            RandomAccessFile file = new RandomAccessFile("Example.txt", "rw");


            //Write data to the file
            file.writeUTF("Hogwarts christmas pudding");
            
            //set pointer to the beginning of the file
            file.seek(0);

            //Read data from the file
            String data = file.readUTF();
            System.out.println("Data from the file : "+ data);

            //close the file
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 }
