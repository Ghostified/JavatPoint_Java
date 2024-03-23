package InputAndOutput;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

/*
 * The java FilePermission class contains all the persmissions of a file or directory
 * All permissions are related to the path
 *  D:\\IO\\-: indicates that permissions is associated witha subdirectories and files recursively
 *  D: \\IO\\*: indicates taht permission is associated with all directories and files within the directory excluding sub-directories
 * 
 */
public class FilePermissionClass {

    public static void main(String[] args) {

        //Calling the file permission example
        FilePermissionExample();
        
    }

    //Example in which permission of a directory path is granted with read permission and
    // a file of the directory is granted write permission
    public static void FilePermissionExample () {
        try {
            String str = "D:\\IO Package\\java.txt";
            FilePermission file1 = new FilePermission("D:\\IO Package\\-", "read");
            PermissionCollection permission = file1.newPermissionCollection();
            permission.add(file1);

            FilePermission file2 = new FilePermission(str, "write");
            permission.add(file2);

            if (permission.implies(new FilePermission(str, "read,write"))) {
                System.out.println("Read, Write permission is granted for the path " + str);
            } else {
                System.out.println("No Read, Write permission is granted for the path" + str);
            }

        } catch (Exception e ) {
            e.printStackTrace();
        }

    }

}
