package InputAndOutput;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/*
 * PipedWriter class is used to write java pipe as a stream of characters
 * PipedWriter is connected to a pipereader and used by diffrent threads
 */
public class PipedWriterClass {

    public static void main(String[] args) {
         pipedWriter();
         pipedWriterMethods();
    }

    public static void pipedWriter () {
        try {

            final PipedReader read = new PipedReader();
            final PipedWriter write = new PipedWriter (read);

            Thread readerThread = new Thread(new Runnable() {
                public void run () {
                    try {
                        int data = read.read();
                        while (data != -1) {
                            System.out.print((char)data);
                            data = read.read();
                        }
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }
            });

            Thread wriThread = new Thread( new Runnable() {
                public void run () {
                    try {
                        write.write("I love Magic \n".toCharArray());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            readerThread.start();
            wriThread.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void pipedWriterMethods () {
       //PipedWriter is used to write data into a pipe which is unidirectional between two threads
       /*
        * Used when one thread is one thread nneeds to pass data to another thread in inter thread communication
        //Data written to a pipewriter can be read from the pipe reader and not vice versa
        //commonly used when where one thread  (producer) writes data to the pipe and another thread(consumer) reads data from it
        //Before using a pipeWriter , it needs to be connected to a pipe reader using the connection method
        */

        //example
        //craete  a PipeWriter and PipeReader
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();

        try {
            //Connect the PipedWriter to the PipedReader
            pipedWriter.connect(pipedReader);

        } catch (IOException e) {
            e.printStackTrace();
        }


        //Create and start a thread
        Thread writerThread= new Thread( () -> {
            try {
                //write data to the PipedWriter
                pipedWriter.write("Hello PipedWriter!".toCharArray());
                pipedWriter.flush();
                pipedWriter.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        writerThread.start();

        //create and start a reader Thread
        Thread readerThread = new Thread(() -> {
            try {
                //Read data from the PipedReader
                int character ;
                while ((character = pipedReader.read()) != -1){
                    System.out.println((char)character);
                }
                pipedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        readerThread.start();

        
    }
}
