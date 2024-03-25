package InputAndOutput;

import java.io.FileReader;

/*
 * FilReader is used to read data from  the file 
 * It returns data in byte formart
 */
public class FileReaderClass {
    public static void main(String[] args) {
        fileReaderExample();
        
    }

    //Example read data from the file "C:\\Users\\allan.branson\\Downloads\\testout.txt"
    public static void fileReaderExample () {
        try {
            FileReader fr = new FileReader("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            int i;

            //read data from the file untill the end is reached (-1)
            while ((i = fr.read()) != -1) {
                System.out.println((char)i);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

