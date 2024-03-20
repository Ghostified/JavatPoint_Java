package InputAndOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//If we have to read files from multiple file, Enumeration is used i.e enums
public class SequenceInputWithEnumeration {
 
    public static void main(String[] args) throws IOException {
        //creating the FileInputStream objects for all the files

        FileInputStream file1 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout.txt");
        FileInputStream file2 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testout2.txt");
        FileInputStream file3 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testInput.txt");
        FileInputStream file4 = new FileInputStream("C:\\Users\\allan.branson\\Downloads\\testInput2.txt");

        //Creating a vector object of the strams
        Vector v = new Vector();
        v.add(file1);
        v.add(file2);
        v.add(file3);
        v.add(file4);

        //Creating enumation objects by calling the elemnts method
        Enumeration e = v.elements();

        //Passing the enumeration object in the consytructor
        SequenceInputStream bin = new SequenceInputStream(e);
        int i = 0;
        while ((i = bin.read())!= -1){
            System.out.println((char)i);
        }
        bin.close();
        file1.close();
        file2.close();
        file3.close();
        file4.close();
    }
}
