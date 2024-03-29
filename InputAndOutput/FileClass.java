package InputAndOutput;

import java.io.File;
import java.io.IOException;

/*
 * The file class in java is used to reperesent directories and pathnames.
 *It provides methods for working with directories and files , deleting, rem=aming , creating etc
 */
public class FileClass {

    public static void main(String[] args) {
        createFile();
        
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
}
