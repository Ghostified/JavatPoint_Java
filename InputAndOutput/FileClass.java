package InputAndOutput;

import java.io.File;
import java.io.IOException;

/*
 * The file class in java is used to reperesent directories and pathnames.
 *It provides methods for working with directories and files , deleting, rem=aming , creating etc
 */
public class FileClass {

    public static void main(String[] args) {
        //createFile();
        //fileDemo();
        //checkFileInfo();
        directoryDetails();
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
}
