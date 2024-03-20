package InputAndOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * Its used to read information froma stream
 * 
 */
public class BufferedInputStramClass {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);

            int i;
            while ((i = bin.read())!=-1) {
                System.out.println((char)i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
