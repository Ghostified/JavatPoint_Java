package InputAndOutput;
/*
 * The PipedInputyAndOutputStreams can be used to write data simultaneously
 * Both Streams are connected with Each other with the connect() method
 */

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//Example of PipedInputStream and PipedOutputStream  using Threads

public class PipedInputAndOutputStreams {

    public static void main(String[] args) {
        pipedWriter();
        
    }

    /*
     * Two Threads are created t1 & t2
     * T1 writes data using the PipedOutputStream object 
     * t2 reads the data from the pipe using the PipedInputStream
     * Boyth the piped stream object are connected with each other
     */

     static void pipedWriter () {
        try {
            final PipedOutputStream pout = new PipedOutputStream();
            final PipedInputStream pin = new PipedInputStream();

            //connecting the streams
            pout.connect(pin);

            //Creating thread T1 that writes the data
            Thread t1 = new Thread() {
                public void run() {
                    for (int i = 65; i<=90 ; i++){
                        try {
                            pout.write(i);
                            Thread.sleep(1000);
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            //creating a second thread t2 which reads the data
            Thread t2 = new Thread(){
                public void run(){
                    try {
                        for(int i = 65; i <= 90; i++) 
                        System.out.println(pin.read());
                    }catch (Exception e) {}
                }
            };

            t1.start();
            t2.start();

        } catch (Exception e){
            e.getCause();
        }
     }
}
