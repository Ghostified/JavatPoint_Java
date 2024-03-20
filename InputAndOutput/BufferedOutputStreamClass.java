package InputAndOutput;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamClass {
    public static void main(String[] args) throws Exception {
        BufferedOutputStreamClassExample.outputstreamclass();
    }

}

class BufferedOutputStreamClassExample {
    static void outputstreamclass () throws Exception{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "welcome to Gringotts";
        byte [] b = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");

    }
}