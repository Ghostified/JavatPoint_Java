package InputAndOutput;

import java.io.FileOutputStream;

import javax.swing.plaf.FontUIResource;

public class FileOutputStreamClass {
    public static void main(String[] args) {

        //Creating an object of the class FileoutputstremExample
        FileOutputStreamExample.Output1();
    }

}

class FileOutputStreamExample {
    static void Output1 (){
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
