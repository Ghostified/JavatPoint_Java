package InputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

import ControlStatements.override;

/*
 * FilterWriter class is an abstract class used to write filtered character streams
 * 
 */
public class FilterWriterClass {

    public static void main(String[] args) throws IOException {
       // FilterWriterExample obj = new FilterWriterExample();
        //obj.filterWriterExample();

        FileWriter fileWriter = new FileWriter("Record.txt");
        UpperCaseFilterWriter upperCaseFilterWriter = new UpperCaseFilterWriter(fileWriter);

        //write data
        upperCaseFilterWriter.write("welcome to hogwarts", 0, 19);

        //closing the writer
        upperCaseFilterWriter.close();
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

//Example of FilterWriter Subclass that converts all cgharacters to uppercase before writing them to the underlying stream
    class UpperCaseFilterWriter extends FilterWriter{
        protected UpperCaseFilterWriter (Writer out) {
            super(out);
        }

        @Override
        public void write (int c ) throws IOException {
            super.write(Character.toUpperCase(c));
        }
        
        @Override
        public void write (char [] cbuf , int off, int len) throws IOException {
            for (int i = off; i < off +len; i++) {
                cbuf [i] = Character.toUpperCase(cbuf[i]);
            }
            super.write(cbuf, off, len);
        }

        @Override
        public void write (String str, int off, int len) throws IOException {
            super.write(str.toUpperCase(), off , len );
        }
    }
