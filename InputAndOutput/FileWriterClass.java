package InputAndOutput;

import java.io.FileWriter;

/*
 * FileWriter Class is used to write character oriented data to a file
 * Unlike a FileOutputStream , strings do not get converted in byte arrays 
 * 
 */
public class FileWriterClass {

    public static void main(String[] args) {

        fileWriter();
        
    }

    public static void fileWriter () {
        try {

            FileWriter fw = new FileWriter("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            fw.write("Hogwarts is fun");
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success");
    }
}
