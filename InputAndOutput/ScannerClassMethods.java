package InputAndOutput;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ShutdownChannelGroupException;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class ScannerClassMethods {

    static final class ScannerExample implements Iterator<String>, Closeable {

        public Scanner scanner;

        // Constructors
        // Constructors to create a scanner that reads from a File
        public ScannerExample(File source) throws FileNotFoundException {
            this.scanner = new Scanner(source);
        }

        // Constructor to create a scanner that reads from a file with specified charset
        public ScannerExample(File source, String charsetName)
                throws FileNotFoundException, UnsupportedEncodingException {
            this.scanner = new Scanner(source, charsetName);

        }

        // constructor to create a scanner that reads from the an Input Stream
        public ScannerExample(InputStream source) {
            this.scanner = new Scanner(source);
        }

        // constructor to create a scanner that reads from an input stream with
        // specified charset
        public ScannerExample(InputStream source, String charsetName) {
            this.scanner = new Scanner(source, charsetName);
        }

        // constructor to create a scanner that reads from a readable source
        public ScannerExample(Readable source) {
            this.scanner = new Scanner(source);
        }

        // Constructor to create a scanner that reads from string
        public ScannerExample(String source) {
            this.scanner = new Scanner(source);
        }

        // Constructor to create a scanner that reads from a ReadableByteChannel with
        // specified charset
        public ScannerExample(ReadableByteChannel source, String charsetName) {
            this.scanner = new Scanner(source, charsetName);
        }

        // Constructor to create a scanner that reads from a ReadableByteChannel
        public ScannerExample(ReadableByteChannel source) {
            this.scanner = new Scanner(source);
        }

        // Constructor to create a scanner that that reads from a path
        public ScannerExample(Path source) throws IOException {
            this.scanner = new Scanner(source);
        }

        // constructor to create a scanner that reads from a path with specified charset
        public ScannerExample(Path source, String charsetName) throws IOException {
            this.scanner = new Scanner(source, charsetName);
        }

        // close scanner
        public void close() {
            scanner.close();
            ;
        }

        // methods
        // set the delimitter for this scanner
        public ScannerExample useDelimiter(String pattern) {
            this.scanner = scanner.useDelimiter(pattern);
            return this;
        }

        // get the locale for this scanner
        public Locale locale() {
            return scanner.locale();
        }

        // check the match result of the last scanning operation
        public MatchResult match() {
            return scanner.match();
        }

        // check if there is another token in the input
        public boolean hasNext() {
            return scanner.hasNext();
        }

        // Find and return the next token
        public String next() {
            return scanner.next();
        }

        // remove the current element
        public void remove() {
            scanner.remove();
        }

        // Read the nextLine of input
        public String nextLine() {
            return scanner.nextLine();
        }

        // Check if thetre is another line in the input
        public boolean hasNextLine() {
            return scanner.hasNextLine();
        }

        // find the next occurence of the of a pattern within the input line
        public String findInLine(String pattern) {
            return scanner.findInLine(pattern);
        }

        // Find the next occurence of a pattern within the input Line
        public String findInLine(java.util.regex.Pattern pattern) {
            return scanner.findInLine(pattern);
        }

        // find the next occurence of a pattern within the specified horizon
        public String findWithinHorizon(String pattern, int horizon) {
            return scanner.findWithinHorizon(pattern, horizon);
        }

        // check if the next token is a boolean
        public boolean hasNextBoolean() {
            return scanner.hasNextBoolean();
        }

        // Read the next token as a boolean
        public boolean nextBoolean() {
            return scanner.nextBoolean();
        }

        // check if the next token is a byte
        public boolean hasNextByte() {
            return scanner.hasNextByte();
        }

        // read the next token as a byte
        public byte nextByte() {
            return scanner.nextByte();
        }

        // check if the next token is a short
        public boolean hasNextShort() {
            return scanner.hasNextShort();
        }

        // read the next token as a short
        public short nextShort() {
            return scanner.nextShort();
        }

        // check if the next token is an Int
        public boolean hasNextInt() {
            return scanner.hasNextInt();
        }

        // Read the next token as an int
        public int nextInt() {
            return scanner.nextInt();
        }

        // Check if the next token is a float
        public boolean hasNextFloat() {
            return scanner.hasNextFloat();
        }

        // Read the next token as a float
        public float nextFloat() {
            return scanner.nextFloat();
        }

        // Check if the next token is a Long
        public boolean hasNextLong() {
            return scanner.hasNextLong();
        }

        // Read the next token as long
        public long nextLong() {
            return scanner.nextLong();
        }

        // check if next token is a Double
        public boolean hasNextDouble() {
            return scanner.hasNextDouble();
        }

        // Read the next token as a double
        public double nextDouble() {
            return scanner.nextDouble();
        }

        // check if next tokenis a BigInteger
        public boolean hasNextBigInteger() {
            return scanner.hasNextBigInteger();
        }

        // Read the next token as a BigInteger
        public BigInteger nextBigInteger() {
            return scanner.nextBigInteger();
        }

        // check if the next token is a BigDecimal
        public boolean hasNextBigDecimal() {
            return scanner.hasNextBigDecimal();
        }

        // skip the input that matches the specified pattern
        public ScannerExample skip(java.util.regex.Pattern pattern) {
            this.scanner = scanner.skip(pattern);
            return this;
        }

        // get the IOException last thrown by the scanner readable
        public IOException ioException() {
            return scanner.ioException();
        }

        // get the default radix of this scanner
        public int radix() {
            return scanner.radix();
        }

        // set the default radix for this scaner
        public ScannerExample useRadix(int radix) {
            this.scanner = scanner.useRadix(radix);
            return this;
        }

        //// get a stream of delimiter -separated tokens from this scanner
        public Stream<String> tokens() {
            return scanner.tokens();
        }

        // GET THE STRING REPRESENTATIONOF THIS SCANNER
        public String toString() {
            return scanner.toString();
        }

        /// main method
        public static void main(String[] args) {

            try {
                //create a scannerExample instance to read from the specified file
                String filepath = "C:\\Users\\allan.branson\\Downloads\\testout.txt";
                ScannerExample fileScanner = new ScannerExample(filepath);

                //Demonstrate reading user input
                Scanner userInputScanner = new Scanner(System.in);

                System.out.println("Enter your name: ");
                String name = userInputScanner.nextLine();

                System.out.println("Enter your age: ");
                int age = userInputScanner.nextInt();
                //Consume the newline character after nextInt() to avoid issues with NextLine();
                userInputScanner.nextLine();

                System.out.println("Enter your salary: ");
                int salary = userInputScanner.nextInt();
                //consume the newline character after nextInt() to avoid issues with nextLine
                userInputScanner.nextLine();

                //use the file scanner to read contentds from the file]
                System.out.println("File contents");
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }

                //demonstrate pattern matching
                System.out.println("Enter a sentence containing the word Java");
                String inputSentence = userInputScanner.nextLine();

                //Check if the user input sentence contains the word Java
                if (inputSentence.matches(".*\\bJava\\b.*")) {
                    System.out.println("The input sentence contains the word 'Java'");
                } else {
                    System.out.println("The input sentence does not contain the word 'Java'");
                }

                //Close the scanners
                fileScanner.close();
                userInputScanner.close();;

            } catch (Exception e) {
                e.printStackTrace();
            }

            //create an instance of ScannerExample to read from starndard input
            ScannerExample scannerExample = new ScannerExample(System.in);
    
            //demonstrate usage of scanner methods
            System.out.println("Enter your name");
            String name = scannerExample.nextLine();
            System.out.println("Hello " + name);
    
            System.out.println("Enter your age");
            int age = 0;
            try {
                age = scannerExample.nextInt();
                scannerExample.nextLine();
                System.out.println("Your age " + age);
    
            }catch (InputMismatchException e) {
                System.out.println("Invalid age input");
                return;
            }
            System.out.println("Enter your salary");
            int salary = 0;
            try {
                salary = scannerExample.nextInt();
                scannerExample.nextLine();
                System.out.println("Your salary" + salary);
    
            }catch (InputMismatchException e) {
                System.out.println("Invalid salary input");
                return;
    
            }scannerExample.close();
        }
    }
}
