package Swing;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.*;


/*
 * The JFileChooser component is used to build GUI with lots of components 
 */
public class FileChooser {
    public static void main(String[] args) {
        //new HelloWorld();
        //new HelloWorld2();
        //new HelloWorld3();
        //new Hello();
        //new Hello2();
        //new Hello3();
        new Hello4 ();
    }

}

//JFileChooser () constructor  - 
//It constructs a JFileChooser highlighting the clients default directory

class HelloWorld {
    HelloWorld () {
        //Creating an object of the JFileChooser Class
        JFileChooser jf = new JFileChooser(); // default constructor JFileChooser is called
        jf.showSaveDialog(null);
    }
}

// JFileChooser (File CurrentDirectory)
// Constructs  a  JFilechooser involving the given file as the way
//Example 

class HelloWorld2 {
    HelloWorld2() {
        //Creating the object to the JFileChooser
        JFileChooser jf = new JFileChooser("C:"); //paarametized constructor, the current directory is called
        jf.showSaveDialog(null); //opening the saved dialog
    }
}

/*
 * JFileChooser (File currentDirectory , FileSystemViewfsv)
 * Constructs a JFileChooser utilizing the given current catalog and FileSystemView
 * Example
 */

 class HelloWorld3 {
    HelloWorld3 () {
        //Creating an obk=ject of the JFileChooser Class
        JFileChooser jf = new JFileChooser("C:", FileSystemView.getFileSystemView()); //Parametized constructor
        jf.showSaveDialog(null);
    }
 }

 /*
  * JFileChooser constructor with the given file system view
  */

  class Hello {
    Hello () {
        JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());
        jf.showSaveDialog(null);
    }
  }

  /*
   * JFileChoose (String currentDirectoryPath)
   * Constructs a JFileChooser using the given way/path?
   */

   class Hello2{
    Hello2 () {
        JFileChooser jf = new  JFileChooser ("C:/Users/allan.branson/Projects");
        jf.showSaveDialog(null);
    }
   }

   /*
    * JFileChooser(String directoryPath , FileSystemView)
    */

    class Hello3 {
        Hello3 () {
            // Creating a JFileChooser parametized constructor with : JFileChooser(String directoryPath , FileSystemView)
            JFileChooser jf = new JFileChooser("C:/Users/allan.branson/Projects", FileSystemView.getFileSystemView());
            jf.showSaveDialog(null); // opening the saved dialogue
        }
    }

    //JfileChooser (File) filr constructor 
class Hello4 {
    Hello4 () {
        JFileChooser jf = new JFileChooser( new File("C:/Users"));
        jf.showOpenDialog(null);
    }
}