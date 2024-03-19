package InputAndOutput;

import java.io.FileOutputStream;

import javax.swing.plaf.FontUIResource;

public class FileOutputStreamClass {
    public static void main(String[] args) {

        //Creating an object of the class FileoutputstremExample
        FileOutputStreamExample.Output1();

        //creating an object of the FileoutputStreamExample2
        FileOutputStreamExample2.writeString();
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

//Write string

class FileOutputStreamExample2 {
    static void writeString () {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            String str = "Welcome to Hogwarts";
            byte b []= str.getBytes(); //converting string to byte array
            fout.write(b);
            fout.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
