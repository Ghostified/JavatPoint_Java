package InputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * FilterWriter class is an abstract class used to write filtered character streams
 * 
 */
public class FilterWriterClass {

    public static void main(String[] args) {
        FilterWriterExample obj = new FilterWriterExample();
        obj.filterWriterExample();
    }
}

class CustomFilterWriter extends FilterWriter {
    CustomFilterWriter(Writer out) {
        super(out);
    }
    public void write (String str) throws IOException {
        super.write(str.toLowerCase());
    }
}
class FilterWriterExample {
    public static void filterWriterExample () {
       // CustomFilterWriter obj = new CustomFilterWriter(null);
        try {
            FileWriter fw = new FileWriter("Record.txt");
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
            filterWriter.write("I LOVE JAVA");
            filterWriter.close();
            FileReader fr = new FileReader("record.txt");
            BufferedReader br = new BufferedReader(fr);
            int k ;
            while ((k = br.read()) != -1){
                System.out.println((char)k);
            }
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}