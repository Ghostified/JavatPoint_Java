package InputAndOutput;

import java.io.PipedReader;
import java.io.PipedWriter;

/*
 * PipedWriter class is used to write java pipe as a stream of characters
 * PipedWriter is connected to a pipereader and used by diffrent threads
 */
public class PipedWriterClass {

    public static void main(String[] args) {
         pipedWriter();
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
}
