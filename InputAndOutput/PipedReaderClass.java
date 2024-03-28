package InputAndOutput;
/*
 * The  PipedReader is used to read the contents of a pipe as a stream of characters 
 * The PipedReader must be connected to the same PipedWriter and are used by diffrent threads
 * Pipe communication - facilates communication between threads
 * Unidirectional - Data written in a PipeWriter can be read from the connected PipeReader and the reverse in not true
 * Used where one thread (producer) writes data to the pipe and another thread (consumer) reads data from the pipe
 * the connect () method is used to connect the PipedReader to the PipedWriter before use
 */

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReaderClass {

    public static void main(String[] args) {
        pipedReaderMethods();
        
    }

   public static void pipedReaderMethods () {
     //Create a PipedWriter and a PipedReader
     PipedReader pipedReader = new PipedReader();
     PipedWriter pipedWriter = new PipedWriter();
 
     try {
         //connect the PipedReader to the PipedWriter
         pipedReader.connect(pipedWriter);
 
     } catch (IOException e) {
         e.printStackTrace();
     }

     //create and start a writer thread
     Thread writerThread = new Thread ( () ->  {
        try {
            //write data to the pipedWriter
            pipedWriter.write("Hello World".toCharArray());
            pipedWriter.flush();
            pipedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
     });
     writerThread.start();


     //create and start a reader Thread 
     Thread readerThread = new Thread(() -> {
        try {
            //read data from the PipedReader
            int character;
            while ((character = pipedReader.read() ) != -1) {
                System.out.println((char) character);
            }
            pipedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     });
     readerThread.start();
   }
}
