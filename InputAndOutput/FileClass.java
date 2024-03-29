package InputAndOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.sound.midi.Soundbank;

/*
 * The file class in java is used to reperesent directories and pathnames.
 *It provides methods for working with directories and files , deleting, rem=aming , creating etc
 */
public class FileClass {

    public static void main(String[] args) {
        createFile();
        fileDemo();
        checkFileInfo();
        directoryDetails();
        fileClassMethods();
    }

    //Create a file
    public static void createFile () {
        try {
            File file = new File ("JavaFile.txt");
            if (file.createNewFile()) {
                System.out.println("New file created");
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileDemo () {
        String path = "";

        boolean bool = false;
        try {
            File file = new File ("testFile1.txt");
            file.createNewFile();
            System.out.println(file);
            //Creating new canonical from file object
            File file2 = file.getCanonicalFile();
            //returns true if the file exists
            System.out.println(file2);
            bool = file2.exists();

            //returns absolute pathname
            path = file2.getAbsolutePath();
            System.out.println(bool);

            //check if file exists
            if (bool) {
                //prints
                System.out.println(path + " Exists? " + bool);
            }

        } catch (Exception e) {
            //if any error occurs 
            e.printStackTrace();
        }
    }

    public static void checkFileInfo (){
        File f = new File ("C:\\Users\\allan.branson\\Downloads");
        String filenames [] = f.list();
        for (String filename:filenames) {
            System.out.println(filename);
        }
    }

    public static void directoryDetails () {
        File dir = new File ("C:\\Users\\allan.branson\\Documents");
        File files [] = dir.listFiles();
        for (File file:files) {
            System.out.println(file.getName()+ " can write: " + file.canWrite() +
             "  Is Hidden : " +file.isHidden() + " Length:  " +file.length() + " bytes");
        }
    }

    public static void fileClassMethods () {
        //Create a file object
        File file = new File("Example.txt");

        try {
            //create a new file 
            if (file.createNewFile()) {
                System.out.println("File created " + file.getName());
            }  else {
                System.out.println("File already existing");
            }

            //check if the file writable 
            if (file.canWrite() && file.canExecute() ) {
                FileWriter writer = new FileWriter(file);
                writer.write("This is some texts");
                writer.close ();
                System.out.println(" content written to the file");
            } else {
                System.out.println("Cannnot write to the file or file is not executable");
            }

            //Read content from the file
            if (file.exists()) {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line ;
                System.out.println("Content of the file");
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

                bufferedReader.close();
            } else {
                System.out.println("File does not exist");
            }

            //get file information
            System.out.println("File name: " + file.getName());
            System.out.println("Absoule file path: "  + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes.");
            System.out.println("Is directory : " + file.isDirectory());
            System.out.println("Parent Directory: " + file.getParent());
            System.out.println("Last Modified: " + file.lastModified());
            System.out.println("Get canonical file: " + file.getCanonicalFile());

            //delete file
            if (file.delete()) {
                System.out.println("File deleted successfully");

            } else {
                System.out.println("Failed to delete the file");
            }


        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
